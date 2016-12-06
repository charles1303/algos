package com.algos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

	public static void main(String args[]) throws NumberFormatException, IOException{
		//initTest();
		//test();
	}

	private static void initTest() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      int N = Integer.parseInt(in.readLine());
	      int K = Integer.parseInt(in.readLine());
	      int[] list = new int[N];

	      for(int i = 0; i < N; i ++)
	         list[i] = Integer.parseInt(in.readLine());
	      
	      int unfairness = Integer.MAX_VALUE;
	      
	      unfairness = getUnfairness(list, unfairness, K);
	      
	      /*
	       * Write your code here, to process numPackets N, numKids K, and the packets of candies
	       * Compute the ideal value for unfairness over here
	      */
	      
	      System.out.println(unfairness);
	}
	
	private static int getUnfairness(int[] list,int initialUnfairness,int k){
		int unfairness = initialUnfairness;
		Arrays.sort(list);
        System.out.println("Sorted Array======"+Arrays.toString(list));
        
        System.out.println("init unfairness==="+unfairness);
        System.out.println("candies.length==="+list.length);
        System.out.println("k==="+k);
        for(int i = 0; i <= list.length - k; i++) {
        	System.out.println("i count==="+i);
            int temp = list[i + k - 1] - list[i];
            System.out.println("candies[i + k - 1]==="+list[i + k - 1]);
            System.out.println("candies[i]==="+list[i]);
            System.out.println("temp==="+temp);
            if(unfairness > temp) {
                unfairness = temp;
            }
            System.out.println("current unfairness===="+unfairness);
        }
        System.out.println("final unfairness===="+unfairness);
		return unfairness;
	}
	
	public static void test(){
		Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        int k = Integer.parseInt(stdin.nextLine());
        int[] candies = new int[tests];
        for(int i = 0; i < tests; i++) {
            candies[i] = Integer.parseInt(stdin.nextLine());
        }
        Arrays.sort(candies);
        System.out.println("Sorted Array======"+Arrays.toString(candies));
        int unfairness = candies[candies.length - 1];
        System.out.println("init unfairness==="+unfairness);
        System.out.println("candies.length==="+candies.length);
        System.out.println("k==="+k);
        for(int i = 0; i <= candies.length - k; i++) {
        	System.out.println("i count==="+i);
            int temp = candies[i + k - 1] - candies[i];
            System.out.println("candies[i + k - 1]==="+candies[i + k - 1]);
            System.out.println("candies[i]==="+candies[i]);
            System.out.println("temp==="+temp);
            if(unfairness > temp) {
                unfairness = temp;
            }
            System.out.println("current unfairness===="+unfairness);
        }
        System.out.println("final unfairness===="+unfairness);
        stdin.close();
    }
	
}
