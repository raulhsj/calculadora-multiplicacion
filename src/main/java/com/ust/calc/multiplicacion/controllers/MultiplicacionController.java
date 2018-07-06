package com.ust.calc.multiplicacion.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ust.calc.bean.InputBean;
import com.ust.calc.multiplicacion.services.IMultiplyService;

@RestController
public class MultiplicacionController implements Multiply{

	private final IMultiplyService multiplicacionService;

    public MultiplicacionController(final IMultiplyService multiplicacionService) {
        this.multiplicacionService = multiplicacionService;
    }
    
    @Override
    @RequestMapping("/multiply")
	public Integer doMulti(@RequestParam(value="one") Integer one, @RequestParam(value="two") Integer two) {
		return multiplicacionService.doMulti(new InputBean(one, two));
	}

}
