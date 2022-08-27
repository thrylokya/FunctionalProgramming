package FP06;

import FP05.Courses;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HigherOrderFunctions {

    private List<Courses> coursesList = new ArrayList<Courses>();

    public static void main(String[] args) {

        HigherOrderFunctions higherOrderFunctions = new HigherOrderFunctions();
        higherOrderFunctions.init();

        higherOrderFunctions.coursesList.stream()
                .filter(courses -> courses.getReviewScore()>4.0f)
                .map(courses -> courses.getName())
                .forEach(System.out::println);


        higherOrderFunctions.coursesList.stream()
                .filter(courses -> courses.getReviewScore()>3.0f)
                .map(courses -> courses.getName())
                .forEach(System.out::println);

        float threshold1 = 3.0f;
        float threshold2 = 4.0f;
        float threshold3 = 5.0f;

        higherOrderFunctions.coursesList.stream()
                .filter(higherOrderFunctions.filterByReviewScore(threshold1))
                .map(courses -> courses.getName())
                .forEach(System.out::println);

        higherOrderFunctions.coursesList.stream()
                .filter(higherOrderFunctions.filterByReviewScore(threshold2))
                .map(courses -> courses.getName())
                .forEach(System.out::println);

        higherOrderFunctions.coursesList.stream()
                .filter(higherOrderFunctions.filterByReviewScore(threshold3))
                .map(courses -> courses.getName())
                .forEach(System.out::println);

    }

    private Predicate<Courses> filterByReviewScore(float threshold)
    {
        return course -> course.getReviewScore() > threshold;
    }

    private void init()
    {
        this.coursesList.add(new Courses("AWS", 200, 4.3f, "Cloud"));
        this.coursesList.add(new Courses("FP01", 20, 4.8f, "Functional Program"));
        this.coursesList.add(new Courses("Spring", 50, 4.0f, "Framework"));
        this.coursesList.add(new Courses("Spring boot", 40, 3.8f,"Framework"));
        this.coursesList.add(new Courses("ios", 100, 3.5f, "Mobile"));
        this.coursesList.add(new Courses("GCP", 200, 4.9f,"Cloud"));
        this.coursesList.add(new Courses("Angular", 35, 2.5f, "Framework"));

    }

}
