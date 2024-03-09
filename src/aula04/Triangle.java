package aula04;

public class Triangle {

    double side1;
    double side2;
    double side3;


    public Triangle(double side1Value, double side2Value, double side3Value) {
        if (side1Value <= 0) {
            System.out.println("side1 value is invalid, negative or 0, it will be changed to 1");
            side1 = 1;
        }
        else
            side1 = side1Value;

        if (side2Value <= 0) {
            System.out.println("side2 value is invalid, negative or 0, it will be changed to 1");
            side2 = 1;
        }
        else
            side2 = side2Value;

        if (side3Value <= 0) {
            System.out.println("side3 value is invalid, negative or 0, it will be changed to 1");
            side3 = 1;
        }
        else
            side3 = side3Value;
    }


    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + ", area = " + Area() + ", perimeter = " + Perimeter();
    }


    public void setSide1(double newSide1) {
        if (newSide1 <= 0) {
            System.out.println("side1 value is invalid, negative or 0, it will be changed to 1");
            side1 = 1;
        }
        else
            side1 = newSide1;
    }


    public void setSide2(double newSide2) {
        if (newSide2 <= 0) {
            System.out.println("side2 value is invalid, negative or 0, it will be changed to 1");
            side2 = 1;
        }
        else
            side2 = newSide2;
    }


    public void setSide3(double newSide3) {
        if (newSide3 <= 0) {
            System.out.println("side3 value is invalid, negative or 0, it will be changed to 1");
            side3 = 1;
        }
        else
            side3 = newSide3;
    }


    public double getSide1() {
        return side1;
    }


    public double getSide2() {
        return side2;
    }


    public double getSide3() {
        return side3;
    }



    public double Perimeter() {
        return side1 + side2 + side3;
    }


    public double Area() {

        double p;

        p = (side1 + side2 + side3)/2;

        return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
    }


    public boolean equals(Triangle otherTriangle) {
        if (side1 == otherTriangle.side1 && side2 == otherTriangle.side2 && side3 == otherTriangle.side3) {
            return true;
        }
        else
            return false;
    }

}
