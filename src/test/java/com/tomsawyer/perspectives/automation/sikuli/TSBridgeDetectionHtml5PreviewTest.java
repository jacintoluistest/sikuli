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

public class TSBridgeDetectionHtml5PreviewTest
{
	@BeforeClass
	public static void setUp()
	{
		// org.sikuli.basics.Debug.setDebugLevel(3);
		Settings.MoveMouseDelay = new Float(1.5);
		String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
		className = TSMaxFlowHtml5CanvasPreviewTest.class.getName();
		environment =
			new TSEnvironment("BridgeDetection",
				TSEnvironment.HTML5_PREVIEW,
				defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);
		html5Tester =
			new TSHtml5PreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester =
			TSFunctions.setHtml5Test(TSAutomationTester, "BridgeDetectionPath");
		environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);
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
	public void testOnMOuseHoverMarqueeZoom()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverMarqueeZoom());
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
	public void testOnMOuseHoverOverview()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverOverview());
	}
	
	
	@Test
	public void testOnMouseHoverCircularLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverCircularLayout());
	}


	@Test
	public void testOnMouseHoverHierarchicalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverHierarchicalLayout());
	}


	@Test
	public void testOnMouseHoverOrthogonalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverOrthogonalLayout());
	}


	@Test
	public void testOnMouseHoverSymmetricLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverSymmetricLayout());
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


	public void testCircularLayout()
	{
		Assert.assertTrue(html5Tester.testCircularLayout());
	}


	@Test
	public void testHierarchicalLayout()
	{
		Assert.assertTrue(html5Tester.testHierarchicalLayout());
	}


	@Test
	public void testOrthogonalLayout()
	{
		Assert.assertTrue(html5Tester.testOrthogonalLayout());
	}


	public void testSymmetricLayout()
	{
		Assert.assertTrue(html5Tester.testSymmetricLayout());
	}

	@AfterClass
	public static void closeAll()
	{
		TSAutomationTester.fullScreenBrowser();
		TSAutomationTester.closeCurrentBrowser();
		TSAutomationTester.closeAll();
	}
	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static TSHtml5PreviewTestCases html5Tester;

}
