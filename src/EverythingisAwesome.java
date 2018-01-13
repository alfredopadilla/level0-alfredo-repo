package level0alfredo;

import javax.swing.JOptionPane;

public class EverythingisAwesome {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null, "What do you like?");
		JOptionPane.showMessageDialog(null, "That's awesome I also like " + answer);

	}

}
