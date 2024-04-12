package aula07;

public class Rectangle extends Shape {

    double length;
    double width;


    public Rectangle(double lengthValue, double widthValue, String color) {
        super(color);
        if (lengthValue <= 0) {
            System.out.println("length value is invalid, negative or 0, it will be changed to 1");
            length = 1;
        }
        else
            length = lengthValue;

        if (widthValue <= 0) {
            System.out.println("width value is invalid, negative or 0, it will be changed to 1");
            width = 1;
        }
        else
            width = widthValue;
    }


    public String toString() {
        return "Rectangle: length = " + length + ", width = " + width + ", area = " + Area() + ", perimeter = " + Perimeter() + super.toString();
    }


    public void setLength(double newLength) {
        if (newLength <= 0) {
            System.out.println("length value is invalid, negative or 0, it will be changed to 1");
            length = 1;
        }
        else
            length = newLength;
    }


    public void setWidth(double newWidth) {
        if (newWidth <= 0) {
            System.out.println("width value is invalid, negative or 0, it will be changed to 1");
            width = 1;
        }
        else
            width = newWidth;
    }


    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }


    public double Perimeter() {
        return 2 * (length * width);
    }


    public double Area() {
        return length * width;
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Rectangle retangle = (Rectangle) obj;

        return super.equals(obj) && retangle.width == this.width && retangle.length == this.length;
    }

}
