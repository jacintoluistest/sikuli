package com.tomsawyer.perspectives.automation.sikuli.tests;

import org.sikuli.script.Location;










/**
 * @author ljacinto
 *
 */
public class TestSikuli {
	public static void main(String args[]){
	
		//org.sikuli.basics.Debug.setDebugLevel(3);
		TSAutomationUtils.pauseScript(new Long(3000));
		TSTester tester = new TSTester(0);
		Location currentLocation = tester.automationTesterCurrentScreen.getCenter();
		float xFactor = new Float (0.5);
		int x = (int)(currentLocation.x +((currentLocation.x * xFactor)));
		int y = (int)(currentLocation.y +((currentLocation.x * xFactor)));
		currentLocation.x = x;
		currentLocation.y = y;
		currentLocation.doubleClick();
		currentLocation.click();
		
		
		
		
	
	}
}
		