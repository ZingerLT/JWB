package com.epam.avia.enity;

import java.util.Objects;

public class Military extends Plane{

    private double rocket;

    public Military(){

    }

    public Military(String name,double rocket,double price,double capacity){
        super(price,capacity,name);
        this.rocket=rocket;
    }

    public void setRocket(double rocket) {
        this.rocket = rocket;
    }

    public double getRocket(){
        return rocket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Military)) return false;
        if (!super.equals(o)) return false;
        Military military = (Military) o;
        return military.getRocket() == getRocket();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rocket);
    }

    public String toString() {
        return String.format("Name:"+getName()+"Number of rockets:"+rocket+"Price:"+getPrice()+"Capacity:"+getCapacity());
    }
}
