package Question1;

public class Student extends Person{
	private String Class_status;
	
	public String getClass_Status( ){
        return Class_status;
    }
    public void setClass_Status(String Class_status){
        this.Class_status = Class_status;           
    }

	public Student(String FirstName, String LastName, String address, String phone_number, String email,String Class_status){
		super(FirstName, LastName, address, phone_number, email);
		this.Class_status = Class_status;
	}
	
}
