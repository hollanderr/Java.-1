import java.util.Scanner;

public class task10and20 {
    /**
     * Created by Serge Prokudin on 04.12.2019.
     * Урок №1 Задание № 4
     * Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("Сумма чисел a и b = " + sum);
        if (10 <= sum && sum <=20) {
            System.out.println("Результат: True");
        }
        else {
            System.out.println("Результат: False");
        }

    }

}
