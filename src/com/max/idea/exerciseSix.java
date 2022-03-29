package com.max.idea;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class exerciseSix {
    public static void main(String[] args) {
        //1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
        //> Выберите что переводить: 1 - масса, 2 - расстояние
        double numb1 = 0.0;
        double numb2 = 0.0;
        double numb3 = 0.0;
        double numb4 = 0.0;
        NumberFormat formatter = new DecimalFormat("#0.00");
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int type = in.nextInt();
        if (type == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - центнер, 3 - тонна, 4 - фунт");
        }
        if (type == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        }
        int unit = in.nextInt();
        //Пользователю предлагается ввести количество выбранных единиц
        System.out.println("Введите число: ");
        double numb = in.nextDouble();
        /*
        > Результат:
> Метры: 10
> Мили: 0.006
> Ярды: 10.94
> Футы: 32.81
         */
        if (type == 1) {
            switch (unit) {
                case 1:
                    numb1 = numb;
                    numb2 = numb / 100;
                    numb3 = numb / 1000;
                    numb4 = numb * 2.2;
                    break;
                case 2:
                    numb1 = numb * 100;
                    numb2 = numb;
                    numb3 = numb / 10;
                    numb4 = numb * 220.46;
                    break;
                case 3:
                    numb1 = numb * 1000;
                    numb2 = numb * 10;
                    numb3 = numb;
                    numb4 = numb * 2204.62;
                    break;
                case 4:
                    numb1 = numb * 0.45;
                    numb2 = numb * 0.045;
                    numb3 = numb / 0.0045;
                    numb4 = numb;
                    break;
            }
            System.out.print("Результат:\nКилограммы: " + formatter.format(numb1) + "\nЦентнеры: " + formatter.format(numb2) + "\nТонны: " + formatter.format(numb3) + "\nФунты: " + formatter.format(numb4));
        }
        if (type == 2) {
            switch (unit) {
                case 1:
                    numb1 = numb;
                    numb2 = numb * 0.00062;
                    numb3 = numb * 1.094;
                    numb4 = numb * 3.281;
                    break;
                case 2:
                    numb1 = numb * 1609.34;
                    numb2 = numb;
                    numb3 = numb / 0.0005682;
                    numb4 = numb / 0.0001894;
                    break;
                case 3:
                    numb1 = numb * 0.9144;
                    numb2 = numb * 0.0005682;
                    numb3 = numb;
                    numb4 = numb * 3;
                    break;
                case 4:
                    numb1 = numb * 0.3048;
                    numb2 = numb * 0.0001894;
                    numb3 = numb / 3;
                    numb4 = numb;
                    break;
            }
            System.out.print("Результат:\nМетры: " + formatter.format(numb1) + "\nМили: " + numb2 + "\nЯрды: " + formatter.format(numb3) + "\nФуты: " + formatter.format(numb4));
        }
    }
}