package abstrak;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobil mobilku = new Mobil();
		Truk trukku = new Truk();
		
		int jumlahroda = 4;
		trukku.setJumlahRoda(jumlahroda);
		
		System.out.println(trukku.getJumlahRoda());
		
	}

}
