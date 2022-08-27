package FP06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,10,4,6,2,8,7);
        System.out.println(numbers);

        System.out.println(Stream.of(1,10,4,6,2,8,7).count());
        System.out.println(Stream.of(1,10,4,6,2,8,7).reduce(Integer::sum).get());

        int[] numArray = {1,10,4,6,2,8,7};
        System.out.println(Arrays.stream(numArray).reduce(Integer::sum).getAsInt());
        System.out.println(Arrays.stream(numArray).max().getAsInt());
        System.out.println(Arrays.stream(numArray).min().getAsInt());


    }
}
