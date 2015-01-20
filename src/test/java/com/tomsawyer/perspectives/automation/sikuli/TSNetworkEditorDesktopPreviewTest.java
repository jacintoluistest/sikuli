package com.tomsawyer.perspectives.automation.sikuli;
import org.junit.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;

import com.tomsawyer.perspectives.automation.sikuli.tests.TSDesktopPreviewTestCases;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSEnvironment;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSFunctions;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSTester;


public class TSNetworkEditorDesktopPreviewTest
{
	@BeforeClass
	public static void setUp() throws Exception
	{
		//org.sikuli.basics.Debug.setDebugLevel(3);
		className = TSNetworkEditorDesktopPreviewTest.class.getName();
		Settings.MoveMouseDelay = new Float(1.5);
		environment =
			new TSEnvironment("NetworkEditor", TSEnvironment.DESKTOP_PREVIEW);
		TSAutomationTester = new TSTester();
		desktopTester = new TSDesktopPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester = TSFunctions.setDesktopTest(TSAutomationTester, "NetworkEditorProjectPath");
		environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);
	}

@AfterClass
public static void closeAll()
{
	TSAutomationTester.closeDekstopPreview();
	TSAutomationTester.closeAll();
}


	@Test
	public void testOnMouseHoverSelect()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverSelect());

	}

static TSTester TSAutomationTester;

static String className;

static TSEnvironment environment;

static int screenId;

static TSDesktopPreviewTestCases desktopTester;

}
