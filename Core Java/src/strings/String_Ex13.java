package strings;

public class String_Ex13 {
public static void main(String args[]) {
		
		String text = "sampleprogram";
 
		String str1 = text.toUpperCase();
		String str2 = str1.toLowerCase();
		
		char[] charArray = text.toCharArray();
		
		System.out.println(str1);
		System.out.println(str2);
		
		for(int i=0; i<charArray.length; i++) {
			
			System.out.print(charArray[i] + " ");
		}
	}

}
