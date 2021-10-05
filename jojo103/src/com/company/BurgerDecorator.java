package com.company;

public abstract class BurgerDecorator implements IBurger {

    IBurger burger;

    public BurgerDecorator(IBurger burger) {
        this.burger = burger;
    }

    @Override
    public String makeBurger() {
        return burger.makeBurger();
    }
}
