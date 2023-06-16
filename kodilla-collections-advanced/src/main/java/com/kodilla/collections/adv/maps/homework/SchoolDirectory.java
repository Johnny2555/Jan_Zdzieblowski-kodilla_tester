package com.kodilla.collections.adv.maps.homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal,School> school = new HashMap<>();
        Principal principal1= new Principal("Jan Kowalski");
        Principal principal2= new Principal("Karol Szczęsny");
        Principal principal3=new Principal("Tadeusz Król");

        School school1 = new School("Szkoła podstawowa", Arrays.asList(23,32,30));
        School school2 = new School("Liceum", Arrays.asList(15,33,28));
        School school3 = new School("Uniwersytet", Arrays.asList(31,25,19));

        school.put(principal1,school1);
        school.put(principal2,school2);
        school.put(principal3,school3);

        for (Map.Entry<Principal,School> information: school.entrySet()){
            School school4 = information.getValue();
            System.out.println("name school"+ information.getKey().getPrincipal() + "students"+ school4.getName()+ "suma"+school4.suma());
        }




    }
}
