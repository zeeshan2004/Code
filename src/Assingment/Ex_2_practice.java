package Assingment;

class Father {
    protected float radius;
}

class Child extends Father {
    // setter for radius
    public void setRadius(float radius) {
        this.radius = radius;
        System.out.println("The radius: " + this.radius);
    }

    // To display Area
    public void displayArea() {
        float area = 3.14f * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    // To display Circumference
    void displayCircumference() {
        float circum = 2 * 3.14f * radius;
        System.out.println("Circumference of Circle is = " + circum);
    }
}


public class Ex_2_practice {
    public static void main(String arg[]) {
        Child obj = new Child();
        obj.setRadius(5);
        obj.displayArea();
        obj.displayCircumference();

    }
}

