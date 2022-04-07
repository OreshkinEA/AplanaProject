package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseThirteen {
    public static void main(String[] args) {

//    Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
        int counter = 0;
        String str = "I love java 8 Я люблю java 14 core1";
        String[] arrayTest = str.split(" ");
//        1. Выведите слова, состоящие только из латиницы.
        for (String i : arrayTest) {
            if (i.matches("\\w+")) {
                if (i.matches("[-+]?\\d+")) {
                    continue;
                }
                System.out.println(i);
                counter++;
            }
        }
//        2. Выведите количество этих слов.
        System.out.println(counter);
    }
}
