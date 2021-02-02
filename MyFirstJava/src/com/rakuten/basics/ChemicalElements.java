package com.rakuten.basics;
public class ChemicalElements implements Comparable<ChemicalElements> {

	int atomicNumber;
	String name;
	String symbol;

	static boolean[] alkaliMetals = new boolean[120];

	static {
		alkaliMetals[3] = true;
		alkaliMetals[11] = true;
		alkaliMetals[19] = true;
		alkaliMetals[37] = true;
		alkaliMetals[55] = true;
		alkaliMetals[87] = true;
	}

	public ChemicalElements(int atomicNumber, String name, String symbol) {
		this.atomicNumber = atomicNumber;
		this.name = name;
		this.symbol = symbol;

	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + atomicNumber;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChemicalElements other = (ChemicalElements) obj;
		if (atomicNumber != other.atomicNumber)
			return false;
		return true;
	}


	public boolean isTransitionMetal() {
		return  (atomicNumber >= 21 && atomicNumber <= 31)
				||(atomicNumber >= 39 && atomicNumber <= 48)
				||(atomicNumber >= 72 && atomicNumber <= 80)
				||(atomicNumber >= 104 && atomicNumber <= 112);
	}
	
	public boolean isAlkaliMetal() {
		return alkaliMetals[atomicNumber];
	}

	@Override
	public int compareTo(ChemicalElements other) {
		if(this.atomicNumber> other.atomicNumber) {
			return 1; //we are returning positive i.e. this Object is > than other
		}
		else if(other.atomicNumber > this.atomicNumber ) {
			return -1;
		}
		else {
			return 0;
		}
}
}






