package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String nameStamp;
    private double sizeStamp;

    private String rubberStamp;
    public Stamp(String nameStamp,double sizeStamp, String rubberStamp){
        this.nameStamp = nameStamp;
        this.sizeStamp = sizeStamp;
        this.rubberStamp = rubberStamp;
    }

    public String getNameStamp() {
        return nameStamp;
    }

    public double getSizeStamp() {
        return sizeStamp;
    }

    public String getRubberStamp() {
        return rubberStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.sizeStamp, sizeStamp) == 0 && Objects.equals(nameStamp, stamp.nameStamp) && Objects.equals(rubberStamp, stamp.rubberStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameStamp, sizeStamp, rubberStamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "nameStamp='" + nameStamp + '\'' +
                ", sizeStamp=" + sizeStamp +
                ", rubberStamp='" + rubberStamp + '\'' +
                '}';
    }
}
