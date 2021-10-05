package com.company;

public class CheeseBurger extends BurgerDecorator {

    public CheeseBurger(IBurger burger) {
        super(burger);
    }

    public String addCheese(){
        return "Cheese and yummy cheese sauce is added. ";
    }

    public String makeBurger() {
        return super.makeBurger() + addCheese();
    }
}
