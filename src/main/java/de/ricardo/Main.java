package de.ricardo;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ricardo", "Lemser", "S123"));
        students.add(new Student("Lara", "Müller", "S124"));
        students.add(new Student("Alice", "Horstmann", "S125"));


        for (Student student : students) {
            System.out.println(student);
        }
    }
}
