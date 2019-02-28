package strings;

public class String_Ex12 {

	public static void main(String args[]) {
		
		String text = "sampleprogram";
 
		String str1 = text.substring(3);
		String str2 = text.substring(3, 8);
		CharSequence str3 = text.subSequence(3, 8);
		
		String str4 = text.intern();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("\n" + str4);
	}

}
