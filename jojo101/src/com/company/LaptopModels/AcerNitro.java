package com.company.LaptopModels;

import com.company.Battaries.LPBattery;
import com.company.Displays.IPSDisplay;
import com.company.Laptop;
import com.company.Processors.CoreProcessor;

public class AcerNitro extends Laptop {

    public AcerNitro() {
        super(new IPSDisplay(), new LPBattery(), new CoreProcessor());
    }

    @Override
    public void display() {
        System.out.println("Im Acer Nitro 5 laptop!");
    }
}
