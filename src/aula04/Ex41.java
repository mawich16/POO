package aula04;

public class Ex41 {

    public static void main(String[] args) {
        
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(5);

        //System.out.println(c1);

        //c1.setRadius(3);

        //System.out.println(c1);

        //double r = c1.getRadius();

        //System.out.println("radius: " + r);

        //System.out.printf("perimeter: %.2f", c1.Perimeter());

        System.out.println(c1.equals(c2));

        c2.setRadius(2);

        System.out.println(c1.equals(c2));
    }

}
