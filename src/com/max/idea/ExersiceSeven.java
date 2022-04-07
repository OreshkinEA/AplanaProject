package com.max.idea;

import java.util.Scanner;

public class ExersiceSeven {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        Scanner in = new Scanner(System.in);
//        1. Пользователь вводит размер массива и данные с клавиатуры в массив
        System.out.println("Задайте размер массива");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Заполните массив данными (Вводите по одному числу)");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
//2. Сравнить элементы массива с заранее заданными константами x, y, z.
//3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
        }
        for (int data : array) {
            if (data == x) {
                System.out.println("Данное значение имеется в константе " + x);
            }
            else if (data == y) {
                System.out.println("Данное значение имеется в константе " + y);
            }
            else if (data == z) {
                System.out.println("Данное значение имеется в константе " + y);
            }
        }
    }
}