package com.algos;

import java.util.*;
public class DecentNumber{

 public final static String FIVE_STRING = "5";
 public final static String THREE_STRING = "3";
 public final static int MAX_TEST_CASES = 20;
 public final static int MAX_NO_OF_DIGITS = 100000;
 
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int testCases =  Integer.parseInt(sc.nextLine());
    if(testCases > MAX_TEST_CASES) {
    	sc.close();
    	return;
    }
    for(int i = 0; i < testCases; i++){
      int num = sc.nextInt();
      System.out.println(getDescentNumber(num));
    }
    sc.close();
  }

  public static String getDescentNumber(int num){
    String descentNumber = "-1";
    for(int i = num; i >=0; i--){
       if((i%3) == 0 && ((num - i)%5) == 0){
         descentNumber = generateDescentNumber(i,num-i);
         break;
       }else if ((i%5) == 0 && ((num - i)%3) == 0){
         descentNumber = generateDescentNumber(i,num-i);
       }
    }
    return descentNumber;
  }

  public static String generateDescentNumber(int fiveCnts, int threeCnts){
	  if(MAX_NO_OF_DIGITS < (fiveCnts+threeCnts)) return "-1";
	  
    StringBuilder descentNumberStr = new StringBuilder();
    for(int i = 0; i < fiveCnts; i++){
       descentNumberStr.append(FIVE_STRING); 
    }
    for(int i = 0; i < threeCnts; i++){
      descentNumberStr.append(THREE_STRING);
    }

   return descentNumberStr.toString();
  }

}
