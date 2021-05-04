package pbogab;

import java.util.Scanner;

public class Motherboard {
	
	static class USB
	{
		int usb2;
		int usb3;
		int getTotalPorts()
		{
			return usb2 + usb3;
		}
	}
}