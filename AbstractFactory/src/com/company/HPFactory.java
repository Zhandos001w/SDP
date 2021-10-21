package com.company;

import com.company.interfaces.ICPU;
import com.company.interfaces.ILaptop;
import com.company.interfaces.ILaptopFactory;
import com.company.interfaces.IRAM;

public class HPFactory implements ILaptopFactory {
    @Override
    public ILaptop createLaptop() {
        return new HPPavilion();
    }

    @Override
    public ICPU createCPU() {
        return new HPPavilionCPU();
    }

    @Override
    public IRAM createRAM() {
        return new HPPavilionRAM();
    }
}
