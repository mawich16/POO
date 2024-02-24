package aula02;
import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("velocidade 1? ");
        double v1 = sc.nextDouble();
        while (v1<0) {
            System.out.print("valor invalido. velocidade 1? ");
            v1 = sc.nextDouble();
        }
        System.out.print("distância 1? ");
        double d1 = sc.nextDouble();
        while (d1<0) {
            System.out.print("valor invalido. distancia 1? ");
            d1 = sc.nextDouble();
        }
        System.out.print("velocidade 2? ");
        double v2 = sc.nextDouble();
        while (v2<0) {
            System.out.print("valor invalido. velocidade 2? ");
            v2 = sc.nextDouble();
        }
        System.out.print("distância 2? ");
        double d2 = sc.nextDouble();
        while (d2<0) {
            System.out.print("valor invalido. distancia 2? ");
            d2 = sc.nextDouble();
        }
        double vf = (d1+d2)/((d1/v1)+(d2/v2));
        System.out.println("a velocidade media final vai ser " + vf);
        sc.close();
    }

}
