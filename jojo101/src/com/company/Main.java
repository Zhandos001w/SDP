package com.company;

import com.company.LaptopModels.AcerNitro;
import com.company.Processors.PentiumProcessor;

public class Main {

    public static void main(String[] args) {

        Laptop laptop = new AcerNitro();

        laptop.display();
        System.out.println("-----------------------");
        laptop.aboutBatteryType();
        laptop.aboutProcessorType();
        laptop.aboutDisplayType();
        System.out.println("-----------------------");

        System.out.println("Want to change my cpu type!");

        laptop.setProcessorType(new PentiumProcessor());
        laptop.aboutProcessorType();


    }
}
