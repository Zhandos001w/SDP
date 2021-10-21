package com.company;

import com.company.interfaces.ICPU;
import com.company.interfaces.ILaptop;
import com.company.interfaces.ILaptopFactory;
import com.company.interfaces.IRAM;

public class AcerFactory implements ILaptopFactory {
    @Override
    public ILaptop createLaptop() {
        return new AcerNitro();
    }

    @Override
    public ICPU createCPU() {
        return new AcerNitroCPU();
    }

    @Override
    public IRAM createRAM() {
        return new AcerNitroRAM();
    }
}
