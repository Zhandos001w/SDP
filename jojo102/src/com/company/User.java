package com.company;

import com.company.Interfaces.IViewer;

import java.util.List;

public class User implements IViewer {
    private String login;

    public User(String login){
        this.login = login;
    }

    @Override
    public void update(List<String> titles) {
        System.out.println("Your grace, "+login+"\nWe have some new titles for you\n"+titles+"\n");
    }
}
