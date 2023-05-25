package arraylist;
import java.util.ArrayList;


class Mahasiswa {
    private String nama;
    private String nim;
    private ArrayList<Double> nilai;

    public Mahasiswa(String nama, String nim, ArrayList<Double> nilai) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double hitungIPK() {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.size();
    }
}