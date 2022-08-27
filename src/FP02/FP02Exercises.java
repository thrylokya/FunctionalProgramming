package FP02;

import java.util.List;

public class FP02Exercises {

    public static void main(String ap[])
    {
        System.out.println(sumOfOddNumbers(List.of(12,3,5,6,7)));
    }

    public static int squareAndSum(List<Integer> numList)
    {
        return numList.stream()
                .reduce(0,(x,y) -> (x + y*y));
    }


    public static int cubeAndSum(List<Integer> numList)
    {
        return numList.stream()
                .reduce(0,(x,y) -> (x + y*y*y));
    }

    public static int sumOfOddNumbers(List<Integer> numList)
    {
        return numList.stream()
                .filter(x -> x%2!=0)
                .reduce(0,(x,y) -> (x + y));
    }

}
