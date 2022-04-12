package school.management.system;

/**
 * this class is responsible for keeping track of
 * a teacher's id, name, and salary.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    public Teacher(int teacherId, String teacherName, int teacherSalary) {
        this.id = teacherId;
        this.name = teacherName;
        this.salary = teacherSalary;
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
}
