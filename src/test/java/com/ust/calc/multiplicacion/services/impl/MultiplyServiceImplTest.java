package com.ust.calc.multiplicacion.services.impl;

import com.ust.calc.bean.InputBean;
import com.ust.calc.multiplicacion.services.IMultiplyService;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplyServiceImplTest {

    private IMultiplyService multiplicacionService;

    @Before
    public void setUp() throws Exception {
        multiplicacionService = new MultiplyServiceImpl();
    }

    @Test
    public void okMultiplyWithBean() {
        InputBean input = new InputBean(6, 9);
        final Integer multi = multiplicacionService.doMulti(input);
        assertThat(multi).isEqualTo(54);
    }

    @Test
    public void koMultiplyWithBean() {
        InputBean input = new InputBean(6, 9);
        final Integer multi = multiplicacionService.doMulti(input);
        assertThat(multi).isNotEqualTo(45);
    }
}