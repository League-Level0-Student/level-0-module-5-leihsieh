package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		rob.show();
		rob.setSpeed(10);
		rob.setPenColor(0, 0, 0);
		rob.penDown();
		String input = JOptionPane.showInputDialog("What would you like drawn?");
		if(input.equalsIgnoreCase("Square")) {
			drawSquare();
		}
		else if(input.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		}
		else if(input.equalsIgnoreCase("Circle")) {
			drawCircle();
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I can't draw that shape.");
		}
		rob.hide();
	}
	
	private static void drawSquare() {
		for(int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
	}
	private static void drawTriangle() {
		for(int i = 0; i < 3; i++) {
			rob.move(100);
			rob.turn(120);
		}
	}
	private static void drawCircle() {
		for(int i = 0; i < 73; i++) {
			rob.move(10);
			rob.turn(5);
		}
	}
}
