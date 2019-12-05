import java.util.Scanner;

public class isNegative {
    /**
     * Created by Serge Prokudin on 04.12.2019.
     * Урок №1 Задание № 6
     * Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        if ( a < 0) {
            System.out.println("Результат: True");
        }
        else {
            System.out.println("Результат: False");
        }

    }

}

