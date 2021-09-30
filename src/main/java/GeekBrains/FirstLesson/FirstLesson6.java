package GeekBrains.FirstLesson;

import java.util.Scanner;

public class FirstLesson6 {
    public static void sixthTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("6. Проверка знака числа с использованием boolean\nВведите значение числа");
        int num = in.nextInt();
        boolean check;

        if (num >= 0) {
            check = true;
        } else {
            check = false;
        }
        System.out.println("Результат проверки = "+check);
    }
}
