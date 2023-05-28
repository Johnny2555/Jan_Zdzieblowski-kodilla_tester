package com.kodilla.abstracts;

public class Application1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1000, "Teaching");
        Person person1 = new Person("John", 40, teacher);
        person1.checkResponsibilities();

        Doctor doctor = new Doctor(1500, "Healing");
        Person person2 = new Person("Mark",50,doctor);
        person2.checkResponsibilities();


    }
}