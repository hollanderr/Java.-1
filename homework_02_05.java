package ru.prokudin.geekbrains.lesson2;

/**
 * Created by Serge Prokudin on 09.12.2019.
 * Урок № 2 Задание № 5
 * Задать одномерный массив и найти в нем минимальный и максимальный элементы
 * (без помощи интернета)
 */

public class homework_02_05 {

    public static void main(String[] args) {

        int[] matrix = {5, 7, 0, -3, 28, 121};
        int minima = matrix[0]; // Создаем и инициализируем переменную для минимума
        int maxima = matrix[0]; // Создаем и инициализируем переменную для максимума
        for (int i = 0; i < matrix.length; i++) { //Пробегаем цикл с i для значений всего массива
            if (matrix[i] < minima) { // Условия для присвоения минимума
                minima = matrix[i];
            }
            else if (matrix[i] > maxima) { // Условия для присвоения максимума
                maxima = matrix[i];
            }
        }
        System.out.println("максимальное значение = " + maxima);
        System.out.println("минимальное значение = " + minima);
    }
}
