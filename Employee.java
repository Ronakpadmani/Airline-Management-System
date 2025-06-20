package AirlineManagementSystem;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String Tel;
	private double salary;
	private String position;
	
	public Employee() {
		
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public void print() {
		System.out.println("id: "+id);
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("Tel: "+Tel);
		System.out.println("Email: "+email);
		System.out.println("salary: "+salary);
		System.out.println("Position: "+position);
		System.out.println();
	}
	
	

}
