package com.errday.object.chapter7.datatype;

import lombok.Getter;

public class Employee {

    @Getter
    private String name;
    private double basePay;
    private boolean hourly;
    private int timeCard;

    public Employee(String name, double basePay, boolean hourly, int timeCard) {
        this.name = name;
        this.basePay = basePay;
        this.hourly = hourly;
        this.timeCard = timeCard;
    }

    public double calculateHourlyPay(double taxRate) {
        double baseSalary = basePay * timeCard;
        return baseSalary - (baseSalary * taxRate);
    }

    public double calculateSalariedPay(double taxRate) {
        return basePay - (basePay * taxRate);
    }

    public double monthlyBasePay() {
        if (hourly) {
            return 0;
        }
        return basePay;
    }


}
