package codility.TimeComplexity;

public class BinaryGap {
	
	
	public static void main(String[] args) {
		System.out.println(solution(15));
	}
	
	 public static int solution(int N){
		 String[] str = Integer.toString(N,2).split("");
		 int maxCount=0;
		 int zeroCount=0;
		 for (int i = 0; i < (str.length - 1); i++) {
	            if (str[(i + 1)].equals("0")) {
	                zeroCount++;
	            }
	            else {
	                if (str[i].equals("0")) {
	                    if (zeroCount > maxCount) {
	                        maxCount = zeroCount;
	                    }
	                    zeroCount = 0;
	                }
	            }
	        }
	        return maxCount;
	 }

}
