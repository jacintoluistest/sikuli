package com.tomsawyer.perspectives.automation.sikuli;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tomsawyer.perspectives.automation.sikuli.tests.TSTester;

//import junit.framework.TestCase;


public class TSSNetworkEditor {
	static TSTester a;
	
	@BeforeClass
	public static void openTS(){
		Properties prop = new Properties();
		InputStream input = null;
		String projectPath;
		

		try{
			input = new FileInputStream("config.properties");
			// load a properties file
			prop.load(input);
			projectPath =prop.getProperty("NetworkEditorProjectPath");
			System.out.println("Path a probar "+projectPath);
		}
			catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
		a = new TSTester();
		a.LaunchTS();
		a.openProjectWindows("");
	}
	
	@AfterClass
	public static void closeTS(){
		a.closeTSP();
	}
	
	
	@Test
	public void testProyectOpened(){
		System.out.println("Prueba");
	}
	
	
	
	

}
