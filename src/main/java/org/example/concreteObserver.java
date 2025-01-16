package org.example;

import java.util.Observable;
import java.util.Observer;

public class concreteObserver implements Observer {
    private String name;

    public concreteObserver(String name) {
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer " + name + " has been notified.");
    }
}
