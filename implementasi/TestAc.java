package implementasi;

public class TestAc {

	public static void main(String[] args) {
		AC ac = new AC(20);
		ac.setOn();
		System.out.println("Suhu AC dinaikkan menjadi: "+ac.setSuhu());
		
		ac.checkSuhu();
		ac.setCool();
		
		ac.checkMode();
		
		ac.setOff();
		ac.setCool();


	}

}
