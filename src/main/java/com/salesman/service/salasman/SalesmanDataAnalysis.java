package com.salesman.service.salasman;

import com.salesman.model.Salesman;
import com.salesman.service.IProcessLine;
import org.springframework.stereotype.Component;

@Component
public class SalesmanDataAnalysis implements IProcessLine {

    private static final int CPF_POSITION = 1;
    private static final int NAME_POSITION = 2;
    private static final int SALARY_POSITION = 3;

    @Override
    public Object processLine(String[] line) {
        String cpf = line[CPF_POSITION];
        String name = line[NAME_POSITION];
        double salary = Double.parseDouble(line[SALARY_POSITION]);
        return new Salesman(cpf, name, salary);
    }
}
