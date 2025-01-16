package org.example;

public class singleton {
    private static singleton instance;

    private singleton() {
        // Exists only to defeat instantiation.
    }

    public static singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }
}
