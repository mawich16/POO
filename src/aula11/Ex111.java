package aula11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex111 {
    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<String, TreeMap<String, Integer>> pairs = new TreeMap<>();
        Scanner input = new Scanner(new FileReader("words.txt"));

        input.useDelimiter("[\\p{Punct}\\s]");;


        ArrayList<String> palavras = new ArrayList<>();

        while (input.hasNext()) {
            String word = input.next();
            if (word.length() > 2) {
                word = word.toLowerCase();
                palavras.add(word);
            }
        }
        input.close();

        for (int i = 0; i < palavras.size()-1; i++) {
            String atual = palavras.get(i);
            String seguinte = palavras.get(i + 1);

            if (!pairs.containsKey(atual)) {
                TreeMap<String, Integer> elemento = new TreeMap<>();
                elemento.put(seguinte, 1);
                pairs.put(atual, elemento);
            } else {
                if (pairs.get(atual).containsKey(seguinte)) {
                    pairs.get(atual).replace(seguinte, pairs.get(atual).get(seguinte) + 1);
                } else {
                    pairs.get(atual).put(seguinte, 1);
                }
            }
        }

        for (String key : pairs.keySet()) {
            System.out.println(key + " = " + pairs.get(key));
        }
    }
}
