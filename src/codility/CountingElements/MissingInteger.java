package codility.CountingElements;

import java.util.HashSet;


/**
 * Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Assume that:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].

Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.
 * */
public class MissingInteger {

	public static int solution(int[] A){
		int num = 1;
	    HashSet<Integer> hset = new HashSet<Integer>();
	    for (int i = 0 ; i < A.length; i++) {
	        hset.add(A[i]);          
	    }
	    while (hset.contains(num)) {
	        num++;
	    }
	    return num;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
		System.out.println(solution(new int[]{1, 2,3 }));
		System.out.println(solution(new int[]{-1,-3}));
	}
	
	
}
