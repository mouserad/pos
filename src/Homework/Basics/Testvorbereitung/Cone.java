package Homework.Basics.Testvorbereitung;

public class Cone extends BaseGeometricFigure {


    @Override
    public double calcVolume() {
        return Math.PI * Math.pow(getRadius(),2) * getHeight() / 3;
    }

    @Override
    public double calcArea() {
        double seitenlaenge;
        seitenlaenge = Math.sqrt((Math.pow(getHeight(),2)+Math.pow(getRadius(),2)));
        return (Math.PI * getRadius() * seitenlaenge) + Math.PI * Math.pow(getRadius(),2);
    }
}