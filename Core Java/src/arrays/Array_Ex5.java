package arrays;

import java.util.Scanner;

class Just {

	int multi[][][] = new int[2][2][2];
	Scanner scan = new Scanner(System.in);
	
	void insert() {
		
		System.out.println("Insert Data into Three-Dimensional Array");
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<2; j++) {
				
				for(int k=0; k<2; k++) {
					
					multi[i][j][k] = scan.nextInt();
				}				
			}
		}
	}
	
	void display() {
		
		System.out.println("\nThe Three-Dimensional Array");
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<2; j++) {
				
				for(int k=0; k<2; k++) {
					
					System.out.print(multi[i][j][k] + " ");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
public class Array_Ex5 {
public static void main(String args[]) {
		
		Just obj = new Just();
		
		obj.insert();
		obj.display();
	}

}
