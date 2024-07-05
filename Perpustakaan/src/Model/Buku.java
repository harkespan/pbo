/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author harke
 */
public class Buku {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the judul_buku
     */
    public String getJudulBuku() {
        return judul_buku;
    }

    /**
     * @return the tahun_terbit
     */
    public int getTahunTerbit() {
        return tahun_terbit;
    }

    /**
     * @return the stok
     */
    public int getStok() {
        return stok;
    }

    /**
     * @return the penulis
     */
    public int getPenulis() {
        return penulis;
    }
    private int id;
    private String judul_buku;
    private int tahun_terbit;
    private int stok;
    private int penulis;
    
    public Buku(int id, String judul_buku, int tahun_terbit, int stok, int penulis)
    {
        this.id = id;
        this.judul_buku = judul_buku;
        this.tahun_terbit = tahun_terbit;
        this.stok = stok;
        this.penulis = penulis;
    }
    
    
    public String toString()
    {
        return judul_buku;
    }
}
