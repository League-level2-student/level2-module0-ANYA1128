package arrays;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	static int a = 0;

	public static void main(String[] args) {
		// 2. create an array of 5 robots.

		Robot[] array = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < array.length; i++) {
		// 4. make each robot start at the bottom of the screen, side by side, facing up
			a = a + 150;
			array[i] = new Robot();
			array[i].setX(a);
			array[i].setY(550);
		}
	}

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
