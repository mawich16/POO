package aula04;

import java.util.Scanner;

public class Ex41 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int choice1, choice2;
        double circleRadius, rectangleWidth, rectangleLength, triangleSide1, triangleSide2, triangleSide3;

        while (true) {

            System.out.println("Select your prefered option:");
            System.out.println("1 - Create a new circle");
            System.out.println("2 - Create a new triangle");
            System.out.println("3 - Create a new rectangle");
            System.out.println("4 - Other options");
            System.out.println("5 - Exit");

            choice1 = sc.nextInt();

            switch (choice1) {

                case 1:
                    
                    System.out.print("Insert circle radius: ");
                    circleRadius = sc.nextDouble();
                    Circle c1 = new Circle(circleRadius);
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
                    Triangle t1 = new Triangle(triangleSide1, triangleSide2, triangleSide3);
                    System.out.println(t1.toString());
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Insert rectangle width: ");
                    rectangleWidth = sc.nextDouble();
                    System.out.print("Insert rectangle length: ");
                    rectangleLength = sc.nextDouble();
                    Rectangle r1 = new Rectangle(rectangleLength, rectangleWidth);
                    System.out.println(r1.toString());
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Select your prefered option:");
                    System.out.println("1 - Compare circles");
                    System.out.println("2 - Compare triangles");
                    System.out.println("3 - Compare rectangles");
                    System.out.println("4 - Exit");

                choice2 = sc.nextInt();

                switch (choice2) {
                    case 1:
                        System.out.print("Insert first circle radius: ");
                        circleRadius = sc.nextDouble();
                        Circle c2 = new Circle(circleRadius);
                        System.out.print("Insert second circle radius: ");
                        circleRadius = sc.nextDouble();
                        Circle c3 = new Circle(circleRadius);
                        if (c2.equals(c3) == true) {
                            System.out.println("The circles are equal");
                        }
                        else {
                            System.out.println("The circles are not equal");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.print("Insert first triangle side 1: ");
                        triangleSide1 = sc.nextDouble();
                        System.out.print("Insert first triangle side 2: ");
                        triangleSide2 = sc.nextDouble();
                        System.out.print("Insert first triangle side 3: ");
                        triangleSide3 = sc.nextDouble();
                        Triangle t2 = new Triangle(triangleSide1, triangleSide2, triangleSide3);
                        System.out.print("Insert second triangle side 1: ");
                        triangleSide1 = sc.nextDouble();
                        System.out.print("Insert second triangle side 2: ");
                        triangleSide2 = sc.nextDouble();
                        System.out.print("Insert second triangle side 3: ");
                        triangleSide3 = sc.nextDouble();
                        Triangle t3 = new Triangle(triangleSide1, triangleSide2, triangleSide3);
                        if (t2.equals(t3) == true) {
                            System.out.println("The triangles are equal");
                        }
                        else {
                            System.out.println("The triangles are not equal");
                        }
                        System.out.println("");
                        break;

                    case 3:
                        System.out.print("Insert first rectangle width: ");
                        rectangleWidth = sc.nextDouble();
                        System.out.print("Insert first rectangle length: ");
                        rectangleLength = sc.nextDouble();
                        Rectangle r2 = new Rectangle(rectangleLength, rectangleWidth);
                        System.out.print("Insert second rectangle width: ");
                        rectangleWidth = sc.nextDouble();
                        System.out.print("Insert second rectangle length: ");
                        rectangleLength = sc.nextDouble();
                        Rectangle r3 = new Rectangle(rectangleLength, rectangleWidth);
                        if (r2.equals(r3) == true) {
                            System.out.println("The rectangles are equal");
                        }
                        else {
                            System.out.println("The rectangles are not equal");
                        }
                        System.out.println("");
                        break;
                
                    default:
                    break;
                }
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
}
