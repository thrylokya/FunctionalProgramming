package FP01;

import java.util.List;

public class FP01Functional {

    public static void main(String ap[])
    {
     //   printAllNumber(List.of(12,3,4,5,6,8));
     //   printEvenNumbers(List.of(12,3,4,5,6,8));
        printSquaresOfNumber(List.of(12,3,4,5,6,8));
    }

  /*  static void print(int number)
    {
        System.out.println(number);
    }*/
    static void printAllNumber(List<Integer> list) {

        list.stream().forEach(System.out::println);
    }

    static void printEvenNumbers(List<Integer> list) {

       /* list.stream().filter(FP01Functional::isEven).
                forEach(System.out::println); */

        list.stream().filter(number -> number%2 == 0)
                .forEach(System.out :: println);
    }

    static boolean isEven(int number)
    {
        return number %2 == 0;
    }

    static void printSquaresOfNumber(List<Integer> list){

        list.stream()
                .map(number -> number * number)
                .forEach(System.out :: println);
    }
}
