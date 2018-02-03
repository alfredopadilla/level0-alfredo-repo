import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
	String input= JOptionPane.showInputDialog(null,"How old are you?");
	int age= Integer.parseInt(input);
	if(age>18){
		JOptionPane.showMessageDialog(null,"Who should be the next president?");
	} else if (age<=18){
		JOptionPane.showMessageDialog(null,"Nobody cares what you think!");
	}

	}

}
