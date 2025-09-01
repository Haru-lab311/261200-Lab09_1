package oop.ocp;

public class Main {
    public static void main(String[] args) {

        AreaCalculator calculator = new AreaCalculator();

        //create different shapes
        Shape rectangle = new Rectangle(35,56);
        Shape circle = new Circle(5);
        Shape ellipse = new Ellipse(2,5);

        //calculate area
        System.out.println("Rectangle area:" +calculator.calculateArea(rectangle));
        System.out.println("Circle area:"+calculator.calculateArea(circle));
        System.out.println("Ellipse area:"+calculator.calculateArea(ellipse));

        //how adding new shape
        Shape triangle = new Triangle(6, 8);
        System.out.println("Triangle area:"+ calculator.calculateArea(triangle));
    }
    }
