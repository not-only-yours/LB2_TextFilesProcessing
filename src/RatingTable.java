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
            if (!student.getBudget()) {
                nonBudget.add(student);
            }
        }

        return nonBudget;
    }

    public Double getMinimumScholarRating() {

        for (Student student : studentsList) {
            student.setScholar(false);
        }

        ArrayList<Student> budget = this.getBudget();

        Integer numOfScholars = budget.size() * 4 / 10;

        if (numOfScholars == 0.0) {
            return 1000000.0;
        }

        return budget.get(numOfScholars).getAverageRating();
    }

    public void getBudgetTable() {

        this.sortStudentsList();

        ArrayList<Student> budget = this.getBudget();

        OutputToCsv output = new OutputToCsv();

        output.output(budget, "budget.csv");

        /*String tableString = "BUDGET: \n" + budget.size() + "\n";

        Double scholar = this.getMinimumScholarRating();

        for (Student student : budget) {
            tableString += student.getName() + " " + student.getAverageRating() + " ";
            if (student.getAverageRating() >= scholar) {
                tableString += "SCHOLAR";
                student.setScholar(true);
            }
            tableString += "\n";
        }

        return tableString;*/
    }

    public void getNonBudgetTable() {

        this.sortStudentsList();

        ArrayList<Student> nonBudget = this.getNonBudget();

        OutputToCsv output = new OutputToCsv();

        output.output(nonBudget, "nonbudget.csv");

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
