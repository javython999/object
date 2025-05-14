package com.errday.object.chapter7.klass.employees;

public class SalariedEmployee extends Employee {

    public SalariedEmployee(String name, double basePay) {
        super(name, basePay);
    }

    @Override
    public double calculatePay(double taxRate) {
        return basePay - (basePay * taxRate);
    }

    @Override
    public double monthlyBasePay() {
        return basePay;
    }
}
