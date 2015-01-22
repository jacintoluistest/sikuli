package com.tomsawyer.perspectives.automation.sikuli.tests;










/**
 * @author ljacinto
 *
 */
public class TestSikuli {
	public static void main(String args[]){
	
		org.sikuli.basics.Debug.setDebugLevel(3);
		TSAutomationUtils.pauseScript(new Long(3000));
		TSTester tester = new TSTester(0);
		tester.fullScreenBrowserMac();
		
	
	}
}
		