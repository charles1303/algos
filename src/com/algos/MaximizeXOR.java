package com.algos;

import java.util.Scanner;

public class MaximizeXOR {

	static int maxXor(int l, int r) {
		int maximumXor = 0;
		
		if(l < 1){
			throw new IllegalArgumentException("Invalid Minumum Value");
		}
		if(l > r){
			throw new IllegalArgumentException("l cannot be large than r");
		}
		if(r > Math.pow(10, 3)){
			throw new IllegalArgumentException("Invalid Maximum Value");
		}
		
		for (int i = l; i <= r; i++) {
			for (int j = i; j <= r; j++) {
				maximumXor = (maximumXor > (i^j)) ? maximumXor : (i^j);
				System.out.println(i+"^"+j+"==============="+(i^j));
			}
		}
		
		return maximumXor;

    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);*/
    	int res;
    	res = maxXor(13, 15);
        System.out.println(res);
        
    }
}
