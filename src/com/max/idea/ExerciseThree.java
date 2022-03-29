package com.max.idea;

public class ExerciseThree {
    public static void main(String[] args) {
        // 1. Задайте массив из 5 любых целых чисел
        int[] myArray = new int[]{1, 2, 3, 4, 5};
        int size = myArray.length;
        int middle;
        // 2. Поменяйте местами первый и последний элемент в массиве
        System.out.println(myArray[0] + " и " + myArray[myArray.length - 1]);
        int temp = myArray[0];
        myArray[0] = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = temp;
        System.out.println(myArray[0] + " и "+ (myArray[myArray.length - 1]));
        /* 3. Вывести в консоль результат суммы первого и среднего элемента
        Примечание: Для получения последнего и среднего элементов в массиве используйте свойство length.
        */
        if (size % 2 > 0) {
            middle = (myArray[size - 1] / 2) + 1;
        } else {
            middle = size / 2;
        }
        System.out.println("суммы первого и среднего элемента равна: " + (myArray[0] + middle));
    }
}

