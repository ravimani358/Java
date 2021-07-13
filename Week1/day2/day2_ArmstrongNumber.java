package Week1.day2;

public class day2_ArmstrongNumber {
	
	public static void main(String[] args) {
	
	int given_num = 153; int multiple_store = 0;
	int final_num = given_num;
	
	while(given_num>0) {
		
		int remember = given_num%10;
		
		multiple_store = multiple_store + (remember*remember*remember);
		
		
		given_num = given_num/10;
		
		}
	
	if(multiple_store == final_num) {
		System.out.println("given number is a armstrong number");
		}
	else {
		System.out.println("not a armstrong number");
	}
	
	 }   		
}
