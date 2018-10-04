package coding;

public class Main {

	public static void main(String[] args) {
		
		new Main().solution(10000);
	}
	
	/**
	 * 2 Codility
	 * 3 Test
	 * 5 Coders	
	 * */
	
	public void solution(int N){
		if(N<0)
			throw new IllegalArgumentException();
			
		for(int i=1;i<=N;i++){
			StringBuilder placeHolder=new StringBuilder();
			int modCounter=0;
			if(i%2==0){
				placeHolder.append("Codility");
				modCounter++;
			}
			if(i%3==0){
				placeHolder.append("Test");
				modCounter++;
			}
			if(i%5==0){
				placeHolder.append("Coders");
				modCounter++;
			}
			
			System.out.println(modCounter==0?i:placeHolder.toString());			
		}
	}

}
