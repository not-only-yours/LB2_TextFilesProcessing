import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
class OutputToCsv {
    public void output(ArrayList<Student> studentsList,String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(String.valueOf(studentsList.size()) + "\n");
            for (Student student : studentsList) {
                writer.write(student.getName() + ",") ;
                writer.write(String.valueOf(student.getAverageRating()) + ",");
                writer.write(String.valueOf(student.getBudget()));
                writer.append('\n');
                writer.flush();
            }
        }
             catch(IOException ex){
                System.out.println((ex.getMessage()));
            }
        }

    public File[] filesInFolder(String folder)
    {
        File myFolder = new File(folder);
        File[] files = myFolder.listFiles();
        return files;
    }
    }