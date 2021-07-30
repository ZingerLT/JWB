package com.epam.avia.client;

import com.epam.avia.enity.Plane;
import com.epam.avia.service.Company;
import com.epam.avia.storage.ClientInfo;

public class Client implements ClientInterface {

    private String name;
    private double money;
    private double price;

    ClientInfo clientInfo = new ClientInfo(this);

    public Client(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public Client() {

    }

    @Override
    public void add(Plane plane) {
        price+=plane.getPrice();
        clientInfo.getClientList().add(plane);
    }

    @Override
    public void buy() {
        int temp=0;
        if(this.money>=price);
        money -=temp;
        System.out.println("\nClient: " + name + " money left: " + money + " Purchases:");
        for (int i = 0; i < clientInfo.getClientPurchases().size(); i++) {
            System.out.println(clientInfo.getClientPurchases().get(i));
        }
    }

    public void printMoney(){
        System.out.println(name + " "+ money);
    }
}
