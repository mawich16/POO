package aula02;
import java.util.Scanner;
public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("cateto A: ");
        double catetoA = sc.nextDouble();
        while (catetoA<0) {
            System.out.print("valor invalido. cateto A: ");
            catetoA = sc.nextDouble();
        }
        System.out.print("cateto B: ");
        double catetoB = sc.nextDouble();
        while (catetoB<0) {
            System.out.print("valor invalido. cateto B: ");
            catetoB = sc.nextDouble();
        }
        double hipotenusaC = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
        double anguloAC = Math.toDegrees(Math.atan(catetoB/catetoA));
        System.out.println("a hipotenusa é " + hipotenusaC + " e o angulo formado por A e C é " + anguloAC);
        sc.close();
    }
}
