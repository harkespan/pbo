package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DemoButton extends JFrame {
	private JButton btn;
	public DemoButton() {
		super("Demo JButton");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		btn = new JButton("Button");
		c.add(btn);
		
		ButtonHandler handler = new ButtonHandler();
		btn.addActionListener(handler);
		setSize(275,100);
		show();
	}

	public static void main(String[] args) {
		DemoButton app = new DemoButton();
        app.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
	}
	
	private class ButtonHandler implements ActionListener {
	    public void actionPerformed(ActionEvent ae) {
	       JOptionPane.showMessageDialog(null,
	               "anda telah menekan"
	               +ae.getActionCommand()+"\n"
	               +"Handler button ini pakai kelas Inner");
	        }
	    }

}
