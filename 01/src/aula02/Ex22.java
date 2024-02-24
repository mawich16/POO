package aula02;
import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("qual é a temperatura em graus C? ");
        double grausf = sc.nextDouble()*1.8 + 32;
        System.out.println("equivalente a " + grausf + " graus F");
        sc.close();
    }

}
