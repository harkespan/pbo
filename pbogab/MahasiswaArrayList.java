package pbogab;
import java.util.*;


public class MahasiswaArrayList {

	static int n;
	public static void main(String[] args) {
		System.out.print("Masukkan Jumlah Data: ");
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();
		String[] nim = new String[n];
		String[] nama = new String[n];
		Double[] ipk = new Double[n];
		for(int i = 0;i < n;i++) {
			System.out.println("Data ke-"+(i+1));
			System.out.print("Masukkan NIM: ");
			nim[i] = inp.next();
			System.out.print("Masukkan Nama: ");
			nama[i] = inp.next();
			System.out.print("Masukkan IPK: ");
			ipk[i] = inp.nextDouble();
		}
		
		setMahasiswa(nim,nama,ipk);
	}
	
	public static void setMahasiswa(String[] nim, String[] nama, Double[] ipk) {
		ArrayList<Mahasiswa> mhs = new ArrayList<>();
		for(int i=0; i < n;i++) {
			mhs.add(new Mahasiswa(nim[i],nama[i],ipk[i]));
		}
		
		cetakMahasiswa(mhs);
	}
	
	public static void cetakMahasiswa(ArrayList<Mahasiswa> list) {
		for(int i = 0;i < n;i++) {
			Mahasiswa mhs = list.get(i);
			System.out.println("Data ke-"+(i+1));
			System.out.println("NIM: "+mhs.nim);
			System.out.println("Nama: "+mhs.nama);
			System.out.println("IPK: "+mhs.ipk);
		}
		
	}

}
