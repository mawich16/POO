package aula02;
import java.util.Scanner;
public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduza a latitude do primeiro ponto: ");
        double p1x = sc.nextDouble();
        while (p1x<0) {
            System.out.print("valor inválido. introduza a latitude do primeiro ponto: ");
            p1x = sc.nextDouble();
        }
        System.out.print("introduza a longitude do primeiro ponto: ");
        double p1y = sc.nextDouble();
        while (p1y<0) {
            System.out.print("valor inválido. introduza a longitude do primeiro ponto: ");
            p1y = sc.nextDouble();
        }
        System.out.print("introduza a latitude do segundo ponto: ");
        double p2x = sc.nextDouble();
        while (p2x<0) {
            System.out.print("valor inválido. introduza a latitude do segundo ponto: ");
            p2x = sc.nextDouble();
        }
        System.out.print("introduza a longitude do segundo ponto: ");
        double p2y = sc.nextDouble();
        while (p2y<0) {
            System.out.print("valor inválido. introduza a longitude do segundo ponto: ");
            p2y = sc.nextDouble();
        }
        double distancia = Math.sqrt(Math.abs((Math.pow(2,p1x) - Math.pow(2,p2x)) + (Math.pow(2,p1y) - Math.pow(2,p2y))));
        System.out.println("a distancia é: " + distancia);
        sc.close();
    }
}
