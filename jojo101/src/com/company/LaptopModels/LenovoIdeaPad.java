package com.company.LaptopModels;

import com.company.Battaries.NCBattery;
import com.company.Displays.OLEDisplay;
import com.company.Laptop;
import com.company.Processors.PentiumProcessor;

public class LenovoIdeaPad extends Laptop {
    public LenovoIdeaPad() {
        super(new OLEDisplay(), new NCBattery(), new PentiumProcessor());
    }

    @Override
    public void display() {
        System.out.println("Im Lenovo IdeaPad Laptop!");
    }
}
