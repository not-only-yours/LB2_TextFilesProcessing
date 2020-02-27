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
            boolean is = false;
            if(buff.charAt(0)== '"')is = true;
            int i=0,j=0;
            String[] qq= buff.split("\\s*,\\s*");
            if(is) {
                do{
                    nameStudent+=(buff.charAt(i));
                    i++;
                }while(buff.charAt(i)!='"');
            }
            else
                do {
                    nameStudent += (buff.charAt(j));
                    j++;
                } while (buff.charAt(j) != ',');
                int h=1;
                if(!is) h=0;
                for (; h < qq.length; h++) {
                    lex.add(qq[h]);
                }

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
            System.out.println(student);
        }
        return students;
    }
    }