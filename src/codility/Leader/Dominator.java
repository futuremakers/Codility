package codility.Leader;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 

A zero-indexed array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.

For example, consider array A such that
 A[0] = 3    A[1] = 4    A[2] =  3
 A[3] = 2    A[4] = 3    A[5] = -1
 A[6] = 3    A[7] = 3

The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.

Write a function

    class Solution { public int solution(int[] A); }

that, given a zero-indexed array A consisting of N integers, returns index of any element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.

Assume that:

        N is an integer within the range [0..100,000];
        each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].

For example, given array A such that
 A[0] = 3    A[1] = 4    A[2] =  3
 A[3] = 2    A[4] = 3    A[5] = -1
 A[6] = 3    A[7] = 3

the function may return 0, 2, 4, 6 or 7, as explained above.

Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
https://codility.com/demo/results/trainingT5A9BC-KYU/

 * **/
public class Dominator {

	
	public int solution(int[] A){
		if(A.length ==0)
			return -1;
		int dominator=-1;
		Map<Integer, Long> mapCounting= IntStream.of(A).boxed()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		mapCounting.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
		
		for (Entry<Integer, Long> entry:mapCounting.entrySet()) {
			if(entry.getValue()>(A.length/2)){
				dominator=	entry.getKey();
				break;
			}
		}
		for (int i = 0; i < A.length; i++) {
			if(dominator==A[i])
				return i;
		}
		return -1;
	
	}
	public static int dominator(int[] A) {
	    if(A.length == 0) return -1;
	      int count     = 0;
	      int elem      = A[0];
	      
	      for(int i : A){
	          if(i == elem){    
	              count++;
	          } else {
	              if(count == 0){
	                  count++;
	                  elem = i;
	              }
	              else count--;
	          }
	      }
	      
	      int ct = 0;
	      int ind = -1;
	      
	      for(int i = 0; i < A.length; i++){
	          if(A[i] == elem){
	              ct++;
	              ind = i;
	          }
	          
	      }
	      if(ct> A.length/2) return ind;
	      else return -1;
	  }
}
