package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Poland",10,"yes"));
        stamps.add(new Stamp("America",5,"no"));
        stamps.add(new Stamp("Japan",7,"yes"));
        stamps.add(new Stamp("America",5,"no"));
        System.out.println(stamps.size());

        for (Stamp stamp: stamps){
            System.out.println(stamps);
        }

    }
}
