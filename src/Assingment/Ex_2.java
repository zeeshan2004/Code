package Assingment;

import java.util.*;



class Circle {
    protected float radius;
}

class Chld extends Circle {
    public void setRadius(float rad) {

        radius = rad;
    }

    public void displayArea() {
        float area = 3.14f * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    public void displayCircumference() {
        float circum = 2 * 3.14f * radius;
        System.out.println("Circumference of Circle is = " + circum);
    }
}

public class Ex_2 {
    public static void main(String[] args) {
        Chld obj = new Chld();
        obj.setRadius(5);
        obj.displayArea();
        obj.displayCircumference();
    }
}

