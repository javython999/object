package com.errday.object.chapter7.tobdown;

import java.util.Arrays;
import java.util.Scanner;

public class Pay {

    private static final String[] EMPLOYEES = {"직원A", "직원B", "직원C", "아르바이트D", "아르바이트E", "아르바이트F"};
    private static final double[] BASE_PAYS = {400, 300, 250, 1, 1, 1.5};
    private static final boolean[] HOURLY = {false, false, false, true, true, true};
    private static final int[] TIME_CARD = {0, 0, 0, 120, 120, 120};

    public static void main(String[] args) {
        payMain("pay","직원A");
        payMain("basePays",null);
    }

    private static void payMain(String operation, String name) {
        if ("pay".equals(operation)) {
            calculatePay(name);
        } else if ("basePays".equals(operation)) {
            sumOfBasePays();
        }
    }

    private static void calculatePay(String name) {
        double taxRate = getTaxRate();
        double pay = 0;
        if (isHourly(name)) {
            pay = calculateHourlyPayFor(name, taxRate);
        } else {
            pay = calculatePayFor(name, taxRate);
        }
        System.out.println(describeResult(name, pay));
    }

    private static boolean isHourly(String name) {
        return HOURLY[Arrays.asList(EMPLOYEES).indexOf(name)];
    }

    private static void sumOfBasePays() {
        double result = 0;
        for (String employee : EMPLOYEES) {
            if (isHourly(employee)) {
                int index = Arrays.asList(EMPLOYEES).indexOf(employee);
                result += (BASE_PAYS[index] * TIME_CARD[index]);
            }
        }
        System.out.println(result);
    }

    private static double getTaxRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("세율을 입력하세요: ");
        return scanner.nextDouble();
    }

    private static double calculatePayFor(String name, double taxRate) {
        int index = Arrays.asList(EMPLOYEES).indexOf(name);
        double basePay = BASE_PAYS[index];
        return basePay - (basePay * taxRate);
    }

    private static double calculateHourlyPayFor(String name, double taxRate) {
        int index = Arrays.asList(EMPLOYEES).indexOf(name);
        double basePay = BASE_PAYS[index] * TIME_CARD[index];
        return basePay - (basePay * taxRate);
    }

    private static String describeResult(String name, double pay) {
        StringBuilder sb = new StringBuilder();
        sb.append("이름: ").append(name).append(", 급여: ").append(pay);
        return sb.toString();
    }
    
    
}
