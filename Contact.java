
public class Contact {
	
	private String firstName;
	private String lastName;
	private String number;
	private String email;
	private char gender;
	
	public Contact() {
		
	}
	
	public Contact(String firstName) {
		
		this.firstName = firstName;
		
	}
	
	public Contact(String firstName, String lastName) {
		
		this(firstName);
		this.lastName = lastName;
			
	}
	
	public Contact(String firstName, String lastName, String number) {
		
		this(firstName, lastName);
		this.number = number;
		
	}
	
	public Contact(String firstName, String lastName, String number, String email) {
		
		this(firstName, lastName, number);
		this.email = email;
		
	}
	
	public Contact(String firstName, String lastName, String number, String email, char gender) {
		
		this(firstName, lastName, number, email);
		this.gender = gender;
		
	}
	
	// setters
	
	public void setFirstName(String firstName) { this.firstName = firstName; }
	
	public void setLastName(String lastName)   { this.lastName = lastName; }
	
	public void setNumber(String number)       { this.number = number; }
	
	public void setEmail(String email)         { this.email = email; }
	
	public void setGender(char gender)         { this.gender = gender; }
	
	// getters

	public String getFirstName() { return this.firstName; }
	
	public String getLastName()  { return this.lastName; }
	
	public String getName()      { return this.firstName + this.lastName; }
	
	public String getNumber()    { return this.number; }
	
	public String getEmail()     { return this.email; }
	
	public char getGender()      { return this.gender; }
	
	public String toString(){
		
		String s = "";
		
		s += this.firstName;
		s += this.lastName;
		s += this.number;
		s += this.email;
		s += this.gender;
		
		return s;
		
	}
	
}