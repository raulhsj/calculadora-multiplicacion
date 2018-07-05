package com.ust.calc.multiplicacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicacionController implements Multiply{

	@Override
	@GetMapping("/multiply/{one}/{two}")
	public Integer doMulti(@PathVariable(name = "one") Integer one, @PathVariable(name = "two") Integer two) {
		return one * two;
	}

}
