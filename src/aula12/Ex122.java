package aula12;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex122 {
    public static void main (String[] args) throws IOException{
        System.out.println("Starting...");
        Scanner file = null;
        try{
            file = new Scanner(new FileReader("A_cidade_e_as_serras.txt"));
        }catch(IOException e){
            System.out.println("Error opening file");
            System.exit(1);
        }

        Map<Character, TreeMap<String,Integer>> wordMap = new TreeMap<>();
        while (file.hasNextLine()){
            String line = file.nextLine().replaceAll("\\p{Punct}","");
            String[] parts = line.split(" ");
            for (int i = 0; i < parts.length; i++){
                if (parts[i].length() > 2){
                    String word = parts[i].toLowerCase();
                    char initial = word.charAt(0);
                    if (!wordMap.containsKey(initial)){
                        wordMap.put(initial, new TreeMap<>());
                    }
                    TreeMap <String,Integer> innerMap = wordMap.get(initial);
                    innerMap.put(word, innerMap.getOrDefault(word, 0)+1);
            }
        }
    }
    file.close();

    PrintWriter writer = new PrintWriter("wordCount.txt", "UTF-8");
    for (Map.Entry<Character,TreeMap<String,Integer>> entry : wordMap.entrySet()){
        writer.println("\n-------------------------\n");
        writer.print(entry.getKey()+": ");
        boolean first = true;
        for (Map.Entry<String,Integer> innerEntry : entry.getValue().entrySet()){
            if (!first){
                writer.print(", ");
            }
            writer.print(innerEntry.getKey()+": "+innerEntry.getValue());
            first = false;
        }
        writer.println();
    }
    writer.close();

    System.out.println("Done!");

}
}
