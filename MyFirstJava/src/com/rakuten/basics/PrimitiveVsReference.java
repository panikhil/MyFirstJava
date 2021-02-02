package com.rakuten.basics;

public class PrimitiveVsReference {
	static int class_level_x;
 public static void main(String[] args) {
	   int x;
		class_level_x++;
		System.out.println(class_level_x);
		
//		x++;
		
//		System.out.println(x); this will give error because its a local type variable
		
	int i = 9;
	int []a = new int[10];
	somefun1(i); //call by value of primitive type
	System.out.println(i);
	 a[0] = 90;
	somefun2(a); //call by reference
	System.out.println(a[0]);
}

public static void somefun1(int a) {
	a++;
}
public static void somefun2(int []b) {
   b[0]++;
	
}
}