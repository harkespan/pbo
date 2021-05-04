package pbogab;

public class Variables {
	public static void main(String[] args) {
		//tipe data 
		// integers int 
		// String
		// float
		// boolean
		// setiap variabel mewakili 1 tipe data
		
		int angka;
		angka = 1; //masukkan nilai 1 ke dalam variabel angka
		System.out.println(angka); //python = print
		angka = 10;
		
		int _angka;
		int $angka;
		System.out.println(angka);
		char karakter;
		karakter = '&'; //variabel dengan tipe char value-nya diapit dengan single quote
		char karakters;
		karakters = 'b';
		System.out.println(karakter);
		double pecahan = 0.5;
		System.out.println(pecahan);
		System.out.printf("Angka=%d \n", angka);//style orang C dan C++
		System.out.println("Angka "+pecahan+" adalah pecahan");
		System.out.printf("Angka =%.2f", pecahan);
//		angka = pecahan;
		pecahan = angka;
		System.out.printf("Angka =%.2f \n", pecahan);
		int angka2 = 3;
		double hasilbagi;
		hasilbagi = (float)angka/(float)angka2;
		System.out.println(hasilbagi);
		
		int a=2, b=5, c=7, d=1;
		System.out.println(a+" "+b+" "+c+" "+d);
		karakter ='2';
		System.out.println(a+karakter);
		String namaDepan = "Imanuel";
		String namaBelakang = "Harkespan";
		System.out.println(namaDepan+" "+namaBelakang);
		boolean x;
		x = true; // x = false
		System.out.println(x);
		
	}
}
