import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		String Input = JOptionPane.showInputDialog(null, "What's Your Zodiac Sign?");
		if (Input.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "You're Progressive, original, independent, and humanitarian");
	

		}

	}

}
