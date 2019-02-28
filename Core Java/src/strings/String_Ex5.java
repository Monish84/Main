package strings;

public class String_Ex5 {
public static void main(String args[]) {
		
		String text = "sampleprograme";
		
		int index = text.charAt(5);
		char ch = text.charAt(5);
		
		int indexOf = text.indexOf('e');
		int lastIndexOf = text.lastIndexOf('e');
				
		System.out.println("ASCII value : " + index);
		System.out.println("Value for index '5' is : "+ ch);
		
		System.out.println("\nFirst index of 'e' : " + indexOf);
		System.out.println("Last index of 'e' : " + lastIndexOf);
	}

}
