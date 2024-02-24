package aula02;
import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("qual é a quantidade de água em kg? ");
        double quantidadeAgua = sc.nextDouble();
        System.out.print("qual é a temperatura inicial em graus C? ");
        double temperaturaInicial = sc.nextDouble();
        System.out.print("qual é a temperatua final em graus C? ");
        double temperaturaFinal = sc.nextDouble();
        double energia = quantidadeAgua * (temperaturaFinal - temperaturaInicial) * 4184;
        System.out.println("a energia necessária para aquecer " + quantidadeAgua + " kg de agua é " + energia + " Joules");
        sc.close();
    }
}
