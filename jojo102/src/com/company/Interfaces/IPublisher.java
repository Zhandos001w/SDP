package com.company.Interfaces;

public interface IPublisher {
    void register(IViewer viewer);
    void unregister(IViewer viewer);
    void notifyAllViewers();
}
