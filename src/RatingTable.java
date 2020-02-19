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

    public ArrayList<Student> getBudget() {
        ArrayList<Student> budget = new ArrayList<>();

        for (Student student : studentsList) {
            if (student.getBudget()) {
                budget.add(student);
            }
        }

        return budget;
    }

    public ArrayList<Student> getNonBudget() {
        ArrayList<Student> nonBudget = new ArrayList<>();

        for (Student student : studentsList) {
            if (student.getBudget()) {
                nonBudget.add(student);
            }
        }

        return nonBudget;
    }

    public Double getMinimumScholarRating() {
        ArrayList<Student> budget = this.getBudget();

        Integer numOfScholars = budget.size() * 4 / 10;

        return budget.get(numOfScholars - 1).getAverageRating();
    }

    public String getBudgetTable() {

        this.sortStudentsList();

        ArrayList<Student> budget = this.getBudget();

        String tableString = "BUDGET: \n" + budget.size() + "\n";

        for (Student student : budget) {
            tableString += student.getName() + " " + student.getAverageRating() + '\n';
        }

        return tableString;
    }

    public String getNonBudgetTable() {

        this.sortStudentsList();

        ArrayList<Student> nonBudget = this.getNonBudget();

        String tableString = "NON BUDGET: \n" + nonBudget.size() + "\n";

        for (Student student : nonBudget) {
            tableString += student.getName() + " " + student.getAverageRating() + '\n';
        }

        return tableString;
    }

    public String getGlobalTable() {

        this.sortStudentsList();

        String tableString = studentsList.size() + "\n";

        for (Student student : studentsList) {
            tableString += student.getName() + " " + student.getAverageRating() + '\n';
        }

        return tableString;
    }
}
