package com.company.Processors;

import com.company.Interfaces.IProcessorType;

public class PentiumProcessor implements IProcessorType {
    @Override
    public void processorType() {
        System.out.println("I have Intel Pentium processor");
    }
}
