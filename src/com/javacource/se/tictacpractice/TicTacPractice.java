/*package com.javacource.se.tictacpractice;

import java.util.Random;
import java.util.Scanner;

public class TicTacPractice {
    private static char[][] map;
    private static int Size = 3;
    private static final char DotEmpty = 8226;
    private static final char Dot_X = 935;
    private static final char Dot_0 = 927;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn() {
                if (isEndGame(Dot_X)) {
                    break;
                }
            }
            computerTurn() {
                if (isEndGame(Dot_0)) {
                    break;
                }
            }
        }
        System.out.println("Игра закончена!");
    }

    private static void initMap(){
        map = new char[Size][Size];
        for (int i = 0; i < Size; i++){
            for (int j = 0; j < Size; j++){
                map[i][j] = DotEmpty;
            }
        }
    }
    private static void printMap(){
        for (int i = 0; i <= Size; i++){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < Size; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void humanTurn(){
        int x;
        int y;

    }
}*/


