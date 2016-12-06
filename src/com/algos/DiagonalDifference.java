package com.algos;

import java.util.Scanner;

public class DiagonalDifference {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                //System.out.println("[a_i]===="+a_i);
                //System.out.println("[a_j]===="+a_j);
                //System.out.println("a[a_i][a_j]********"+a[a_i][a_j]);
                //System.out.println("a[a_j]===="+a[a_j]);
        }
        }
        diagonalDifference(n, a);
    }

	private static int diagonalDifference(int n, int[][] a) {
		int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        for (int i = 0; i < n; i++) {
        	System.out.println("[i]===="+i);
            
            System.out.println("a[i][i]********"+a[i][i]);
            primaryDiagonal += a[i][i];
            
            System.out.println("[n - 1]===="+((n - i) - 1));
            
            System.out.println("a[i][((n - i) - 1)]********"+a[i][((n - i) - 1)]);
            secondaryDiagonal += a[i][((n - i) - 1)];
		}
        
        System.out.println("primaryDiagonal********"+primaryDiagonal);
        System.out.println("secondaryDiagonal********"+secondaryDiagonal);
        System.out.println("Diff********"+Math.abs(primaryDiagonal - secondaryDiagonal));
        return Math.abs(primaryDiagonal - secondaryDiagonal);
	}

}
