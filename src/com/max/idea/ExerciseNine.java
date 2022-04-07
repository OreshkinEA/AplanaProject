package com.max.idea;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        double avr;
        double sum = 0.0;
        Scanner in = new Scanner(System.in);
//        1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        System.out.println("Задайте размер массива");
        int size = in.nextInt();
        double[] array = new double[size];
        System.out.println("Заполните массив данными (Вводите по одному числу)");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextDouble();
        }
//2. Посчитайте среднее арифметическое элементов массива.
        for (double x : array) {
            sum += x;
        }
        avr = sum / array.length;
        System.out.println("Среднее арифметическое чисел равно: " + avr);
//3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        System.out.println("Вывод массива на экран с умножением каждого элемента на среднее арифметическое:");
        for (double k : array) {
            k *= avr;
            System.out.println(k);
        }
    }
}