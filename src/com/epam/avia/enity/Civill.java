package com.epam.avia.enity;

import java.util.Objects;

public class Civill extends Plane {

    private Integer seat;

    public Civill(){

    }

    public Civill(String name,int seat,double price,double capacity){
        super(price,capacity,name);
        this.seat=seat;
    }

    public Civill(double cash, String nick) {
        super(cash,nick);
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getSeat(){
        return seat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Civill)) return false;
        if (!super.equals(o)) return false;
        Civill citizen = (Civill) o;
        return citizen.getSeat() == getSeat();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seat);
    }

    public String toString() {
        return String.format("Name:"+getName()+"Number of seats:"+seat+"Price:"+getPrice()+"Capacity:"+getCapacity());
    }

}
