package atlassian;

import java.util.ArrayList;
import java.util.Scanner;

public class SubList {
	 public static void main(String args[] ) throws Exception {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	       // find();
		/* System.out.println(lookAndSay("11",2));
		 System.out.println(lookAndSay("1",1));
		 System.out.println(lookAndSay("11",1));
		 System.out.println(lookAndSay("21",1));
		 System.out.println(lookAndSay("1211",1));
		 System.out.println(lookAndSay("111221",1));
		 System.out.println(lookAndSay("222333233322200",1));*/
		 //System.out.println(lookAndSay("11",0));
		 System.out.println(lookAndSay("1",1));
		 System.out.println(convert(7l));;
	    }

	 static String convert(long number){
		long remainder = 0;
        boolean finish = false;
        ArrayList<Long> result = new ArrayList<>();
        while (!finish) {
            if (number == 0) {
                finish = true;
            } else {
                remainder = number % 7;
                number = number / 7;
                result.add(remainder);
            }
            remainder = 0;
        }
        StringBuilder st=new StringBuilder();
        for (int i = result.size()-1; i >=0 ; i--) {
            long a = result.get(i);
        //    System.out.print(a);
            st.append(a);
        }
        return st.toString();
	}
	public static String lookAndSay(String start, int n){
		StringBuilder result = new StringBuilder();
		char currentChar=start.charAt(0);
		int count=1;
		for(int i= 1;i<start.length();i++){
			if(start.charAt(i)==currentChar){
				count++;
			}else{
				result.append(count).append(currentChar);
				currentChar=start.charAt(i);
				count=1;
			}
		}
		result.append(count).append(currentChar);
		if(n<=1)
			return result.toString();
		return lookAndSay(result.toString(),n-1);
	}


	private String lookAndSay(String say) {
		StringBuilder result = new StringBuilder();
		char currentChar=say.charAt(0);
		int count=1;
		for(int i= 1;i<say.length();i++){
			if(say.charAt(i)==currentChar){
				count++;
			}else{
				currentChar=say.charAt(i);
				count=1;
			}
			result.append(count).append(currentChar);
		}
		return result.toString();
	}  
	 
	private static void find() {
		Scanner sc = new Scanner(System.in);
		int firstListSize = sc.nextInt();
		StringBuilder firstArr=new StringBuilder();
		for(int t = 0; t < firstListSize; t++) {
		    firstArr.append(sc.next());
		}
		
		int secondListSize = sc.nextInt();
		StringBuilder secondArr=new StringBuilder();
		for(int t = 0; t < secondListSize; t++) {
		    secondArr.append(sc.next());
		}
		
		sc.close();
      
		System.out.println(firstArr.toString().indexOf(secondArr.toString()));
	}
	 
	 
	
}
