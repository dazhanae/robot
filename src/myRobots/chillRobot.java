package myRobots;

import java.awt.Color;

import robocode.HitByBulletEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class ChillRobot extends Robot {
	public void run() {
		while (true) { 
			//Moves my robot forward 300 pixels
			ahead(300);
			//Turns my gun to the right by 360 degrees
			turnGunRight(360);
			// Moves my robot back 100 pixels backward
			back(100);
			//Turns my gun to the left by 360 degrees
			turnGunLeft(360);
			
	}
	}// Access modifier Return type=null  
	 public void onScannedRobot(ScannedRobotEvent e) {
	       	//immediately fires a bullet 
		 	fire(10);
	        //Sets the color of my robot to orange
	        setBodyColor(Color.orange);
	        //Set the color of my bullets to yellow
	        setBulletColor(Color.YELLOW);
	    }//Method
	 public void onHitByBullet(HitByBulletEvent e) {
	        //Moves my robot back 10 pixels when hit by a bullet
	        back(10);
	    }
	 
}

	  