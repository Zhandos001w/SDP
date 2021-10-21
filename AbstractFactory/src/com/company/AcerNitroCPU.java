package com.company;

import com.company.interfaces.ICPU;

public class AcerNitroCPU implements ICPU {

    @Override
    public void getCPU() {
        System.out.println("Intel Core I5 (7300HQ, 2.50Ghz, 6MB)");
    }
}
