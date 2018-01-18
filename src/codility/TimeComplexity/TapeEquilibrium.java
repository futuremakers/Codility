package codility.TimeComplexity;




/**
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:
  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3

We can split this tape in four places:

        P = 1, difference = |3 − 10| = 7
        P = 2, difference = |4 − 9| = 5
        P = 3, difference = |6 − 7| = 1
        P = 4, difference = |10 − 3| = 7 
 * Write a function:

    class Solution { public int solution(int[] A); }

that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.

For example, given:
  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3

the function should return 1, as explained above.

Assume that:

        N is an integer within the range [2..100,000];
        each element of array A is an integer within the range [−1,000..1,000].

Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.
 * */
public class TapeEquilibrium {

	public static void main(String[] args) {
		System.out.println(new TapeEquilibrium().solution(new int[]{1,2}));

	}

	
	public int solution1(int[] A){
		if (A.length == 0)
			throw new IllegalArgumentException("Error empty array");
		if (A.length == 1)
	        return A[0];
		
		 if (A.length == 2)
		        return Math.abs(A[0]-A[1]);

		    int [] s1 = new int[A.length-1];
		    s1[0] = A[0];
		    for (int i=1;i<A.length-1;i++) {
		        s1[i] = s1[i-1] + A[i];
		    }

		    int [] s2 = new int[A.length-1];
		    s2[A.length-2] = A[A.length-1];
		    for (int i=A.length-3;i>=0;i--) {
		        s2[i] = s2[i+1] + A[i+1];
		    }

		    int finalSum = Integer.MAX_VALUE;
		    for (int j=0;j<s1.length;j++) {
		        int sum = Math.abs(s1[j]-s2[j]);
		        if (sum < finalSum)
		            finalSum = sum;
		    }
		    return finalSum;
	}
	
	public int solution(int[] A) {
		int[] diff;
		int sum1;
		int sum2 = 0;
		int ans, localMin;
		diff = new int[A.length - 1];

		// AT P=1 sum1=A[0]
		sum1 = A[0];

		for (int i = 1; i < A.length; i++) {
			sum2 += A[i];
		}

		ans = Math.abs(sum1 - sum2);

		for (int p = 1; p < A.length; p++) {
			localMin = Math.abs(sum1 - sum2);

			if (localMin < ans) {
				ans = localMin;
			}
			// advance the sum1, sum2
			sum1 += A[p];
			sum2 -= A[p];
			diff[p - 1] = localMin;
		}
		return (getMinVal(diff));
	}

	public int getMinVal(int[] arr) {
		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	}
	
	






















