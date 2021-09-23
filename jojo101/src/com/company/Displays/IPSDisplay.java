package com.company.Displays;

import com.company.Interfaces.IDisplayType;

public class IPSDisplay implements IDisplayType {
    @Override
    public void displayType() {
        System.out.println("In-Plane Switching display is built into me!");
    }
}
