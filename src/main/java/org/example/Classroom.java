package org.example;

import java.util.*;

public class Classroom {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {

        return new ArrayList<>(this.students);
    }

    public Optional<Student> findById(int id) {

      // Optional<Student> studentOptional = Optional.empty();
      //
      // for (Student student : students) {
      // if (student.getId() == id) {
      // studentOptional = Optional.of(student);
      // break;
      // }
      // }
      //
      // return studentOptional;

      return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst();
    }


    public List<Student> getPassedStudents() {
        return students.stream()
                .filter(student -> student.getPassStatus() == PassStatus.PASSED)
                .toList();
    }

    public Optional<Student> findTopStudent() {
        return students.stream()
                .max(Comparator.comparingInt(Student::getScore));
    }

    public List<Student> searchByName(String name) {
        return students.stream()
                .filter(student -> (student.getName()).contains(name))
                .toList();
    }
}

