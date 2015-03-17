package Question1;

import java.util.Date;

public class Employee extends Person{

	    private String office;
	    private double salary;
	    private Date hire;
	    
	    public String getOffice(){
	    	return office;
	    }
	    public void setOffice(String office){
	    	this.office=office;
	    }
	    public double getSalary(){
	    	return salary;
	    }
	    public void setSalary(double salary){
	    	this.salary=salary;
	    }
	    public Date getHire(){
	    	return hire;
	    }
	    public void setHire(Date hire){
	    	this.hire=hire;
	    }
	    
	    public Employee(String FirstName, String LastName, String address, String phone_number, String email,String office,double salary,Date hire){
    		super(FirstName, LastName, address, phone_number, email);
    		this.office = office;
    	    this.salary = salary;
    	    this.hire = hire;
    		
    		
	    }

}
