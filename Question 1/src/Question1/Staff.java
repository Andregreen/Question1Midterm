package Question1;

import java.util.Date;

public class Staff extends Employee{
	private String title;
	
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public Staff(String FirstName, String LastName, String address,String phone_number, String email, String office, double salary,Date hire,String title){
		super(FirstName, LastName, address, phone_number, email, office, salary, hire);
		this.title=title;

	}

}
