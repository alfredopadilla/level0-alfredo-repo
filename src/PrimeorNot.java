import javax.swing.JOptionPane;

public class PrimeorNot {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Type in a number 1-100");
		int value = Integer.parseInt(input);
		boolean prime;
		for (int i = 1; i < 100; i++) {
			if (value > 1 && value % i == 1) {
				prime = true;
			} else {
				prime = false;
			}

		}
		if (prime = true) {
			JOptionPane.showMessageDialog(null, "It's a prime number");
		}
		if (prime = false) {
			JOptionPane.showMessageDialog(null, "It's not a prime number");

		}
//mostly done something went wrong, aka when running it and input 24 it said its a prime when its's not 
	}
}
