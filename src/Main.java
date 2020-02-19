import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(50);
        list1.add(1);
        Student student1= new Student("kappa1", list1, true);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1000);
        Student student2 = new Student("kappa2", list2, false);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        Student student3 = new Student("kappa3", list3, false);

        RatingTable ratingTable = new RatingTable();
        ratingTable.addStudent(student1);
        ratingTable.addStudent(student2);
        ratingTable.addStudent(student3);

        System.out.println(ratingTable.getNonBudgetTable());
        System.out.println(ratingTable.getBudgetTable());
    }

}
