package codility.CountingElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class StackMahine {
	 
	private static  final Set<Character> LETTERS= new HashSet<>(Arrays.asList('0','1','2','3','4','5','6','7','8','9','+','*'));
	
	public int solution(String S) {
		Stack<Integer> letterStack=new Stack<>();
		if(S==null || S.isEmpty() || S.length()>20000)
			return -1;
		for(char letter:S.toCharArray()){
			if(!LETTERS.contains(letter))
				return -1;
			
			if((letter=='+' ||letter=='*') && letterStack.size()<2 ){
				return -1;
			}else if((letter=='+' ||letter=='*') && letterStack.size()>=2){
				if(letter=='+' )
					letterStack.push(letterStack.pop()+letterStack.pop());
				else
					letterStack.push(letterStack.pop()*letterStack.pop());

			}else {
				letterStack.push(Integer.parseInt(letter+""));
			}
		}
	    return !letterStack.isEmpty()?letterStack.pop():-1 ;
	 }
	
	
	public static void main(String[] args) {
		//new StackMahine().solution("13+62*7+*");
		//new StackMahine().solution("11++");
		System.out.println(new StackMahine().solution("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999****************************************"));
		System.out.println(new StackMahine().solution("1234567")); //7
		System.out.println(new StackMahine().solution("11+22+33*+*")); //26
		System.out.println(new StackMahine().solution("43567810294**+1**++12++*"));
		System.out.println(new StackMahine().solution("************"));
		System.out.println(new StackMahine().solution("11"));
		
	}
}
