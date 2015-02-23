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

public class TSBiconnectedComponentsDesktopPreview
{
	@BeforeClass
	public static void setUp() throws Exception
	{
		// org.sikuli.basics.Debug.setDebugLevel(3);
		className = TSBiconnectedComponentsDesktopPreview.class.getName();
		Settings.MoveMouseDelay = new Float(2.5);

		environment =
			new TSEnvironment("BiconnectedComponents", TSEnvironment.DESKTOP_PREVIEW);
		TSAutomationTester = new TSTester();
		desktopTester =
			new TSDesktopPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester =
			TSFunctions.setDesktopTest(TSAutomationTester,
				"BiconnectedComponentsProjectPath");
		environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);
	}


	@AfterClass
	public static void closeAll()
	{
		//TSAutomationTester.closeDekstopPreview();
		// TSAutomationTester.closeAll();
	}
	
	@Test
	public void testOnMouseHoverSaveAs()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverSaveAs());
	}
	

	@Test
	public void testOnMouseHoverSelect()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverSelect());
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
	
	public void testOnMouseHoverOverview()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverOverview());
	}
	
	@Test
	public void testOnMouseHoverCircularLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverCircularLayout());
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
	public void testOnMouseHoverSymmetricLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverSymmetricLayoutSelected());
	}

	@Test
	public void testOnMouseHoverGlobalLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverGlobalLayout());
	}
	
	@Test
	public void testOnMouseHoverIncrementalLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverIncrementalLayout());
	}
	
	@Test
	public void testOnMouseHoverRunBiconnectedAnalysis()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverRunBiconnectedComponentsAnalysis());
	}
	
	@Test
	public void testOnMouseHoverClearResults()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverClearResults());
	}
	
	@Test
	public void testIsOverviewPresent()
	{
		Assert.assertTrue(desktopTester.testIsOverviewPresent());
	}
	
	@Test
	public void testCircularLayout()
	{
		Assert.assertTrue(desktopTester.testCircularLayout());
	}
	
	@Test
	public void testOrthogonalLayout()
	{		
		Assert.assertTrue(desktopTester.testOrthogonalLayout());
	}
	
	@Test
	public void testHierarchicalLayout()
	{
		Assert.assertTrue(desktopTester.testHierarchicalLayout());
	}
	
	@Test
	public void runBiconnectedComponents()
	{
		String drawExpected = environment.projectImagesPath + File.separator + "drawExpected.png";
		String treeViewExpected = environment.projectImagesPath + File.separator + "treeViewExpected.png";
		String toolBarExpected = environment.projectImagesPath + File.separator + "toolBarExpected.png";
		
		Assert.assertTrue(desktopTester.runBiconnectedComponents(drawExpected, treeViewExpected, toolBarExpected));
	}

	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static TSDesktopPreviewTestCases desktopTester;
}
