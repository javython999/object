package com.errday.object.chapter7.module;

import com.errday.object.chapter7.module.employees.Employees;

import java.util.Arrays;
import java.util.Scanner;

public class Pay {

    private static final String[] EMPLOYEES = {"직원A", "직원B", "직원C"};
    private static final int[] BASE_PAYS = {400, 300, 250};
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
        double pay = Employees.calculatePay(name, taxRate);
        System.out.println(describeResult(name, pay));
    }

    private static double getTaxRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("세율을 입력하세요: ");
        return scanner.nextDouble();
    }

    private static String describeResult(String name, double pay) {
        StringBuilder sb = new StringBuilder();
        sb.append("이름: ").append(name).append(", 급여: ").append(pay);
        return sb.toString();
    }

    private static void sumOfBasePays() {
        double result = Employees.sumOfBasePays();
        System.out.println(result);
    }



}
