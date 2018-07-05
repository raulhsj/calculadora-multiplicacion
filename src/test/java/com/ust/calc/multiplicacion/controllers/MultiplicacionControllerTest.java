package com.ust.calc.multiplicacion.controllers;

import org.junit.Before;
import org.junit.Test;

import com.ust.calc.bean.InputBean;
import com.ust.calc.multiplicacion.services.IMultiplyService;
import com.ust.calc.multiplicacion.services.impl.MultiplyServiceImpl;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplicacionControllerTest {

    private Multiply multiplicacionController;
    private IMultiplyService multiplicacionService;

	@Before
	public void setUp() throws Exception {
        multiplicacionController = new MultiplicacionController();
        multiplicacionService = new MultiplyServiceImpl();
	}

	@Test
	public void happyPathTest() {
        final Integer multi = multiplicacionController.doMulti(3, 2);
        assertThat(multi).isEqualTo(6);
    }

    @Test
    public void noHappyPathTest() {
        final Integer multi = multiplicacionController.doMulti(3, 3);
        assertThat(multi).isNotEqualTo(3);
    }
    
    @Test
    public void okMultiplyWithBean() {
    	InputBean input = new InputBean();
    	input.setOne(6);
    	input.setTwo(9);
    	final Integer multi = multiplicacionService.doMulti(input);
    	assertThat(multi).isEqualTo(54);
    }
    
    @Test
    public void koMultiplyWithBean() {
    	InputBean input = new InputBean();
    	input.setOne(6);
    	input.setTwo(9);
    	final Integer multi = multiplicacionService.doMulti(input);
    	assertThat(multi).isEqualTo(45);
    }


}
