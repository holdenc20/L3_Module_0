package Package;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class LogSearch implements ActionListener {
	HashMap<Integer,String> Logs=new HashMap<Integer,String>();
	JFrame f=new JFrame();
	JPanel p=new JPanel();
	JButton b1=new JButton();
	JButton b2=new JButton();
	JButton b3=new JButton();
	 Scanner s = new Scanner(System.in);
	public LogSearch() {

		f.add(p);
		p.add(b1);
		b1.setText("Add Entry");
		b1.addActionListener(this);
		p.add(b2);
		b2.setText("Search by ID");
		b2.addActionListener(this);
		p.add(b3);
		b3.setText("View List");
		b3.addActionListener(this);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		LogSearch ls=new LogSearch();
	}
	  /* 
		 * Crate a HashMap of Integers for the keys and Strings for the values.
		 * Create a GUI with three buttons. 
		 * Button 1: Add Entry
		 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
		 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
		 * 				Add this information as a new entry to your HashMap.
		 * 
		 * Button 2: Search by ID
		 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
		 * 				If that ID exists, display that name to the user.
		 * 				Otherwise, tell the user that that entry does not exist.
		 * 
		 * Button 3: View List
		 * 				When this button is clicked, display the entire list in a message dialog in the following format:
		 * 				ID: 123  Name: Harry Howard
		 * 				ID: 245  Name: Polly Powers
		 * 				ID: 433  Name: Oliver Ortega
		 * 				etc...
		 * 
		 * When this is complete, add a fourth button to your window.
		 * Button 4: Remove Entry
		 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
		 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
		 * 				is not in the list. 
		 *
		 * */
	HashMap<Integer,String> Hash=new HashMap<Integer,String>();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(b1==e.getSource()) {
			System.out.println("Enter ID number>>");
			int ID=s.nextInt();
			
			System.out.println("Enter name>>");
			String name=s.nextLine();
			Logs.put(ID, name);
		}
		if(b2==e.getSource()) {
			System.out.println("Enter ID number>>");
			s.nextLine();
			int ID=s.nextInt();
			if(Logs.containsKey(ID)) {
				System.out.println(Logs.get(ID));
			}
			else {
				System.out.println("Not valid ID");
			}
		}
		if(b3==e.getSource()) {
			for(String i : Logs.values()){
				System.out.println(i);
			}
		}
	}
	
	}