package com.tnsif.daytwelve.userdefinedexp;

import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {
        try {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);

            Student student = new Student();
            StudentService studentService = new StudentService();

            System.out.println("Enter roll No:");
            int rollNo = sc.nextInt();
            student.setRollNo(rollNo);

            System.out.println("Enter Name:");
            sc.nextLine(); // Consume newline
            String name = sc.nextLine();
            student.setName(name);

            System.out.println("Enter the number of subjects:");
            int sub = sc.nextInt();

            if (sub > 0) {
                student.setNoOfSubjects(sub);
                System.out.println("Enter the marks for " + sub + " subjects:");
                int[] marks = new int[sub];

                for (int i = 0; i < sub; i++) {
                    marks[i] = sc.nextInt();
                }

                studentService.setMarks(student, marks);
                System.out.println(student);
            } else {
                System.out.println("Enter valid number of subjects");
            }
        } catch (InvalidMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}
