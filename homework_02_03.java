package ru.prokudin.geekbrains.lesson2;

/**
 * Created by Serge Prokudin on 09.12.2019.
 * Урок № 2 Задание № 3
 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
 и числа меньшие 6 умножить на 2;
 */

public class homework_02_03 {

    public static void main(String[] args) {

        int[] massiv = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 6){
                massiv[i] = massiv[i] * 2;
            }

            System.out.println(massiv[i]);
        }

    }
}