package strings;

public class String_Ex14 {
public static void main(String args[]) {
		
		String text = "sampleprogram";
 
		if(text.equals("sampleprogram")) 
			System.out.println("The Both are Equal");
		else
			System.out.println("The Both are not Equal");
		
		if(text.equalsIgnoreCase("SaMpLePrOgRaM"))
			System.out.println("The Both are Equal");
		else
			System.out.println("The Both are not Equal");
	}

}
