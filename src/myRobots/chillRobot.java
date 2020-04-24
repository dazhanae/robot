package myRobots;

import java.awt.Color;

import robocode.HitByBulletEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class chillRobot extends Robot {
	public void run() {
		while (true) { 
			ahead(300);
			turnGunRight(360);
			back(200);
			turnGunRight(360);
			
	}
	}
	 public void onScannedRobot(ScannedRobotEvent e) {
	        fire(10);
	        setBodyColor(Color.orange);
	    }
	 public void onHitByBullet(HitByBulletEvent e) {
	        
	        back(10);
	    }
}

	  