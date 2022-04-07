package com.max.idea;

import java.util.Random;

public class ExerciseFourteen {
    public static void main(String[] args) {
//        Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
        int[] array = new int[15];
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 41) - 20);
            System.out.println(array[i]);
        }
        //1. Выведите максимальный и минимальный элемент массива.
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение: "+ max);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение :" + min);
        //2. Из максимального и минимального значения выведите наибольшее по модулю.
        int modulmin = Math.abs(min);
        int modulmax = Math.abs(max);
        int result = Math.max(modulmin, modulmax);
        System.out.println("Наибольшее по модулю: "+ result);
    }
}