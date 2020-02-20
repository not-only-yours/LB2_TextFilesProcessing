import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.io.IOException;
class OutputToCsv {
    public void Output(ArrayList<Student> studentsList,String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Student student : studentsList) {
                writer.write(student.getName() + ",") ;
                writer.write(String.valueOf(student.getBudget()));
                writer.append('\n');
                writer.flush();
            }
        }
             catch(IOException ex){
                System.out.println((ex.getMessage()));
            }
        }
    }


