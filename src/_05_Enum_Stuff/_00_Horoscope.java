package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.

	void run(Zodiac z) {

		if (z == Zodiac.ARIES) {

			JOptionPane.showMessageDialog(null, "Soon you are going to be rich");
		}

		if (z == Zodiac.TAURUS) {

			JOptionPane.showMessageDialog(null, "Success is in your future");
		}

		if (z == Zodiac.GEMINI) {

			JOptionPane.showMessageDialog(null, "A dangerous person is going to enter your life");
		}

		if (z == Zodiac.CANCER) {

			JOptionPane.showMessageDialog(null, "A friend is going to betray you");
		}

		if (z == Zodiac.LEO) {

			JOptionPane.showMessageDialog(null,"Seek advice from a new friend to give you a suggestion you hadn't considered");
		}

		if (z == Zodiac.VIRGO) {

			JOptionPane.showMessageDialog(null,"Are you wondering about making a major purchase? This year might be a moment to consider and it will be time to act");
		}

		if (z == Zodiac.LIBRA) {

			JOptionPane.showMessageDialog(null,"This week you should give someone you love a word of encouragement. Once you do, you can find what you seek.");
		}

		if (z == Zodiac.SCORPIO) {

			JOptionPane.showMessageDialog(null,"All signs say that you will own something you forgot about, and it will become important to you once again. If this doesn't make sense, it will as your day goes on");
		}

		if (z == Zodiac.SAGITTARIUS) {

			JOptionPane.showMessageDialog(null,"If you're feeling doubtful, you should reach out to those close to you who may need you. And then the good in the world will become more obvious");

		}
		
		if (z == Zodiac.CAPRICORN) {

			JOptionPane.showMessageDialog(null,"If you're feeling doubtful, you should reach out to those close to you who may need you. And then the good in the world will become more obvious");

		}
		
		if (z == Zodiac.AQUARIUS) {

			JOptionPane.showMessageDialog(null,"You may want an older relative to give you bad advice. The power to do the right thing is ultimately in your hands");

		}
		
		if (z == Zodiac.PISCES) {

			JOptionPane.showMessageDialog(null,"You should do something for someone in your family. When you do the pieces will start to fall in place");

		}

	}

	// 3. Make a main method to test your method

	public static void main(String[] args) {
		
		_00_Horoscope h = new _00_Horoscope();
		h.run(Zodiac.SAGITTARIUS);
	}
}
