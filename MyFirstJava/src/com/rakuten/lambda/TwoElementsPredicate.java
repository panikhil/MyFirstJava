package com.rakuten.lambda;

public interface TwoElementsPredicate<T> {
	public boolean isFirstBetterThanSecond(T first, T second);

}
