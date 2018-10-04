package coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Num {

	public static void main(String[] args) {
		System.out.println(ChessboardTraveling("(1 1)(3 3)"));
		/*System.out.println(KaprekarsConstant(9831));
		System.out.println(AlphabetSoup("coderbyte"));*/
	}

	public static String TimeConvert(int num) { 
		int hours =num/60;
		int minutess =num%60;
		return (num/60)+":"+(num%60);
	    
	 } 
	
	 public static String AlphabetSoup(String str) { 
		 char[] chars=str.toCharArray(); 
		 Arrays.sort(chars);
		 return new String(chars);
	} 
	 
	public static int counter=0;
	public static int KaprekarsConstant(int num) { 
		String padding="";
		String numStr=num+"";
		if(numStr.length()<4){
			for(int i=0;i<4-numStr.length();i++)
				padding+="0";
		}
		numStr=padding+numStr;
		char[] ascendingOr=numStr.toCharArray();
		Arrays.sort(ascendingOr);
		
		char[] descendingOr=new char[ascendingOr.length];
		for(int i = ascendingOr.length - 1, c=0; i >= 0; i--,c++) 
			descendingOr[c]=ascendingOr[i];
		int smallNum=Integer.parseInt(new String(ascendingOr));
		int bigNum=Integer.parseInt(new String(descendingOr));
		counter++;
		if((bigNum-smallNum)==6174)
			return counter; 
		else 	{
			KaprekarsConstant((bigNum-smallNum));
		}
		return counter;
	}  
	
	 public static int ChessboardTraveling(String str) { 
		 	int x = str.charAt(1) - '0';
		    int y = str.charAt(3) - '0';
		    int a = str.charAt(6) - '0';
		    int b = str.charAt(8) - '0';
		    return numberOfPaths(a,b,x,y);
		    
	} 
	 static int  numberOfPaths(int m, int n, int x, int y)
	    {
		 	System.out.println("M->"+m+" , N->"+n+" , X->"+x+" , Y->"+y);
		    // If either given row number is first or 
	        // given column number is first
	        if (m == x || n == y)
	            return 1;
	  
	        // If diagonal movements are allowed then 
	        // the last addition is required.
	        return  numberOfPaths(m-1, n,x,y) + numberOfPaths(m, n-1,x,y);
	                // + numberOfPaths(m-1,n-1);
	    }
	  
		  
}
