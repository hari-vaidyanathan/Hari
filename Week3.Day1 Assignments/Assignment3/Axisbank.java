package Assignment3;

public class Axisbank extends BankInfo {
	
 public void deposit(int amount) {
		
		System.out.println("amount is" +amount);

	}

	public static void main(String[] args) {
		
		Axisbank ab = new Axisbank();
		ab.deposit(100000);

	}

}
