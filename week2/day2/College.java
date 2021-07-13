package week2.day2;

public class College extends University {



	@Override
	void pg() {
		// TODO Auto-generated method stub
		
		System.out.println("print the all ug colleges");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		University colg = new College();
		
		colg.pg();
		colg.ug();

	}
	
	
}
