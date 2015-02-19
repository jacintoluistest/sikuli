package com.tomsawyer.perspectives.automation.sikuli;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSAutomationUtils;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSEnvironment;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSFunctions;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSHtml5PreviewTestCases;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSTester;

public class TSWorldCupHtml5PreviewTest
{
	@BeforeClass
	public static void setUp()
	{
		       // org.sikuli.basics.Debug.setDebugLevel(3);
				Settings.MoveMouseDelay = new Float(1.5);
				String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
				className = TSWorldCupHtml5PreviewTest.class.getName();
				environment =
					new TSEnvironment("WorldCup", TSEnvironment.HTML5_PREVIEW, defaultBrowser);
				TSAutomationTester = new TSTester(defaultBrowser);
				html5Tester =
					new TSHtml5PreviewTestCases(environment, TSAutomationTester, className);
				TSAutomationTester =
					TSFunctions.setHtml5Test(TSAutomationTester, "WorldCupProjectPath");
				environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);
	}
	
	@AfterClass
	public static void closeAll()
	{
		TSAutomationTester.fullScreenBrowser();
		TSAutomationTester.closeCurrentBrowser();
		TSAutomationTester.closeAll();
	}
	
	@Test
	public void testOnMouseHoverSaveAs()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverSaveAsImage());
	}


	@Test
	public void testOnMouseHoverPrintSetUp()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverPrintSetUp());
	}


	@Test
	public void testOnMouseHoverPrintPreview()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverPrintPreview());
	}

	@Test
	public void testOnMouseHoverSelect()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverSelect());
	}
	
	@Test
	public void testOnMouseHoverPan()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverPan());
	}


	@Test
	public void testOnMouseHoverNavigateLinks()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverNavigateLinks());
	}


	@Test
	public void testOnMouseHoverMarqueeZoom()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverMarqueeZoom());
	}


	@Test
	public void testOnMouseHoverInteractiveZoom()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverInteractiveZoom());
	}


	@Test
	public void testOnMouseHoverZoomIn()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverZoomIn());
	}


	@Test
	public void testOnMouseHoverZoomOut()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverZoomOut());
	}


	@Test
	public void testOnMouseHoverZoomFit()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverZoomFit());
	}


	@Test
	public void testOnMouseHoverOverview()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverOverview());
	}


	@Test
	public void testOnMouseHoverOrthogonalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverOrthogonalLayout());
	}


	@Test
	public void testOnMouseHoverSymmetric()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverSymmetricLayoutSelected());
	}


	@Test
	public void testOnMouseHoverGlobalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverGlobalLayout());
	}


	@Test
	public void testOnMouseHoverIncrementalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverIncrementalLayout());
	}


	@Test
	public void testIsOverviewPresent()
	{
		Assert.assertTrue(html5Tester.testIsOverviewPresent());
	}


	@Test
	public void testOrthogonalLayout()
	{
		Assert.assertTrue(html5Tester.testOrthogonalLayout());
	}


	@Test
	public void testIsTreeViewPresent()
	{
		Assert.assertTrue(html5Tester.testIsTreeViewPresent());
	}


	@Test
	public void testSearch()
	{
		String searchCriteria = "Mx";
		String searchExpectedImagePath = "";
		Assert.assertTrue(html5Tester.testSearch(searchCriteria,
			searchExpectedImagePath));
	}
	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;
	
	static TSHtml5PreviewTestCases html5Tester;
}
