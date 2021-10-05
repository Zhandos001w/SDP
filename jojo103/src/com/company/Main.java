package com.company;

public class Main {

    public static void main(String[] args) {

        IBurger burger = new CheeseBurger(new DoubleBeefBurger(new Hamburger()));

        System.out.println(burger.makeBurger());
    }
}
