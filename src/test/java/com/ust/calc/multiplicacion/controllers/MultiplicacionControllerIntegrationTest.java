package com.ust.calc.multiplicacion.controllers;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ust.calc.bean.InputBean;
import com.ust.calc.multiplicacion.services.IMultiplyService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MultiplicacionControllerIntegrationTest {

	
	@Autowired
	private MockMvc mockMvc;
	
	private Integer result;

	
	@MockBean
	private IMultiplyService multiplicacionService;

	
	@Before
	public void setup() {
		doReturn(result).when(multiplicacionService).doMulti(any(InputBean.class));
	}
	
	 @Test
	public void contextLoads() throws Exception {
	    mockMvc.perform(get(
	            "/multiply?one=2&two=3"))
	            .andExpect(status().isOk());
	}


}
