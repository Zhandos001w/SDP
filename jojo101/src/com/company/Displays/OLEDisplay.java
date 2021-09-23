package com.company.Displays;

import com.company.Interfaces.IDisplayType;

public class OLEDisplay implements IDisplayType {
    @Override
    public void displayType() {
        System.out.println("Organic Light-emitting Diode display is built into me!");
    }
}
