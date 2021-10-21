package com.company;

import com.company.interfaces.ILaptop;

public class HPPavilion implements ILaptop
{
    @Override
    public void getLaptop() {
        System.out.println("It is HP Pavilion Gaming!");
    }

}
