package atlassian;

import java.util.Arrays;
import java.util.List;

public class Tester {
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result=Arrays.asList(0,0);
		for(int i =0;i< a.size();i++) {
			if(a.get(i)>b.get(i)) { // alice get one
				result.set(0,result.get(0)+1);
			}else if(a.get(i)< b.get(i)) { //Boob get One
				result.set(1,result.get(1)+1);
			}
		}
		return result;
    }
	
	static long aVeryBigSum(long[] ar) {
		long sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
		}
		return sum;

    }
	
	static String kangaroo1(int x1, int v1, int x2, int v2) {
		//0 3 4 2
		//0 2 5 3  x1 v1 x2 v2
		if(x1<x2 && v2>=v1)
			return "NO";
		long jumpLength1 = Math.abs((v1-x1));
		long jumpLength2 = Math.abs((v2-x2));
		int counter=1;
		long target = v1*v2;
		while(target>1){
			if((int)((target-x1)/jumpLength1) == (int)((target-x2)/jumpLength2)){
				return "YES";
			}else{
				counter++;
				target*=counter;
			}
		}
		
		
		return "NO";
		
		
	}
	public static String kangaroo(int x1, int v1, int x2, int v2) {
		String result;
		if (v2 >= v1) {
			result="NO";
        } else {
            if ((x2 - x1) % (v1 - v2) == 0) {
            	result="YES";
            } else {
            	result="NO";
            }
        }
		return result;
	}
	static int diagonalDifference(int[][] arr) {
		int result=0;
		int leftDir=0,rightDir=0;
		int size=arr.length;
		boolean isOddNumber=size%2==0?false:true;
		int interSection=size/2;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(isOddNumber && i==j && interSection==i) {
					rightDir+=arr[i][j];
					leftDir+=arr[i][j];
				}else if(i==j) {
					leftDir+=arr[i][j];
				}else if((i+j+1)==arr.length){
					rightDir+=arr[i][j];
				}
					
			}
					
		}
		result=leftDir-rightDir;
		return Math.abs(result);
    }
	
	static void plusMinus(int[] arr) {
		int positive=0,negative=0,zeros=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
				negative++;
			else if(arr[i]>0)
				positive++;
			else
				zeros++;
		}
		
		System.out.printf("%.6f %n", ((double)positive/(double)arr.length));
		System.out.printf("%.6f %n", ((double)negative/(double)arr.length));
		System.out.printf("%.6f %n", ((double)zeros/(double)arr.length));
    }
	static void staircase(int n) {
		for (int i = 1; i <= n; i++) {
			//print spaces
			//print #
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			//print #
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}

			// generate a new line
			System.out.println("");
		}
    }
	
	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		long sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println((sum-arr[arr.length-1])+" "+ (sum-arr[0]));
	 }
	
	 static int birthdayCakeCandles(int[] ar) {
		 int size=ar.length;
		 int result=1;
		 Arrays.sort(ar);
		 if(ar[size-1]!=0 && size>2) {
			 int tallestOne=ar[size-1];
			 for(int i=size-2;i>=0;i--) {
				 if(tallestOne==ar[i])
					 result++;
			 }
		 }
		
		 return result;
	 }
	 static String timeConversion(String s) {
		 //07:05:45PM
		 String amPM=s.substring(s.length()-2);
		 String[] dateFormat=s.split(":");
		 String hh=dateFormat[0];
		 String mm=dateFormat[1];
		 String ss=dateFormat[2].substring(0,2);
		 StringBuilder result=new StringBuilder();
		 
		 if("AM".equals(amPM) && "12".equals(hh)) 	 // Midnight is 12:00:00AM on a 12-hour clock,and 00:00:00 on a 24-hour clock.
			 hh="00";
		 else if("PM".equals(amPM) && !"12".equals(hh)) {
			 hh= (Integer.parseInt(hh)+12)+"";
		 }
		 result.append(hh).append(":").append(mm).append(":").append(ss);
			 
		 return result.toString();
	 }
	public static void main(String[] args) {
		//0 3 4 2
		System.out.println(kangaroo(21 ,6 ,47, 3));
		//System.out.println(kangaroo(0, 2, 5, 3));
//		System.out.println(kangaroo(0, 3, 4, 2));
		/*	countApplesAndOranges(7, 11, 5, 15, new int[] {-2 ,2, 1}, new int[] {5 ,-6});
		System.out.println(Arrays.toString(gradingStudents(new int[] {73,67,38,33})));
		System.out.println(timeConversion("07:05:45PM"));
		System.out.println(timeConversion("12:40:22AM"));//00:40:22
		System.out.println(timeConversion("06:40:03AM"));//06:40:03
*/	//	System.out.println(birthdayCakeCandles(new int[] {3, 2 ,1 ,3}));
	//	System.out.println(birthdayCakeCandles(new int[] {4, 4 ,1 ,4}));
	//	miniMaxSum(new int[] {1 ,2 ,3 ,4 ,5});
	//	staircase(6);
	//	plusMinus(new int[] {-4 ,3 ,-9, 0, 4, 1});
	//	System.out.println(diagonalDifference(new int[][]{{11 ,2,4},{4 ,5 ,6},{10,8,-12}}));
		
		/*6 6 7 -10 9 -3 8 9 -1 //52
		9 7 -10 6 4 1 6 1 1
		-1 -2 4 -6 1 -4 -6 3 9
		-8 7 6 -1 -6 -6 6 -7 2
		-10 -4 9 1 -7 8 -5 3 -5
		-8 -3 -4 2 -3 7 -5 1 -5
		-2 -7 -4 8 3 -1 8 2 3
		-3 4 6 -7 -7 -8 -3 9 -6
		-2 0 5 4 4 4 -3 3 0*/
		
		//System.out.println(compareTriplets(Arrays.asList(17 ,28 ,30), Arrays.asList(99, 16, 8)));
		//System.out.println(compareTriplets(Arrays.asList(5 ,6, 7), Arrays.asList(3, 6,10)));
		
	}
	
	static int[] gradingStudents(int[] grades) {
		int[] finalGrades=new int[grades.length];
		for (int i = 0; i < grades.length; i++) {
			if(grades[i]<38) {
				finalGrades[i]=grades[i];
			}else {			
				int remain=grades[i]%5;
				if((5-remain)<3)
					finalGrades[i]=grades[i]+(5-remain);
				else
					finalGrades[i]=grades[i];
			}
		}
		return finalGrades;
    }
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int appleCount=0;
		int orangeCount=0;
		int bigLength= (apples.length>oranges.length)?apples.length:oranges.length;
		for(int i=0;i<bigLength;i++) {
			if(i<apples.length && apples[i]>0) {
				int appPosition=apples[i]+a;
				if(appPosition >= s && appPosition <= t)
					appleCount++;
			}
			
			if(i<oranges.length && oranges[i]<0) {
				int oraPosition=b+oranges[i];
				if(oraPosition >= s && oraPosition <= t)
					orangeCount++;
			}
			
		}
		System.out.println(appleCount);
		System.out.println(orangeCount);

    }


}
