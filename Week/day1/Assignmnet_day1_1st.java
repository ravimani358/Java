package Week.day1;


public class Assignmnet_day1_1st {

	public static void main(String[] args) { 
		int given_number = 3;
		int count = 0;
		
		for(int i=1; i<given_number; i++) {
				if(given_number%i ==0) {
					count++;
				}
					
		}
		if(count == 2) {
			System.out.println(given_number + "is a Prime Number");
		}
		else {
			System.out.println(given_number + "is not a prime number");
		}
	}

}
