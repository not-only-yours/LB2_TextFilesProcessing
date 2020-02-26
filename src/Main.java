import java.io.File;
import java.io.IOException;
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

        OutputToCsv output = new OutputToCsv();
        File[] files =  output.filesInFolder("C:\\Users\\darty\\OneDrive\\Документы\\GitHub\\LB2_TextFilesProcessing\\input");

        RatingTable ratingTable = new RatingTable();
        /*ratingTable.addStudent(student1);
        ratingTable.addStudent(student2);
        ratingTable.addStudent(student3);*/

        for (File file : files) {
            System.out.println(file);
            MyReader reader = new MyReader();
            try {
                ArrayList<Student> students = reader.read(file.getPath());
                ratingTable.addListOfStudents(students);
            } catch (IOException ex) {

            }
        }

        ratingTable.getNonBudgetTable();
        ratingTable.getBudgetTable();
    }

}
