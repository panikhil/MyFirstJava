package com.rakuten.lambda;

public interface StringsUtil {
	//if we will not use static then it will raise an error as interface cannot have concrete methods
     public static int eChecker(String s1, String s2) {
    	 if(s1.contains("e") && !s2.contains("e")) {
 			return -1;
 		}else if(!s1.contains("e") && s2.contains("e")) {
 			return 1;
 		}
 		else {return 0;}
 	}
     }

