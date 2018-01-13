import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		String unbirthday = JOptionPane.showInputDialog("When is your birthday?");
		if (unbirthday.equals("1/6")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday");

		} else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday");

		}

	}
}
