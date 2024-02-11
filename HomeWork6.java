package homework6;

public class HomeWork6 {
    public static void main(String[] args) {
        /* 1. Напишите функцию-калькулятор должна принимать два числа double
        и операцию над ними - символ '*', '/', '+' или '-' и возвращать результат этой операции */
        System.out.println("7*5=" + calculator(7, 5, '*'));
        System.out.println("35/5=" + calculator(35, 5, '/'));
        System.out.println("7+7=" + calculator(7, 7, '+'));
        System.out.println("25-5=" + calculator(25, 5, '-'));

        /* 2.Напишите функцию, которая принимает параметр А и перебирает все числа
        от 1 до A с шагом 1 и печатает только числа, кратные 5, 7 или 13 */
        with1toA(27);

        /* *3. Распечатайте все числа Фибоначчи от 1 до 500.
        Про числа Фибоначчи можно прочитать в википедии, если кратко,
        каждое следующее число получается из суммы двух предыдущих: 1+2=3, 2+3=5, 3+5=8 и т.д. */


        // *4. Напишите функцию для вычисления суммы цифр любого целого числа. Пример: 234->9
        System.out.println("234 -> " + sumDigits(234));

        //*5. Напишите функцию для обращения строки. Пример: "Миша" -> "ашиМ"


    }//main

    //#1
    public static double calculator(double a, double b, char c) {
        return switch (c) {
            case '*' -> a * b;
            case '/' -> a / b;
            case '+' -> a + b;
            case '-' -> a - b;
            default -> 0_0;
        };

    }

    //#2
    public static void with1toA(int a) {
        for (int b = 1; b <= a; b++) {
            if (b % 5 == 0) {
                System.out.println("кратное 5: " + b);
            } else if (b % 7 == 0 || b % 13 == 0) {
                System.out.println("кратное 7 или 13: " + b);
            }
        }
    }

    //#3
    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
