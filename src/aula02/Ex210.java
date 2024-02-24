package aula02;
import java.util.Scanner;
public class Ex210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduza um numero: ");
        int numero = sc.nextInt();
        int min = numero;
        int max = numero;
        int numero2 = 0;
        while (numero2 != numero) {
            System.out.print("introduza outro numero: ");
            numero2 = sc.nextInt();
            if (numero2 > max){
                max = numero2;
            }
            if (numero2 < min) {
                min = numero2;
            }
        }
        System.out.println("o maior numero foi " + max + " e o menor numero foi " + min);
        sc.close();
    }
}
