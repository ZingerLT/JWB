package com.epam.avia.service;

import com.epam.avia.enity.Plane;
import com.epam.avia.storage.PlaneInfo;
import com.epam.avia.storage.CompanyInfo;

import java.util.Collections;

public class Company implements CompanyInterface {

    private static double money;

    static CompanyInfo companyInfo =new CompanyInfo();
    PlaneInfo planeInfo=PlaneInfo.getListOfItem();

    public Company(double money){
        Company.money=money;
    }

    @Override
    public void printAllPlane() {
    planeInfo.allPlane.sort(planeInfo::compareByPower);
    for (Plane obj :
            planeInfo.getAllPlane()){
        System.out.println(obj + " :  " + Collections.frequency(planeInfo.allPlane, obj));
    }
    }

    public void cell(Plane plane) {
        money+=plane.getPrice();
        companyInfo.getFlight().add(plane);
    }

    @Override
    public boolean buy(double costMoney) {
        boolean check=true;
        double temp=0;
        if (money>costMoney){
            System.out.println("No money, no funny!");
            return false;
        } else {
            while (check){
                for(Plane obj :
                planeInfo.getList()) {
                    if(temp+obj.getPrice()<=costMoney){
                        temp+=obj.getPrice();
                        companyInfo.getCompanyInfo().add(obj);
                    } else {
                       check =false;
                    }

                }
            }
            System.out.println("Thanks for purchase, temp money: "+ temp);
            money -= temp;
            return true;
        }
    }

    public String toString(){
        return "Money: " + money;
    }

}
