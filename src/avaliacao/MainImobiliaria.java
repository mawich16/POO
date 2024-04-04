package avaliacao;

import java.util.ArrayList;
import java.util.Scanner;

public class MainImobiliaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String morada, tipoTerreno;
        int precoBase, area, numQuartos, numPisos, idVenda, precoVenda;
        // Imobiliaria imobiliaria = new Imobiliaria(100); // Capacidade para 100 imóveis
        ArrayList<Imovel> imoveis = new ArrayList<>(100);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar novo imóvel");
            System.out.println("2. Listar imóveis disponíveis");
            System.out.println("3. Vender imóvel");
            System.out.println("4. Imprimir lucro total");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Tipo de Imóvel (1 - Casa, 2 - Apartamento, 3 - Terreno): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    // Pedir dados do imóvel
                    System.out.println("Morada: ");
                    morada = scanner.next();
                    System.out.println("Preço Base de Venda: ");
                    precoBase = scanner.nextInt();
                    System.out.println("Area total: ");
                    area = scanner.nextInt();
                    Imovel imovel = new Imovel(String morada, int precoBase, int area);
                    switch (tipo) {
                        case 1:
                            // Pedir dados da casa
                            System.out.println("Numero de quartos: ");
                            numQuartos = scanner.nextInt();
                            System.out.println("Numero de pisos: ");
                            numPisos = scanner.nextInt();
                            Casa casa = new Casa(morada, precoBase, area, numQuartos, numPisos);
                            imoveis.add(casa);
                            break;
                        case 2:
                            // Pedir dados do apartamento
                            System.out.println("Numero de quartos: ");
                            numQuartos = scanner.nextInt();
                            Apartamento apartamento = new Apartamento(morada, precoBase, area, numQuartos);
                            imoveis.add(apartamento);
                            break;
                        case 3:
                            // Pedir dados do terreno
                            System.out.println("Tipo de terreno (urbano ou rústico): ");
                            tipoTerreno = scanner.next();
                            Terreno terreno = new Terreno(morada, precoBase, area, tipoTerreno);
                            imoveis.add(terreno);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                case 2:
                    // Listar imóveis disponíveis
                    for (Imovel i : imoveis) {
                        System.out.println(i);
                    }
                    break;
                case 3:
                    // Vender imóvel
                    System.out.println("ID do imóvel a vender: ");
                    idVenda = scanner.nextInt();
                    System.out.println("Imovel vendido por: ");
                    precoVenda = scanner.nextInt();
                    System.out.println("Imovel vendido com sucesso");
                    break;

                case 4:
                    // Imprimir lucro total
                    break;
                case 5:
                    System.out.println("Obrigada por usar o sistema.");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida.");

                }

}   while(opcao != 5);
        }
    }


