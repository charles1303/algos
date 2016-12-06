package com.algos;

import java.util.Scanner;

public class PalidromeString {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 1 || n > 10){
        	throw new IllegalArgumentException("Invalid range for number of strings");
        }
        String input[] = new String[n+1];
        for (int i = 0; i <= n; i++) {
        	input[i] = in.nextLine();
        	
		}
        noOfReductions(input);
		
	}

	private static void testPalindrome() {
		String inputString;
		//Scanner in = new Scanner(System.in);

		//System.out.println("Input a string");
		//inputString = in.nextLine();
		inputString = "moom";

		int length = inputString.length();
		int i, begin, end, middle;

		begin = 0;
		end = length - 1;
		middle = (begin + end) / 2;
		
		System.out.println("begin 0====="+begin);
		System.out.println("end 0====="+end);
		System.out.println("middle 0====="+middle);
		
		System.out.println("commencing loop=====");

		for (i = begin; i <= middle; i++) {
			//Character.toLowerCase(ch1) < Character.toLowerCase(ch2);
			System.out.println("char 1====="+Character.toLowerCase(inputString.charAt(begin)));
			System.out.println("char 2====="+Character.toLowerCase(inputString.charAt(end)));
			
			System.out.println("char val 1====="+(int) Character.toLowerCase(inputString.charAt(begin)));
			System.out.println("char val 2====="+(int)Character.toLowerCase(inputString.charAt(end)));
			
			System.out.println("Character.toLowerCase(ch1) < Character.toLowerCase(ch2)======="+(Character.toLowerCase(inputString.charAt(begin)) < Character.toLowerCase(inputString.charAt(end))));
			if ((int)inputString.charAt(begin) == (int)inputString.charAt(end)) {
				System.out.println("begin 1====="+begin);
				System.out.println("end 1====="+end);
				begin++;
				end--;
				System.out.println("begin 2====="+begin);
				System.out.println("end 2====="+end);
				System.out.println("********************************************");
			} else {
				break;
			}
			System.out.println("i loop value====="+i);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("i====="+i);
		System.out.println("middle====="+middle);
		System.out.println("middle + 1====="+(middle + 1));
		if (i == middle + 1) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
	
	public static void noOfOperations(String inputString){
		int noOfOperations = 0;
		int length = inputString.length();
		int i, begin, end, middle;

		begin = 0;
		end = length - 1;
		middle = (begin + end) / 2;
		
		System.out.println("begin 0====="+begin);
		System.out.println("end 0====="+end);
		System.out.println("middle 0====="+middle);
		
		System.out.println("commencing loop=====");

		for (i = begin; i <= middle; i++) {
			//Character.toLowerCase(ch1) < Character.toLowerCase(ch2);
			System.out.println("char 1====="+Character.toLowerCase(inputString.charAt(begin)));
			System.out.println("char 2====="+Character.toLowerCase(inputString.charAt(end)));
			
			System.out.println("char val 1====="+(int) Character.toLowerCase(inputString.charAt(begin)));
			System.out.println("char val 2====="+(int)Character.toLowerCase(inputString.charAt(end)));
			if ((int)inputString.charAt(begin) != (int)inputString.charAt(end)) {
				noOfOperations += Math.abs((int)inputString.charAt(begin) - (int)inputString.charAt(end));
			}
			begin++;
			end--;
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("noOfOperations====="+noOfOperations);
		
	}
	
	public static void noOfReductions(String inputStringArr[]){
		
		for (int i = 1; i < inputStringArr.length; i++) {
			int noOfOperations = 0;
			String inputString = inputStringArr[i];
			if(inputString.length() < 1 || inputString.length() > Math.pow(10,4)){
        		throw new IllegalArgumentException("Invalid string length");
        	}
			
			if(!inputString.equals(inputString.toLowerCase())){
        		throw new IllegalArgumentException("Upper case characters exists");
        	}
			
			int length = inputString.length();
			int j, begin, end, middle;

			begin = 0;
			end = length - 1;
			middle = (begin + end) / 2;
			

			for (j = begin; j <= middle; j++) {
				if ((int)inputString.charAt(begin) != (int)inputString.charAt(end)) {
					noOfOperations += Math.abs((int)inputString.charAt(begin) - (int)inputString.charAt(end));
				}
				begin++;
				end--;
			}
			
			System.out.println(noOfOperations);
			
		}
		}
		

}
