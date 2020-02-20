import java.io.IOException;
import java.io.*;
import java.util.ArrayList;

class OutputToCsv {
    public void Output(ArrayList<Student> studentsList) {
        try (FileWriter writer = new FileWriter("Output.csv")) {
            writer.write(studentsList.Student);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println((ex.getMessage()));
        }
    }
    public void Input() throws FileNotFoundException{
        FileReader reader = new FileReader("Input.csv");
        String bool;
        while(reader.hasNext()){
            
        }
    }
}

