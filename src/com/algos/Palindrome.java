package com.algos;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Palindrome {
	public static final String[] VALID_CHARS = {"{","}","(",")","[","]"};

	public static boolean isBalanced(String expression) {
		boolean result = true;
		int len = expression.length();
		if(len%2 != 0)
			return false;
		int mid = len/2;
		int end = len - 1;
		for(int i = mid; i >= 1; i--){
			if(!matches(expression.charAt(i-1),expression.charAt(end-i+1))){
				result = false;
				break;
			}
		}
		return result;
	      
    }
	
	private static boolean matches(char left, char right) {
	    if (left == '(') return (right == ')');
	    if (left == '[') return (right == ']');
	    if (left == '{') return (right == '}');
	    return false;
	  }
	
	public static boolean validateCharacters(String input) {
	    HashMap<Character, Character> matches = new HashMap<Character, Character>();
	    matches.put('{', '}');
	    matches.put('(', ')');
	    matches.put('[', ']');

	    Set<Character> specialChars = new HashSet<Character>();
	    Deque<Character> expected = new LinkedList<Character>();
	    for (Entry<Character, Character> ee : matches.entrySet()) {
	        specialChars.add(ee.getKey());
	        specialChars.add(ee.getValue());
	    }

	    for (int i = 0; i < input.length(); i++) {
	        char next = input.charAt(i);
	        Character expect = expected.peekLast();
	        if (expect != null && expect == next) {
	            expected.removeLast();
	        }
	        else if (matches.containsKey(next)) {
	            expected.addLast(matches.get(next));
	        }
	        else if (specialChars.contains(next)) {
	            return false;
	        }
	    }
	    return true;
	}
	
	
  public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       boolean exit = false;
       int t = in.nextInt();
       if (t < 1 || t > Math.pow(10, 3)){
           System.out.println("Failed Constraint 1");
           exit = true;
           //System.exit(0);
       }
       for(int a0 = 0; a0 < t; a0++) {
           String expression = in.next();
           if(expression.length() < 1 || expression.length() > Math.pow(10, 3)){
               System.out.println("Failed Constraint 2");
               exit = true;
               //System.exit(0);
           }
           if(!validateCharacters(expression)){
        	   System.out.println("Failed Constraint 3");
        	   exit = true;
               //System.exit(0);
           }
           if(!exit){
            boolean answer = isBalanced(expression);
            if(answer)
             System.out.println("YES");
            else System.out.println("NO");
           }
       }
   }
}

