package GeekBrains.FirstLesson;

import java.util.Scanner;

public class FirstLesson5 {
    public static void fifthTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("4. Проверка знака числа\nВведите значение числа");
        int num = in.nextInt();

        if (num >= 0) {
            System.out.println("Число больше либо равно нулю");
        } else {
            System.out.println("Число меньше нуля");
        }
    }
}
