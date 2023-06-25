package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", new Teacher("Mr. Smith")));
        students.add(new Student("Alice", new Teacher("Mrs. Johnson")));
        students.add(new Student("Bob", null));
        students.add(new Student("Eva", new Teacher("Mr. Brown")));
        students.add(new Student("Mike", null));

        for (Student student : students) {
            String studentName = student.getName();
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");

            System.out.println("Student: " + studentName + ", Teacher: " + teacherName);
        }
    }

    }

