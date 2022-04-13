package school.management.system;

import java.util.List;

public class School {
    /**
     * School can have many teachers, many students
     */

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent =0;
    }
    // return list of teachers
    public List<Teacher> getTeachers() {
        return teachers;
    }

    // add teacher to list of teachers
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }
    // return list of students
    public List<Student> getStudents() {
        return students;
    }
    // add student to list of students
    public void setStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void updateTotalMoneyEarned(int moneyEarned) {
        this.totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateTotalMoneySpent(int moneySpent) {
        this.totalMoneySpent += moneySpent;
    }
}
