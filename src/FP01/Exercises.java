package FP01;

import java.util.List;

public class Exercises {

    public static void main(String ap[])
    {
     //   printOddNumbers(List.of(12,3,5,6,7,9,10));
      //  printCubesofOddNumbers(List.of(12,3,5,6,7,9,10));
       // printCoursesIndividually(List.of("Spring", "Spring boot","API", "Metadata", "AWS","PCF","Azure"));
     //   printCourseContainingSpring(List.of("Spring", "Spring boot","API", "Metadata", "AWS","PCF","Azure"));
      //  printCourseContainingAltesat4Chars(List.of("Spring", "Spring boot","API", "Metadata", "AWS","PCF","Azure"));
        printCharsInCourse(List.of("Spring", "Spring boot","API", "Metadata", "AWS","PCF","Azure"));

    }

    static void printOddNumbers(List<Integer> list)
    {
        list.stream()
                .filter(number -> number%2!=0)
                .forEach(System.out :: println);
    }

    static void printCoursesIndividually(List<String> courseList)
    {
        courseList.stream()
                .forEach(System.out :: println);
    }

    static void printCourseContainingSpring(List<String> courseList)
    {
        courseList.stream()
                .filter(word -> word.indexOf("Spring")!=-1)
                .forEach(System.out :: println);
    }

    static void printCourseContainingAltesat4Chars(List<String> courseList)
    {
        courseList.stream()
                .filter(word -> word.length() >=4)
                .forEach(System.out :: println);
    }

    static void printCubesofOddNumbers(List<Integer> list)
    {
        list.stream()
                .filter(number -> number % 2 !=0)
                .map(number -> number * number * number)
                .forEach(System.out :: println);
    }

    static void printCharsInCourse(List<String> courseList)
    {
        courseList.stream()
                .map(course -> course +" " + course.length())
                .forEach(System.out :: println);
    }
}
