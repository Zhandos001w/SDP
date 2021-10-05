package com.company;

public class DoubleBeefBurger extends BurgerDecorator{

    public DoubleBeefBurger(IBurger burger) {
        super(burger);
    }

    public String addBeef(){
        return "Juicy beef is added. ";
    }

    public String makeBurger() {
        return burger.makeBurger() +  addBeef();
    }


}
