import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class MyReader {
    int numberOfString;
    boolean budgetOfStudent;
    String[] nameOfStudent;
    String nameStudent;
    ArrayList<Integer> markOfStudent;
    String buff;
    String[] buffToInt;
    String toInt;

    public ArrayList<Student> read(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        numberOfString = scanner.nextInt();
        System.out.println(numberOfString);
        nameOfStudent = new String[50];
        ArrayList<Student> students = new ArrayList<>();
        buff = new String();
        while (scanner.hasNextLine()) {
            buff = scanner.nextLine();
            nameOfStudent = buff.split(",");
            markOfStudent = new ArrayList<>();
            buffToInt = new String[50];
            buffToInt=buff.split(",");
            toInt=new String();
            toInt= buffToInt.toString();
            markOfStudent.add(Integer.parseInt(toInt));
            String[] isBudget;
            isBudget = buff.split(",");
            if (isBudget.equals("TRUE")) budgetOfStudent = true;
            else budgetOfStudent = false;
            nameStudent = new String();
            nameStudent=nameOfStudent.toString();
            Student student = new Student(nameStudent, markOfStudent, budgetOfStudent);
            students.add(student);
        }
        return students;
    }

    }