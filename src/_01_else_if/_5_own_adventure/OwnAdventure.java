package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[]args) {
		String story = JOptionPane.showInputDialog("Are you a fan of the Lakers");
		if(story.equals("yes")) {
			JOptionPane.showInputDialog("");
		}
	}
}
