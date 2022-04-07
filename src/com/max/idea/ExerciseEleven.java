package com.max.idea;

import java.util.Scanner;

public class ExerciseEleven {
    public static void main(String[] args) {
        //1. Ввести первое число с клавиатуры и записать его в строковую переменную.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        String fisrt =  in.nextLine();
        //2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.println("Введите второе число");
        int second = in.nextInt();
        //3. Сравнить 2 числа и вывести большее на экран
        int fone = Integer.parseInt(fisrt);
        int big = Math.max(fone,second);
        System.out.println("Большее число: "+big);
        //4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
        double small = Math.min(fone,second);
        System.out.println("Наименьшее число: "+small);
    }
}