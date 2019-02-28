package strings;

public class String_Ex8 {
public static void main(String args[]) {
		
		String text = "samplecodez";
 
		int codeAt = text.codePointAt(1);
		int codeAtBefore = text.codePointBefore(2);
		int codeCount = text.codePointCount(1, 6);
		boolean contain1 = text.contains("code");
		boolean contain2 = text.contains("co de");
				
		System.out.println("ASCII value of 'a' : " + codeAt);
		System.out.println("ASCII value of 'a' : " + codeAtBefore);
		System.out.println("Char count is : " + codeCount);
		
		System.out.println("\nCheck the content is " +
				"available in the string or not : " + contain1);
		System.out.println("Check the content is " +
				"available in the string or not : " + contain2);
	}

}
