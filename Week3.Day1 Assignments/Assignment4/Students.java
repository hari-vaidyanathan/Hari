package Assignment4;

public class Students {
	
	


	public void getstudentinfo(int ID, String Name) 
	{
		{
			 System.out.println("Student ID is : " +ID);
			 System.out.println("Student name is: " +Name);
		}

	}
	
	public void getstudentinfo(String Email, long Phonenumber) 
	{
		{
			 System.out.println("Student email is : " +Email);
			 System.out.println("Student Phonenumber is: " +Phonenumber);
		}

	}


	public static void main(String[] args) {
		
		Students student = new Students();
		student.getstudentinfo(1, "Hari");
		student.getstudentinfo("hari.v@outlook.com.au", 852481626L);

	}

}
