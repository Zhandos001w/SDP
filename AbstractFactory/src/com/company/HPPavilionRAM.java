package com.company;

import com.company.interfaces.IRAM;

public class HPPavilionRAM implements IRAM {
    @Override
    public void getRAM() {
        System.out.println("Crucial 32GB Kit (2 x 16GB) DDR4-2666 SODIMM");
    }
}
