package oop.ocp;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        this.setRadius(radius);
    }
    @Override
    public double calculateArea(){
        return radius*radius*Math.PI;// Area of a circle = π * r^2
    }
}
