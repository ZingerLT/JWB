package com.epam.avia.controller;

import com.epam.avia.client.Client;
import com.epam.avia.enity.Civill;
import com.epam.avia.enity.Military;
import com.epam.avia.enity.Plane;
import com.epam.avia.enity.Private_jet;
import com.epam.avia.service.Company;
import com.epam.avia.storage.PlaneInfo;

public class Main {

    public static void main(String[] args) {
        PlaneInfo planeInfo = PlaneInfo.getListOfItem();

        planeInfo.getList().add(new Civill("BOEING-737-800",100,500,1000));
        planeInfo.getList().add(new Civill("AIRBUS A320",150,700,1500));
        planeInfo.getList().add(new Civill("BOEING-777",200,1000,2000));

        planeInfo.getList().add(new Military("МиГ-15",10,5000,10000));
        planeInfo.getList().add(new Private_jet("BOMBARDIER - 31a",true,3000,5000));

        Company company = new Company(1000);

        company.buy(300);
        company.printAllPlane();

        Client client = new Client();

        client.add(new Civill(20,"Sasha"));
        client.add(new Civill(40,"Diar"));
        client.add(new Civill(60,"Gleb"));
        client.add(new Civill(80,"Nikita"));
        client.add(new Civill(0, "Daniil"));

        client.buy();

        company.printAllPlane();

        client.printMoney();

    }
}
