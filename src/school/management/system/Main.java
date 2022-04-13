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
        System.out.println(willowbrookHigh.getTotalMoneyEarned());
    }
}
