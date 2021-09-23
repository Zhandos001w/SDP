package com.company.Battaries;

import com.company.Interfaces.IBatteryType;

public class LIBattery implements IBatteryType {
    @Override
    public void batteryType() {
        System.out.println("I have Lithyum-Ion battery type");
    }
}
