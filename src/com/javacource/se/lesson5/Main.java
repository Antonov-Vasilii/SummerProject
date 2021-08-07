package com.javacource.se.lesson5;


public class Main {
    public static void main(String[] args) {
        int x = getSum(2, 3);

        if (x >= 10 && x <= 20) {
            System.out.println(x + " True");
        } else {
            System.out.println(x + " False");
        }
    }

    static int getSum(int a, int b) {
        return a + b;
    }
}
