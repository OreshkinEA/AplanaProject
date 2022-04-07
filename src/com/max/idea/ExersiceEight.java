package com.max.idea;

import java.util.Scanner;

public class ExersiceEight {
    public static void main(String[] args) {
//        Напишите программу, где пользователь вводит любое целое положительное число n.
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int numb = in.nextInt();
//        А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
        for (int i = 1; i <= numb; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Cумма всех нечетных чисел: " + sum);
    }
}
