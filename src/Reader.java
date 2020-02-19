import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Reader {
    public static void read(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("Import.txt"));
       int numberOfString = reader.nextInt();
        Object[] Students = new Object[numberOfString];


        while(reader.hasNext()) {
            String boof = reader.nextLine();


        }
    }
}


class Students{
    String name;
    int rating;
    boolean budget;
        }