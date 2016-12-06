package com.algos;

import java.util.Scanner;

public class LonelyInteger {
	
	public static void main2(String[] args){
		System.out.println(1^3^2^4^5^1^2^4^5);
		System.out.println(1^2^4^5^1^2^4^5);
		System.out.println(1^1^1);
		System.out.println(1^1);
	}
	
	static int lonelyinteger(int[] a) {
        int result = 0;
        for(int i=0;i<a.length;i++){
            result = result ^a[i];
        }
        return result;
 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
         
        int _a_size = Integer.parseInt(in.nextLine());
        if(_a_size > 100) return;
        if(_a_size%2 == 0) return;
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
         
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
         
        res = lonelyinteger(_a);
        System.out.println(res);
         
    }

}
