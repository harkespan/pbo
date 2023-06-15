package implementasi.phone;
import java.util.*;
import java.lang.Math;

public class Cellphone implements Phone{
    String merk;
    String type;
    int balance;
    int batteryLevel;
    int status;
    int volume;
    boolean kontakKetemu = false;
    ArrayList<Contact> kontak = new ArrayList<Contact>();

    public Cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);  
    }

    public void powerOn(){
        this.status = 1;
        System.out.println("Ponsel menyala");
    }
    
    public void powerOff(){
        this.status = 0;
        System.out.println("Ponsel mati");
    }

    public void volumeUp(){
        if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
        }
        else
        {
            this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    }

    public void volumeDown(){
        this.volume--;
    }

    public int getVolume(){
        return this.volume;
    }

    public void getContact(String nama){
        for(Contact contact : kontak){
            if(contact.getNama().equalsIgnoreCase(nama))
            {
                System.out.println("Pencarian kontak "+nama+" ketemu");
                System.out.println("Nama: "+contact.getNama());
                System.out.println("Nomor: "+contact.getNomor());
                System.out.println();
                kontakKetemu = true;
            }
        }

        if(!kontakKetemu)
        {
            System.out.println("Kontak tidak ketemu");
        }
    }

    public void listContact(){
        System.out.println("Daftar Kontak:");
        for (Contact contact : kontak) {
            System.out.println("Nama: " + contact.getNama());
            System.out.println("Nomor: " + contact.getNomor());
            System.out.println();
        }
    }

    public void getBatteryLevel(){
        System.out.println("Baterai: "+this.batteryLevel+"%");
        if(this.batteryLevel < 20){
            System.out.println("Baterai kurang dari 20. Disarankan untuk mengisi daya");
        }
    }

    public int getBalance(){
        return this.balance;
    }

    public void insertContact(String nama, String nomor){
        kontak.add(new Contact(nama, nomor));
        System.out.println("Kontak dengan nama: "+nama+" dan nomor: "+nomor+" telah disimpan");
    }

    public void topUpBalance(int balance){
        this.balance += balance;
        System.out.println("Pulsa bertambah "+balance+". Sisa pulsa: "+this.balance);
    }

    public void phoneInfo()
    {
        System.out.println("Merk ponsel: "+this.merk);
        System.out.println("Tipe ponsel: "+this.type);
        getBatteryLevel();
        System.out.println("Sisa pulsa: "+this.balance);
    }
}
