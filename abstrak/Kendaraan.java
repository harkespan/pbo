package abstrak;

public abstract class Kendaraan {
	private String merk;
	private String model;
	private int jumlahRoda;
	
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getJumlahRoda() {
		return jumlahRoda;
	}
	public void setJumlahRoda(int jumlahRoda) {
		this.jumlahRoda = jumlahRoda;
	}

	public abstract void nyalakan();
}
