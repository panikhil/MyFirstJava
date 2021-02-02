package com.rakuten.stream;
//Part 2

import java.util.*;



public class StreamExamples {
  public static void main(String[] args) {
    List<String> words = 
        Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
    System.out.printf("Original words: %s.%n", words);
    //  Stream<String> wordStream = words.stream();  NO!! Why not?
    
    String upperCaseWords = 
        words.stream().reduce("", (s1, s2) -> s1.toUpperCase() 
                                              + s2.toUpperCase());
    System.out.printf("Single uppercase String: %s.%n", 
                      upperCaseWords);
    
    String upperCaseWords2 = 
        words.stream().map(String::toUpperCase)     // Or .map (s -> s.toUpperCase())
                      .reduce("", String::concat);  // Or .reduce("", (s1,s2) -> s1+s2)
    System.out.printf("Single uppercase String: %s.%n", 
                      upperCaseWords2);
    
    String wordsWithCommas = 
        words.stream().reduce((s1, s2) -> s1 + "," + s2)
                      .orElse("need at least two strings");
    System.out.printf("Comma-separated String: %s.%n", 
                      wordsWithCommas);
    
    int numberOfChars =
        words.stream().mapToInt(String::length)
                      .sum();
    System.out.printf("Total number of characters: %s.%n", 
                      numberOfChars);
    
    long numberOfWordsWithH =
        words.stream().filter(s -> s.contains("h"))
                      .count();
    System.out.printf("Number of words containing 'h': %s.%n", 
                      numberOfWordsWithH);
  }
}

