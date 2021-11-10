package com.company;

public class Chef {
    public void makePilafASAP(Kitchen kitchen){
        if(kitchen.isActiveStove()){
            System.out.println("Chef is cooking yummy Pilaf!");
        }
        else {
            System.out.println("Chef is relaxing and chilling!");
        }
    }
}
