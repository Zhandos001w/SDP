package com.company;

import com.company.interfaces.ICPU;

public class HPPavilionCPU implements ICPU {
    @Override
    public void getCPU() {
        System.out.println("Amd Ryzen 3600 (4.2Ghz)");
    }
}
