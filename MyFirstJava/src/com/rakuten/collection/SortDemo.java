package com.rakuten.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.rakuten.basics.ChemicalElements;

public class SortDemo {
	public static String[] strings = { "this", "is", "a", "bunch", "of", "bizaree", "words", "like", "xylophone" };

	public static void main(String[] args) {
		// demoSimpleSortOfStrings();
		demoSortOfUserDefinedTypes();
	}

	private static void demoSortOfUserDefinedTypes() {

		ChemicalElements h = new ChemicalElements(1, "Hydrogen", "H");
		ChemicalElements k = new ChemicalElements(19, "Potassium", "K");
		ChemicalElements o = new ChemicalElements(8, "Oxygne", "O");
		ChemicalElements zn = new ChemicalElements(30, "Zinc", "Zn");
		List<ChemicalElements> cList = new ArrayList<>();

	}

	/*
	 * private static void demoSimpleSortOfStrings() { //List<String> wordList =
	 * Arrays.asList(strings); List<String> wordList = new
	 * ArrayList<>(Arrays.asList(strings));//this will not modify the original array
	 *rather creates the copy of the array
	 *  // System.out.println(strings); //
	 * System.out.println(wordList); // Arrays.sort(strings); //for sorting array //
	 * System.out.println(Arrays.asList(strings)); //for printing array elements
	 * Collections.sort(wordList); System.out.println(wordList);
	 * 
	 * for(String aWord: strings) { System.out.println(aWord); }
	 * 
	 * }
	 */

}
