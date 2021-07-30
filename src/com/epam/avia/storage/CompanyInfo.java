package com.epam.avia.storage;

import com.epam.avia.enity.Plane;

import java.util.ArrayList;

public class CompanyInfo {

    private final ArrayList<Plane> companyInfo =new ArrayList<>();

    public ArrayList<Plane> getCompanyInfo() { return companyInfo; }

    private final ArrayList<Plane> flight = new ArrayList<>();

    public ArrayList<Plane> getFlight() {
        return flight;
    }


}
