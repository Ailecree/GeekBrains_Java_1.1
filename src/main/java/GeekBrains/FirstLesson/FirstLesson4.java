package GeekBrains.FirstLesson;

import java.util.Scanner;

public class FirstLesson4 {
    public static void fourthTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("4. Проверка суммы чисел\nВведите значение числа a");
        int a = in.nextInt();
        System.out.println("Введите значение числа b");
        int b = in.nextInt();
        int sum = a + b;
        boolean check;

        if (sum > 9 & sum < 21) {
            check = true;
        } else {
            check = false;
        }
        System.out.println("Результат проверки = "+check);
    }
}
