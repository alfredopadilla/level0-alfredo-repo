import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null,
				"Once upon a time there were 2 bears that were lost in a forest,"
						+ " \nthey encountered 2 different pathways,1 bear wanted to go left. \nWhile the other bear wanted to go right, who are u following, bear 1 or bear 2? [ Enter Bear 1 or Bear 2]");
		if (input.equalsIgnoreCase("Bear 1")) {
			JOptionPane.showMessageDialog(null, "You decided to go through the left pathway with bear 1, \n"
					+ "unfortunally you decided to go through the pathway that takes you to an ogre that eats anyone who encounters him.\n"
					+ "Now you're dead! :(");
		} else if (input.equalsIgnoreCase("Bear 2")) {
			JOptionPane.showMessageDialog(null,
					"You decided to go through the right pathway with bear 2, and now you are walking through a pathway\n"
							+ "that's filled with candy, and at the end of the pathway there is a treasure that's waiting for you with 1 billion dollars.");
		}
		input = JOptionPane.showInputDialog(null, "Are You Happy with the bear you followed?");
		if(input.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You're smart for following your instinct");
		}
		else if(input.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Good luck next time!");
		}
		{

		}

	}
}
