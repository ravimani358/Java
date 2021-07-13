package week2.day1;

public class calculator {
	
	//adding
	
	public void add(int a, int b) {
		
		a = a+b;
		
		System.out.println("adding "+a);
		
	}
	
	public void add(int a, int b,int c) {
		
		a = a+b+c;
		
		System.out.println("adding "+a);
		
	}
	
	// multiplication
	
	public void multiplication(int a, int b) {
		
		a = a*b;
		
		System.out.println("multiplication "+a);
		
	}
	
	public void multiplication(int a, double b) {
		
		a = (int) (a*b);
		
		System.out.println("multiplication "+a);
		
	}
	
	// Subtraction
	
	public void subract(int a, int b) {
		
		a = a-b;
		
		System.out.println("Subtraction "+a);
		
	}
	
	public void subract(double a, double b) {
		
		a = (a-b);
		
		System.out.println("Subtraction "+a);
		
	}
	
	// Divide
	
	public void divid(int a, int b) {
		
		a = a/b;
		
		System.out.println("Divide "+a);
		
	}
	
	public void divid(int a, double b) {
		
		a = (int) (a/b);
		
		System.out.println("Divide "+a);
		
	}

	public static void main(String[] args) {
		
		calculator calci = new calculator();
		
		calci.add(2,3);
		calci.add(2,3,4);
		
		calci.multiplication(2,3);
		calci.multiplication(2,3.3);
		
		calci.subract(12,3);
		calci.subract(12,3.3);
		
		calci.divid(12,2);
		calci.divid(12,2.5);
		
		
	}

}
