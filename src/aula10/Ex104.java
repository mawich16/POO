package aula10;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex104 {
    public static void main(String[] args) throws IOException{
        try (Scanner input = new Scanner(new FileReader("words.txt"))) {
            ArrayList<String> palavras = new ArrayList<>();

            ArrayList<String> maisDoQue2 = new ArrayList<>();
            System.out.println("Palavras: ");

            while (input.hasNext()) {
                String word = input.next();
                System.out.println(word);
                palavras.add(word);

                if (word.length() > 2) {
                    maisDoQue2.add(word);
                }
            }

            System.out.println();
            System.out.println("Todas as palavras com mais de duas letras: " + maisDoQue2 + "\n");

            System.out.println("Palavras do ficheiro terminadas em 's': ");
            for (String palavra: palavras) {
                if (palavra.toLowerCase().endsWith("s")) {
                    System.out.print(palavra + " | ");
                }
            }

            System.out.println();
            System.out.println("\nPalavras com mais do que 2 caracteres terminadas em 's': ");
            for (String palavra: maisDoQue2) {
                if (palavra.toLowerCase().endsWith("s")) {
                    System.out.print(palavra + " | ");
                }
            }

            System.out.println();
            System.out.println();

            Iterator<String> iterator = maisDoQue2.iterator();
            while (iterator.hasNext()) {
                String word = iterator.next();
                for (char c: word.toCharArray()) {
                    if(!Character.isLetter(c)) {
                        iterator.remove();
                        break;
                    }
                }
            }

            System.out.println();
            System.out.println();

            System.out.println("Palavras que contêm apenas letras: " + maisDoQue2);
        }
    }
}