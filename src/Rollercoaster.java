import javax.swing.JOptionPane;

public class Rollercoaster {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "What's your height in inches");
		int height = Integer.parseInt(input);
		if (height > 48) {
			JOptionPane.showMessageDialog(null, "You can go on the rollercoaster");
		} else if (height <= 48) {
			JOptionPane.showMessageDialog(null, "You need to grow more first");

		}

	}
}