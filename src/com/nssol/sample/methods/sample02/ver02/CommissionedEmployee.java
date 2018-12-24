package com.nssol.sample.methods.sample02.ver02;

import com.nssol.sample.methods.sample02.Money;

public class CommissionedEmployee extends Employee{
    @Override
    Money calulatePay() {
        return new Money();
    }
}
