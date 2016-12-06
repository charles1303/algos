package com.coding.interviews;

public class UniqueChar {
	
	public static void main(String[] args){
		String str = "abcfdef";
		//System.out.println(isUniqueChar(str));
		System.out.println(isUniqueChar2(str));
	}
	
	public static boolean isUniqueChar(String str){
		if(str.length() > 256) return false;
		
		boolean[] charSet = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(charSet[val]){
				return false;
			}
			charSet[val] = true;
		}
		return true;
	}
	
	public static boolean isUniqueChar2(String str){
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			
			if((checker & (1 << val)) > 0){
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

}
