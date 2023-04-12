package inheritance;

public class Mahasiswa{
    String nim;
    String nama;
    int usia;

    public Mahasiswa(String nim, String nama, int usia){
        this.nim = nim;
        this.nama = nama;
        this.usia = usia;
    }

    public void mengumpulkanTugas()
    {
        System.out.println(nama+" mengumpulkan tugas");
    }

    public void mengikutiKuliah()
    {
        System.out.println(nama+" sedang mengikuti kuliah");
    }

    public void cetak(){
        System.out.println("NIM: "+nim);
        System.out.println("Nama: "+nama);
        System.out.println("Usia: "+usia);
    }
}