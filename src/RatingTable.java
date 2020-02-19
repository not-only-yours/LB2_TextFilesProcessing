import java.util.ArrayList;
import java.util.Collections;

public class RatingTable {

    private ArrayList<Student> studentsList;

    RatingTable() {
        studentsList = new ArrayList<Student>();
    }

    RatingTable(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void addListOfStudents(ArrayList<Student> studentsList) {
        for (Student student : studentsList) {
            this.studentsList.add(student);
        }
    }

    public void sortStudentsList() {
        Collections.sort(studentsList);
    }

    public String getRatingTable() {

        this.sortStudentsList();

        String tableString = new String();
        tableString = studentsList.size() + "\n";

        for (Student student : studentsList) {
            tableString += student.getName() + " " + student.getAverageRating() + '\n';
        }

        return tableString;
    }

}
