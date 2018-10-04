package coding;
import java.io.IOException;
import java.util.Scanner;

public class Tester {
	int i=0;
	{
		
	}
	
    /**
     * Complete the function below.
     * DO NOT MODIFY anything outside this method. 
     */
    static boolean[] twins(String[] a, String[] b) {
        boolean[] result = new boolean[a.length];
        for(int i=0;i<a.length;i++){
        	String word=a[i];
        	String comparKey=b[i];
        	
        	if(word.length()!=comparKey.length()){
        		result[i]=false;
        	}else{
        	   char[] odds=new char[word.length()/2];
        	   char[] evens=new char[word.length()/2];
        	   char[] letters=word.toCharArray();
        	   int evenCounter=0,oddCounter=0;
        	   for(int j=0;j<letters.length;j++){
        		   if(!Character.isLowerCase(letters[j]))
        			   throw  new IllegalArgumentException();
        		   	 if((j+1)%2==0){
        		   		evens[evenCounter]=letters[j];
        		   		evenCounter++;
        		   	 }
        		   	 else{
        		   		odds[oddCounter]=letters[j];
        		   		oddCounter++;
        		   	 }
        	   }
        	   StringBuilder finalStr=new StringBuilder();
        	   for(int k=0;k<odds.length;k++){
        		   finalStr.append(evens[k]).append(odds[k]);
        	   }
        	   if(comparKey.equals(finalStr.reverse().toString()))
        		   result[i]=true;
        	   else
        	   		result[i]=false;
        	}
        }
        return result;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
       int ii=0;
       if(ii++ == --ii){
    	   System.out.println("sssss");
       }else{
    	   System.out.println("2222");
       }
    	
    	Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine().trim());
        String[] a = new String[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextLine();
        }
        
        int m = Integer.parseInt(in.nextLine().trim());
        String[] b = new String[m];
        for(int i = 0; i < m; i++) {
            b[i] = in.nextLine();
        }
        
        // call twins function
        boolean[] results = twins(a, b);
        
        for(int i = 0; i < results.length; i++) {
            System.out.println(results[i]? "Yes" : "No");
        }
    }
}