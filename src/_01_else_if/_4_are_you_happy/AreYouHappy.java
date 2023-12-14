package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[]args) {
		String happy = JOptionPane.showInputDialog("Are you happy?");
		if(happy.equals("yes"))	{
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		else {
			happy = JOptionPane.showInputDialog("Do you wnat to be happy?");
			if(happy.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change Something");
			}
			else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
		}
	}
}	