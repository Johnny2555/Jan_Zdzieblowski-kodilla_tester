package com.kodilla.optional.homework;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class ApplicationTest {
@Test
    void testFilterStudentTeacher(){
    List<Student> students = new ArrayList<>();
    students.add(new Student("John", new Teacher("Mr. Smith")));
    students.add(new Student("Alice", new Teacher("Mrs. Johnson")));
    students.add(new Student("Bob", null));

    List<String> expectedPairs = new ArrayList<>();
    expectedPairs.add("Student: John, Teacher: Mr. Smith");
    expectedPairs.add("Student: Alice, Teacher: Mrs. Johnson");
    expectedPairs.add("Student: Bob, Teacher: <undefined>");

    List<String> actualPairs = new ArrayList<>();
    for (Student student : students) {
        String studentName = student.getName();
        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");

        actualPairs.add("Student: " + studentName + ", Teacher: " + teacherName);
    }

    assertEquals(expectedPairs,actualPairs);

}

}