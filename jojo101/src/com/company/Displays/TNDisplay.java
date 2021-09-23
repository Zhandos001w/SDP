package com.company.Displays;

import com.company.Interfaces.IDisplayType;

public class TNDisplay implements IDisplayType {
    @Override
    public void displayType() {
        System.out.println("Twisted Nematic display is built into me!");
    }
}
