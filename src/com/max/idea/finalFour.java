package com.max.idea;

import java.util.Scanner;

public class finalFour {
    public static void main(String[] args) {


    /*
    Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
Ответ: “Заархивированный вирус”.
     */
        int counter = 1;
        String answer = "Заархивированный вирус";
        String hint = "Подсказка";
        Scanner in = new Scanner(System.in);
        //1. У пользователя есть 3 попытки, чтобы отгадать загадку.
        System.out.println("Решите загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        for (int i = 1; i <=3; i++) {
            String userAnswer = in.nextLine();
            //5. Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны.
            //Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку.
            //Если на 2 и 3 попытке, вывести “Подсказка уже недоступна”.
            if (userAnswer.equals(hint) & i > 1) {
                 i--;
                 System.out.println("Подсказка уже недоступна");
            }
            else if (userAnswer.equals(hint) & counter == 1) {
                counter++;
                System.out.println("Связано с архивами и вирусами.");
            }
            //2. Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
            else if (userAnswer.equals(answer)) {
                System.out.println("Правильно!");
                break;
            }
             //Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
             //Если пользователь, использовавший подсказку, ошибется,
             //вывести “Обидно, приходи в другой раз” и завершить работу.
             else if ((i == 3 | counter == 2) & ! userAnswer.equals(answer)) {
                 System.out.println("Обидно, приходи в другой раз");
                 break;
             }
            // Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
            else if (! userAnswer.equals(answer) & i <=2) {
                System.out.println("Подумай еще!");
            }
        }
    }
}