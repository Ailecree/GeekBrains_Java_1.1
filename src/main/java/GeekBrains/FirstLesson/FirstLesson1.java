package GeekBrains.FirstLesson;
import java.util.Scanner;
public class FirstLesson1 {

    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите задание для проверки, начиная со второго\n");        //Хотел сделать проверку через While, чтобы можно было проверить сразу все задания, но не разобрался, дождусь разъяснения циклов while
        int taskNumber = in.nextInt();
                if (taskNumber == 2) {
                    FirstLesson2.secondTask();  //2.Объявление переменных
                } else if (taskNumber == 3) {
                    FirstLesson3.thirdTask();   //3.Вычисление выражения
                } else if (taskNumber == 4) {
                    FirstLesson4.fourthTask();  //4.Проверка суммы чисел
                } else if (taskNumber == 5) {
                    FirstLesson5.fifthTask();   //5.Проверка знака числа
                } else if (taskNumber == 6) {
                    FirstLesson6.sixthTask();   //6.Проверка знака числа с использованием boolean
                } else if (taskNumber == 7) {
                    FirstLesson7.seventhTask(); //7.Приветствие пользователя
                } else if (taskNumber == 8) {
                    FirstLesson8.eighthTask();  //8.Определение, является ли год високосным
                } else {
                    System.out.println("Некорректно указано задание");
                }
         }

    }

