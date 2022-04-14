package school.management.system;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher benny = new Teacher(2, "Benny", 450);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(benny);


        Student joe = new Student(1, "Joe", 10);
        Student betty = new Student(2, "Betty", 11);

        List<Student> studentList = new ArrayList<>();
        studentList.add(joe);
        studentList.add(betty);

        School willowbrookHigh = new School(teacherList, studentList);
        System.out.println("- - - current money in budget - - -");
        System.out.println(willowbrookHigh.getTotalMoneyEarned());
        System.out.println("- - - collecting student fees - - -");
        System.out.println("- - - current money in budget - - -");
        joe.payFees(5000);
        System.out.println(willowbrookHigh.getTotalMoneyEarned());
        System.out.println("- - - paying out salaries - - -");
        lizzy.receiveSalary(lizzy.getSalary());
        benny.receiveSalary(benny.getSalary());
        System.out.println("- - - current money in budget - - -");
        System.out.println(willowbrookHigh.getTotalMoneyEarned());

    }
}
