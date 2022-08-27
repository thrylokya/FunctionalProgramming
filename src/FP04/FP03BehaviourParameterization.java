package FP04;

import java.util.List;
import java.util.function.Predicate;

public class FP03BehaviourParameterization {

    public static void main(String ap[])
    {
        List<Integer> numList = List.of(12,9,34,1,10,23);
        Predicate<Integer> pc = x -> x%2 ==0;

        filterAndPrint(numList, (x -> x%2 ==0));
        filterAndPrint(numList, (x -> x%2 ==1));




    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> pc)
    {
        numbers.stream().filter(pc).forEach(System.out::println);
    }

}
