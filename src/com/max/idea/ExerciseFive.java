package com.max.idea;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        /*
        1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
        2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
         */
        int result = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число А");
        int a = in.nextInt();
        System.out.println("Введите число B");
        int b = in.nextInt();
        System.out.println("Введите операцию (+, -, *, /)");
        String operator = in.next();
        switch (operator) {
            case ("+"):
                result = a + b;
                break;
            case ("-"):
                result = a - b;
                break;
            case ("*"):
                result = a * b;
                break;
            case ("/"):
                result = a / b;
                break;
        }
        System.out.println("Результат операции: " + result);
    }
}
