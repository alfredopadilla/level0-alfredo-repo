import javax.swing.JOptionPane;

public class SecretMessage {

	public static void main(String[] args) {
		String password= "apple";
		String secretmessage = JOptionPane.showInputDialog("What is the secret mesage");
		String answer = JOptionPane.showInputDialog("You can only see the secret message if you guess the passcode");
		if(answer.equals(password)){
			JOptionPane.showMessageDialog(null,secretmessage);
		}
		else{
			JOptionPane.showMessageDialog(null,"INTRUDER!!");
		}
				
		

	}

}
