package com.rakuten.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExercises {
	
	public static <T> List<T> allMatches(List<T> list,Predicate<T> matcher){
		List<T> matches = new ArrayList<>();
		for(T aPossibleMatch : list) {
			if(matcher.test(aPossibleMatch)) {
				matches.add(aPossibleMatch);
			}
		}
		return matches;
	}

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(100,200,300,400,500,600,700,800);
		List<Integer> bigNums = allMatches(nums, n -> n>=500);
		System.out.println(bigNums);

	}

}
