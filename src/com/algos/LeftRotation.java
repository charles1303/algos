package com.algos;

import java.util.Scanner;

public class LeftRotation {
	
	 public static int[] arrayLeftRotation(int[] a, int n, int k) {
		 if(n < 1 || n > Math.pow(10, 5)){
			 throw new IllegalArgumentException("Invalid range for number of array elements");
		 }
		 
		 if(k < 1 || k > n){
			 throw new IllegalArgumentException("Invalid no of rotations");
		 }
		        int[] copy = a.clone();
	            for (int i = 0; i < a.length; ++i) {
	            	if(a[i] < 1 || a[i] > Math.pow(10, 6)){
	       			 throw new IllegalArgumentException("Invalid array element value range");
	       		 }
	            	int j = (i + k) % a.length;
	                a[i] = copy[j];
	                
	        }
		  
	      return a;
	    }
	    
	    public static void main2(String[] args) {
	        //Scanner in = new Scanner(System.in);
	        //5 4
	        //1 2 3 4 5
	       //int n = in.nextInt();
	        //int k = in.nextInt();
	        //int a[] = new int[n];
	    	
	        /*for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }*/
	    	
	    	int n = 5;
	        int k = 4;
	        int a[] = {1,2,3,4,5};
	      
	        int[] output = new int[n];
	        output = arrayLeftRotation(a, n, k);
	        for(int i = 0; i < n; i++)
	            System.out.print(output[i] + " ");
	      
	        System.out.println();
	      
	    }
	    
	    public static void main(String[] args) {
	        //Scanner in = new Scanner(System.in);
	        //5 4
	        //1 2 3 4 5
	       //int n = in.nextInt();
	        //int k = in.nextInt();
	        //int a[] = new int[n];
	    	
	        /*for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }*/
	    	
	    	int n = 5;
	        int k = 4;
	        int a[] = {1,2,3,4,(int)Math.pow(10,7)};
	      
	        int[] output = new int[n];
	        //output = rotate(a,k);
	        output = arrayLeftRotation(a, n, k);
	        for(int i = 0; i < n; i++)
	            System.out.print(output[i] + " ");
	      
	        System.out.println();
	      
	    }
	    
	    private static int[] rotate(int[] arr, int order) {
	        if (arr == null || order < 0) {
	            throw new IllegalArgumentException("The array must be non-null and the order must be non-negative");
	        }
	        int offset = order;
	        if (offset > 0) {
	            int[] copy = arr.clone();
	            for (int i = 0; i < arr.length; ++i) {
	            	int j = (i + offset) % arr.length;
	                arr[i] = copy[j];
	                
	            }
	        }
	        return arr;
	    }
	    
	    
}
