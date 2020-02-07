package com.xu.jdk8;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = "";
        String input = "";
        int num1;
        int num2;
        while (true) {
            System.out.println("请输入计算种类(1:加法 2:减法 3:乘法 4:除法) : ");
            type = scanner.next();
            if (!isType(type)) {
                continue;
            }
            System.out.println("请输入数1 : ");
            input = scanner.next();
            num1 = getNumber(input, scanner);
            System.out.println("请输入数2 : ");
            input = scanner.next();
            num2 = getNumber(input, scanner);
            CalculateInterface calculateInterface = (pType, m, n) -> {
                switch (pType) {
                    case "1":
                        System.out.println("和是： " + (m + n));
                        break;
                    case "2":
                        System.out.println("差是： " + (m - n));
                        break;
                    case "3":
                        System.out.println("积是： " + (m * n));
                        break;
                    case "4":
                        System.out.println("商是： " + (m / n));
                        break;
                }
            };
            calculate(calculateInterface, type, num1, num2);
            System.out.println("---------*************************----------");
        }
    }

    public static void calculate(CalculateInterface calculateInterface, String type, int a, int b) {
        calculateInterface.calculate(type, a, b);
    }

    public static boolean isType(String type) {
        if (!type.equals("1") && !type.equals("2") && !type.equals("3") && !type.equals("4")) {
            System.out.println("你输入错误 : " + type);
            return false;
        }
        return true;
    }

    public static int getNumber(String num, Scanner scanner) {
        int number;
        try {
            number = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println("输入错误, 请重新输入！！");
            return getNumber(scanner.next(), scanner);
        }
        return number;
    }
}
