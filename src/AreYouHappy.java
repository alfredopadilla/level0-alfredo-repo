import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Are You Happy?");
		if (input.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing.");
		} 
		else if(input.equalsIgnoreCase("no")) {
			input=JOptionPane.showInputDialog(null, "Do You Want To Be Happy?");
			if(input.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change Something.");
			}
				else if(input.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing.");

			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Please answer yes or no");

		}
		
	}

}
