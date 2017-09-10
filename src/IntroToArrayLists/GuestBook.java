package Package;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	ArrayList<String> guests=new ArrayList<String>();
	public GuestBook() {
		createUI();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame f = new JFrame();
	JPanel p=new JPanel();
	JButton b1=new JButton();
	JButton b2=new JButton();
	Scanner s=new Scanner(System.in);
	public void createUI() {
		f.add(p);
		f.setVisible(true);
		p.add(b1);
		b1.setText("Add Name");
		b1.addActionListener(this);
		p.add(b2);
		b2.setText("View Names");
		b2.addActionListener(this);
	}
	public static void main(String[] args) {
	GuestBook gb=new GuestBook();
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name;
		if(b1==e.getSource()) {
			System.out.println("Enter a name");
			name=s.nextLine();
			guests.add(name);
		}
		if(b2==e.getSource()) {
			for(String names:guests) {
				System.out.println(names);
			}
		}
	}
}
