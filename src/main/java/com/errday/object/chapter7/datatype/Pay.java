package com.errday.object.chapter7.datatype;

import com.errday.object.chapter7.module.employees.Employees;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pay {

    private static List<Employee> EMPLOYEES = List.of(
            new Employee("직원A", 400, false, 0),
            new Employee("직원B", 300, false, 0),
            new Employee("직원C", 250, false, 0),
            new Employee("아르바이트D", 1, true, 120),
            new Employee("아르바이트E", 1, true, 120),
            new Employee("아르바이트F", 1, true, 120)
    );

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
        Employee find;
        for (Employee employee : EMPLOYEES) {
            if (name.equals(employee.getName())) {
                find = employee;
                System.out.println(describeResult(name, find.calculateSalariedPay(taxRate)));
                break;
            }
        }
    }

    private static void sumOfBasePays() {
        double result = EMPLOYEES.stream()
                        .mapToDouble(Employee::monthlyBasePay)
                        .sum();
        System.out.println(result);
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
    
    
}
