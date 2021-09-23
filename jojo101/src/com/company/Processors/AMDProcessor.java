package com.company.Processors;

import com.company.Interfaces.IProcessorType;

public class AMDProcessor implements IProcessorType {
    @Override
    public void processorType() {
        System.out.println(" I have AMD Ryzen processor");
    }
}
