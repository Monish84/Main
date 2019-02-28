package arrays;

public class Array_Ex1 {
public static void main(String args[]) {
		
		int[] intArray = new int[6];
		
		intArray[0] = 100;
		intArray[1] = 200;
		intArray[2] = 300;
		intArray[3] = 400;
		intArray[4] = 500;
		intArray[5] = 600;
		
		for(int i=0; i<intArray.length; i++) {
			
			System.out.println(i+1 + ". value is : " + intArray[i]);
		}
	}

}
