package utils;

import java.util.Scanner;

public class UserInput {
    public static Double isDoublePositive(String stringRequest) {
        Scanner sc = new Scanner(System.in);
        System.out.println(stringRequest);
        double value = sc.nextDouble();
        while (value <= 0) {
            System.out.println("valor inválido. Tente novamente: ");
            value = sc.nextDouble();
        }
        return value;
    }
}
