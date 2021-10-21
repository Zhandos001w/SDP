package com.company;

public class PrimeMinisterFactory implements IMinisterFactory {
    @Override
    public IMinister createMinister() {
        return new PrimeMinister();
    }
}
