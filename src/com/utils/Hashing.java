package com.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashing {
	final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
	public static void main(String args[]){
		
		String password = "shq";
		String salt = "8bl1GqHv"+"\n";
		
		//byte[] salt = hexStringToByteArray("5f8f041b75042e56");

		//try {
		    System.out.println(bytesToHex(getHash(password, salt)));
		//} catch (NoSuchAlgorithmException e1) {
		    //e1.printStackTrace();
		//}
	}

	
	public static byte[] getHash(String password, String salt){
		String password1 = "abcd";
		String salt1 = "5f8f041b75042e56";

		try {
		    MessageDigest digest = MessageDigest.getInstance("SHA-256");
		    
		    digest.update((password + salt).getBytes());
		    System.out.println("***********************"+bytesToHex(digest.digest()));

		    return digest.digest((password + salt).getBytes("UTF-8"));
		} catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
			e.printStackTrace();
		    return null;
		}
	}
	
	public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                                 + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
	
	
	public static String bytesToHex(byte[] bytes) {
	    char[] hexChars = new char[bytes.length * 2];
	    for ( int j = 0; j < bytes.length; j++ ) {
	        int v = bytes[j] & 0xFF;
	        hexChars[j * 2] = hexArray[v >>> 4];
	        hexChars[j * 2 + 1] = hexArray[v & 0x0F];
	    }
	    return new String(hexChars);
	}
}
