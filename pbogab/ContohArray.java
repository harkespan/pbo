package pbogab;

public class ContohArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[5]; //cara 1
		x[2] = 4;
		x[4] = 1;
		
		//cara 2
		int[] y = {4,6,8,4};
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("Variabel x index ke-"+i+" "+x[i]);
		}
		
		for(int j = 0; j < y.length;j++) {
			System.out.println("Variabel y index ke-"+j+" "+y[j]);
		}
	}

}
