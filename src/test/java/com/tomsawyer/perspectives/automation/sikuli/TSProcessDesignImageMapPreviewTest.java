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

public class TSProcessDesignImageMapPreviewTest
{
	@BeforeClass
	public static void setUp()
	{
		Settings.MoveMouseDelay = new Float(1.5);
		String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
		className = TSAcyclicImageMapPreviewTest.class.getName();
		environment =
			new TSEnvironment("AcyclicTest",
				TSEnvironment.IMAGEMAP_PREVIEW,
				defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);
		imageMapTester =
			new TSImageMapPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester =
			TSFunctions.setImageMapTest(TSAutomationTester, "AcyclicTestProjectPath");
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
		Assert.assertTrue(imageMapTester.testOnMouseHoverSaveAsImage());
		
	}
	
	@Test
	public void testOnMouseHoverPrintSetUp()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverPrintSetUp());
	}
	
	@Test
	public void testOnMouseHoverPrintPreview()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverPrintPreview());
	}
	
	
	@Test
	public void testOnMouseHoverSelect()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverSelect());
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
	public void testOnMouseHoverInteractiveZoom()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverInteractiveZoom());
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
		Assert.assertTrue(imageMapTester.testOnMouseHoverHierarchicalLayoutSelected());
	}
	
	@Test
	public void testOnMouseHoverOrthogonalLayout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverOrthogonalLayout());
		
	}
	
	@Test
	public void testOnMouseHoverGlobalLayout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverGlobalLayout());
	}
	
	@Test
	public void testOnMouseHoverShowAbout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverShowAbout());
	}
	 
	@Test
	public void testIsTreeViewPresent()
	{
		Assert.assertTrue(imageMapTester.testIsTreeViewPresent());
	}
	
	@Test
	public void testIsActionsTreeViewPresent()
	{
		String actionsTreeViewTab = environment.projectImagesPath + File.separator + "Tabs" + File.separator + "actionsTab.png";
		String defaultTreeViewTab =  environment.projectImagesPath + File.separator + "Tabs" + File.separator + "rolesTab.png";
		String actionsTreeViewExpected =  environment.projectImagesPath + File.separator + "actionsTreeViewExpected.png";
		
		Assert.assertTrue(imageMapTester.testIsTreeViewPresent(actionsTreeViewTab, actionsTreeViewExpected, defaultTreeViewTab));
		
	}
	
	@Test
	public void testSearch()
	{
		String searchCriteria = "ReceiveExternalOrder";
		String searchExpected = environment.projectImagesPath + File.separator + "searchExpected.png";
		Assert.assertTrue(imageMapTester.testSearch(searchCriteria, searchExpected));
	}
	
	@Test
	public void testInspectorView()
	{
		String nodeSelected =environment.projectImagesPath+ File.separator + "nodeSelected.png";
		String inspectorViewExpected = environment.projectImagesPath + File.separator + "InspectorViewPresent.png";
		Assert.assertTrue(imageMapTester.testIsInspectorViewPresent(nodeSelected, inspectorViewExpected));
	}
	
	@Test
	public void testDefaultButtonsState()
	{
		Assert.assertTrue(imageMapTester.testProcessDesignButtonsState());	
	}
	@Test
	public void testSubProcessButtonsState()
	{
		Assert.assertTrue(imageMapTester.testProcessDesignButtonStateSubProcess());
		
	}
	
	
	
	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static TSImageMapPreviewTestCases imageMapTester;
}
