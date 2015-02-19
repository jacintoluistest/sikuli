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

public class TSMicroWaveTransmissionHtml5PreviewTest
{
	@BeforeClass
	public static void setUp()
	{
		       // org.sikuli.basics.Debug.setDebugLevel(3);
				Settings.MoveMouseDelay = new Float(1.5);
				String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
				className = TSMaxFlowHtml5CanvasPreviewTest.class.getName();
				environment =
					new TSEnvironment("MicroWaveTransmission", TSEnvironment.HTML5_PREVIEW, defaultBrowser);
				TSAutomationTester = new TSTester(defaultBrowser);
				html5Tester =
					new TSHtml5PreviewTestCases(environment, TSAutomationTester, className);
				TSAutomationTester =
					TSFunctions.setHtml5Test(TSAutomationTester, "MicroWaveTransmissionProjectPath");
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
	public void testOnMouseHoverUndo()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverUndo());
	}
	
	@Test
	public void testOnMouseHoverRedo()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverRedo());
	}
	
	@Test
	public void testShowAbout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverShowAbout());
	}
	@Test
	public void testCircularLayout()
	{
	Assert.assertTrue(html5Tester.testCircularLayout());
	}
	
	@Test
	 public void testHierarchicalLayout()
	{
		Assert.assertTrue(html5Tester.testSymmetricLayout());
	}
	
	@Test
	 public void testSymmetricLayout()
	{
		Assert.assertTrue(html5Tester.testSymmetricLayout());
	}
	
	@Test
	public void testIsOverviewPresent()
	{
		Assert.assertTrue(html5Tester.testIsOverviewPresent());
	}
	
	@Test
	public void testSearch()
	{
		String searchCriteria="3720";
		String searchExpected=environment.projectImagesPath + File.separator +"searchExpected.png";
		String closeTreeNodeImagePath = environment.toolBarImagesPath + File.separator + "";
		Assert.assertTrue(html5Tester.testSearch(searchCriteria, searchExpected));
		TSFunctions.closeTreeNode(TSAutomationTester, closeTreeNodeImagePath);
		
	}
	
	@Test
	public void testDefaultTreeView()
	{
		Assert.assertTrue(html5Tester.testIsTreeViewPresent());
	}
	
	@Test
	public void testSettingsTreeView()
	{
		String filtersTreeViewTab = environment.projectImagesPath + File.separator + "Tabs" + File.separator + "settingsTreeViewTab.png";
		String filterTreeViewExpected=environment.projectImagesPath + File.separator + "settingsTreeViewExpected";
		String defaultTreeViewTab=environment.projectImagesPath + File.separator + "Tabs" + File.separator + "equipmentTreeViewTab.png";
		Assert.assertTrue(html5Tester.testIsTreeViewPresent(filtersTreeViewTab, filterTreeViewExpected, defaultTreeViewTab));
	}
	

	@Test
	public void testIsPresentInspectorView()
	{
		String nodeToSelect = environment.projectImagesPath + File.separator + "";
		String inspectorViewExpected =
			environment.projectImagesPath + File.separator + "inspectorViewExpected";
		html5Tester.testIsInspectorViewPresent(nodeToSelect, inspectorViewExpected);
	}
	
	@Test
	public void testConnectionsTableView()
	{
		String connectionTableViewTab="";
		String defaultTabView="";
		String expectedConnectionsTableView="";
		Assert.assertTrue(html5Tester.testIsTableViewPresent(connectionTableViewTab, expectedConnectionsTableView, defaultTabView));
	}
	
	@Test
	public void testAntennasTableView()
	{
		String antennasTableViewTab="";
		String defaultTabView="";
		String expectedAntennasTableView="";
		Assert.assertTrue(html5Tester.testIsTableViewPresent(antennasTableViewTab, expectedAntennasTableView, defaultTabView));
	}
	
	
	
	
	
	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;
	
	static TSHtml5PreviewTestCases html5Tester;
}
