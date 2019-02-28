package arrays;

class Array_Ex {

	int a, b;
		void setData(int x, int y) {
		
		a = x;
		b = y;
	}
		void showData() {
		
		System.out.println("Value of a is : " + a);
		System.out.println("Value of b is : " + b);
	}
}
public class Array_Ex3 {
public static void main(String args[]) {
		
		Array_Ex obj[] = new Array_Ex[2];
		
		obj[0] = new Array_Ex();
		obj[1] = new Array_Ex();
		
		obj[0].setData(10, 20);
		obj[1].setData(100, 200);
		
		System.out.println("The First Array Object's value");
		obj[0].showData();
		
		System.out.println("\nThe Second Array Object's value");
		obj[1].showData();
	}

}
