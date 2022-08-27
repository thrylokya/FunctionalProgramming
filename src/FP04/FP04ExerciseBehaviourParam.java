package FP04;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP04ExerciseBehaviourParam {

    public static void main(String ap[])
    {
        List<Integer> numList = List.of(12,3,4,6,7,1,9);

        Function<Integer, Integer> func = x -> x*x;

        squareAndPrint(numList, func);
    }

    private static void squareAndPrint(List<Integer> numbers, Function<Integer, Integer> func)
    {
        numbers.stream().map(func).forEach(System.out::println);
    }
}
