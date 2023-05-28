package com.kodilla.abstracts;

public abstract class Job {
    private double salary;
    private String responsibilities;

    public Job (double salary, String responsibilities){
        this.salary = salary;
        this.responsibilities =responsibilities;
        }
        public double getSalary(){
        return salary;
        }
        public String getResponsibilites(){
        return responsibilities;
        }
}
