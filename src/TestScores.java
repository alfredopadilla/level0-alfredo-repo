import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "What's your test score?");
		double value = Double.parseDouble(input);
		if (value > 80) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
		} else {
			JOptionPane.showMessageDialog(null, "Why don't you study harder next time");
		}
	}
}
