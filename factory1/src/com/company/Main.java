package com.company;

public class Main {

    public static void main(String[] args) {

        IMinisterFactory factory = new PrimeMinisterFactory();
        IMinister minister = factory.createMinister();

        minister.giveDecree();
    }
}
