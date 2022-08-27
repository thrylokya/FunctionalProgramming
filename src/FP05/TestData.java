package FP05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestData {

    private List<Courses> coursesList = new ArrayList<Courses>();

    public static void main(String[] args) {

        TestData testData = new TestData();
        testData.initData();

        Comparator<Courses> coursesStudentComparator = Comparator.comparing(Courses::getStudentCount);
        testData.coursesList.stream().sorted(coursesStudentComparator)
                .map(Courses -> Courses.getName())
                .forEach(System.out::println);
        System.out.println("=============================================================================");
        Comparator<Courses> coursesReviewScoreComparator = Comparator.comparing(Courses::getReviewScore).reversed();
        testData.coursesList.stream().sorted(coursesReviewScoreComparator)
                .map(Courses -> Courses.getName())
                .forEach(System.out::println);

        System.out.println("=============================================================================");

        Comparator<Courses> coursesStudentCountAndReviewScoreComparator =
                Comparator.comparing(Courses :: getStudentCount)
                        .thenComparing(Courses :: getReviewScore)
                        .reversed();

        testData.coursesList.stream()
                .sorted(coursesStudentCountAndReviewScoreComparator)
                .map(Courses -> Courses.getName())
                .forEach(System.out::println);
        System.out.println("=============================================================================");

        List<Courses> courses = testData.compareOf(testData.coursesList);
        courses.stream().map(course -> course.getName()).forEach(System.out::println);
    }

    private List<Courses> compareOf(List<Courses> coursesList) {

        Comparator<Courses> coursesComparator = new Comparator<Courses>() {
            @Override
            public int compare(Courses o1, Courses o2) {
             return (o1.getName().compareTo(o2.getName()));
            }
        };

        coursesList.sort(coursesComparator);
        return coursesList;

    }

    private void initData() {

        this.coursesList.add(new Courses("AWS", 200, 4.3f, "Cloud"));
        this.coursesList.add(new Courses("FP01", 20, 4.8f, "Functional Program"));
        this.coursesList.add(new Courses("Spring", 50, 4.0f, "Framework"));
        this.coursesList.add(new Courses("Spring boot", 40, 3.8f,"Framework"));
        this.coursesList.add(new Courses("IOS", 100, 3.5f, "Mobile"));
        this.coursesList.add(new Courses("GCP", 200, 4.9f,"Cloud"));
        this.coursesList.add(new Courses("Angular", 35, 2.5f, "Framework"));

    }
}
