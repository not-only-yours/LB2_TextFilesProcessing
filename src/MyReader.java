import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class MyReader {

    public MyReader() {

    }

    public ArrayList<Student> read(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));

        int numberOfString = scanner.nextInt();

        System.out.println(numberOfString);
       String nameOfStudent = new String();
        ArrayList<Student> students = new ArrayList<>();
        String buff = new String();
        while (scanner.hasNextLine()) {
            buff = scanner.nextLine();
            nameOfStudent = new buff.split(",");
            ArrayList<Integer> markOfStudent = new ArrayList<>();
            markOfStudent.add(Integer.parseInt(new buff.split(",")));
            boolean budgetOfStudent;
            String[] isBudget;
            isBudget = buff.split(",");
            if (isBudget.equals("TRUE")) budgetOfStudent = true;
            else budgetOfStudent = false;
            Student student = new Student(nameOfStudent, markOfStudent, budgetOfStudent);
            students.add(student);
        }
        return students;
    }

    }