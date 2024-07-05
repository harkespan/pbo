/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author harke
 */
public class Penulis {
    private int id;
    private String nama;
    
    public Penulis(int id, String nama)
    {
        this.id = id;
        this.nama = nama;
    }
    
    public String getNama()
    {
        return nama;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String toString()
    {
        return nama;
    }
    
    public String getNamaById(int id)
    {
        return nama;
    }
}
