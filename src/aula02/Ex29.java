package aula02;
import java.util.Scanner;
public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduza um numero: ");
        int numero = sc.nextInt();
        while (numero>=0) {
            if (numero%10==0) {
                System.out.println(numero);
            }
            else {
                System.out.print(numero + ",");
            }
            numero -= 1;
        }
        sc.close();
    }
}
