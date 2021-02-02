package com.rakuten.lambda;

import java.util.ArrayList;
import com.rakuten.collection.SortDemo;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Lambda1Demo {
	
	public int eChecker(String s1,String s2) {
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>(Arrays.asList(SortDemo.strings));
		Collections.sort(strings, (s1,s2) -> s1.length() - s2.length());
		System.out.println(strings);
//		Collections.sort(strings,LambdaDemo::eChecker);
		Lambda1Demo obj = new Lambda1Demo();
		Collections.sort(strings,obj::eChecker);
		System.out.println(strings);
		
		//String lengthier = betterString("hi","Hello",(s1,s2) -> s1.length() > s2.length());
		String lengthier = betterElements("hi","Hello",(s1,s2) -> s1.length() > s2.length());
		
		System.out.println(lengthier);
	}

	public static String betterString(String string1, String string2, TwoStringsPredicate decider) {
		if(decider.isFirstBetterThanSecond(string1, string2)) {
			return string1;
		}else {
			return string2;
		}
	}
	
	public static <ET> ET betterElements(ET e1, ET e2, TwoElementsPredicate<ET> decider){
		
		if(decider.isFirstBetterThanSecond(e1, e2)) {
			return e1;
		}else {
			return e2;
		}
	}

}
