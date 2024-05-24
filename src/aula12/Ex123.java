package aula12;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Ex123 {
    public static void main (String[] args) throws IOException{
        try{
            ArrayList<Movie> movies = new ArrayList<>();
            List <String> linha = Files.readAllLines(Paths.get("movies.txt"));
            HashSet<String> genres = new HashSet<>();

            for (int i =1; i<linha.size(); i++){
                String[] split = linha.get(i).split("\t");
                movies.add(new Movie(split[0], Double.parseDouble(split[1]), split[2], split[3], Integer.parseInt(split[4])));
                genres.add(split[3]);
            }


            movies.sort((m1, m2) -> m1.getName().compareTo(m2.getName()));

            System.out.println("Movies sorted by name:");
            for (Movie m : movies){
                System.out.println(m);
            }
            
            System.out.println("---------------------//--------------------\n");


            movies.sort((m1, m2) -> Double.compare(m2.getScore(), m1.getScore()));

            System.out.println("Movies sorted by score:");
            for (Movie m : movies){
                System.out.println(m);
            }

            System.out.println("---------------------//--------------------\n");


            movies.sort((m1, m2) -> Integer.compare(m1.getRt(), m2.getRt()));

            System.out.println("Movies sorted by runtime:");
            for (Movie m : movies){
                System.out.println(m);
            }

            System.out.println("---------------------//--------------------\n");


            System.out.println("Genres:");
            for (String g : genres){
                int count = 0;
                for (Movie m : movies){
                    if (m.getGenre().equals(g)){
                        count++;
                    }
                }
                System.out.println(g + " - " + count);
            }

            System.out.println("---------------------//--------------------\n");


            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Insert a genre:");
                String genre = sc.nextLine().toLowerCase();

                while (!genres.contains(genre)){
                    System.out.println("Genre not found. Try again:");
                    genre = sc.nextLine().toLowerCase();
                }
                
                PrintWriter writer = new PrintWriter("myselection.txt", "UTF-8");
                writer.println("Movies of genre " + genre + " with score > 60");
                for (Movie m : movies){
                    if (m.getGenre().equals(genre) && m.getScore() >60){
                        writer.println(m);
                    }
                }
                sc.close();
                writer.close();
            } catch (IOException e){
                System.out.println("Erro na escrita do ficheiro");
            }

            System.out.println("\nDone!\n");

        } catch (IOException e){
            System.out.println("Erro na leitura do ficheiro");
        }
    }
    
}
