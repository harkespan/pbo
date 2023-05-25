package arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class MahasiswaAksi {
    public static void main(String[] args) {
        // membuat objek ArrayList untuk menyimpan data mahasiswa
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();

       // menambahkan data mahasiswa ke dalam ArrayList
       ArrayList<Double> nilai1 = new ArrayList<Double>();
       nilai1.add(3.5);
       nilai1.add(3.0);
       nilai1.add(4.0);
       mahasiswaList.add(new Mahasiswa("Budi", "12345", nilai1));

       // menampilkan data mahasiswa dan IPK menggunakan Iterator
       Iterator<Mahasiswa> iterator = mahasiswaList.iterator();
       while (iterator.hasNext()) {
            Mahasiswa mahasiswa = iterator.next();
            System.out.println("Nama: " + mahasiswa.getNama() + ", NIM: " + mahasiswa.getNim() + ", IPK: " );
       }
    }
}
