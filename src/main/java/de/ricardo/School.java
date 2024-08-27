package de.ricardo;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student findStudentByID(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }

    public boolean removeStudentByID(String studentID) {
        return students.removeIf(student -> student.getStudentID().equals(studentID));
    }


}
