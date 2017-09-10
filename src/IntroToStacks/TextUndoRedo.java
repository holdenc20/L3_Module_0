package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	JFrame f = new JFrame();
	JPanel p=new JPanel();
	JLabel l = new JLabel();
	String text="";
	Stack<Character> s = new Stack<Character>();
	public TextUndoRedo(){
		f.add(p);
		p.add(l);
		l.setText("");
		f.addKeyListener(this);
		f.setVisible(true);
		f.setSize(400, 400);
	}
	public static void main(String[] args) {
		TextUndoRedo t=new TextUndoRedo();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==92) {
			if(!s.isEmpty()) {
				text=text+s.pop();
			}
		}
		// TODO Auto-generated method stub
		else if(e.getKeyCode()==8) {
			s.push(text.charAt(text.length()-1));
			text=text.substring(0,text.length()-1);
		}
		else {
	//	s.push(e.getKeyChar());
		text=text+e.getKeyChar();
		}
		l.setText(text);
	}
}
