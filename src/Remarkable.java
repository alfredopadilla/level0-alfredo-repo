import javax.swing.JOptionPane;

public class Remarkable {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Name a student");
		if (name.equals("Alexa")) {
			JOptionPane.showMessageDialog(null, "Alexa is remarkably smart");
		} else if (name.equalsIgnoreCase("Paola")) {
			JOptionPane.showMessageDialog(null, "Paola is remarkably stylish");
		} else if (name.equalsIgnoreCase("Angel")) {
			JOptionPane.showMessageDialog(null, "Angel is remarkably brilliant");
		} else if (name.equalsIgnoreCase("Wendy")) {
			JOptionPane.showMessageDialog(null, "Wendy is remarkably thoughtful");
		} else if (name.equalsIgnoreCase("Joshua")) {
			JOptionPane.showMessageDialog(null, "Joshua is remarkably intelligent");
		} else if (name.equalsIgnoreCase("Neo")) {
			JOptionPane.showMessageDialog(null, "Neo is remarkably humorous");
		} else if (name.equalsIgnoreCase("Julie")) {
			JOptionPane.showMessageDialog(null, "Julie is remarkably quiet");
		}

	}

}
