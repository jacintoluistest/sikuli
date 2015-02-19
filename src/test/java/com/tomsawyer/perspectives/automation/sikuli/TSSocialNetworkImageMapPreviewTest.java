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


public class TSSocialNetworkImageMapPreviewTest
{

	@BeforeClass
	public static void setUp()
	{
		//org.sikuli.basics.Debug.setDebugLevel(3);
		Settings.MoveMouseDelay = new Float(1.5);
		String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
		className = TSSocialNetworkHtml5PreviewTest.class.getName();
		environment =
			new TSEnvironment("SocialNetworkAnalysis",
				TSEnvironment.IMAGEMAP_PREVIEW,
				defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);
		ImageMapTester =
			new TSImageMapPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester =
			TSFunctions.setHtml5Test(TSAutomationTester, "SocialNetworkProjectPath");
		environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);
	}


	@AfterClass
	public static void closeAll()
	{
		TSAutomationTester.closeCurrentBrowser();
		TSAutomationTester.closeAll();
	}


	@Test
	public void testIsPresentToolBar()
	{
		Assert.assertTrue(ImageMapTester.testIsPresentToolBar());
	}


	@Test
	public void testIsTableViewPresent()
	{

		Assert.assertTrue(ImageMapTester.testIsTableViewPresent());
	}


	@Test
	public void testIsTreeViewPresent()
	{

		Assert.assertTrue(ImageMapTester.testIsTreeViewPresent());
	}


	@Test
	public void testOnMouseHoverSaveAs()
	{

		Assert.assertTrue(ImageMapTester.testOnMouseHoverSaveAsImage());
	}


	@Test
	public void testOnMouseHoverPan()
	{
		Assert.assertTrue(ImageMapTester.testOnMouseHoverPan());
	}


	@Test
	public void testOnMouseHoverMarqueeZoom()
	{

		Assert.assertTrue(ImageMapTester.testOnMouseHoverMarqueeZoom());

	}


	@Test
	public void testOnMouseHoverZoomIn()
	{
		Assert.assertTrue(ImageMapTester.testOnMouseHoverZoomIn());
	}


	@Test
	public void testOnMouseHoverZoomOut()
	{
		Assert.assertTrue(ImageMapTester.testOnMouseHoverZoomOut());
	}


	@Test
	public void testOnMouseHoverZoomFit()
	{
		Assert.assertTrue(ImageMapTester.testOnMouseHoverZoomFit());
	}


	@Test
	public void testOnMouseHoverOverview()
	{
		Assert.assertTrue(ImageMapTester.testOnMouseHoverOverview());
	}


	@Test
	public void testOnMouseHoverCircularLayout()
	{

		Assert.assertTrue(ImageMapTester.testOnMouseHoverCircularLayout());

	}


	@Test
	public void testOnMouseHoverHierarchicalLayout()
	{
		Assert.assertTrue(ImageMapTester.testOnMouseHoverHierarchicalLayout());
	}


	@Test
	public void testOnMouseHoverOrthogonalLayout()
	{
		Assert.assertTrue(ImageMapTester.testOnMouseHoverOrthogonalLayout());
	}


	@Test
	public void testOnMouseHoverSymmetricLayout()
	{
		Assert.assertTrue(ImageMapTester.testOnMouseHoverSymmetricLayout());
	}


	@Test
	public void testOnMouseHoverGlobalLayout()
	{

		Assert.assertTrue(ImageMapTester.testOnMouseHoverGlobalLayout());

	}


	@Test
	public void testOnMouseHoverIncrementalLayout()
	{
		Assert.assertTrue(ImageMapTester.testOnMouseHoverIncrementalLayout());
	}


	@Test
	public void testOnMouseHoverBetweenCentralityLayout()
	{

		Assert.assertTrue(ImageMapTester.testOnMouseHoverBetweenCentralityLayout());
	}


	@Test
	public void testOnMouseHoverClosenessCentralityLayout()
	{

		Assert.assertTrue(ImageMapTester.testOnMouseHoverClosenessCentralityLayout());
	}


	@Test
	public void testOnMouseHoverDegreeCentralityLayout()
	{

		Assert.assertTrue(ImageMapTester.testOnMouseHoverDegreeCentralityLayout());
	}


	@Test
	public void testOnMouseHoverEigenVectorCentralityLayout()
	{
		Assert.assertTrue(ImageMapTester.testOnMouseHoverEigenVectorCentralityLayout());

	}


	@Test
	public void testIsOverviewPresent()
	{

		Assert.assertTrue(ImageMapTester.testIsOverviewPresent());

	}


	@Test
	public void testCircularLayout()
	{
		Assert.assertTrue(ImageMapTester.testCircularLayout());
	}


	@Test
	public void testHierarchicalLayout()
	{
		Assert.assertTrue(ImageMapTester.testHierarchicalLayout());
	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static TSImageMapPreviewTestCases ImageMapTester;

	static int screenId;

}
