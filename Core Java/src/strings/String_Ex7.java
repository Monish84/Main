package strings;

public class String_Ex7 {
public static void main(String args[]) {
		
		String text = "sampleprogram";
 
		boolean val1 = text.contentEquals("sample");
		boolean val2 = text.contentEquals("sampleprogram");
		boolean val3 = text.equalsIgnoreCase("Sampleprogram");
		
		System.out.println("If value is 'true', both are equal..");
		System.out.println("If value is 'false', both are not equal..\n");
 
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
	}

}
