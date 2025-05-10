package com.errday.object.chapter7.tobdown;

import java.util.Arrays;
import java.util.Scanner;

public class Pay {

    private static final String[] EMPLOYEES = {"직원A", "직원B", "직원C"};
    private static final int[] BASE_PAYS = {400, 300, 250};

    public static void main(String[] args) {
        payMain("직원A");
    }

    private static void payMain(String name) {
        float taxRate = getTaxRate();
        float pay = calculatePayFor(name, taxRate);
        System.out.println(describeResult(name, pay));
    }
    
    private static float getTaxRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("세율을 입력하세요: ");
        return scanner.nextFloat();
    }

    private static float calculatePayFor(String name, float taxRate) {
        int index = Arrays.asList(EMPLOYEES).indexOf(name);
        int basePay = BASE_PAYS[index];
        return basePay - (basePay * taxRate);
    }

    private static String describeResult(String name, float pay) {
        StringBuilder sb = new StringBuilder();
        sb.append("이름: ").append(name).append(", 급여: ").append(pay);
        return sb.toString();
    }
    
    
}
