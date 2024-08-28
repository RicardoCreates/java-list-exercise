package de.ricardo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    //private List<Student> students;
    private Map<String, Student> students = new HashMap<>();

    //public School() {
    //    this.students = new ArrayList<>();
    //}



    //public void addStudent(Student student) {
    //    students.add(student);
    //}

    public void addStudent(Student student) {
        students.put(student.getStudentID(), student);
    }

    //public void printAllStudents() {
    //    for (Student student : students) {
    //        System.out.println(student);
    //    }

    public void printAllStudents() {
        System.out.println(students);
    }


    //public Student findStudentByID(String studentID) {
    //    for (Student student : students) {
    //        if (student.getStudentID().equals(studentID)) {
    //            return student;
    //        }
    //    }
    //    return null;
    //}

    //public boolean removeStudentByID(String studentID) {
    //    return students.removeIf(student -> student.getStudentID().equals(studentID));
    //}

    public boolean removeStudentByID(String studentID) {
        return students.remove(studentID) != null;
    }

    public Student findStudentByID(String studentID) {
        return students.get(studentID);
    }
}

