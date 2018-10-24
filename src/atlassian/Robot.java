package atlassian;

public class Robot {

	public static void main(String[] args) {
		
		System.out.println(RobotCommand("PMLPMMMLPMLPMML"));
		System.out.println(RobotCommand("PLPLPLPLPLPLPLPLPLPL"));
		
	}

	private static String  RobotCommand(String command) {
		int[] positions=new int[10] ;
		int count=0;
		for(int i=0;i<command.length();i++){
			if('P'==command.charAt(i) ){
			}else if('L'==command.charAt(i)){
				positions[count]++;
				count=0;
			}else{
				count++;
			}
		}
	
		StringBuilder result=new StringBuilder();
		for(int x=0;x<positions.length;x++){
			if(positions[x]>9)
				result.append(Integer.toHexString(positions[x]).toUpperCase());
			else
				result.append(positions[x]);
		}
		
		return result.toString();
	}
	
	
}

		