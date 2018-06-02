import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		String Input = JOptionPane.showInputDialog(null, "What's Your Zodiac Sign?");
		if (Input.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "You're Progressive, original, independent, and humanitarian");
		}
		else if(Input.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null,"You're Highly energetic, assertive, and independent"); 
		}
		else if(Input.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null,"You're an deliberate thinker, stubborn person"); 
		}
		else if(Input.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null,"You have a great sense of humor "); 
		}
		else if(Input.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null,"You're clingy, and insecure when you feel you're going to lose friendship or love from someone else,"); 
		}
		else if(Input.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null,"You're honest, and you have great sense of self-worth "); 
		}
		else if(Input.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null,"You're a kind, patient person "); 
			}
		else if(Input.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null,"You're a loyal, balanced, altruistic person "); 
			}
		else if(Input.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null,"You're a seductive, original, and outstanding person "); 
			}
		else if(Input.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null,"You're a seductive, adventurous, and intelligent person "); 
			}
		else if(Input.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null,"You're a confident, caring, responsible person "); 
			}
		else if(Input.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null,"You're progressive, original, and independent "); 
			}
		else if(Input.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null,"You're compassionate, artistic, and intiutive "); 
			}
		else {
			JOptionPane.showMessageDialog(null,"That's not a star sign!"); 
		}

}

}
