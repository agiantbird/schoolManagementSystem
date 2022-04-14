package school.management.system;
/**
 * This class is responsible for keeping track of students
 * and their name, grade, fees due, and fees paid.
 */
public class Student {
    // fields
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * to create a new Student object by initializing values
     * Fees for every student is going to be $30,000 per year.
     * fees paid initially is $0.
     * @param studentId, id for the student: unique
     * @param studentName, name of the student
     * @param studentGrade, grade for the student
     */
    public Student(int studentId, String studentName, int studentGrade) {
        this.id = studentId;
        this.name = studentName;
        this.grade = studentGrade;
        this.feesTotal = 30_000;
        this.feesPaid = 0;
    }

    /* We're not going to alter a student's name or id. */

    // setters always void, getters return data types
    // setGrade used to update student's grade @param grade is new grade
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeesTotal() {
        return this.feesTotal;
    }

    public int getFeesPaid() {
        return this.feesPaid;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getGrade() {
        return this.grade;
    }

    public void payFees(int feesPaid) {
        this.feesPaid += feesPaid;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }


}
