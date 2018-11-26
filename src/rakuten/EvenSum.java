package rakuten;

public class EvenSum {
	
	public static int solution(int [] A) {
		if (A == null || A.length < 2) {
			  return 0;
			}

			int evenNumbersCount = 0;
			int oddNumberCount = 0;

			for (int aA : A) {
			  if (aA % 2 == 0) {
			    evenNumbersCount++;
			  } else {
			    oddNumberCount++;
			  }
			}

			int i = (evenNumbersCount * (evenNumbersCount - 1)) / 2 + (oddNumberCount * (oddNumberCount - 1)) / 2;
			return i > 1000000000 ? -1 : i;
	}
	
	
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,3,4,5}));
	}
}
