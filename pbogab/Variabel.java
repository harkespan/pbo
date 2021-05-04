package pbogab;

public class Variabel {
	public static void main(String[] args)
	{
		//data field - variabel - attribute
		/*tipe data
		 * integer
		 * float
		 * double
		 * char
		 * boolean
		 * byte
		 * short
		 * long
		 */
		int angka; //benar
		int _angka; //benar
		int $angka; //benar
		int Angka; 
		
		angka = 10;
		System.out.println("Variabel angka bertipe integer nilainya adalah " +angka);
		
		angka = 100;
		double pecahan = 1.6;
		System.out.println("Variabel pecahan bertipe double nilainya adalah " +pecahan);
		char karakter = '2';
		System.out.println(karakter+angka);
		boolean aksi;
		aksi = true;//false
		System.out.println(aksi);
		/*
		 * operasi aritmatika
		 * +, -, /, *, %
		 * pembanding
		 * <, >, <=, >=, !=, ><, ==
		 */
		int jumlah;
		jumlah = angka+(int)pecahan;
		System.out.println(jumlah);
		
		String namaDepan = "Imanuel";
		String namaBelakang = "Harkespan";
		System.out.println(namaDepan+" "+namaBelakang);
	}
}
