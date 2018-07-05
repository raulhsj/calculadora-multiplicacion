package com.ust.calc.multiplicacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicacionController implements Multiply{

	@Override
	@GetMapping("/multiply")
	public Integer doMulti(@RequestParam(name = "one") Integer one, @RequestParam(name = "two") Integer two) {
		// TODO Auto-generated method stub
		return one * two;
	}

}
