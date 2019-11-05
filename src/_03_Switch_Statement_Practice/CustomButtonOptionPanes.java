package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		switch (choice) {

		case "Sunday":
			JOptionPane.showMessageDialog(null, "It is the second best day of the week because you can watch the NFL!");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Oh, it is the first day of the week. That sucks...");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "The best dinner of the week is today: Taco Tuesday!!!!!!");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Guess what day it is? Hump day!!!!!!");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Nice, it is close to the end of the week...");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "So close to the weekend!!!");
			break;

		default: 
			JOptionPane.showMessageDialog(null, "It is the best day of the week. Time to relax!");
			break;

		}
		// use a switch statement to do something cool for each option

	}
}
