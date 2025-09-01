package oop.ocp;

public class Rectangle extends Shape {
    private double width, height;

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double width, double height){
        this.setWidth(width);
        this.setHeight(height);
    }
    @Override
    public double calculateArea(){
        return this.width * this.height;//area of rectangle
    }
}
