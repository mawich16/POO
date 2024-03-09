package aula04;

public class Circle {

    double radius;


    public Circle(double radiusValue) {
        if (radiusValue <= 0) {
            System.out.println("the value is invalid, negative or 0, it will be changed to 1");
            radius = 1;
        }
        else
            radius = radiusValue;
    }


    public String toString() {
        return "Circle: radius = " + radius;
    }


    public void setRadius(double newRadius) {
        if (newRadius <= 0) {
            System.out.println("the value is invalid, negative or 0, it will be changed to 1");
            radius = 1;
        }
        else
            radius = newRadius;
    }


    public double getRadius() {
        return radius;
    }


    public double Perimeter() {
        return 2 * Math.PI * radius;
    }


    public double Area() {
        return Math.PI * radius * radius;
    }


    public boolean equals(Circle otherCircle) {
        if (radius == otherCircle.radius) {
            return true;
        }
        else
            return false;
    }

}





