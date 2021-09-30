package GeekBrains.FirstLesson;

import java.util.Scanner;

public class FirstLesson3 {
    public static void thirdTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("3. Вычисление выражения a * (b + (c / d)\nВведите значение числа a");
        float a = in.nextFloat();
        System.out.println("Введите значение числа b");
        float b = in.nextFloat();
        System.out.println("Введите значение числа c");
        float c = in.nextFloat();
        System.out.println("Введите значение числа d");
        float d = in.nextFloat();
        float result = a * (b + c / d);
        System.out.println("Значение выражения a * (b + (c / d) = " + result);
    }
}
