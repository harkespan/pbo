package pbogab;

/**
 * konstruktor dengan parameter
 * @param nim bertipe String, contoh: A11.2000.00001
 * @param nama bertipe String, adalah nama mahasiswa
 * @param ipk bertipe Double, adalah ipk mahasiswa
 * @author lazyprogrammer
 *
 */

public class Mahasiswa {
	String nim;
	String nama;
	Double ipk;
	
	public Mahasiswa(String nim, String nama, Double ipk) {
		this.nim = nim;
		this.nama = nama;
		this.ipk = ipk;
	}
	
	
}
