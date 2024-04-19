package aula09;

import java.util.Collection;
import java.util.Scanner;

public class PlaneTester {

    private static PlaneManager frota = new PlaneManager();

    public static void main(String[] args) {

        int choice, anoProducao, numPassageiros, velocidadeMaxima, tipoAviao, numTripulantes, numMunicoes;
        String id, fabricante, modelo;
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1 - Adicionar aviões tanto comerciais como militares à frota");
            System.out.println("2 - Remover aviões da frota");
            System.out.println("3 - Procurar um avião em específico");
            System.out.println("4 - Imprimir a informação de todos os aviões da frota");
            System.out.println("5 - Imprimir a lista de todos os aviões comerciais ou a lista de todos os aviões militares");
            System.out.println("6 - Imprimir as informações do avião mais rápido da frota");
            System.out.println("7 - Sair");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Id do avião: ");
                    id = sc.next();
                    System.out.println("Fabricante do avião: ");
                    fabricante = sc.next();
                    System.out.println("Modelo do avião: ");
                    modelo = sc.next();

                    System.out.println("Ano de produção: ");
                    anoProducao = sc.nextInt();
                    System.out.println("Número de passageiros: ");
                    numPassageiros = sc.nextInt();
                    System.out.println("Velocidade máxima: ");
                    velocidadeMaxima = sc.nextInt();

                    System.out.println("1 - Avião comercial");
                    System.out.println("2 - Avião militar");
                    
                    tipoAviao = sc.nextInt();

                    switch (tipoAviao) {
                        case 1:
                            System.out.println("Número de tripulantes: ");
                            numTripulantes = sc.nextInt();
                            Plane plane = new CommercialPlane(id, fabricante, modelo, anoProducao, numPassageiros, velocidadeMaxima, numTripulantes);
                            frota.addPlane(plane);
                            break;

                        case 2:
                            System.out.println("Número de munições: ");
                            numMunicoes = sc.nextInt();
                            Plane plane1 = new MilitaryPlane(id, fabricante, modelo, anoProducao, numPassageiros,velocidadeMaxima, numMunicoes);
                            frota.addPlane(plane1);
                            break;
                        }
                    break;

                case 2:
                    System.out.println("Id do avião: ");
                    id = sc.next();
                    frota.removePlane(id);
                    break;

                case 3:
                    System.out.println("Id do avião: ");
                    id = sc.next();
                    Plane plane = frota.searchPlane(id);

                    if (plane == null) {
                        System.out.println("Nenhum avião encontrado");
                        continue;
                    }

                    System.out.println(plane);
                break;

                case 4:
                    frota.printAllPlanes();
                    break;

                case 5:
                    Collection<Plane> planes = null;

                    System.out.println("1 - Avião comercial");
                    System.out.println("2 - Avião militar");

                    tipoAviao = sc.nextInt();

                    switch (tipoAviao) {
                        case 1:
                            planes = frota.getCommercialPlanes();
                            break;

                        case 2:
                            planes = frota.getMilitarPlanes();
                            break;
                    }

                    if (planes == null) continue;

                    for (Plane plane1 : planes)
                        System.out.println(plane1);

                    break;
                case 6:
                    System.out.println(frota.getFastestPlane());
                    break;

                case 7:
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");
                    System.out.println("");
                    break;
            }
        }
    }
}

