import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(1);

        Student student = new Student("kappa", list, true);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1000);
        Student student2 = new Student("kappa1", list2, false);

        RatingTable ratingTable = new RatingTable();
        ratingTable.addStudent(student);
        ratingTable.addStudent(student2);

        System.out.println(ratingTable.getRatingTable());
    }

}
