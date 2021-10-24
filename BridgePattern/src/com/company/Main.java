package com.company;

public class Main {

    public static void main(String[] args) {

        Phone p1 = new IPhone ();
        Phone p2 = new SamsungPhone();
        ITheme dark = new DarkTheme();
        ITheme light = new LightTheme();

        p1.setColor(new BlueColor());
        p1.useColor();
        p1.setTheme(dark);
        p1.useTheme();
        System.out.println("----------------");
        p2.setColor(new RedColor());
        p2.useColor();
        p2.setTheme(light);
        p2.useTheme();
    }
}
