package aula10;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex103 {
	public static void main(String[] args) {
		String sentence = "Hello World";
		Map<Character, TreeSet<Integer>> map = new TreeMap<>();

		for (int i = 0; i < sentence.length(); i++) {
			Character letter = sentence.charAt(i);

			if (map.containsKey(letter)) {
				map.get(letter).add(i);
			} else {
				TreeSet<Integer> treeSet = new TreeSet<>();
				treeSet.add(i);
				map.put(letter,treeSet);
			}
		}

		System.out.println(map.entrySet());
	}

}

