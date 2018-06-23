import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		Robot frost = new Robot();
		frost.setSpeed(50);
		frost.penDown();
		String shapeEntered = JOptionPane.showInputDialog(null, "What shape do you want, circle, triangle, square");
		String shapeColor = JOptionPane.showInputDialog(null, "Between blue, red, and yellow, what color do you want?");
		if (shapeColor.equalsIgnoreCase("blue")) {
			frost.setPenColor(66, 107, 244);
		} else if (shapeColor.equalsIgnoreCase("red")) {
			frost.setPenColor(244, 65, 65);
		} else if (shapeColor.equalsIgnoreCase("yellow")) {
			frost.setPenColor(244, 241, 65);

		}

		if (shapeEntered.equalsIgnoreCase("Circle")) {
			drawCircle(frost, 100);
		} else if (shapeEntered.equalsIgnoreCase("Square")) {
			drawSquare(frost, 100);
		} else if (shapeEntered.equalsIgnoreCase("Triangle")) {
			drawTriangle(frost, 100);
		}

	}

	public static void drawSquare(Robot robot, int size) {
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
