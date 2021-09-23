package com.company.Battaries;

import com.company.Interfaces.IBatteryType;

public class NCBattery implements IBatteryType {
    @Override
    public void batteryType() {
        System.out.println("I have Nickel Cadmium battery type");
    }
}
