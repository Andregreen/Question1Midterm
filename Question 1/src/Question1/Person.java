package Question1;


public abstract class Person {

		private String FirstName;
		private String LastName;
		private String address;
		private String phone_number;
		private String email_address;
		

		public String getFirstName(){
			return FirstName;
		}

		public void setFirstName(String FirstName){
			this.FirstName = FirstName;
		}

		public String getLastName(){
			return LastName;
		}

		public void setLastName(String LastName){
			this.LastName = LastName;
		}
		
		public String getAddress(){
			return address;
		}
		
		public void setAddress(String address){
			this.address = address;
		}
		
		public String getPhone_Number(){
			return phone_number;
		}

		public void setPhone(String phone_number){
			this.phone_number = phone_number;
		}
		
		public String getEmail(){
			return email_address;
		}
				
		public void setEmail(String email){
			this.email_address = email;
		}

		public Person(String FirstName,String LastName,String address, String phone_number,String email){
			this.FirstName = FirstName;
			this.LastName = LastName;
			this.address = address;
			this.phone_number = phone_number;
			this.email_address = email;
		}

		//public void PrintName(){
			//System.out.println(this.FirstName + ' ' + this.Class_Status);
		//}
		
	
}

