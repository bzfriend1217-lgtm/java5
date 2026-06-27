package org.example;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    private Scanner sc;

    public Main() {
        this.sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.run();

    }


    public void run() {
        Classroom classroom = new Classroom();

        Student student1 = new Student(1, "Kim Hana", 87);
        Student student2 = new Student(2, "Lee Doyun", 92);
        Student student3 = new Student(3, "Park Seojun", 58);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        //TODO
        System.out.println(classroom.getStudents());
        System.out.println("input id to rewrite.");
        int queryId = readInt("input ID: ");
        if (queryId == -1) {
            return;
        }

        Optional<Student> studentOptional = classroom.findById(queryId);
        if (studentOptional.isEmpty()) {
            System.out.println("failed to search, no matching student.");
            return;
        }
        Student student = studentOptional.get();

        int queryScore = readInt("input Score: ");
        if (queryScore == -1) {
            return;
        }

        try {
            student.updateScore(queryScore);
        } catch (IllegalArgumentException e){
            System.out.println("Wrong score.");
            return;
        }

        printStudents(classroom);
        printTopStudent(classroom);

    }
        private int readInt(String label) {
            int i = 0;
            do {
                i++;

                System.out.print(label);
                String input = sc.nextLine().trim();
                try {
                    return Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Input only numbers.");
                    System.out.println("error time(s): " + i + " time(s) you have " + (4 - i) + " left");
                }
            } while(i < 4);
            System.out.println("failed 4 times.");
            return -1;
        }



        private void printStudents(Classroom classroom) {
            System.out.println(classroom.getPassedStudents());

        }

        private void printTopStudent(Classroom classroom) {
            System.out.println(classroom.findTopStudent());
        }




}