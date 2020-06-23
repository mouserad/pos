package Homework.Basics.Testvorbereitung;

public class Sphere extends BaseGeometricFigure {
    @Override
    public double calcVolume() {
        return 4 * Math.PI * Math.pow(getRadius(),3) / 3;
    }

    @Override
    public double calcArea() {
        return 4 * Math.PI * Math.pow(getRadius(),2);
    }
}
