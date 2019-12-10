package ru.prokudin.geekbrains.lesson2;

/**
 * Created by Serge Prokudin on 09.12.2019.
 * Урок № 2 Задание № 2
 * Задать пустой целочисленный массив размером 8.
 * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
 */

public class homework_02_02 {

    public static void main(String[] args) {

        int[] massiv = new int[8];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = i * 3;
            System.out.println(massiv[i]);
        }

    }
}
