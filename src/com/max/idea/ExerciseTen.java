package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
//        Размерность матрицы задается пользователем.
        System.out.println("Введите размерность матрицы:");
        int size = in.nextInt();
        int [][] TwoDimArray = new int[size][size];
        System.out.println("Заполните матрицу данными:");
        for (int i = 0; i < TwoDimArray.length; i++) {
            for (int j = 0; j < TwoDimArray[i].length; j++) {
                System.out.print("Введите данные матрицы строки " + i + " и номер элемента " + j + " : ");
                TwoDimArray[i][j] = in.nextInt();
            }
        }
//        а после этого произведите вывод первой строки матрицы на экран,
//        где каждый элемент умножается на 3.
        for (int j = 0; j < TwoDimArray[0].length; j++) {
            System.out.println("Вывод первой строки матрицы, умноженной на 3: " + (TwoDimArray[0][j] * 3));
            }
    }
}