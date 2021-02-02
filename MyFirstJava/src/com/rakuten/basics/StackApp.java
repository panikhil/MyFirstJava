package com.rakuten.basics;
public class StackApp {

	public static void main(String[] args) {
		StackUser user = new StackUser();
		
		FixedArrayStack s = new FixedArrayStack(9);
		
		user.fill10(s); //interface  helps us to do this

	}

}
