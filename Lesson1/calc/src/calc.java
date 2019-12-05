import java.util.Scanner;
public class calc {
    /**
     * Created by Serge Prokudin on 04.12.2019.
     * Урок №1 Задание № 3
     *Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float.
    */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите переменные a b c d в строчку через пробел: ");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        float d = in.nextFloat();
        float x = a * (b + (c / d));
        System.out.println("Результат: x = " + x);
        in.close();

    }
}
//Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
////где a, b, c, d – аргументы этого метода, имеющие тип float.