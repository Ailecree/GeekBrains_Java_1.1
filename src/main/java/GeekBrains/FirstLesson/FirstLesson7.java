package GeekBrains.FirstLesson;

import java.util.Scanner;

public class FirstLesson7 {
    public static void seventhTask () {
        Scanner in = new Scanner(System.in);
        System.out.println("7. Приветствие пользователя\nВведите ваше имя");
        String name = in.nextLine();
        System.out.println("Привет, "+name);
    }
}
