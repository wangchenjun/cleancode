package com.nssol.sample.methods.sample02.ver01;

import com.nssol.sample.methods.sample02.InvalidEmployeeType;
import com.nssol.sample.methods.sample02.Money;

public class Payroll {
    private static final int COMMISSIONED = 1;
    private static final int HOURLY = 2;
    private static final int SALARIED = 3;

    public Money calculatePay(Employee e) throws InvalidEmployeeType {
        switch (e.getType()) {
            case COMMISSIONED:
                return calculateCommissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalaryPay(e);
            default:
                throw new InvalidEmployeeType();
        }
    }

    private Money calculateSalaryPay(Employee e) {
        return new Money();
    }

    private Money calculateHourlyPay(Employee e) {
        return new Money();
    }

    private Money calculateCommissionedPay(Employee e) {
        return new Money();
    }
}
