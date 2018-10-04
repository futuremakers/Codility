package com.yaa.test;

public class Alpha {
	
	public static void main(String[] args) {
		
		System.out.println(LetterChanges("hello*3"));
	}
	
	public static String LetterChanges(String str) { 
		  
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
	       String alphas="abcdefghijklmnopqrstuvxyz";
	       for(char chary:str.toCharArray()) {
	    	   if(chary=='z')
	    		   str=str.replaceAll("z","a");
	    		else  
	    			str=str.replaceAll(chary+"", alphas.charAt(alphas.indexOf(chary)+1)+"");
	       }
	       return str;
	    
	  } 
	
	 public static String LetterChanges1(String str) { 
		  
		  StringBuffer buffer = new StringBuffer();
		  int temp;
		   for(int i=0;i<str.length();i++){
		       temp = str.charAt(i);
		       if((temp>=97 && temp<=122)||(temp>=65 && temp<=90)){
		       temp++;
		       }
		       if((char)temp == 'a' || (char)temp == 'e' || (char)temp == 'i' || (char)temp == 'o' || (char)temp == 'u')
		       temp-=32;
		       
		       buffer.append((char)temp);
		      
		   }
		       
		    return buffer.toString();
		    
		  } 

}
