package pbogab;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int jmlData;
		Scanner inp = new Scanner(System.in);
		System.out.print("Masukkan Jumlah Data: ");
		jmlData = inp.nextInt();
		
		ArrayPrototype ap = new ArrayPrototype();
		
		ap.setArray(jmlData);
		
		ap.cetakArray();
		
		System.out.println("Jumlah angka = "+ap.sumOfArray());
	}
}
