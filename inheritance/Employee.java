package inheritance;

public class Employee extends Person{
	public Employee() {
		super.name="Joko";
	}
	public String getName() {
		System.out.println("Employee name: "+name);
		return name;
	}
}
