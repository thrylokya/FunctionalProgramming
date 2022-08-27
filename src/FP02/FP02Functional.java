package FP02;

import java.util.Comparator;
import java.util.List;

public class FP02Functional {

    public static void main(String ap[])
    {

//        System.out.println(addListFunctional(List.of(12,2,5,6,7,9,10)));
 //       System.out.println(findMax(List.of(12,2,5,6,7,29,10)));
        //printSorted(List.of(12,2,5,6,12,2,5,6,7,29,10));
        printCustomSorted(List.of("Spring", "Spring boot","API", "Metadata", "AWS","PCF","Azure"));
    }

    public static int addListFunctional(List<Integer> numList)
    {
      //  return  numList.stream()
        //        .reduce(0, FP02Functional::addNumber);

      /*  return numList.stream()
                .reduce(0, (x,y) -> (x+y)); */

        return numList.stream().reduce(0, Integer::sum);
    }

    public static int addNumber(int a , int b)
    {
        System.out.println(a +" "+ b);
        return a+b;
    }

    public static  int findMax(List<Integer> numList)
    {
       return  numList.stream().reduce(0,(x,y) -> (x>y?x:y));
    }

    public static  int findMin(List<Integer> numList)
    {
        return  numList.stream().reduce(Integer.MAX_VALUE,(x,y) -> (x<y?x:y));
    }


    public static void printDistinct(List<Integer> numList)
    {
        numList.stream().distinct().forEach(System.out::println);
    }

    public static void printSorted(List<String> numList)
    {
        numList.stream().distinct().sorted().forEach(System.out::println);
    }

    public static void printCustomSorted(List<String> numList)
    {
     //   numList.stream().sorted(Comparator.comparing(str -> str.length()).).forEach(System.out::println);
    }

}
