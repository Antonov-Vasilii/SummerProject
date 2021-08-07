package com.javacource.se.tusk2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tusk2 {
    public static void main(String[] args) {

        byte[] binArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (byte i = 0; i < binArray.length; i++) {
            if (binArray[i] == 1) {
                binArray[i] = 0;
            } else {
                binArray[i] = 1;
            }
            System.out.print(" " + binArray[i] + " ");
        }
        System.out.println();

        int[] secondArray = new int[8];
        int a = 0;
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = a;
            a += 3;
            System.out.print(" " + secondArray[i] + " ");
        }
        System.out.println();

        int[] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < thirdArray.length; i++) {
            if (thirdArray[i] < 6) {
                thirdArray[i] *= 2;
            }
            System.out.print(" " + thirdArray[i] + " ");
        }
        System.out.println();

       int [][] fourthArray = new int[5][5];
        for (int i = 0; i < fourthArray.length; i++){
            for (int y = 0; y < fourthArray.length; y++){
                if ((i == y) || ((i + y) == fourthArray.length-1)) {fourthArray[i][y] = 1;}
                System.out.print(" " + fourthArray[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int [] fifthArray = {3,2,1,5,6,9,8,7};
        int maxNumber = 0;
        for (int i = 0; i < fifthArray.length; i++) {
          if (fifthArray[i] > maxNumber) maxNumber = fifthArray[i];
        }
        int minNumber = maxNumber;
        for (int i = 0; i < fifthArray.length; i++) {
            if (fifthArray[i] < minNumber) minNumber = fifthArray[i];
        }
        System.out.println("Наибольшее значение: " + maxNumber + "," + " наименьшее значение:" + minNumber);

        int [] sixthArray = {2,1,1,1,1,2};
        int sum = 0;
        for (int i = 0; i < sixthArray.length; i++){
            sum = sum + sixthArray[i];

        }
        System.out.print(sum);
        System.out.println();

        int [] testArray = {2,1,1,1,1,3};
        int sum2 = 0;
        for (int i = 0; i < testArray.length; i++){
            sum2 = sum2 + testArray[i];

        }
        System.out.print(sum2);
        System.out.println();


        int [] seventhArray1 = {1,2,1,1,2,1};
        int [] seventhArray2 = {1,2,2,1,2,1};
        System.out.println(halfArray(seventhArray1));
        System.out.println(halfArray(seventhArray2));
    }
    public static boolean halfArray(int[] array){
        int sumArray = 0;
        int sumTemp = 0;
        for(int i = 0; i < array.length; i++){
            sumArray +=array[i];
        }
        int halfSum = sumArray / 2;
        if((sumArray % 2) == 0){
            for(int i = 0; i < array.length; i++){
                sumTemp += array[i];
                if(sumTemp == halfSum) return true;
                else continue;
            }
            return false;
        }
        else return false;
    }
}
