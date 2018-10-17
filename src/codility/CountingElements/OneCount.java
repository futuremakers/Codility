package codility.CountingElements;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OneCount {
	 
	
	public int solution1(int N) {
		if(N<0 || N>1000)
			return -1;
		//Double numerPowered=;
		BigDecimal numerPowered = BigDecimal.valueOf(Math.pow(11, N));
		
	    String resutltAsStr=numerPowered.toBigInteger()+"";
	    int count=(int)resutltAsStr.chars().filter(ch -> ch=='1').count();
	    System.out.println(N + " decimal representation: "+resutltAsStr +" ,count :"+count);
		return count;
	}
	
	public int solution(int N) {
		if(N<0 || N>1000)
			return -1;
		BigInteger sum =new BigInteger("1");
		for(int i=1;i<=N;i++){
			sum=sum.multiply(new BigInteger("11"));
		}
	    String resutltAsStr=sum+"";
	    int count=(int)resutltAsStr.chars().filter(ch -> ch=='1').count();
	    System.out.println(N + " decimal representation: "+resutltAsStr +" ,count :"+count);
		return count;
	}
	
	public static void main(String[] args) {
		new OneCount().solution(0);
		new OneCount().solution(1);
		new OneCount().solution(2);
		new OneCount().solution(3);
		new OneCount().solution(4);
		new OneCount().solution(5);
		new OneCount().solution(6);
		new OneCount().solution(10);
		new OneCount().solution(500);
		System.out.println("********************************************");
		new OneCount().solution1(1);
		new OneCount().solution1(2);
		new OneCount().solution1(3);
		new OneCount().solution1(4);
		new OneCount().solution1(5);
		new OneCount().solution1(6);
		new OneCount().solution1(10);
		new OneCount().solution1(500);
	}
}
