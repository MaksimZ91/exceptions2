package org.example;

public class FixSecond {

// 2.Если необходимо, исправьте данный код (задание 2)
//    public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//    }
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//    }

    public static void fix2() throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch ( ArithmeticException ex ){                                 //т.к. сначала выполняется операция деления первым идет ArithmeticException
            System.out.println("При делении что то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");     //  далее вызываетмя метод printSum который принимает -->
        } catch (IndexOutOfBoundsException ex) {                             // --> ссылки на Integer соответственно может быть NullPointerException
            System.out.println("Массив выходит за пределы своего размера!"); // далее создается массив и идет обращение по индексу которого -->
        }catch (Throwable ex) {                                              // --> может там не быть обрабываем с помощью IndexOutOfBoundsException
            System.out.println("Что-то пошло не так метод fix2...");         // Если что то еще пошло не так отлавливаем это и говорим где конкретно (метод)
        }
    }
    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }



}
