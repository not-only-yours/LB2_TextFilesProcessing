import java.util.ArrayList;

public class Student implements Comparable<Student> {

    private final String name;
    private final ArrayList<Integer> rating;
    private final Boolean budget;

    public Student(String name, ArrayList<Integer> rating, Boolean budget) {
        this.name = name;
        this.rating = rating;
        this.budget = budget;
    }

    public Double getAverageRating() {

        Integer summaryRating = 0;

        for (Integer rate : rating) {
            summaryRating += rate;
        }

        Double averageRating = (double)(summaryRating) / (double)rating.size();

        return averageRating;
    }

    public String getName() {
        return name;
    }

    public Boolean getBudget() {
        return budget;
    }

    @Override
    public int compareTo(Student otherStudent) {
        if (this.budget && !otherStudent.budget) {
            return 1;
        } else if (!this.budget && otherStudent.budget) {
            return 1;
        } else {
            if(this.getAverageRating() < otherStudent.getAverageRating()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
