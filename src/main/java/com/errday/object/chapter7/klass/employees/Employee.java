package com.errday.object.chapter7.klass.employees;

import lombok.Getter;

public abstract class Employee {

    @Getter
    protected String name;
    protected double basePay;

    public Employee(String name, double basePay) {
        this.name = name;
        this.basePay = basePay;
    }

    public abstract double calculatePay(double taxRate);
    public abstract double monthlyBasePay();
}
