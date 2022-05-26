package pbogab;
import java.util.Scanner;

public class ArrayPrototype {
	int[] angka;
	
	void setArray(int n) {
		angka = new int[n];
		Scanner inp = new Scanner(System.in);
		for(int i = 0;i < n;i++) {
			System.out.print("Masukkan Angka ke-"+(i+1)+": ");
			angka[i] = inp.nextInt();
		}
	}
	
	void cetakArray() {
		System.out.println("Isi array: ");
		int i = 0;
		while(angka.length>i) {	
			System.out.print(angka[i]+",");
			i++;
		}
	}
	
	int sumOfArray() {
		int sum = 0;
		int i = 0;
		while(angka.length>i) {
			sum += angka[i];
			i++;
		}
		return sum;
	}
}
