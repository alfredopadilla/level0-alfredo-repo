import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumber {

	public static void main(String[] args) {
		
		Random r = new Random();
		Integer randomnum1= r.nextInt(5);
		String final1= randomnum1.toString();
		
		Integer randomnum2= r.nextInt(5);
		String final2= randomnum2.toString();
		
		Integer randomnum3= r.nextInt(5);
		String final3= randomnum3.toString();
		
		Integer randomnum4= r.nextInt(5);
		String final4= randomnum4.toString();
		
		Integer randomnum5= r.nextInt(5);
		String final5= randomnum5.toString();
		
		JOptionPane.showMessageDialog(null, "Your Winning Loterry Numbers Are" + final1 + ", " + final2 + ", " + final3 + ", " + final4 + ", " + final5 + ", ");
		
	}
		
		

		
		
		
		
	
	}

	

