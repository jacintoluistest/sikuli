package com.tomsawyer.perspectives.automation.sikuli;

import java.io.File;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSDesktopPreviewTestCases;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSEnvironment;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSFunctions;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSTester;

public class TSAcyclicDesktopPreviewTest
{
	@BeforeClass
		public static void setUp() throws Exception
		{
			//org.sikuli.basics.Debug.setDebugLevel(3);
			className = TSMSliceDesktopPreviewTest.class.getName();
			Settings.MoveMouseDelay = new Float(1.5);
			environment =
				new TSEnvironment("AcyclicTest", TSEnvironment.DESKTOP_PREVIEW);
			TSAutomationTester = new TSTester();
			desktopTester = new TSDesktopPreviewTestCases(environment, TSAutomationTester, className);
			TSAutomationTester = TSFunctions.setDesktopTest(TSAutomationTester, "AcyclicTestProjectPath");
			environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);
		}

	@AfterClass
	public static void closeAll()
	{
		TSAutomationTester.closeDekstopPreview();
		//TSAutomationTester.closeAll();
	}
	
	@Test
	public void testOnMouseHoverPan()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverPan());
	}
	
	@Test
	public void testOnMouseHoverNavigateLinks()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverNavigateLinks());
	}
	
	@Test
	public void testOnMouseHoverMarqueeZoom()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverMarqueeZoom());
	}
	
	@Test
	public void testOnMouseHoverInteractiveZoom()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverInteractiveZoom());
	}
	
	@Test
	public void testOnMouseHoverZoomIn()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverZoomIn());
	}


	@Test
	public void testOnMouseHoverZoomOut()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverZoomOut());
	}


	@Test
	public void testOnMouseHoverZoomFit()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverZoomFit());
	}


	@Test
	public void testOnMouseHoverOverview()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverOverview());
	}
	
	@Test
	public void testOnMouseHoverHierarchicalLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverHierarchicalLayout());
	}


	@Test
	public void testOnMouseHoverOrthogonalLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverOrthogonalLayout());
	}
	
	@Test
	public void testOnMouseHoverRunAcyclicTest()
	{
	

		Assert.assertTrue(desktopTester.testOnMouseHoverRunAcyclicTest());
	}

	@Test
	public void testOnMouseHoverClearResults()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverClearResults());
	}
	
	@Test
	public void testHierarchicalLayout()
	{
		String expectedHierarchical= environment.projectImagesPath + File.separator + "AcyclicTestDesktopHierarchicalExpected.png";
		Assert.assertTrue(desktopTester.testHierarchicalLayout(expectedHierarchical));
		TSAutomationTester.orthogonalLayoutDesktop();
	}


	@Test
	public void testIsOverviewPresent()
	{
		Assert.assertTrue(desktopTester.testIsOverviewPresent());
	}


	@Test
	public void testIsRunAcyclicButtonEnable()
	{
		Assert.assertTrue(desktopTester.testIsRunAcyclicButtonEnable());
	}


	@Test
	public void testIsClearResultsButtonDisable()
	{
		Assert.assertTrue(desktopTester.testIsClearResultsButtonDisable());
	}


	@Test
	public void testRunAcyclicTest()
	{
		Assert.assertTrue(desktopTester.testRunAcyclicTest());
	}
	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;
	
	static int screenId;
	
	static TSDesktopPreviewTestCases desktopTester;
}

