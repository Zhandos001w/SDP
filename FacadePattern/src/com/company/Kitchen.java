package com.company;

public class Kitchen {
    private boolean activeStove;

    public boolean isActiveStove() {
        return activeStove;
    }

    public void turnOnStove(){
        System.out.println("Stove is turned on and it heats up...");
        activeStove = true;
    }

    public void turnOffStove(){
        System.out.println("Stove is turned down!");
        activeStove = false;
    }
}
