package ru.prokudin.geekbrains.lesson2;

/**
 * Created by Serge Prokudin on 09.12.2019.
 * Урок № 2 Задание № 1
 * Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */

public class homework_02_01 {

    public static void main(String[] args) {

        int[] massiv = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 0){
                massiv[i] = 1;
            }
            else if (massiv[i] == 1){
                massiv[i] = 0;
            }
            System.out.println(massiv[i]);
        }

    }
}
