package com.company;

public class DefenceMinisterFactory implements IMinisterFactory {
    @Override
    public IMinister createMinister() {
        return new DefenceMinister();
    }
}
