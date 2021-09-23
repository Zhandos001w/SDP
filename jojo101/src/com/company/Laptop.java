package com.company;

import com.company.Interfaces.IBatteryType;
import com.company.Interfaces.IDisplayType;
import com.company.Interfaces.IProcessorType;

public abstract class Laptop {

    private IDisplayType displayType;
    private IBatteryType batteryType;
    private IProcessorType processorType;

    public Laptop(IDisplayType displayType, IBatteryType batteryType, IProcessorType processorType) {
        this.displayType = displayType;
        this.batteryType = batteryType;
        this.processorType = processorType;
    }

    public void aboutBatteryType(){
        this.batteryType.batteryType();
    }

    public void aboutDisplayType(){
        this.displayType.displayType();
    }

    public void aboutProcessorType(){
        this.processorType.processorType();
    }

    public abstract void display();

    public IDisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(IDisplayType displayType) {
        this.displayType = displayType;
    }

    public IBatteryType getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(IBatteryType batteryType) {
        this.batteryType = batteryType;
    }

    public IProcessorType getProcessorType() {
        return processorType;
    }

    public void setProcessorType(IProcessorType processorType) {
        this.processorType = processorType;
    }
}
