package com.epam.avia.storage;

import com.epam.avia.enity.Plane;

import java.util.ArrayList;

public class PlaneInfo {

    public static PlaneInfo planeInfo;

    public ArrayList<Plane> allPlane = new ArrayList<>();

    public ArrayList<Plane> getAllPlane(){
        return allPlane;
    }

    public int compareByPower(Plane obj1, Plane obj2){
        return Double.compare(obj1.getPrice(), obj2.getPrice());
    }

    public int compareByCapacity(Plane obj1, Plane obj2){
        return Double.compare(obj1.getCapacity(), obj2.getCapacity());
    }

    public static PlaneInfo getListOfItem() {
        if (planeInfo == null) {
            planeInfo = new PlaneInfo();
        }
        return planeInfo;
    }

    public ArrayList<Plane> getList() {
        return allPlane;
    }
}
