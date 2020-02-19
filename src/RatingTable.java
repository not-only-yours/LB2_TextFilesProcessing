import java.util.ArrayList;

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

    public String getRatingTable() {
        String tableString = new String();
        tableString += studentsList.size() + '\n';

        for (Student student : studentsList) {
            tableString += student.getName() + " " + student.getAverageRating() + '\n';
        }

        return tableString;
    }

}
