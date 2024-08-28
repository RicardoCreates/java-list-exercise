package de.ricardo;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List<Student> students = new ArrayList<>();

        //students.add(new Student("Ricardo", "Lemser", "S123"));
        //students.add(new Student("Lara", "Müller", "S124"));
        //students.add(new Student("Alice", "Horstmann", "S125"));


        //for (Student student : students) {
        //    System.out.println(student);
        //}

        School school = new School();

        school.addStudent(new Student("Ricardo", "Lemser", "S123"));
        school.addStudent(new Student("Lara", "Müller", "S124"));
        school.addStudent(new Student("Alice", "Horstmann", "S125"));

        school.printAllStudents();


        System.out.println("Finding student with ID S124:");
        System.out.println(school.findStudentByID("S124"));


        System.out.println("Removing student with ID S125:");
        boolean removed = school.removeStudentByID("S125");
        System.out.println("Student removed: " + removed);


        school.printAllStudents();

    }
}
