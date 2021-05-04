package inheritance;

public class Student extends Person{
	String nim;
	public Student() {
		System.out.println("Inside Student:Constructor");
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
		
}
