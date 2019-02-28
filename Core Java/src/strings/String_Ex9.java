package strings;

public class String_Ex9 {
public static void main(String args[]) {
		
		String text = "samplecodez";
 
		boolean start = text.startsWith("Samp");
		boolean end = text.endsWith("dez");
		
		boolean start_case = text.startsWith("sAmp");
		boolean end_case = text.endsWith("Dez");
 
		System.out.println("true - the content is available in the string");
		System.out.println("false - the content is not available in the string\n");
		
		System.out.println(start);
		System.out.println(end);
		
		System.out.println(start_case);
		System.out.println(end_case);
	}

}
