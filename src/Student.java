import java.util.ArrayList;

public class Student {

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

}
