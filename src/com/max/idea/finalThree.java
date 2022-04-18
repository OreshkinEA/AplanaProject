package com.max.idea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class finalThree {
    public static void main(String[] args) throws IOException {
    /*
    Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
    Среди данных строк найти строку с максимальным количеством различных символов.
    Если таких строк будет много, то вывести первую.

Пример для теста работы программы:

Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет
     */
        int count = 0;
        String maxstr = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество строк:");
        String size = reader.readLine();
        String [] array = new String[Integer.parseInt(size)];
        System.out.println("Введите строки:");
        for (int i = 0; i < Integer.parseInt(size); i++) {
            array[i] = reader.readLine();
        }
        for (int i = 0; i < Integer.parseInt(size); i++) {
            if (array[i].chars().distinct().count() > count) {
                count = (int) array[i].chars().distinct().count();
                maxstr = array[i];
            }
        }
        System.out.println("Ответ: "+ maxstr + " Количество символов: "+ count);
    }
}