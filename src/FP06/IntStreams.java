package FP06;

import java.util.stream.IntStream;

public class IntStreams {
    public static void main(String[] args) {

        IntStream.range(1,100);
        System.out.println(IntStream.range(1,100).reduce(Integer::sum).getAsInt());

        System.out.println(IntStream.iterate( 1, e -> e+2).limit(10).peek(System.out::println).sum());

        System.out.println(IntStream.iterate( 1, e -> e*2).limit(10).peek(System.out::println).sum());

    }
}
