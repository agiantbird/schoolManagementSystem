package school.management.system;
/**
 * This class is responsible for keeping track of students
 * and their name, grade, fees due, and fees paid.
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * to create a new Student object by initializing values
     * @param studentId, id for the student: unique
     * @param studentName, name of the student
     * @param studentGrade, grade for the student
     */
    public Student(int studentId, String studentName, int studentGrade) {
        this.id = studentId;
        this.name = studentName,
        this.grade = studentGrade,
    }
}
