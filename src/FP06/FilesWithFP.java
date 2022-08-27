package FP06;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FilesWithFP {

    public static void main(String[] args) throws IOException {

       Files.lines(Paths.get("/Users/tgeereddy/Documents/workspace/FunctionalProgramming/FunctionalProgramming/src/FP06/file.txt"))
               .map(line -> line.toUpperCase())
               .forEach(System.out::println);


        Files.lines(Paths.get("/Users/tgeereddy/Documents/workspace/FunctionalProgramming/FunctionalProgramming/src/FP06/file.txt"))
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
    }
}
