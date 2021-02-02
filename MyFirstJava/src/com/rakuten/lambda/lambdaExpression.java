package com.rakuten.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambdaExpression {
public static String[] strings = { "this", "is", "a", "bunch", "of", "bizaree", "words", "like", "xylophone" };

public static void main(String[] args) {
	
	arraySorting();
}

private static void arraySorting() {
	List<String> wordList = new ArrayList<>(Arrays.asList(strings));
	Arrays.sort(strings);
	System.out.println(Arrays.asList(strings));
	String[] s1 = Arrays.sort(strings,s1);
	
	
	
}

}
