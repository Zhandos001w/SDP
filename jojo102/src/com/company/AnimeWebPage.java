package com.company;

import com.company.Interfaces.IPublisher;
import com.company.Interfaces.IViewer;

import java.util.ArrayList;
import java.util.List;

public class AnimeWebPage implements IPublisher {
    private List<IViewer> viewers =new ArrayList<>();
    private List<String> titles =new ArrayList<>();


    public void addTitle(String titles){
        this.titles.add(titles);
        notifyAllViewers();
    }

    public void removeTitle(String titles){
        this.titles.remove(titles);
        notifyAllViewers();
    }

    @Override
    public void register(IViewer viewer) {
        this.viewers.add(viewer);
    }

    @Override
    public void unregister(IViewer viewer) {
        this.viewers.remove(viewer);
    }

    @Override
    public void notifyAllViewers() {
        for(IViewer view: this.viewers){
            view.update(this.titles);
        }
    }
}
