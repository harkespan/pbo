package pbogab;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Scanner;

public class SomeArrayList {
	public static void main(String[] args)
	{
		ArrayList<Integer> i = new ArrayList<>();
		i.add(1);
		i.add(10);
		i.add(9);
		i.set(1,8);//menimpa nilai pada indeks 1 yang tadinya 10 menjadi 8
		System.out.println(i);
		System.out.println(i.get(1));
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Masukkan angka: ");
		int x = inp.nextInt();
		
		i.add(x);
		i.add(5, 9);
		
		int jmlData = i.size(); //untuk mencari jumlah data pada arraylist
		
		for(int a = 0;a < jmlData;a++)
		{
			System.out.println(i.get(a));
		}
		
	}
}
