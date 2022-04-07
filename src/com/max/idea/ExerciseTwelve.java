package com.max.idea;

import java.util.Scanner;

public class ExerciseTwelve {
    public static void main(String[] args) {
        /*
        Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:

1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).

2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).

3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).

4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.

5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).

         */
        String str = "I like Java!!!";
        if (str.contains("Java") & str.startsWith("I like") & str.endsWith("!!!")) {
            String result = str.toUpperCase();
            System.out.println(result);
        }
        str = str.replace("a", "o");
        System.out.println(str.substring(7,11));
    }
}