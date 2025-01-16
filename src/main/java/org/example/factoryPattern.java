package org.example;

public class factoryPattern {
    public static void main(String[] args) {
       shapeFactory shapeFactory = new shapeFactory();
       Shape circle = shapeFactory.getShape("circle");
         circle.draw();
         Shape rectangle = shapeFactory.getShape("rectangle");
            rectangle.draw();
    }
}
