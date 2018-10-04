package coderbyte;

public class AddIng {

	
	public static int SimpleAdding(int num) { 
		if(num<1 || num>1000)
			return -1;
		int sum =0;
	    for(int i=1;i<=num;i++)
	    	sum+=i;
		
	    return sum;
	    
	}
	
	public static String LetterCapitalize(String str){
		String[] words=str.split(" ");
		
		StringBuilder blder=new StringBuilder();
		for (String word : words) {
			blder.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
		}
		
		return blder.toString();
	}
	
    public static String SimpleSymbols(String str) {
    	if(str.isEmpty() || Character.isLetter(str.charAt(0)) || Character.isLetter(str.charAt(str.length()-1)) )
    		return "false";
    	int previousIndx,nextIndx=0;
    	
    	
    	for(int i =0;i<str.length();i++){
    		previousIndx=i-1;
    		nextIndx=i+1;
    		if(!Character.isLetter(str.charAt(i)))
    			continue;
    		if(Character.isLetter(str.charAt(i)) && (str.charAt(previousIndx)!='+' ||  str.charAt(nextIndx)!='+')){
    			return "false";
    		}
    	}
    	return "true";
	} 
    
   
	
	public static void main(String[] args) {
		System.err.println(SimpleSymbols("f++d+"));
		System.out.println(LetterCapitalize("hello world"));
		System.out.println(SimpleAdding(4));
	}
}
