import javax.swing.JOptionPane;

public class PracticrTest2{

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Type in a number 1-20");
		int value = Integer.parseInt(input);
		if (value > 1 || value > 20) {
			System.out.println(input + 10);
		}
		
		
		
		
	}	
	}