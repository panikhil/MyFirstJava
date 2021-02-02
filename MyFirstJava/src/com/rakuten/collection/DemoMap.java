package com.rakuten.collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
 public static void  main(String [] args) {
	  demoSimpleMaps();
 }

private static void demoSimpleMaps() {
	Map<String, Integer> runs = new HashMap<>();
	runs.put("Sachin",10000);
	runs.put("Virat", 50000);
	int a = runs.get("Virat");
	System.out.println(a);
	
}
}
