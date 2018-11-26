package cross;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class RecipeRemainder {
		  /**
		   * Complete the function below.And make sure to include required imports
		   * DONOT MODIFY anything outside this function!
		   */
		  static int[]  calculateRemainders(int[] proportions,int[] availableGrams) {
		    int[] remaining_grams=new int[proportions.length];
		    int numberOfTimes=Integer.MAX_VALUE;
		    for(int i=0;i<proportions.length;i++){
		    	int remainder=availableGrams[i]/proportions[i];
		    	if(remainder<numberOfTimes)
		    		numberOfTimes=remainder;
		    }
		    for(int j=0;j<proportions.length;j++){
		    	remaining_grams[j]=availableGrams[j]-(numberOfTimes*proportions[j]);
		    }
		    
		    return remaining_grams;

		  }
		  
		  public static void add(int a){
			  loop:for(int i=1;i<3;i++){
				  System.out.println(i+1);
				  for(int j=1;j<3;j++){
					  if(a==5){
						  break loop;
					  }
					  System.out.println(i*j);
				  }
			  }
		  }
		  
		  
		  /**
		   * DO NOT MODIFY THIS METHOD!
		   */
		  public static void main(String[] args) {
			  add(5);
		      Scanner in = new Scanner(System.in);
		      int[] proportions = Arrays.stream(in.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
		      int[] availableGrams = Arrays.stream(in.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
		      
		      int[] remainder = calculateRemainders(proportions,availableGrams) ;
		      
		      System.out.println(Arrays.stream(remainder)
		                         .mapToObj(String::valueOf)
		                         .collect(Collectors.joining(", ")));
		  }
		  
}

