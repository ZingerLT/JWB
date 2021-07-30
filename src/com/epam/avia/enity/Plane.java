package com.epam.avia.enity;

import java.util.Objects;

public abstract class Plane implements Comparable<Plane> {

    private double price;
    private double capacity;
    private String name;

    public Plane(){

    }

    public  Plane(double price, double capacity,String name) {
        this.capacity=capacity;
        this.price=price;
        this.name=name;
    }

    public Plane(double cash, String nick) {
    }

    public void setPrice(double price){
        this.price=price;
    }

    public double getPrice(){
        return price;
    }

    public void setCapacity(int capacity){
        this.capacity=capacity;
    }

    public double getCapacity(){
        return capacity;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(),getCapacity(),getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return  Double.compare(plane.getPrice(), getPrice()) == 0
                && Double.compare(plane.getCapacity(), getCapacity()) == 0
                && getName().equals(plane.getName());
    }

    @Override
    public  String toString(){
        return String.format("Name:"+getName()+"Price:"+getPrice()+"Capacity:"+getCapacity());
    }

    @Override
    public int compareTo(Plane o) {
        return 0;
    }
}
