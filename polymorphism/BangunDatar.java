package polymorphism;

public class BangunDatar {
	protected double panjang;
	protected double lebar;
	protected double tinggi;
	protected double sisi;
	
	public double luas()
	{
		double luas;
		luas = panjang*lebar;
		return luas;
	}
	/**
	 * overload
	 * @param panjang
	 * @param tinggi
	 * @return
	 */
	public double luas(double panjang, double tinggi)
	{
		return (panjang*tinggi)/2;
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
