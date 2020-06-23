package Homework.Basics.Testvorbereitung;


public abstract class BaseGeometricFigure implements GeometricFigure {

    private double radius;
    private double height;

    public void info(){

        if(getHeight()!=0) {
            System.out.println("Radius= " + getRadius() + ", Höhe= " + getHeight() + ", Volumen= " + Math.round(calcVolume() * 100.00) / 100.00 + ", Oberfläche= " + Math.round(calcArea() * 100.00) / 100.00);
        }
        else{
            System.out.println("Radius= " + getRadius() + ", Höhe= " + (2*getRadius()) + ", Volumen= " + (Math.round(calcVolume() *100.00) / 100.00) + ", Oberfläche= " + (Math.round(calcArea() *100.00) / 100.00));
        }

    }

    @Override
    public abstract double calcVolume();

    @Override
    public abstract double calcArea();

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
