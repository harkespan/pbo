package pbogab;
import java.util.Scanner;
public class MotherBoardGo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Motherboard.USB usb = new Motherboard.USB();
		usb.usb2 = input.nextInt();
		usb.usb3 = input.nextInt();
		System.out.println("Total Ports = "+usb.getTotalPorts());
	}
}