import java.io.PrintWriter;
class OutputToCsv {
    PrintWriter writer = new PrintWriter(filename, "UTF-8");
    writer.println(studentslist);
    writer.close();
    }
