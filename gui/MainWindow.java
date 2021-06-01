package gui;
import javax.swing.*;

public class MainWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame.isDefaultLookAndFeelDecorated();
		JFrame container = new JFrame("Main Window");
		container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setSize(300,100);
		container.setLocation(200,200);
		container.setVisible(true);
	}

}
