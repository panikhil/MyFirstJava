package com.rakuten.stream;
//Part3


import java.util.*;
import java.util.stream.*;



public class StreamExamplePart3 {
  public static void main(String[] args) {
    //double[] nums = { 1, 4, 9 };
    double[] nums = MathUtils.randomArray(100_000_000);
    System.out.println("Summing sequentially:");
   
      double sum = MathUtils.sqrtSum(nums);
      System.out.printf("  Sum is %,.8f.%n", sum);
  
    System.out.println("Summing in parallel:");
   
      sum = MathUtils.sqrtSumParallel(nums);
      System.out.printf("  Sum is %,.8f.%n", sum);
   
    
    System.out.println("Random nums:");
    MathUtils.randomNums(10).limit(5).forEach(System.out::println);
    List<Double> randomNums1 = 
      MathUtils.randomNums(10).limit(10).collect(Collectors.toList());
    System.out.println("List of random nums: " + randomNums1);
    Double[] randomNums2 =
      MathUtils.randomNums(10).limit(20).toArray(Double[]::new);
    System.out.println("Array of random nums: " + Arrays.asList(randomNums2));
  }
}
