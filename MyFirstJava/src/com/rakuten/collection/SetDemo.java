package com.rakuten.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		demoHashSet();

	}

	private static void demoHashSet() {
		Set<String> uniqueWords = new LinkedHashSet<>();
		
		try(Scanner kb = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter a word:");
				String aWord = kb.nextLine();
				if (aWord.equalsIgnoreCase("quit")) {
					break;
				}
				if (!uniqueWords.add(aWord)) {
					System.out.println("That's a duplicate!!");
				}
			}
			System.out.println("_____________________");
			for (String s : uniqueWords) {
				System.out.println(s);
			}
		} 
	}

}
