package aula12;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex121 {
    public static void main (String[] args) throws IOException{
        Scanner file = null;
        try{
            file = new Scanner(new FileReader("palavras.txt"));
        }catch(IOException e){
            System.out.println("Error opening file");
            System.exit(1);
        }

        //count number of words
        int count = 0;
        while (file.hasNextLine()){
            String line = file.nextLine().replaceAll("\\p{Punct}","");
            String[] parts = line.split(" ");
            count += parts.length;
        }

        System.out.println("Number of words: " + count);

        //count only different words
        Set <String> difWords= new HashSet<>();
        file = new Scanner(new FileReader("palavras.txt"));
        while (file.hasNextLine()){
            String line = file.nextLine().replaceAll("\\p{Punct}","");
            String[] parts = line.split(" ");
            for (int i = 0; i < parts.length; i++){
                difWords.add(parts[i]);
            }
        }

        System.out.println("Number of different words: " + difWords.size());
    
    }
    
}
