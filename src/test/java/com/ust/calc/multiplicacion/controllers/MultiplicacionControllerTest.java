package com.ust.calc.multiplicacion.controllers;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplicacionControllerTest {

    private Multiply multiplicacionController;

	@Before
	public void setUp() throws Exception {
        multiplicacionController = new MultiplicacionController();
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


}
