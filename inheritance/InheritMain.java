package inheritance;

public class InheritMain {

	public static void main(String[] args) {
//		Student mahasiswa  = new Student();
//		mahasiswa.identity();
//		mahasiswa.job();
		
		Person ref;
		Student studentObject = new Student();
		Employee employeeObject = new Employee();
		
		ref = studentObject;
//		
		String temp = ref.getName();
		System.out.println(temp);
		
		ref = employeeObject;
		
		String temp1 = ref.getName();
		System.out.println(temp);
	}

}
