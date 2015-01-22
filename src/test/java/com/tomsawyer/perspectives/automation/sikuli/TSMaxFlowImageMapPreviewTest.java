package com.tomsawyer.perspectives.automation.sikuli;
import java.io.File;

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


public class TSMaxFlowImageMapPreviewTest
{
	@BeforeClass
	public static void setUp()
	{
		// org.sikuli.basics.Debug.setDebugLevel(3);

		Settings.MoveMouseDelay = new Float(1.5);
		String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
		className = TSMaxFlowImageMapPreviewTest.class.getName();
		environment =
			new TSEnvironment("MaxFlow", TSEnvironment.IMAGEMAP_PREVIEW, defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);
		imageMapTester =
			new TSImageMapPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester =
			TSFunctions.setImageMapTest(TSAutomationTester, "MaxFlowProjectPath");
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
	public void testOnMouseHoverSelect()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverSelect());
	}


	@Test
	public void testOnMouseHoverSaveAs()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverSaveAsImage());
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
		String hierarchicalButtonPath =
			environment.toolBarImagesPath + File.separator
				+ "HierarchicalLayoutSelectedImageMap.png";
		Assert.assertTrue(imageMapTester.testOnMouseHoverHierarchicalLayout(hierarchicalButtonPath));
	}


	@Test
	public void testOnMouseHoverGlobalLayout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverGlobalLayout());
	}


	@Test
	public void testOnMouseHoverIncrementallLayout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverIncrementalLayout());
	}


	@Test
	public void testOnMouseHoverSetSourceNode()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverSetSourceNode());
	}


	@Test
	public void testOnMouseHoverSetSinkNode()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverSetSinkNode());
	}


	public void testOnMouseHoverRunMaximumFlow()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverRunMaximumFlow());
	}


	public void testOnMouseHoverClearResults()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverClearResults());

	}


	@Test
	public void testRunMaxFlow()
	{
		String layoutExpected =
			environment.projectImagesPath + File.separator + "MaxFlowExpected.png";
		String viewExpected =
			environment.projectImagesPath + File.separator + "TreeViewMaxFlow.png";
		Assert.assertTrue(imageMapTester.runMaximumImageMap(layoutExpected, viewExpected));
	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static String projectName;

	static TSImageMapPreviewTestCases imageMapTester;
}
