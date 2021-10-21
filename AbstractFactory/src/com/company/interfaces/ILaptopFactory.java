package com.company.interfaces;

public interface ILaptopFactory {
    ILaptop createLaptop();
    ICPU createCPU();
    IRAM createRAM();
}
