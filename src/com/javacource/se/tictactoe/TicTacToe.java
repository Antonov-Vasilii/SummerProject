package com.javacource.se.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static char[][] map;
    private static int SIZE = 3;
    private static final char DOT_EMPTY = 8226;
    private static final char DOT_X = 935;
    private static final char DOT_0 = 927;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true){
            humanTurn();
            if (isEndGame(DOT_X)){
                break;
            }

            computerTurn();
            if (isEndGame(DOT_0)){
                break;
            }
        }
        System.out.println("ТЫ КРАСАВЧИК !!!");
    }
        private static void initMap () {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        private static void printMap () {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }

        private static void humanTurn(){
        int x, y;
        do {
            System.out.println("Введите координаты ячейки через пробел");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map [x][y] = DOT_X;
        }

        private static void computerTurn(){
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }while (!isCellValid(x, y));
            System.out.println("Компьютер выбрал ячейку " + (y + 1) + " " + (x + 1));

        map [y][x] = DOT_0;

        }

        private static boolean isCellValid(int x, int y){
        boolean result = true;
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE){
            result = false;
        }
        if (map [x][y] != DOT_EMPTY){
            result =false;
        }

        return result;
        }

        private static boolean isEndGame(char playerSimbol){
        boolean result = false;
        printMap();
        if (checkSimbol(playerSimbol)){
            System.out.println("Победил " + playerSimbol);
            result = true;
        }
        if (isMapFul()){
            System.out.println("Ничья");
            result = true;
        }
        return result;
        }

        private static boolean isMapFul(){
        boolean result = true;
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (map[i][j] == DOT_EMPTY){
                    result = false;
                }
            }
        }
        return result;
        }

        private static boolean checkSimbol(char playerSimbol){
        boolean result = false;
        if ((map[0][0] == playerSimbol && map[0][1] == playerSimbol && map[0][2] == playerSimbol) ||
                (map[1][0] == playerSimbol && map[1][1] == playerSimbol && map[1][2] == playerSimbol) ||
                (map[2][0] == playerSimbol && map[2][1] == playerSimbol && map[2][2] == playerSimbol) ||
                (map[0][0] == playerSimbol && map[1][0] == playerSimbol && map[2][0] == playerSimbol) ||
                (map[0][1] == playerSimbol && map[1][1] == playerSimbol && map[2][1] == playerSimbol) ||
                (map[0][2] == playerSimbol && map[1][2] == playerSimbol && map[2][2] == playerSimbol) ||
                (map[0][0] == playerSimbol && map[1][1] == playerSimbol && map[2][2] == playerSimbol) ||
                (map[0][2] == playerSimbol && map[1][1] == playerSimbol && map[2][0] == playerSimbol)){
            result = true;
        }
        return result;
        }
    }

