package com.company;

import com.company.interfaces.IRAM;

public class AcerNitroRAM implements IRAM {
    @Override
    public void getRAM() {
        System.out.println("Crucial 16GB DDR4-2666 SODIMM");
    }
}
