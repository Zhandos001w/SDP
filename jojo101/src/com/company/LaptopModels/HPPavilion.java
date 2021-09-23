package com.company.LaptopModels;


import com.company.Battaries.LIBattery;
import com.company.Displays.TNDisplay;
import com.company.Laptop;
import com.company.Processors.AMDProcessor;

public class HPPavilion extends Laptop {
    public HPPavilion() {
        super(new TNDisplay(), new LIBattery(), new AMDProcessor());
    }

    @Override
    public void display() {
        System.out.println("Im HP Gaming Pavilion 15 xe5g laptop!");
    }
}
