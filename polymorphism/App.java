package polymorphism;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BangunDatar bd;
		Scanner inputan = new Scanner(System.in);
		SegiEmpat persegi = new SegiEmpat();
		bd = persegi;
		System.out.println("Masukkan Panjang: ");
		bd.panjang = inputan.nextDouble();
		System.out.println("Masukkan Lebar: ");
		bd.lebar = inputan.nextDouble();
		double luas = bd.luas();
		bd.cetakLuas("Persegi panjang",luas);
		Segitiga sikusiku = new Segitiga();
		bd = sikusiku;
		System.out.println("Masukkan Panjang: ");
		bd.panjang = inputan.nextDouble();
		System.out.println("Masukkan Tinggi: ");
		bd.tinggi = inputan.nextDouble();
		double luas1 = bd.luas(bd.panjang, bd.tinggi);
		bd.cetakLuas("Segitiga siku-siku", luas1);
	}

}
