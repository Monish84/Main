package strings;

public class String_Ex10 {
public static void main(String args[]) {
		
		String text = "sample program";
 
		String str1 = text.replace('s', 'S');
		String str2 = text.replaceAll(text, "Hello World Hello");
		String str3 = text.replaceFirst("sample", "Java");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
