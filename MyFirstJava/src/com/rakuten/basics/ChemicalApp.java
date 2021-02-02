package com.rakuten.basics;

public class ChemicalApp {

	public static void main(String[] args) {
		ChemicalElements h = new ChemicalElements(1, "Hydrogen", "H");
		System.out.println("Is hydrogen an alkali? "+h.isAlkaliMetal());
		
		ChemicalElements k = new ChemicalElements(19, "Potassium", "K");
		System.out.println("Is Potassium an alkali? "+k.isAlkaliMetal());
	}

}
