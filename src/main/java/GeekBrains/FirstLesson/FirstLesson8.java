package GeekBrains.FirstLesson;

import java.util.Scanner;

public class FirstLesson8 {
    public static void eighthTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("8. Определение, является ли год високосным\nВведите год");
        int year = in.nextInt();
        int leap = 4;
        int century = 100;
        int fourthCentury = 400;

        if (year <= 0) {
            System.out.println("Некорректно указан год");
        }  else if (year % fourthCentury == 0) {
            System.out.println("Год является високосным");
        }  else if (year % century == 0) {
            System.out.println("Год не является високосным");
        }  else if (year % leap == 0) {
            System.out.println("Год является високосным");
        }  else {
            System.out.println("Год не является високосным");
        }
    }
}
