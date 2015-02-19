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
import com.tomsawyer.perspectives.automation.sikuli.tests.TSHtml5PreviewTestCases;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSTester;

public class TSProcessDesignHtml5PreviewTest
{
	@BeforeClass
	public static void setUp()
	{
		       // org.sikuli.basics.Debug.setDebugLevel(3);
				Settings.MoveMouseDelay = new Float(1.5);
				String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
				className = TSMaxFlowHtml5CanvasPreviewTest.class.getName();
				environment =
					new TSEnvironment("AcyclicTest", TSEnvironment.HTML5_PREVIEW, defaultBrowser);
				TSAutomationTester = new TSTester(defaultBrowser);
				html5Tester =
					new TSHtml5PreviewTestCases(environment, TSAutomationTester, className);
				TSAutomationTester =
					TSFunctions.setHtml5Test(TSAutomationTester, "AcyclicTestProjectPath");
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
	public void testOnMouseHoverHierarchicalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverHierarchicalLayoutSelected());
	}
	
	@Test
	public void testOnMouseHoverOrthogonalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverOrthogonalLayout());
		
	}
	
	@Test
	public void testOnMouseHoverGlobalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverGlobalLayout());
	}
	
	@Test
	public void testOnMouseHoverShowAbout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverShowAbout());
	}
	 
	@Test
	public void testIsTreeViewPresent()
	{
		Assert.assertTrue(html5Tester.testIsTreeViewPresent());
	}
	
	@Test
	public void testIsActionsTreeViewPresent()
	{
		String actionsTreeViewTab = environment.projectImagesPath + File.separator + "Tabs" + File.separator + "actionsTab.png";
		String defaultTreeViewTab =  environment.projectImagesPath + File.separator + "Tabs" + File.separator + "rolesTab.png";
		String actionsTreeViewExpected =  environment.projectImagesPath + File.separator + "actionsTreeViewExpected.png";
		
		Assert.assertTrue(html5Tester.testIsTreeViewPresent(actionsTreeViewTab, actionsTreeViewExpected, defaultTreeViewTab));
		
	}
	
	@Test
	public void testSearch()
	{
		String searchCriteria = "ReceiveExternalOrder";
		String searchExpected = environment.projectImagesPath + File.separator + "searchExpected.png";
		Assert.assertTrue(html5Tester.testSearch(searchCriteria, searchExpected));
	}
	
	@Test
	public void testInspectorView()
	{
		String nodeSelected =environment.projectImagesPath+ File.separator + "nodeSelected.png";
		String inspectorViewExpected = environment.projectImagesPath + File.separator + "InspectorViewPresent.png";
		Assert.assertTrue(html5Tester.testIsInspectorViewPresent(nodeSelected, inspectorViewExpected));
	}
	
	@Test
	public void testDefaultButtonsState()
	{
		Assert.assertTrue(html5Tester.testProcessDesignButtonsState());	
	}
	@Test
	public void testSubProcessButtonsState()
	{
		Assert.assertTrue(html5Tester.testProcessDesignButtonStateSubProcess());
		
	}
	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;
	
	static TSHtml5PreviewTestCases html5Tester;
}
