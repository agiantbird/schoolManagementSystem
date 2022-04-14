package school.management.system;

/**
 * this class is responsible for keeping track of
 * a teacher's id, name, and salary.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int teacherId, String teacherName, int teacherSalary) {
        this.id = teacherId;
        this.name = teacherName;
        this.salary = teacherSalary;
        this.salaryEarned = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneyEarned(-salary);
    }
}
