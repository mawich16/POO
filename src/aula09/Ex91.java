package aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import aula05.DateYMD;
import aula06.Pessoa;
import aula07.Date;

public class Ex91 {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10)
        c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
        System.out.println("Elemento: " + c1.get(i));
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

        System.out.println(c2.indexOf("Chuva"));
        System.out.println(c2.subList(1, 2));


        Set<Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Maria", 117, new DateYMD(1, 1, 2001)));
        c3.add(new Pessoa("João", 113, new DateYMD(2, 2, 2002)));
        c3.add(new Pessoa("Joel", 115, new DateYMD(3, 3, 2003)));
        c3.add(new Pessoa("Toni", 114, new DateYMD(4, 4, 2004)));
        c3.add(new Pessoa("Manel", 116, new DateYMD(5, 5, 2005)));

        for (Pessoa pessoa : c3) {
            System.out.println(pessoa);
        }

        if (c3.add(new Pessoa("Hopper", 117, new DateYMD(1, 1, 1)))) throw new AssertionError();

        Set<Date> c4 = new TreeSet<>();

        c4.add(new aula07.DateYMD(1, 2, 2023));
        c4.add(new aula07.DateYMD(4, 5, 2026));
        c4.add(new aula07.DateYMD(7, 8, 2029));


        for (Date date : c4) {
            System.out.println(date);
        }
    }
}
