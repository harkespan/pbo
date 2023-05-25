package inheritance;

public class MahasiswaMbkm extends MahasiswaBaru {
    int tahunMasuk;

    public MahasiswaMbkm(String nim, String nama, int usia, String asalSekolah,int tahunMasuk){
        super(nim,nama,usia,asalSekolah);
        this.tahunMasuk = tahunMasuk;
    }

    @Override
    public boolean ikutOspek()
    {
        return false;
    }

    public void cetak(){
        super.cetak();
        System.out.println("Tahun masuk: "+tahunMasuk);
    }
}
