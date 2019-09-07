package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	static int a = 0;
	static int i;
	static boolean raceInProgress = true;
	static int robotWinner;
	static Random rndom=new Random();

	public static void main(String[] args) {
		// 2. create an array of 5 robots.

		Robot[] array = new Robot[7];
		// 3. use a for loop to initialize the robots.
		for (i = 0; i < array.length; i++) {
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			a = a + 115;
			array[i] = new Robot();
			array[i].setX(a);
			array[i].setSpeed(10);
			array[i].setY(550);

			// 5. use another for loop to iterate through the array and make each robot move
			// a random amount less than 50.

		}
//6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		while (raceInProgress) {
			for (int robo = rndom.nextInt(7); robo < array.length;robo = rndom.nextInt(7)) {
				Random rand = new Random();
				int distance = rand.nextInt(50);
			

				array[robo].move(distance);

				if (array[robo].getY() <= 10) {
					raceInProgress = false;
					robotWinner = robo;
					array[robotWinner].penDown();
					array[robotWinner].setPenColor(100, 0, 150);
					array[robotWinner].setPenWidth(10);
					array[robotWinner].move(-556);

					break;
				}

			}

			// 7. declare that robot the winner and throw it a party!

			// 8. try different races with different amounts of robots.

			// 9. make a random robot move at a random time
		}
	}

}
