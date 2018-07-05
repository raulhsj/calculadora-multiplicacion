package com.ust.calc.multiplicacion.controllers;

import com.ust.calc.bean.InputBean;
import com.ust.calc.multiplicacion.services.IMultiplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicacionController implements Multiply{

	private final IMultiplyService multiplicacionService;

    public MultiplicacionController(final IMultiplyService multiplicacionService) {
        this.multiplicacionService = multiplicacionService;
    }

    @Override
	@GetMapping("/multiply/{one}/{two}")
	public Integer doMulti(@PathVariable(name = "one") Integer one, @PathVariable(name = "two") Integer two) {
		return multiplicacionService.doMulti(new InputBean(one, two));
	}

}
