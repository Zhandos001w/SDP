package com.company;

public class HealthMinisterFactory implements IMinisterFactory {
    @Override
    public IMinister createMinister() {
        return new HealthMinister();
    }
}
