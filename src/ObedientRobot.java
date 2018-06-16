import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		Robot frost = new Robot();
		frost.setSpeed(10);
		frost.penDown();
		String shapeEntered = JOptionPane.showInputDialog(null, "What shape do you want, circle, triangle, square");
		if (shapeEntered.equalsIgnoreCase("Circle")) {
			drawCircle(frost, 100);
		}
		else if(shapeEntered.equalsIgnoreCase("Square")) {
			//drawSquare(frost,100);
		}
		else if(shapeEntered.equalsIgnoreCase("Triangle")) {
			drawTriangle(frost,100); 
		}
		String shapeColor = JOptionPane.showInputDialog(null, "Between blue, red, and yellow, what color do you want?");
		if (shapeColor.equalsIgnoreCase("blue")) {
			//working on setting the color to blue
			//remember color is a class Color.BLUE
			// create a Color the same way you created a new Robot ex line 9 but include the color in the ().
		}
	}

	public static void drawSquare(Robot robot, int size, Color color) {
		robot.setPenColor(color);
		robot.move(size);
		robot.turn(90);
		robot.move(size);
		robot.turn(90);
		robot.move(size);
		robot.turn(90);
		robot.move(size);
		robot.penUp();

	}

	public static void drawTriangle(Robot robot, int size) {
		robot.turn(-90);
		robot.move(200);
		robot.turn(120);
		robot.move(200);
		robot.turn(120);
		robot.move(200);
		robot.penUp();
	}

	public static void drawCircle(Robot robot, int size) {
		for (int i = 1; i <= 360; i++) {
			robot.turn(1);
			robot.move(1);
		}
	}
}
