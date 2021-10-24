package com.company;

public class SamsungPhone extends Phone{

    @Override
    public void useTheme() {
        System.out.println("Samsung is applying theme...");
        theme.applyTheme();

    }

    @Override
    public void useColor() {
        color.paintColor();
    }
}
