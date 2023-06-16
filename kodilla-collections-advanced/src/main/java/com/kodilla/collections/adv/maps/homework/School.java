package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private String name;
    private List<Integer> schoolSize =new ArrayList<>();

    public School(String name, List<Integer> schoolSize){
        this.name=name;
        this.schoolSize=schoolSize;

    }

    public String getName() {
        return name;
    }

    public List<Integer> getSchoolSize() {
        return schoolSize;
    }
    public int suma(){
        int sum = 0;
        for(int size: schoolSize)
            sum = sum + size;
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(name, school.name) && Objects.equals(schoolSize, school.schoolSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolSize);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", schoolSize=" + schoolSize +
                '}';
    }
}
