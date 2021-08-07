package com.javacource.se.tusk1;

public class Tusk1 {
    public static void main(String[] args) {

        System.out.println(getSum(2, 3, 5, 5));
        System.out.println(getSum(2, 3, 4, 2));

        System.out.println(interval(2,3));

        numInteger(3);
        numInteger(-2020);

        hello("Мария");
        leapYear(2022);

    }

    static int getSum(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    static boolean interval(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void numInteger(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    static void hello(String nameWife) {
        System.out.println("Привет " + nameWife + "!");
    }

    static void leapYear(int a){
        if ((a%400 ==0) || (a%4==0 & !(a%100==0))) {
            System.out.println(a + " год является високосным");
        }
        else {
            System.out.println(a + " год является невисокосным");
        }
    }
}
