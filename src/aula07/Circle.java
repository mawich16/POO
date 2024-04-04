package aula07;

public class Circle extends Shape {

    double radius;


    public Circle(double radiusValue, String color) {
        super(color);
        if (radiusValue <= 0) {
            System.out.println("the value is invalid, negative or 0, it will be changed to 1");
            radius = 1;
        }
        else
            radius = radiusValue;
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


    public String toString() {
        return "Circle: radius = " + radius + ", area = " + Area() + ", perimeter = " + Perimeter();
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Circle circle = (Circle) obj;

        return super.equals(obj) == true && circle.radius == this.radius;
    }

}





