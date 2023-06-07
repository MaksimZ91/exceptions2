package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println(echo(3));
        // checkStr();
    }

   // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
   // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
   // необходимо повторно запросить у пользователя ввод данных.
    public static double echo(int tryCount) {
        if (tryCount < 0)
            throw new RuntimeException("Превышено кол-во поыток ввода!");
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        try {
            result = scanner.nextDouble();
        } catch (NumberFormatException | InputMismatchException e) {
            System.err.println("Введено не кореектное значение, у вас остлось " + tryCount + " попыток!");
            return echo(tryCount - 1);
        }
        return result;
    }
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void checkStr(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое значение кроме пустой строи: ");
        String str = scanner.nextLine();
        if (str.length() == 0)
            throw new RuntimeException("Вводить пустые строки запрещенно!");
        System.out.println(str);
    }


}