package inheritance;

public class Main {
    public static void main(String[] args) {
        
        boolean isOspek = false;
        
        Mahasiswa mhs = new Mahasiswa("A11.2000.00001", "Rudi", 20);
        MahasiswaBaru mb = new MahasiswaBaru("A11.2001.00002", "Susi", 18, "SMA Negeri 1 Semarang");
        MahasiswaAktif ma = new MahasiswaAktif("A11.2000.00002", "Tony", 20, 4);

        mhs.cetak();
        isOspek = mb.ikutOspek();
        mb.cetak();
        if(isOspek){
            System.out.println(mb.nama+" mengikuti Ospek");
        }
    }
}
