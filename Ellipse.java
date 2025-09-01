package oop.ocp;

public class Ellipse extends Shape {
    private double major, minor;

    public double getMajor() {
        return major;
    }

    public void setMajor(double major) {
        this.major = major;
    }

    public double getMinor() {
        return minor;
    }

    public void setMinor(double minor) {
        this.minor = minor;
    }

    public Ellipse(double major, double minor){
        this.setMajor(major);
        this.setMinor(minor);
    }

    @Override
    public double calculateArea(){
        return this.major*this.minor*Math.PI;// Area of an ellipse = π * a * b
    }
}
