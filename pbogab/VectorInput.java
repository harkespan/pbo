package pbogab;
import java.util.*;
public class VectorInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Scanner choice = new Scanner(System.in);
		Vector<String> namas = new Vector<>();
		char pilih = 't';
		do
		{
			System.out.print("Masukkan nama: ");
			String nama = input.nextLine();
			namas.add(nama);
			System.out.print("Input lagi? (y/t)");
			pilih = choice.next().charAt(0);
			
		}
		while(pilih == 'y');
		System.out.println(namas);
		int jumlah = namas.size();
		System.out.print("Mau hapus index ke berapa? : ");
		int index = input.nextInt();
		if(index<jumlah)
		{
			String element = namas.remove(index);
			System.out.println("Elemen yang akan dihapus adalah : "+element);
			System.out.println(namas);			
		}
		else
		{
			System.out.println("Index berada di luar range");
		}
	}
}
 