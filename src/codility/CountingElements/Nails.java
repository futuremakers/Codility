package codility.CountingElements;

public class Nails {
	 
	
	int solution(int[] A, int K) {
        int n = A.length;
        int best = 0;
        int count = 1;
        for (int i = 0; i < n - K - 1; i++) {
            if (A[i] == A[i + 1])
                count = count + 1;
            else
                count = 1;
            if (count > best)
                best = count;
        }
        if(best==0)
        	return 1;
        if(K>best)
        	return best ;
        else 
        	return best  + K;
    }
	
	void method(int a){
		a=4;
	}
	public static void main(String[] args) {
		
		System.out.println(new Nails().solution(new int[]{1, 1, 3, 3, 3, 4, 5, 5, 5, 5},5));
		System.out.println(new Nails().solution(new int[]{1, 1, 3, 3, 3, 4, 5, 5, 5, 5},8));
		System.out.println(new Nails().solution(new int[]{1, 1, 3, 3, 3, 4, 5, 5, 5, 5},3));

		System.out.println(new Nails().solution(new int[]{1,2},1));
		System.out.println(new Nails().solution(new int[]{1,1},0));
		System.out.println(new Nails().solution(new int[]{1},0));
		System.out.println(new Nails().solution(new int[]{1, 1, 3, 3, 3, 4, 5, 5, 5, 5},2));
		System.out.println(new Nails().solution(new int[]{1, 1,2,2,2,3,4,4,4,4,4,5},2));
		/*System.out.println(new Nails().solution(18));
		System.out.println(new Nails().solution(181));*/
	}
}
