import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(1);

        Student student = new Student("kappa", list, false);
        System.out.println(student.getAverageRating());
    }

}
