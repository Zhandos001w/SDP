package com.company.Processors;

import com.company.Interfaces.IProcessorType;

public class CoreProcessor implements IProcessorType {
    @Override
    public void processorType() {
        System.out.println("I have Intel Core processor");
    }
}
