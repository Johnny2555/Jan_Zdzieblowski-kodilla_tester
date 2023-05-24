package com;

public class sayHello {
    private static String sayHello(){
        String text = "Hello World";
        return text;

    }
    private static int myAge(){
        int age = 45;
        return age;
    }
    private static double myHeight(){
        double height = 1.78;
        return height;
    }
    public static void main(String[] args) {
        String example = sayHello();
        System.out.println(example);
        int Age = myAge();
        System.out.println(Age);
        double height = myHeight();
        System.out.println(height);

    }
}
