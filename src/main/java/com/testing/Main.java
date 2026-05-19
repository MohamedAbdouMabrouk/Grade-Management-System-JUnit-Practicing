package com.testing;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School school = new School();
        while(true){
            System.out.println("=====================================\n" +
                    " STUDENT GRADE MANAGEMENT SYSTEM\n" +
                    "=====================================\n" +
                    "1. Add a new student\n" +
                    "2. Add grades for a student\n" +
                    "3. Display all students and their average grades\n" +
                    "4. Display class statistics\n" +
                    "5. Search for a student\n" +
                    "6. Exit\n" +
                    "=====================================\n" +
                    "Enter your choice (1-6):");

            int input = sc.nextInt();
            switch (input){
                case 1:{
                    school.addStudent();
                    break;
                }
                case 2:{
                    school.addGrades();
                    break;
                }
                case 3:{
                    school.displayAllStudents();
                }
            }
        }
    }
}