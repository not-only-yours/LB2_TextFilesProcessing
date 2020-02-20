import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MyReader {

    public MyReader() {

    }

    public ArrayList<Student> read(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));

        int numberOfString = scanner.nextInt();

        System.out.println(numberOfString);

        ArrayList<Student> students = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String buff = scanner.nextLine();

            System.out.println(buff);
        }

        return students;

        /*for (int i=0; i<numberOfString; i++) {


            ArrayList<String> array = new ArrayList<>();

            for (String s : buff.split(",")) {
                array.add(s);
            }

            ArrayList<Integer> marks = new ArrayList<>();
            marks.add(Integer.valueOf(array.get(1)));
            marks.add(Integer.valueOf(array.get(2)));
            marks.add(Integer.valueOf(array.get(3)));
            marks.add(Integer.valueOf(array.get(4)));
            marks.add(Integer.valueOf(array.get(5)));

            Student student = new Student(array.get(0), marks, Boolean.parseBoolean(array.get(7)));

            students.add(student);
        }

        return students;*/
    }
}