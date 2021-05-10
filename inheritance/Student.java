package inheritance;

public class Student extends Person{
	String nim;
	public Student() {
		System.out.println("Inside Student:Constructor");
		super.name="Anda";
	}
	
	public String getNim()
	{
		return nim;
	}
	
	@Override
	public void identity()
	{
		System.out.println("NIM: "+getNim());
		System.out.println("Nama: "+super.name);
		System.out.println("Alamat: "+super.address);
	}
	
	public void job()
	{
		System.out.println("Pekerjaan : Mahasiswa");
	}
	
	public String getName() {
		System.out.println("Student name: "+name);
		return name;
	}
		
}
