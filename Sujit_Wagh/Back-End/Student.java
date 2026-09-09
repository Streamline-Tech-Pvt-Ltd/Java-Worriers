package main.in.sp;

public class Student {
	private int id;
	private String name;
	private String email;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		
	}
	public void display() {
		System.out.println("ID"+":"+id);
		System.out.println("Name"+":"+name);
		System.out.println("Email"+":"+email);
		System.out.println("Address"+":"+address);
	}
	public Student(int id, String name, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID"+":"+id+" "+"Name"+":"+name+" "+"Email"+":"+email+" "+"Address"+":"+address;
	}

}
