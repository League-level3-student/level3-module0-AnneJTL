package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
    static int maxSpeed = 300;
	//1. make a main method
    public static void main(String[] args) {

		//2. create an array of 5 robots.
        Robot[] myRobots = new Robot[5];

		//3. use a for loop to initialize the robots.
        int posx = 100;
        for (int i = 0; i < myRobots.length; i++) {
            myRobots[i] = new Robot(posx, 500);

            //4. make each robot start at the bottom of the screen, side by side, facing up
            posx += 150;
        }

		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
        Random randomMove = new Random();
        int robotMove = randomMove.nextInt(maxSpeed);
        boolean top = false;
        do {
            for (int i = 0; i < myRobots.length; i++) {
                myRobots[i].move(robotMove);
                robotMove = randomMove.nextInt(maxSpeed);
                System.out.println("getY: " + myRobots[i].getY() );
                if ((myRobots[i].getY() - 100)  <= 0){
                    top = true;
                    JOptionPane.showMessageDialog(null, "The robot " + (i+1) + " is the winner.");
                    break;
                }
            }
        } while (!top);
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

    }
}
