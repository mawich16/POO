package aula06;

import java.util.ArrayList;
import java.util.Scanner;

import aula05.DateYMD;

public class Ex62 {

    private static ArrayList<Contacto> contactos = new ArrayList<>();
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        String telemovel;
        String email;

        while (true) {

            System.out.println("Selecione uma opção:");
            System.out.println("1. Inserir contacto");
            System.out.println("2. Alterar contacto");
            System.out.println("3. Apagar contacto");
            System.out.println("4. Procurar contacto");
            System.out.println("5. Listar contactos");
            System.out.println("0. Sair");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Pessoa pessoa = createPessoa();

                    if (pessoa == null) {
                        continue;
                    }

                    Contacto contacto;

                    while (true) {
                        System.out.println("numero de telemovel:");
                        telemovel = sc.next();
                        System.out.println("email:");
                        email = sc.next();

                        try {
                            contacto = new Contacto(pessoa, telemovel, email);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println(e);
                        }
                    }
                    contactos.add(contacto);
                    break;

                case 2:
                    contacto = procurarContacto();

                    if (contacto == null) {
                        continue;
                    }

                    while (true) {
                        try {
                            System.out.println("Novo número de telemóvel: ");
                            telemovel = sc.next();

                            contacto.setTelemovel(telemovel);

                            System.out.println("Novo email: ");
                            email = sc.next();

                            contacto.setEmail(email);

                            break;
                        }
                        catch (IllegalArgumentException e) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 3:
                    contacto = procurarContacto();

                        if (contacto == null) {
                            continue;
                        }

                        contactos.remove(contacto);
                    break;

                case 4:
                    contacto = procurarContacto();

                    if (contacto == null) {
                        continue;
                    }

                    System.out.println(contacto);
                    break;
                
                case 5:
                    for (Contacto i : contactos) {
                        System.out.println(i);
                    }
                    break;

                default:
                    break;
            }
            break;
        }
    }

    private static Pessoa createPessoa() {
        Scanner sc = new Scanner(System.in);
        String nome;
        int cc;
        String dateString;
        int year;
        int day;
        int month;

        System.out.println("nome: ");
        nome = sc.nextLine();
        System.out.println("cc:");
        cc = sc.nextInt();
        

        for (Contacto contacto : contactos) {
            if (contacto.getPessoa().getCC() == cc) {
                System.out.println("Já existe um contacto com esta pessoa");
                System.out.println(contacto);
                return null;
            }
        }

        System.out.println("data de nascimento na forma yyyy-mm-dd:");
                dateString = sc.next();

                String[] dateParts = dateString.split("-");
                year = Integer.parseInt(dateParts[0]);
                month = Integer.parseInt(dateParts[1]);
                day = Integer.parseInt(dateParts[2]);
                DateYMD dataNasc = new DateYMD(day, month, year);

        try {
            return new Pessoa(nome, cc, dataNasc);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private static Contacto procurarContacto() {
        Scanner sc = new Scanner(System.in);
        int choice;
        int selecao;
        String searchNome;
        String searchNumber;
        ArrayList<Contacto> candidates = new ArrayList<>();

        System.out.println("Selecione uma opção:");
        System.out.println("1. Procurar por nome");
        System.out.println("2. Procurar por numero de telemovel");
        System.out.println("3. Sair");
        choice = sc.nextInt();

        switch (choice) {
            default:
                return null;

            case 1:
                System.out.println("Procura por nome: ");
                searchNome = sc.next();

                for (Contacto contacto : contactos) {
                    if (contacto.getPessoa().getNome().contains(searchNome)) {
                        candidates.add(contacto);
                    }
                }
                break;

            case 2:
                System.out.println("Procura por número: ");
                searchNumber = sc.next();

                for (Contacto contacto : contactos) {
                    if (contacto.getTelemovel().startsWith(searchNumber)) {
                        candidates.add(contacto);
                    }
                }
                break;
            }
            

            if (candidates.size() == 0) {
                System.out.print("Nenhum contacto encontrado");
                return null;
            }
            else if (candidates.size() == 1) {
                return candidates.get(0);
            }
            else {
                System.out.println("Muitos contactos encontrados, selecione um");

                for (Contacto candidate : candidates) {
                    System.out.print(candidate);
                }

                while (true) {
                    System.out.println("Insira a sua seleção: ");
                    selecao = sc.nextInt();

                    for (Contacto candidate : candidates) {
                        if (candidate.getId() == selecao) {
                            return candidate;
                        }
                    }

                    System.out.println("id invalido, tente novamente");
                }
            }
        }

}
