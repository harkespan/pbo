package abstrak;

public abstract class BangunDatar {
	
	int x,y;
	
	public void pindahkan(int a, int b)
	{
		x = a;
		y = b;
	}
	
	public abstract void draw();
	public abstract void resize();

}
