package com.ust.calc.multiplicacion.services;

import com.ust.calc.bean.InputBean;

public interface IMultiplyService {

	Integer doMulti(Integer one, Integer two);
	Integer doMulti(InputBean entrada);
}
