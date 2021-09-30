package GeekBrains.FirstLesson;

public class FirstLesson2 {
    public static void secondTask() {
        // 2.1. Целочисленные
        byte byte1 = 42;            //От -128 до 127. 1 байт
        short short1 = 42;          //От -32768 до 32767. 2 байта
        int int1 = 42;              //От -2147483648 до 2147483647. 4 байта
        long long1 = 42;            //От -9223372036854775808 до 9223372036854775807. 8 байт

        //2.2. С плавающей точкой
        float float1 = 4.2f;        //От -3.4Е +38 до 3.4Е +38. 4 байта
        double double1 = 4.2;       //От -1.7E + 308 до 1.7Е + 308. 8 байт

        //2.3 Символы
        char char1 = '\u25b2';      //От 0 до 65536. 2 байта

        //2.4 Логические
        boolean boolean1 = true;    //true или false. 1 бит

        //2.5 Строка
        String string1 = "Строка";  //До 2147483647. До 65535 байт

        //2. Проверка
        System.out.println("2. Объявление переменных\n2.1 Целочисленные");
        System.out.println("byte = " + byte1);
        System.out.println("short = " + short1);
        System.out.println("int = " + int1);
        System.out.println("long = " + long1);
        System.out.println("2.2. С плавающей точкой");
        System.out.println("float = " + float1);
        System.out.println("double = " + double1);
        System.out.println("2.3 Символы");
        System.out.println("char = " + char1);
        System.out.println("2.4 Логические");
        System.out.println("boolean = " + boolean1);
        System.out.println("2.5 Строка");
        System.out.println("string = " + string1);
    }
}
