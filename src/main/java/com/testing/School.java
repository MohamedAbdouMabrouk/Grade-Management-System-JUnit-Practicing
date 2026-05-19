package com.testing;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private ArrayList<Student> students;
    static final int MAX_STUDENTS = 100;
    Scanner sc = new Scanner(System.in);

    public School() {
        this.students = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getStudentCount() {
        return this.students.size();
    }

    public void addStudent(){
        if (students.size() >= MAX_STUDENTS){
            System.out.println("System is full! Cannot add more students.");
            return;
        }
        System.out.println("Please Enter The Student Name: ");
        String name = sc.next();
        Student s = new Student(name);
        students.add(s);
        System.out.println("The System Has Created The Student Successfully!");
        System.out.println("Student Name: " + s.getName() + "Student ID: " + s.getID());
    }

    public void addGrades(){
        if(getStudentCount() == 0){
            System.out.println("No students in the system yet. Please add a student first.");
            return;
        }
        students.forEach(student -> {
            System.out.println(student.getID() + " " + student.getName());
        });

        System.out.println("Please Enter The Student ID: ");
        int ID = sc.nextInt();
        Student student  = getByID(ID);

        if(student.getGradeCount() >= 5){
            System.out.println("Student already has maximum grades (5). Cannot add more.");
            return;
        }

        System.out.println("Do You Want To Add A New grade? y/n");
        String in = sc.next();
        while (in.equals("y")){
            System.out.println("Please Enter The Grade: ");
            student.addGrade(sc.nextDouble());
            System.out.println("Do You Want To Add A New grade? y/n");
            in = sc.next();
        }

        student.getGrades().forEach(System.out::println);
        System.out.println("Average: " + student.getAvg());

    }

    public Student getByID(int ID){
        return students.stream()
                .filter(student -> student.getID() == ID)
                .findFirst()
                .orElse(null);
    }

    public void displayAllStudents(){
        if(students.isEmpty()){
            System.out.println("No students in the system.");
        }

        students.forEach(student -> {
            System.out.println("ID: " + student.getID() + " | Name: " + student.getName());
            System.out.print("Grades: ");
            student.getGrades().forEach(grade -> System.out.print(grade + " "));
            System.out.println();
            System.out.println("Average: " + student.getAvg()); // Prints a new line after listing the grades
            System.out.println("-------------------------------------");
        });
    }

    public void calculateAverage(){
        if(getStudentCount() == 0){
            System.out.println("No students in the system yet. Please add a student first.");
            return;
        }
        students.forEach(student -> {
            System.out.println(student.getID() + " " + student.getName());
        });

        System.out.println("Please Enter The Student ID: ");
        int ID = sc.nextInt();
        Student student  = getByID(ID);
        System.out.println("Average: " + student.getAvg());
    }

    public void displayClassStatistics(){
        if(getStudentCount() == 0){
            System.out.println("No students in the system yet. Please add a student first.");
            return;
        }
        System.out.println("Total Students: " + students.size());

    }
}
