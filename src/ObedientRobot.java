import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		Robot frost = new Robot();
		frost.setSpeed(10);
		frost.penDown();
 
	//for (int i = 360; i <= 360; i--) {
frost.turn(100);
frost.move(100);
frost.turn(100);
frost.move(100);//this doesn't work!

		//}

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
}
