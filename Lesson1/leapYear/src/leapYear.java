import java.util.Scanner;

public class leapYear {
    /**
     * Created by Serge Prokudin on 04.12.2019.
     * Урок №1 Задание № 8
     * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in.nextInt();
        if ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год " + year +  " - високосный");
        }
        else {
            System.out.println("Год " + year +  " - НЕвисокосный");
        }

    }

}

