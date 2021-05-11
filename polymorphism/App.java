package polymorphism;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BangunDatar bd;
		SegiEmpat persegi = new SegiEmpat();
		bd = persegi;
		double luas = bd.luas();
		bd.cetakLuas("Persegi panjang",luas);
		Segitiga sikusiku = new Segitiga();
		bd = sikusiku;
	}

}
