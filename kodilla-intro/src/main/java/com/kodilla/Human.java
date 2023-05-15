package com.kodilla;

public class Human {
    int weight;
    int age;
    double height;

    public Human (int weight, int age, double height){
        this.weight = weight;
        this.age = age;
        this.height = height;

    }
    public void checkWeight(){
        if( this.weight < 80 && this.age < 20){
            System.out.println("Human is not heavy and teenage");
        }else if (this.weight > 80 && this.age > 20){
            System.out.println("Human is heavy and adult");
        }else {
            System.out.println("Human no exist");
        }
    }
    public void checkHeight() {
        if (this.height < 1.5) {
            System.out.println("Human is not tall");
        } else if (this.height>1.5 && this.height<1.8){
            System.out.println("Human is normal");
        }else{
            System.out.println("Human is tall");
        }
    }
}
