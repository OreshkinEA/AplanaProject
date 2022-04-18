package com.max.idea;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class finalOne {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        //Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
        //Пользователь вводит текущий курс и количество рублей.
        Scanner in = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double course = in.nextDouble();
        System.out.print("Количество рублей: ");
        double rubles = in.nextDouble();
        double dollars = rubles / course;
        //Итоговое значение должно быть округлено до двух знаков после запятой.
//        Пример для теста работы программы:
//        Курс доллара: 67,55
//        Количество рублей: 1000
//        Итого: 14,80 долларов
        System.out.println("Итого: " + formatter.format(dollars) + " долларов");
    }
}
