package com.epam.avia.storage;

import com.epam.avia.client.Client;
import com.epam.avia.enity.Plane;

import java.util.ArrayList;

public class ClientInfo {

    public ClientInfo(Client client){

    }
    public ArrayList<Plane> ClientList = new ArrayList<>();

    public ArrayList<Plane> ClientPurchases = new ArrayList<>();

    public ArrayList<Plane> getClientList() {
        return ClientList;
    }

    public ArrayList<Plane> getClientPurchases() {
        return ClientPurchases;
    }
}
