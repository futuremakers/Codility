package coderbyte;

public class LetterChanger {

	public static void main(String[] args) {
		System.out.println(LetterChanges("this long cake@&"));//UIjt mpOh dblf@&. 
		System.out.println(LetterChanges("helloz*3"));//"Ifmmpa*3"
		System.out.println(LetterChanges("fun times!"));//"gvO Ujnft!"
	}

	public static String LetterChanges(String str) {
		/*String letters="abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ";
		for(int i=0;i<letters.length();i++){
			System.out.println(letters.charAt(i)+"->"+((int)letters.charAt(i)));
		}*/
		StringBuffer buffer = new StringBuffer();
		int temp;
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			if ((temp >= 97 && temp <= 122) || (temp >= 65 && temp <= 90)) {
				if(temp==122)
					temp=97;
				else if( temp == 90)
					temp=65;
				else
					temp++;
			}
			if ((char) temp == 'a' || (char) temp == 'e' || (char) temp == 'i' || (char) temp == 'o' || (char) temp == 'u')
				temp -= 32;

			buffer.append((char) temp);

		}

		return buffer.toString();

	}

}
