package aula10;

import java.util.HashMap;
import java.util.Map.Entry;

public class Ex101 {

    private static HashMap<String, Book> library = new HashMap<>();
    public static void main(String[] args) {

        //add
        library.put("horror",new Book("Flores","luisa",1995));
        library.put("fantasia",new Book("Aves","joao",1980));
        library.put("historia",new Book("Computadores","maria",2000));
        library.put("ação",new Book("Passeio","joana",2020));
        library.put("desporto",new Book("Corrida","ana",2025));

        //alter
        library.put("desporto",new Book("Maratoa","mariana",2030));

        //remove
        library.remove("desporto");

        //toString
        System.out.println(library);

        //print
        for (Entry<String, Book> entry : library.entrySet()) {
            System.out.println( entry.getKey() + ": " + entry.getValue() );
        }

        //print keys
        System.out.println(library.keySet());

        //print books
        System.out.println(library.values());
    }
}