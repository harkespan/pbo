package inheritance;

public class MahasiswaBaru extends Mahasiswa{
    String asalSekolah;

    public MahasiswaBaru(String nim, String nama, int usia, String asalSekolah){
        super(nim,nama,usia);
        this.asalSekolah = asalSekolah;
    }

    public boolean ikutOspek()
    {
        return true;
    }

    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Asal sekolah: "+asalSekolah);
    }

}