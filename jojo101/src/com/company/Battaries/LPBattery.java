package com.company.Battaries;

import com.company.Interfaces.IBatteryType;

public class LPBattery implements IBatteryType {
    @Override
    public void batteryType() {
        System.out.println("I have Lityum Polymer battery type");
    }
}
