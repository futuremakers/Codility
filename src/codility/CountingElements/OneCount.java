package codility.CountingElements;

import java.math.BigDecimal;

public class OneCount {
	 
	
	public int solution(int N) {
		if(N<0 || N>1000)
			return -1;
		//Double numerPowered=;
		BigDecimal numerPowered = BigDecimal.valueOf(Math.pow(11, N));
		
	    String resutltAsStr=numerPowered.toBigInteger()+"";
	    System.out.println(resutltAsStr);
		return (int)resutltAsStr.chars().filter(ch -> ch=='1').count();
	}
	
	public static void main(String[] args) {
		System.out.println(new OneCount().solution(77));
		System.out.println(new OneCount().solution(2));
		System.out.println(new OneCount().solution(6));
		System.out.println(new OneCount().solution(9));
		System.out.println(new OneCount().solution(18));
		System.out.println(new OneCount().solution(181));
	}
}
