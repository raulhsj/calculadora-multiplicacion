package com.ust.calc.multiplicacion.controllers;

import com.ust.calc.bean.InputBean;
import com.ust.calc.multiplicacion.services.IMultiplyService;
import com.ust.calc.multiplicacion.services.impl.MultiplyServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MultiplicacionControllerTest {

    private Multiply multiplicacionController;

    private @Mock
    IMultiplyService multiplicacionService;


    @Before
	public void setUp() throws Exception {
        multiplicacionController = new MultiplicacionController(multiplicacionService);
	}

	@Test
	public void happyPathTest() {
        when(multiplicacionService.doMulti(any(InputBean.class))).thenReturn(6);
        final Integer multi = multiplicacionController.doMulti(3, 2);
        assertThat(multi).isEqualTo(6);
    }

    @Test
    public void noHappyPathTest() {
        when(multiplicacionService.doMulti(any(InputBean.class))).thenReturn(6);
        final Integer multi = multiplicacionController.doMulti(3, 3);
        assertThat(multi).isNotEqualTo(3);
    }
    



}
