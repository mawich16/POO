package aula11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex111 {
        public static void main(String[] args)  throws FileNotFoundException {
        final Map<String, Map<String, Integer>> pairs = new TreeMap<>();
        final Scanner input = new Scanner(new FileReader("major.txt"));

        input.useDelimiter("\t\n.,:'‘’;?!-*{}=+&/()[]”“\"\'");

    }
}