package org.example;

import java.util.ArrayList;
import java.util.List;

public class subject {
    private List<observer> observers = new ArrayList<observer>();

    public void attach(observer observer) {
        observers.add(observer);
    }

    public void detach(observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (observer observer : observers) {
        }
    }
}

