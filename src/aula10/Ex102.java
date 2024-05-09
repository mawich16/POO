package aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Ex102 {

    private static TreeMap<String, List<Book>> library = new TreeMap<>();

    private static List<Book> allBooks = new ArrayList<>();

    private static void addBook(String genero, Book book) {
        List <Book> l = library.get(genero);
        if (l == null) {
            l = new ArrayList<Book>();
            library.put(genero,l);
        }
        l.add(book);
    }

    public static void main(String[] args) {

        //add
        addBook("horror", new Book("Flores","luisa",1995));
        addBook("fantasia",new Book("Passaros","jonhy",1990));
        addBook("fantasia",new Book("Aves","joao",1980));
        addBook("historia", new Book("Computadores","maria",2000));
        addBook("ação", new Book("Passeio","joana",2020));
        addBook("desporto", new Book("Corrida","ana",2025));


        //alter ?
        addBook("desporto", new Book("Maratoa","mariana",2030));

        //remove
        library.remove("desporto");

        //toString
        System.out.println(library);


        public static Book getRandomBook(Sting genero) {
            List <Book> l = library.get(genero);
            int i = Math.random(0,l.size());
            return l[i];
        }

    }
}
