package com.numbers;

import java.util.ArrayList;
import java.util.List;

class Student {
    private static int idCounter = 100;
    private int id;
    private String name;
    private String parentage;
    
    Student(String name, String parentage) {
        this.id = ++idCounter;
        this.setName(name);
        this.setParentage(parentage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentage() {
        return parentage;
    }
    
    public int getId() {
        return id;
    }

    public void setParentage(String parentage) {
        this.parentage = parentage;
    }
}

class ClassRoom {
    String nameOfClassRoom;
    List<Student> students;
    
    ClassRoom(String nameOfClassRoom) {
        this.nameOfClassRoom = nameOfClassRoom;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(String name, String parentage) {
        students.add(new Student(name, parentage));
    }
    
    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getParentage() + " " + student.getId());
        }
    }
}

class School {
    String schoolName;
    List<ClassRoom> classRooms;
}

public class SchoolSystem {

    public static void main(String[] args) {
        ClassRoom classRoom1 = new ClassRoom("Ist");
        ClassRoom classRoom2 = new ClassRoom("2nd");
        
        classRoom1.addStudent("Haroon", "Khanday");
        classRoom1.addStudent("Bilal", "Khanday");
        classRoom1.addStudent("John", "Khanday");
        classRoom1.addStudent("Ali", "Khanday");
        
        classRoom2.addStudent("John", "Doe");
        classRoom2.addStudent("Ali", "Smith");
        classRoom1.printAllStudents();
        classRoom2.printAllStudents();
    }
}
