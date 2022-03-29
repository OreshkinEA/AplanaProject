package com.max.idea;
import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        // 1. Ввести три числа с клавиатуры x, y, z
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число X");
        int x = in.nextInt();
        System.out.println("Введите число Y");
        int y = in.nextInt();
        System.out.println("Введите число Z");
        int z = in.nextInt();
        //2. Найти и вывести в консоль среднее арифметическое этих чисел
        int avr = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + avr);
        //3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        System.out.println("Среднее арифметическое разделенное на 2 с округлением в меньшую сторону:" + Math.floor(avr / 2));
        //4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (avr/2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}