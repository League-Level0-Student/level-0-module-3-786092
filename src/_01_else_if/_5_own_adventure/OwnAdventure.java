package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[]args) {
		String story = JOptionPane.showInputDialog("Who is the GOAT Jordan or LeBron?");
		if(story.equals("Jordan")) {
			String j_champ = JOptionPane.showInputDialog("Did Michael Jordan win 6 championships or 5?");
			if(j_champ.equals("6")) {
				JOptionPane.showMessageDialog(null, "Jordan is the GOAT");
			}
			else {
				JOptionPane.showMessageDialog(null, "You are not a Jordan fan");
			}
		}
		else {
			String l_champ = JOptionPane.showInputDialog("Did LeBron James win 4 championships or 5");
			if(l_champ.equals("4")) {
				JOptionPane.showMessageDialog(null, "LeBron is the GOAT");
			}
			else {
				JOptionPane.showMessageDialog(null, "You are not a LeBron fan");
			}
		}
	}
}
