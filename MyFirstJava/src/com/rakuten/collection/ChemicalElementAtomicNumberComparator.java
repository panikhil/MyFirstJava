package com.rakuten.collection;
import java.util.Comparator;

import com.rakuten.basics.ChemicalElements;

public class ChemicalElementAtomicNumberComparator implements Comparator<ChemicalElements> {
	
	@Override
	public int compare(ChemicalElements c1, ChemicalElements c2) {
		if(c1.getAtomicNumber() > c2.getAtomicNumber()) {
			return 1;
		}else if(c2.getAtomicNumber() > c1.getAtomicNumber()) {
			return -1;
		}else {
			return 0;
		}
		
		//return c1.getAtomicNumber() - c2.getAtomicNumber()
	}

}
