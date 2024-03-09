package aula04;

public class Rectangle {

    double length;
    double width;


    public Rectangle(double lengthValue, double widthValue) {
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
        return "Rectangle: length = " + length + ", width = " + width + ", area = " + Area() + ", perimeter = " + Perimeter();
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


    public boolean equals(Rectangle otherRectangle) {
        if (length == otherRectangle.length && width == otherRectangle.width) {
            return true;
        }
        else
            return false;
    }

}
