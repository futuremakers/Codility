package codility.TimeComplexity;
/**
 *Write a function:

    class Solution { public int solution(int X, int Y, int D); }

that,  given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:
  X = 10
  Y = 85
  D = 30

the function should return 3, because the frog will be positioned as follows:

        after the first jump, at position 10 + 30 = 40
        after the second jump, at position 10 + 30 + 30 = 70
        after the third jump, at position 10 + 30 + 30 + 30 = 100

Assume that:

        X, Y and D are integers within the range [1..1,000,000,000];
        X ≤ Y.

Complexity:

        expected worst-case time complexity is O(1);
        expected worst-case space complexity is O(1).


 * */
public class FrogJmp {

	public static void main(String[] args) {
		System.out.println(solution(10, 85, 30));
	}
	
	public static  int solution(int X, int Y, int D){
		if(Y < X || D<=0 )
			throw new IllegalArgumentException("Invalid params");
		if((Y-X) % D == 0)
			return ((Y-X) / D) ;
		else 
			return ((Y-X) / D) +1;
		
	}

}
