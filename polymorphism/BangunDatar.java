package polymorphism;

public class BangunDatar {
	protected float panjang;
	protected float lebar;
	protected float tinggi;
	protected float sisi;
	
	public double luas()
	{
		double luas;
		luas = panjang*lebar;
		return luas;
	}
	
	public void cetakLuas(String tipe, double luas)
	{
		System.out.println("Luas "+tipe+ " adalah "+luas);
	}
	
	//overload
	public void cetakLuas(String tipe, int luas) 
	{	
		System.out.println("Luas "+tipe+ " adalah "+luas);
	}
}
