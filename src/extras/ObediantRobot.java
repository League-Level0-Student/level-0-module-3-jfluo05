package extras;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	static Robot rob;
public static void main(String[] args) {
	
	//Make an obedient robot that will obey commands to draw shapes.

	//1. Make a new class, create a main method, and show the robot.
rob= new Robot("mini");
	//2. Have the robot draw a square.




	//3. Extract this code into a drawSquare() method.

	//4. Have the robot draw a triangle.

	//5. Extract this code into a drawTriangle(); method.

	//6. Have the robot draw a circle.

	//7. Extract this code into a drawCircle() method.

	//8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.
String color= JOptionPane.showInputDialog("What color do you want me to draw your shape in?(Red, green, or blue)");

if(color.equalsIgnoreCase("red")) {
	rob.setPenColor(Color.RED);
	rob.penDown();
}
else if(color.equalsIgnoreCase("green")) {
	rob.setPenColor(Color.GREEN);
	rob.penDown();
}
else if(color.equalsIgnoreCase("blue")) {
	rob.setPenColor(Color.BLUE);
	rob.penDown();
}
else {
	JOptionPane.showMessageDialog(null, "That is not valid, I am going to use a random colour.");
	rob.setRandomPenColor();
	rob.penDown();
}


String shape= JOptionPane.showInputDialog("Which shape do you want? Square, triangle, or circle?");
if(shape.equalsIgnoreCase("square")) {
	drawSquare();
}
else if(shape.equalsIgnoreCase("triangle")) {
	drawTriangle();
}
else if(shape.equalsIgnoreCase("circle")) {
	drawCircle();
}
else {
	JOptionPane.showMessageDialog(null, "That is not a valid shape I am going to draw a circle.");
drawCircle();
}
	//9. Ask the user which color they want. Color the the shape depending on their answer.
	
	
	
	
	
}
private static void drawCircle() {
	// TODO Auto-generated method stub
	
	
	rob.setSpeed(100);
	for(int i=0;i<361;i++) {
	rob.move(1);
	rob.turn(1);
	}
}
private static void drawTriangle() {
	// TODO Auto-generated method stub
	
	rob.setSpeed(25);
	rob.move(100);
	rob.turn(120);
	rob.move(100);
	rob.turn(120);
	rob.move(100);
	
}
private static void drawSquare() {
	// TODO Auto-generated method stub
	
	rob.setSpeed(25);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
}


}
