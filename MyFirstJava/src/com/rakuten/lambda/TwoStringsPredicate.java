package com.rakuten.lambda;
@FunctionalInterface
public interface TwoStringsPredicate {

	public boolean isFirstBetterThanSecond(String s1, String s2);
}
