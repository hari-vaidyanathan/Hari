package Week3.day2;

public class Desktop implements Hardware,Software {
	
	public void Softwareresources() {
		System.out.println("software resources");
		
	}

	public void hardwareresources() {
		System.out.println("Hardware resource");
		
	}
	
	public void desktopmodel() {
		
		System.out.println("Desktop model");
		
	}

	public static void main(String[] args) {
		Desktop DS = new Desktop();
		DS.hardwareresources();
		DS.Softwareresources();
		DS.desktopmodel();
				
		
		
		
		

	}

	

}
