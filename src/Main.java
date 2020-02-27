import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        OutputToCsv output = new OutputToCsv();

        System.out.println("Enter directory: ");
        Scanner scanner = new Scanner(System.in);
        File[] files =  output.filesInFolder("./input");

        RatingTable ratingTable = new RatingTable();

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
