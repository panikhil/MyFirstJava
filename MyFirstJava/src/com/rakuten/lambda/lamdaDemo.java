package com.rakuten.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.rakuten.collection.SortDemo;

public class lamdaDemo {
 public static void main(String[] args) {
	List<String> strings = new ArrayList<>(Arrays.asList(SortDemo.strings));
	Collections.sort(strings,(s1,s2) ->s1.length() - s2.length() );
	System.out.println(strings);
	
	//below is the lamba expression
	/*
	 * Collections.sort(strings,(s1,s2) -> { if(s1.contains("e") &&
	 * !s2.contains("e")) { return -1; }else if(!s1.contains("e") &&
	 * s2.contains("e")) { return 1; } else {return 0;} });
	 */
	//System.out.println(strings);
	// this is the method referencing way of writing lambda where i am passing 
	//already existing functions as an argument
	Collections.sort(strings,(s1,s2)-> StringsUtil.eChecker(s1, s2));
	System.out.println(strings);
}
}
