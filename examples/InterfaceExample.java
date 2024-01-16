package examples;

public class InterfaceExample {
    public static void main(String[] args) {
        Circle myCircle = new Circle(0.5);
        double area = myCircle.calculateArea();
        System.out.println("Area: " + area);
        myCircle.display();
    }
    
}

/**
 * Shape
 */
interface Shape {
    double calculateArea();
    void display();
}

class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle with radius: " + radius);
    }
}
