package com.tomsawyer.perspectives.automation.sikuli;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSAutomationUtils;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSEnvironment;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSFunctions;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSImageMapPreviewTestCases;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSTester;


public class TSTesterFunctionality
{

	@BeforeClass
	public static void setUp()
	{

		className = TSTesterFunctionality.class.getName();
		Settings.MoveMouseDelay = new Float(1.5);
		String defaultBrowser =TSAutomationUtils.getProperty("DefaultBrowser");
		environment =
			new TSEnvironment("AcyclicTest", TSEnvironment.IMAGEMAP_PREVIEW,defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);		
		imageMapTester = new TSImageMapPreviewTestCases(environment, TSAutomationTester, className);
		environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);
		TSAutomationUtils.pauseScript();
		
	}
	
	@AfterClass
	public static void closeAll()
	{
		// TSAutomationTester.fullScreenBrowser();
		// TSAutomationTester.closeCurrentBrowser();
		// TSAutomationTester.closeAll();
	}



	@Test
	public void testOnMouseHoverPan()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverPan());
	}


	@Test
	public void testOnMouseHoverMarqueeZoom()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverMarqueeZoom());

	}


	@Test
	public void testOnMouseHoverZoomIn()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverZoomIn());

	}


	@Test
	public void testOnMouseHoverZoomOut()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverZoomOut());
	}


	@Test
	public void testOnMouseHoverZoomFit()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverZoomFit());

	}


	@Test
	public void testOnMouseHoverOverview()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverOverview());
	}


	@Test
	public void testOnMouseHoverHierarchicalLayout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverHierarchicalLayout());
	}


	@Test
	public void testOnMouseHoverRunAcyclicTest()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverRunAcyclicTest());
	}


	@Test
	public void testIsRunAcyclicButtonEnable()
	{

		Assert.assertTrue(imageMapTester.testIsRunAcyclicButtonEnable());
	}


	@Test
	public void testIsClearResultsButtonDisable()
	{

		Assert.assertTrue(imageMapTester.testIsClearResultsButtonDisable());
	}


	@Test
	public void testRunAcyclicTest()
	{
		Assert.assertTrue(imageMapTester.testRunAcyclicTest());
	}


	@Test
	public void testHierarchicalLayout()
	{
		Assert.assertTrue(imageMapTester.testHierarchicalLayout());
	}


	@Test
	public void testOnMouseHoverOrthogonalLayout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverOrthogonalLayout());

	}


	@Test
	public void testOnMouseHoverSelect()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverSelect());

	}


	@Test
	public void testIsOverviewPresent()
	{
		Assert.assertTrue(imageMapTester.testIsOverviewPresent());
	}


	@Test
	public void testOnMouseHoverClearResults()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverClearResults());
	}

	
	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;
	
	static TSImageMapPreviewTestCases imageMapTester;

}
