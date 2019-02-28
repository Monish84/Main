package strings;

public class String_Ex6 {
public static void main(String args[]) {
		
		String text = "sampleprogram";
		int val1 = text.compareTo("sampleprogram");
		int val2 = text.compareTo("Sampleprogram");
		int val3 = text.compareToIgnoreCase("samplePROGRAM");
		
		System.out.println("If value is 0, both are equal. Otherwise not equal.");
 
		System.out.println("\n" + val1);
		System.out.println(val2);
		System.out.println(val3);
	}

}
