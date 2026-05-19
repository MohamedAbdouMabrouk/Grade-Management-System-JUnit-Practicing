package com.testing;

import java.util.ArrayList;

public class Student {
    private String name;
    private int ID;
    private ArrayList<Double> grades;
    private int gradeCount;

    private static int IDCounter = 1001;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public static int getIDCounter() {
        return IDCounter;
    }

    public static void setIDCounter(int IDCounter) {
        Student.IDCounter = IDCounter;
    }

    public int getGradeCount() {
        return gradeCount;
    }

    public void setGradeCount(int gradeCount) {
        this.gradeCount = gradeCount;
    }

    public Student(String name) {
        this.name = name;
        this.ID = IDCounter++;
        this.gradeCount = 0;
        this.grades = new ArrayList<>();
    }

    public void addGrade(Double grade) {
        if (gradeCount >= 5) {
            System.out.println("Student already has maximum grades (5). Cannot add more.");
        }
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid Grade");
        }
        grades.add(grade);
        gradeCount++;
    }

    public double getAvg() {
        if (grades.isEmpty()) {
            return 0.0; // Prevent division by zero
        }

        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    public double averageGrade() {
        double sum = 0;
        int s = grades.size();
        for (double grade : grades) {
            sum += grade;
        }
        return sum / s;
    }

    public String myfinalGrade() {
        if (grades.isEmpty()) {
            return "no grades are assigned yet";
        }
        double avg = getAvg();
        if (avg <= 100 && avg >= 90) {
            return "A";
        } else if (avg >= 80 && avg < 90) {
            return "B";
        } else if (avg >= 60 && avg < 70) {
            return "D";
        } else if (avg >= 70 && avg < 80) {
            return "C";
        } else {
            return "F";
        }
    }

}

