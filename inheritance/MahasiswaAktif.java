package inheritance;

public class MahasiswaAktif extends Mahasiswa{
    int semester;

    public MahasiswaAktif(String nim, String nama, int usia, int semester){
        super(nim,nama,usia);
        this.semester = semester;
    }

    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Semester: "+semester);
    }
}