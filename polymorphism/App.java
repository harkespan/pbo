package polymorphism;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BangunDatar bd;
		SegiEmpat persegi = new SegiEmpat();
		bd = persegi;
		bd.lebar = 5;
		bd.panjang = 10;
		double luas = bd.luas();
		bd.cetakLuas("Persegi panjang",luas);
		Segitiga sikusiku = new Segitiga();
		bd = sikusiku;
		bd.panjang = 10;
		bd.tinggi = 5;
		double luas1 = bd.luas(bd.panjang, bd.tinggi);
		bd.cetakLuas("Segitiga siku-siku", luas1);
	}

}
