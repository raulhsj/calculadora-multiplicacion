package com.ust.calc.multiplicacion.services.impl;

import com.ust.calc.bean.InputBean;
import com.ust.calc.multiplicacion.services.IMultiplyService;
import org.springframework.stereotype.Service;

@Service
public class MultiplyServiceImpl implements IMultiplyService {

    @Override
    public Integer doMulti(InputBean entrada) {
        return entrada.getOne() * entrada.getTwo();
    }

}
