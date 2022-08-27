package FP05;

import java.io.Serializable;
import java.util.Comparator;

public class Courses  {



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public float getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(float reviewScore) {
        this.reviewScore = reviewScore;
    }

    private String name;
    private int studentCount;
    private float reviewScore;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String category;


    public Courses(String name, int studentCount, float reviewScore, String category) {
        this.name = name;
        this.studentCount = studentCount;
        this.reviewScore = reviewScore;
        this.category = category;
    }


}
