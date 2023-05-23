package com.kodilla;

public class Human2 {
    public static void main(String[] args){
        Human human = new Human (58, 18, 1.9);
        System.out.println(" Weight is:" + human.weight + " " + "Age is:"+ human.age +" "+"Height is:" +human.height);
        human.checkWeight();
        human.checkHeight();

    }
}
