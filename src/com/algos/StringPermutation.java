package com.algos;

import java.util.Arrays;

public class StringPermutation {
	//p(a) = {"a"}
	//p(ab) ={"ab","ba"}
	//p(abc) = {"cab","acb","abc"},{"cba","bca","bac"}
	//merge arrays
	//p(abcd) = {"dcab","cdab","cadb","cabd"} {"dacb","adcb","acdb","acbd},{"dabc","adbc","abdc","abcd"}
	
	public static void main(String args[]){
		String input = "abcd";
		//permutate(input);
		//permutation("",input);
		permute(input);
	}
	
	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	public static void permutate(String input){
		for (int i = 0; i < input.length(); i++) {
			String stringToPermutate = input.substring(0, i+1);
			System.out.println("stringToPermutate====="+stringToPermutate);
			String lastChar = stringToPermutate.substring(i);
			System.out.println("lastChar====="+lastChar);
			String firstPart = stringToPermutate.substring(0, i);
			System.out.println("firstPart====="+firstPart);
			String[] permutation = new String[firstPart.length()+1];
			System.out.println("firstPart.length()====="+firstPart.length());
			for (int j = 0; j < firstPart.length(); j++) {
				String permutated = firstPart.substring(0, j)+lastChar+firstPart.substring(j, firstPart.length());
				System.out.println("permutated====="+permutated);
				permutation[j] = permutated;
				
			}
			permutation[firstPart.length()] = stringToPermutate;
			System.out.println(Arrays.toString(permutation));
			
			
			
		}
	}
	
	static void permute( String input)
	{
	  int inputLength = input.length();
	  boolean[ ] used = new boolean[ inputLength ];
	  StringBuffer outputString = new StringBuffer();
	  char[ ] in = input.toCharArray( );
	  
	  doPermute ( in, outputString, used, inputLength, 0 );

	}

	  static void doPermute ( char[ ] in, StringBuffer outputString, 
	                    boolean[ ] used, int inputlength, int level)
	  {
	     if( level == inputlength) {
	     System.out.println ( outputString.toString()); 
	     return;
	     }

	    for( int i = 0; i < inputlength; ++i )
	    {       

	       if( used[i] ) continue;

	       outputString.append( in[i] );      
	       used[i] = true;       
	       doPermute( in,   outputString, used, inputlength, level + 1 );       
	       used[i] = false;       
	         outputString.setLength(   outputString.length() - 1 );   
	    }
	 }
}
