import javax.swing.JOptionPane;

public class PrimeorNot {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Type in a number 1-100");
		int value = Integer.parseInt(input);
		if (value < 1 || value > 100) {
			JOptionPane.showMessageDialog(null, "Error, please give a number between 1-100");
		} else {

			boolean prime = true;
			for (int i = 2; i < value; i++) {
				if (value > 1 && value % i == 0) {
					prime = false;
				}

			}
			if (prime == true) {
				JOptionPane.showMessageDialog(null, "It's a prime number");
			}
			if (prime == false) {
				JOptionPane.showMessageDialog(null, "It's not a prime number");

			}
		}

	}
}
