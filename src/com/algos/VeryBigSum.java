package com.algos;

import java.util.Scanner;

public class VeryBigSum {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long sum = 0;
        for (int i = 0; i < n; i++) {
        	 if(n >= 1 && n <= 10 && arr[i] >= 1 && arr[i] <= (int)Math.pow(10,10)){
        		 sum +=(long)arr[i];
        	 }
			
		}
        System.out.println(sum);
        
    }

}
