package com.company;

public class CookProcessFacade {
    Order order = new Order();
    Chef chef = new Chef();
    Kitchen kitchen = new Kitchen();

    public void makePilaf(){
        order.takeOrder();
        kitchen.turnOnStove();
        chef.makePilafASAP(kitchen);
    }
}
