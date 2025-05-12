package com.errday.object.chapter7.module.employees;

import java.util.Arrays;

public class Employees {

    private static final String[] EMPLOYEES = {"직원A", "직원B", "직원C"};
    private static final int[] BASE_PAYS = {400, 300, 250};
    private static final boolean[] HOURLY = {false, false, false, true, true, true};
    private static final int[] TIME_CARD = {0, 0, 0, 120, 120, 120};

    public static double calculatePay(String name, double taxRate) {
        if (isHourly(name)) {
            return calculateHourlyPayFor(name, taxRate);
        } else {
            return calculatePayFor(name, taxRate);
        }
    }

    public static boolean isHourly(String name) {
        return HOURLY[Arrays.asList(EMPLOYEES).indexOf(name)];
    }

    public static double sumOfBasePays() {
        double result = 0;
        for (String employee : EMPLOYEES) {
            if (isHourly(employee)) {
                int index = Arrays.asList(EMPLOYEES).indexOf(employee);
                result += (BASE_PAYS[index] * TIME_CARD[index]);
            }
        }
        return result;
    }

    public static double calculateHourlyPayFor(String name, double taxRate) {
        int index = Arrays.asList(EMPLOYEES).indexOf(name);
        double basePay = BASE_PAYS[index] * TIME_CARD[index];
        return basePay - (basePay * taxRate);
    }

    public static double calculatePayFor(String name, double taxRate) {
        int index = Arrays.asList(EMPLOYEES).indexOf(name);
        double basePay = BASE_PAYS[index];
        return basePay - (basePay * taxRate);
    }

}
