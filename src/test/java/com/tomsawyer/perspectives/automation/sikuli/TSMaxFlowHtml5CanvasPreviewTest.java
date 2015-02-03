package com.tomsawyer.perspectives.automation.sikuli;
import java.io.File;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.sikuli.basics.Settings;

import com.tomsawyer.perspectives.automation.sikuli.tests.TSAutomationUtils;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSEnvironment;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSFunctions;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSHtml5PreviewTestCases;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSTester;


public class TSMaxFlowHtml5CanvasPreviewTest
{

	@BeforeClass
	public static void setUp()
	{
		// org.sikuli.basics.Debug.setDebugLevel(3);

		Settings.MoveMouseDelay = new Float(1.5);
		String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
		className = TSMaxFlowHtml5CanvasPreviewTest.class.getName();
		environment =
			new TSEnvironment("MaxFlow", TSEnvironment.HTML5_PREVIEW, defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);
		html5Tester =
			new TSHtml5PreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester =
			TSFunctions.setHtml5Test(TSAutomationTester, "MaxFlowProjectPath");
		environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);

	}


	@Test
	public void testOnMouseHoverSelect()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverSelect());
	}


	@Test
	public void testOnMouseHoverSaveAs()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverSaveAsImage());
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
	public void testOnMouseHoverHierarchicalLayout()
	{
		String hierarchicalButtonPath =
			environment.toolBarImagesPath + File.separator
				+ "HierarchicalLayoutSelectedCanvas.png";
		Assert.assertTrue(html5Tester.testOnMouseHoverHierarchicalLayout(hierarchicalButtonPath));
	}


	@Test
	public void testOnMouseHoverGlobalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverGlobalLayout());
	}


	@Test
	public void testOnMouseHoverIncrementallLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverIncrementalLayout());
	}


	@Test
	public void testOnMouseHoverSetSourceNode()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverSetSinkNode());
	}

	@Test
	public void testOnMouseHoverSetSinNode()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverSetSinkNode());
	}

	@Test
	public void testOnMouseHoverRunMaximumFlow()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverRunMaximumFlow());
	}

	@Test
	public void testOnMouseHoverClearResults()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverClearResults());

	}
	
	@Test
	public  void testRunMaxFlowHtml5()
	{
		String layoutExpected = environment.projectImagesPath + File.separator + "MaxFlowExpected.png";
		String viewExpected = environment.projectImagesPath + File.separator + "TreeViewMaxFlow.png";
		Assert.assertTrue(html5Tester.runMaximumFlowHtml5(layoutExpected,viewExpected));
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

	static String projectName;

	static TSHtml5PreviewTestCases html5Tester;

}
