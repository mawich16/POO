package aula02;
import java.util.Scanner;
public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("tempo em segundos? ");
        int segundos = sc.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos - (horas*3600)) / 60;
        segundos = segundos - (horas*3600 + minutos*60);
        System.out.println(horas + ":" + minutos + ":" + segundos);
        sc.close();
    }
}
