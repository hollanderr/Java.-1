import java.util.Scanner;
public class greetings {
        /**
         * Created by Serge Prokudin on 04.12.2019.
         * Урок №1 Задание № 7
         */
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Как Вас зовут? Введите Ваше имя: ");
            String name = in.nextLine();
            System.out.println("Привет "+ name + "! :)");

        }
    }


