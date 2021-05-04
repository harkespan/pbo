package inheritance;

public class Person {
	protected String name;
	protected String address;
	
	//Default Constructor
	public Person() {
		System.out.println("Inside Person:Constructor");
		name="";
		address="";
	}
	
	//Constructor dengan parameter
	public Person(String name,String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void job(String job)
	{
		System.out.println("Pekerjaan "+job);
	}
	
	public void identity()
	{
		System.out.println("Nama: "+name);
		System.out.println("Alamat: "+address);
	}
}
