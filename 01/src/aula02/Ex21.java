package aula02;
import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("quantos quilometros? ");
        double milhas = sc.nextDouble() / 1.609;
        System.out.println("esse valor é equivalente a " + milhas + " milhas");
        sc.close();
    }
}
