package com.max.idea;

import java.util.Scanner;

public class finalTwo {
    public static void main(String[] args) {
/*
Напишите программу, которая позволит решить простое уравнение относительно x.
Программа принимает на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.

Нужно найти неизвестное.

Пример для теста работы программы:

- Ввод: x+5=7
- Вывод: 2
- Ввод: 3-x=9
- Вывод: -6
- Ввод: 3-3=x
- Вывод: 0
 */
        int a = 0;
        int b = 0;
        int c = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пример: ");
        String exercise = in.nextLine();
        char[] chArray = exercise.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            if (Character.isLetter(chArray[i]) == true & i == 0) {
                a = chArray[i];
                b = Integer.parseInt(String.valueOf(chArray[2]));
                c = Integer.parseInt(String.valueOf(chArray[4]));
                count += 0;
            } else if (Character.isLetter(chArray[i]) == true & i == 2) {
                a = chArray[i];
                b = Integer.parseInt(String.valueOf(chArray[0]));
                c = Integer.parseInt(String.valueOf(chArray[4]));
                count += 2;
            } else if (Character.isLetter(chArray[i]) == true & i == 4) {
                a = chArray[i];
                b = Integer.parseInt(String.valueOf(chArray[0]));
                c = Integer.parseInt(String.valueOf(chArray[2]));
                count += 4;
            } else if (chArray[1] == '-' & i == 1) {
                --count;
            }
        }
        switch (count) {
            case 0:
                a = c - b;
                break;
            case 2:
                a = c - b;
                break;
            case 4:
                a = c + b;
                break;
            case -1:
                a = c + b;
                break;
            case 1:
                a = b - c;
                break;
            case 3:
                a = b - c;
                break;
        }
        System.out.println(a);
    }
}