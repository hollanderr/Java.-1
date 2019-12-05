import java.util.Scanner;

public class PositiveNegative {
    /**
     * Created by Serge Prokudin on 04.12.2019.
     * Урок №1 Задание № 5
     * Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число х: ");
        int x = in.nextInt();
        if (x >= 0) {
            System.out.println("Число х - положительное");
        }
        if (x < 0) {
            System.out.println("Число х - отрицательное");
        }
        in.close();

    }
}
