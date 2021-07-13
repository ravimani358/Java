package Week1.day2;

public class Calculator {
	
	public int add() {
		int sum = 1 + 1;
		return sum;
	}
	
	public int sub() {
		int sum = 5 - 1;
		return sum;
	}
	
	public int multiple() {
		int sum = 5 * 1;
		return sum;
	}
	
	public int divid() {
		int sum = 100 / 10;
		return sum;
	}
	
	public static void main(String[] args) {
		
		//add
		
		Calculator adding = new Calculator();
		
		int additon = adding.add();
		
		System.out.println(additon);
		
		//sub
		
		int subraction = adding.sub();
		
		System.out.println(subraction);
		
		//multi
		
		int multip = adding.multiple();
		
		System.out.println(multip);
		
		//divid
		
		int divition = adding.divid();
		
		System.out.println(divition);
		
		
	}

}
