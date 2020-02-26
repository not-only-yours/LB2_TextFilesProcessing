import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class MyReader {
   public static int numberOfString;

    public static Boolean budgetOfStudent;
    public static String nameStudent;
    public static ArrayList<Integer> markOfStudent;

    public static ArrayList<String> lex;

    public ArrayList<Student> read(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        numberOfString = Integer.parseInt(scanner.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lex = new ArrayList<>();
            String buff = scanner.nextLine();
            for (String nex : buff.split("\\s*,\\s*")) {
                lex.add(nex);
            }
            nameStudent = lex.get(0);
            markOfStudent = new ArrayList<>();
            markOfStudent.add(Integer.parseInt(lex.get(1)));
            markOfStudent.add(Integer.parseInt(lex.get(2)));
            markOfStudent.add(Integer.parseInt(lex.get(3)));
            markOfStudent.add(Integer.parseInt(lex.get(4)));
            markOfStudent.add(Integer.parseInt(lex.get(5)));
           if(lex.get(6).equals("TRUE")) budgetOfStudent = true;
            else budgetOfStudent = false;
            Student student = new Student(nameStudent, markOfStudent, budgetOfStudent);
            students.add(student);
        }
        return students;
    }
    }