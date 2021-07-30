package com.epam.avia.enity;

import java.util.Objects;

public class Private_jet extends Plane{

    private boolean luxury;

    public Private_jet(){

    }

    public Private_jet(String name,boolean luxury,double price,double capacity){
        super(price,capacity,name);
        this.luxury=luxury;
    }

    public void setLuxury(boolean luxury) {
        this.luxury = luxury;
    }

    public boolean getLuxury(){
        return luxury;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Private_jet)) return false;
        if (!super.equals(o)) return false;
        Private_jet private_jet = (Private_jet) o;
        return private_jet.getLuxury() == getLuxury();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), luxury);
    }

    public String toString() {
        return String.format("Name:"+getName()+"Luxury:"+luxury+"Price:"+getPrice()+"Capacity:"+getCapacity());
    }
}
