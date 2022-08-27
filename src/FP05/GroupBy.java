package FP05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupBy {

    private List<Courses> coursesList = new ArrayList<Courses>();

    public static void main(String[] args) {
        GroupBy groupBy = new GroupBy();
        groupBy.initData();

        System.out.println(groupBy.coursesList.stream()
                .collect(Collectors.groupingBy(Courses :: getCategory)));

    }

    private void initData() {

        this.coursesList.add(new Courses("AWS", 200, 4.3f, "Cloud"));
        this.coursesList.add(new Courses("FP01", 20, 4.8f, "Functional Program"));
        this.coursesList.add(new Courses("Spring", 50, 4.0f, "Framework"));
        this.coursesList.add(new Courses("Spring boot", 40, 3.8f,"Framework"));
        this.coursesList.add(new Courses("ios", 100, 3.5f, "Mobile"));
        this.coursesList.add(new Courses("GCP", 200, 4.9f,"Cloud"));
        this.coursesList.add(new Courses("Angular", 35, 2.5f, "Framework"));

    }
}
