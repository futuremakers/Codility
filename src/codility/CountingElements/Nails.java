package codility.CountingElements;

public class Nails {
	 
	
	int solution(int[] A, int K) {
		  int n = A.length;
	        int best = 0;
	        int count = 1;
	        if(A.length==1)
	        	return 1;
	        for (int i = 0; i < n - K - 1; i++) {
	            if (A[i] == A[i + 1])
	                count = count + 1;
	            else
	                count = 1;
	            if (count > best)
	                best = count;
	        }
	        int result = best  + K;

	        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(new Nails().solution(new int[]{1,1},0));
		System.out.println(new Nails().solution(new int[]{1, 1, 3, 3, 3, 4, 5, 5, 5, 5},2));
		System.out.println(new Nails().solution(new int[]{1, 1,2,2,2,3,4,4,4,4,4,5},2));
		/*System.out.println(new Nails().solution(18));
		System.out.println(new Nails().solution(181));*/
	}
}
