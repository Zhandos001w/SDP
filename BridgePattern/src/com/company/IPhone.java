package com.company;

public class IPhone extends Phone{

    @Override
    public void useTheme() {
        System.out.println("IPhone is applying theme...");
        theme.applyTheme();
    }

    @Override
    public void useColor() {
        color.paintColor();
    }

}
