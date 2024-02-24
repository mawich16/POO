package aula02;
import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("em euros, quanto investiu? ");
        double investimento = sc.nextDouble();
        System.out.print("em percentagem, quanto é a taxa de juro mensal? ");
        double taxa = sc.nextDouble();
        double montante = investimento;
        for (int i=0; i<3; i++) {
            montante += montante * (taxa/100);
        }
        System.out.println("para um investimento de " + investimento + " euros e uma taxa de " + taxa + "% o montante ao fim de 3 meses será " + montante + " euros");
        sc.close();
    }

}
