package com.company;

import com.company.interfaces.ICPU;
import com.company.interfaces.ILaptop;
import com.company.interfaces.ILaptopFactory;
import com.company.interfaces.IRAM;

public class Main {
    private ILaptopFactory factory;

    public Main(ILaptopFactory factory) {
            this.factory = factory;
        }

        public ILaptop createLaptop(){
            ILaptop laptop = factory.createLaptop();
            return laptop;
        }

        public ICPU createCPU(){
            ICPU cpu = factory.createCPU();
            return cpu;
        }

        public IRAM createRAM(){
            IRAM ram = factory.createRAM();
            return ram;
        }

        public static void main(String[] args){
            Main client = new Main(new AcerFactory());
            ILaptop i1 = client.createLaptop();
            ICPU i2 = client.createCPU();
            IRAM i3 = client.createRAM();

            i1.getLaptop();
            i2.getCPU();
            i3.getRAM();
        }
}
