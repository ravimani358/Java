package week2.day2;

public class Desktop implements HardWare,software{



	public void hardwareResources() {
		// TODO Auto-generated method stub
		
		System.out.println("thay are 5 hardwareResources");
		
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("thay are 10 softwareResources");
		
	}
	
	void clasmethod() {
		System.out.println("print the all method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop Desktops = new Desktop();
		
		Desktops.hardwareResources();
		Desktops.softwareResources();
		Desktops.clasmethod();
		
	}

}
