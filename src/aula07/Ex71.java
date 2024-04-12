package aula07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex71 {

    private static ArrayList<Shape> shapes = new ArrayList();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice1, choice2;
        double circleRadius, rectangleWidth, rectangleLength, triangleSide1, triangleSide2, triangleSide3;
        String circleColor, triangleColor, rectangleColor;

        while (true) {

            System.out.println("Select your prefered option:");
            System.out.println("1 - Create a new circle");
            System.out.println("2 - Create a new triangle");
            System.out.println("3 - Create a new rectangle");
            System.out.println("4 - Compare shapes");
            System.out.println("5 - Exit");

            choice1 = sc.nextInt();

            switch (choice1) {

                case 1:
                    
                    System.out.print("Insert circle radius: ");
                    circleRadius = sc.nextDouble();
                    System.out.print("Insert circle color: ");
                    circleColor = sc.next();
                    Circle c1 = new Circle(circleRadius,circleColor);
                    addShape(c1);
                    System.out.println(c1.toString());
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Insert triangle side 1: ");
                    triangleSide1 = sc.nextDouble();
                    System.out.print("Insert triangle side 2: ");
                    triangleSide2 = sc.nextDouble();
                    System.out.print("Insert triangle side 3: ");
                    triangleSide3 = sc.nextDouble();
                    System.out.print("Insert triangle color: ");
                    triangleColor = sc.next();
                    Triangle t1 = new Triangle(triangleSide1, triangleSide2, triangleSide3, triangleColor);
                    addShape(t1);
                    System.out.println(t1.toString());
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Insert rectangle width: ");
                    rectangleWidth = sc.nextDouble();
                    System.out.print("Insert rectangle length: ");
                    rectangleLength = sc.nextDouble();
                    System.out.print("Insert rectangle color: ");
                    rectangleColor = sc.next();
                    Rectangle r1 = new Rectangle(rectangleLength, rectangleWidth, rectangleColor);
                    addShape(r1);
                    System.out.println(r1.toString());
                    System.out.println("");
                    break;

                case 4:
                if (shapes.size() == 0) {
                    System.out.println("First insert shapes");
                    continue;
                }
                int index = 1, index1, index2;
                for (Shape i : shapes) {
                    System.out.println("index: " + index + " shape: " + i);
                    index++;
                }
                System.out.println("Insert first shape index: ");
                index1 = sc.nextInt() - 1;
                Shape shape1 = shapes.get(index1);
                System.out.println("Insert second shape index: ");
                index2 = sc.nextInt() - 1;
                Shape shape2 = shapes.get(index2);
                System.out.println(shape1.equals(shape2));
                System.out.println("");
                break;

                case 5:
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");
                    System.out.println("");
                    break;
            }
        }
    }

    private static void addShape(Shape shape) {
        int index = shapes.size() + 1;
        shapes.add(shape);
        System.out.printf("Shape added with index %d\n", index);
    }

}
