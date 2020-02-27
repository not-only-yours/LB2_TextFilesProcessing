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

        sortStudentsList();

        return budget;
    }

    public ArrayList<Student> getNonBudget() {
        ArrayList<Student> nonBudget = new ArrayList<>();

        for (Student student : studentsList) {
            if (!student.getBudget()) {
                nonBudget.add(student);
            }
        }

        return nonBudget;
    }

    public Double getMinimumScholarRating() {

        /*for (Student student : studentsList) {
            student.setScholar(false);
        }*/

        this.sortStudentsList();

        ArrayList<Student> budget = this.getBudget();

        Integer numOfScholars = budget.size() * 4 / 10;

        if (numOfScholars == 0.0) {
            return 1000000.0;
        }

        return budget.get(numOfScholars).getAverageRating();
    }

    public ArrayList<Student> getScholar() {
        Double scholar = getMinimumScholarRating();
        ArrayList<Student> scholars = new ArrayList<>();

        for (Student student : studentsList) {
            if (student.getBudget() && student.getAverageRating() >= scholar) {
                scholars.add(student);
            }
        }

        return scholars;
    }

    public ArrayList<Student> getNonScholar() {
        Double scholar = getMinimumScholarRating();
        ArrayList<Student> nonScholars = new ArrayList<>();

        for (Student student : studentsList) {
            if (!student.getBudget() || student.getAverageRating() < scholar) {
                nonScholars.add(student);
            }
        }

        return nonScholars;
    }

    public void getBudgetTable() {

        //this.sortStudentsList();

        ArrayList<Student> scholars = this.getScholar();

        OutputToCsv output = new OutputToCsv();

        output.output(scholars, "scholar.csv");
    }

    public void getNonBudgetTable() {

        //this.sortStudentsList();

        ArrayList<Student> nonScholars = this.getNonScholar();

        OutputToCsv output = new OutputToCsv();

        output.output(nonScholars, "nonScholars.csv");

        /*String tableString = "NON BUDGET: \n" + nonBudget.size() + "\n";

        for (Student student : nonBudget) {
            tableString += student.getName() + " " + student.getAverageRating() + '\n';
        }

        return tableString;*/
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
