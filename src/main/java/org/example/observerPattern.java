package org.example;

import javax.security.auth.Subject;

public class observerPattern {
    public static void main(String[] args) {
       Subject subject = new Subject();
       Observer obs1 = (Observer) new concreteObserver("concrete observer");
       Observer obs2 = (Observer) new concreteObserver("concrete observer");

       subject.equals(obs1);
       subject.equals(obs2);

       subject.notifyAll();
    }
}
