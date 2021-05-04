package pbogab;
import java.util.ArrayList;
import java.lang.Integer;
public class SomeArrayList {
	public static void main(String[] args)
	{
		ArrayList<Integer> i = new ArrayList<>();
		i.add(1);
		i.add(10);
		i.add(9);
		i.set(1,8);
		System.out.println(i);
		System.out.println(i.get(1));
	}
}
