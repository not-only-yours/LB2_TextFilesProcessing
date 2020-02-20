import java.io.IOException;
import java.io.*;
class OutputToCsv {
    public void Output(String args[]) {
        try (FileWriter writer = new FileWriter("Output.csv")) {
            writer.write(studentslist);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println((ex.getMessage()));
        }
    }
}
