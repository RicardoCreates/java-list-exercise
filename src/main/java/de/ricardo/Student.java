package de.ricardo;

public class Student {
    private String firstName;
    private String lastName;
    private String studentID;

    public Student(String firstName, String lastName, String studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Name: " + firstName + " " + lastName;
    }
}
