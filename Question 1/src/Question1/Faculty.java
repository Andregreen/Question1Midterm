package Question1;

import java.util.Date;

public class Faculty extends Employee{
	private Date office_hours;
	private String Rank;
	
	public Date getOffice_hours(){
		return office_hours;
	}
	public void setOffice_hours(Date office_hours){
		this.office_hours=office_hours;
	}
	public String getRank(){
		return Rank;
	}
	public void setRank(String Rank){
		this.Rank=Rank;
	}
	
	public Faculty(String FirstName, String LastName, String address,String phone_number, String email, String office, double salary,Date hire,Date office_hours, String Rank){
		super(FirstName, LastName, address, phone_number, email, office, salary, hire);
		this.office_hours=office_hours;
		this.Rank=Rank;
	}

}
