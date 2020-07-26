package org.system;

public class Desktop extends Computer{
	
	public void desktopsize() {
		System.out.println("size is 15.6");

	}

	public static void main(String[] args) 
	
	{
		Desktop mylap = new Desktop();
		mylap.computermodel();
		mylap.desktopsize();

	}

}
