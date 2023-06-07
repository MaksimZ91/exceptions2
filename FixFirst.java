package org.example;

public class FixFirst {

// 1.Если необходимо, исправьте данный код (задание 2)
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
//
       public static void fix(int[] intArray){
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (NullPointerException e) {                    //Первый отлавливаем exception связанный
            System.out.println("Catching exception: " + e);   //с массивом т.к. обращение к нему раньше операции дления.
        } catch ( ArrayIndexOutOfBoundsException e) {         // Первым исключение говорит об отсутвие самого массива.
            System.out.println("Catching exception: " + e);   // Второе говорит о том что мы обращаемся к индукцию которого нет.
        } catch ( ArithmeticException e){                     // Т.к. дальше идет операция деления,
            System.out.println("Catching exception: " + e);   // отлавливаем возможные исключение которые могу возникнуть при ее выполнии.
        }
    }
}
