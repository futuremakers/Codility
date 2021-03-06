package codility.StacksAndQueues;

import java.util.Stack;


/**
 * 

A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

        S is empty;
        S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
        S has the form "VW" where V and W are properly nested strings.

For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

    class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Assume that:

        N is an integer within the range [0..200,000];
        string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".

Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N) (not counting the storage required for input arguments).


 * 
 * */
public class Brackets {

	public static void main(String[] args) {
		System.out.println(solution("{[()()]}"));
		System.out.println(solution("{}"));
		System.out.println(solution("{)(}"));
		System.out.println(solution("{"));
		System.out.println(solution(""));
		
	}

	
	public static int solution(String S){
		Stack<Character> leftBrackets = new Stack<Character>();
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if (ch == ')' || ch == ']' || ch == '}') {
				if (leftBrackets.empty()) {
					return 0;
				}
				char top = leftBrackets.pop();
				if ((ch == ')' && top != '(') || (ch == ']' && top != '[')
						|| (ch == '}' && top != '{')) {
					return 0;
				}
			} else {
				leftBrackets.push(ch);
			}
		}
		return leftBrackets.empty() ? 1 : 0;
	}
}
