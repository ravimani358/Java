package Week.day1;

public class Mobile {
	public void makecall() {
		System.out.println("mak a call");
	}
	
	public void sendMsg() {
		System.out.println("Send Message");
	}

	public static void main(String[] args) {
		Mobile execution = new Mobile();
		execution.makecall();
		execution.sendMsg();
	}
}
