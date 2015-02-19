
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


public class TSMicroWaveTransmissionDesktopPreviewTest
{

	@BeforeClass
	public static void setUp() throws Exception
	{
		// org.sikuli.basics.Debug.setDebugLevel(3);
		className = TSMSliceDesktopPreviewTest.class.getName();
		Settings.MoveMouseDelay = new Float(2.5);

		environment = new TSEnvironment("AcyclicTest", TSEnvironment.DESKTOP_PREVIEW);
		TSAutomationTester = new TSTester();
		desktopTester =
			new TSDesktopPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester =
			TSFunctions.setDesktopTest(TSAutomationTester, "AcyclicTestProjectPath");
		environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);
	}


	@AfterClass
	public static void closeAll()
	{
		TSAutomationTester.closeDekstopPreview();
		// TSAutomationTester.closeAll();
	}
	
	@Test
	public void testOnMouseHoverSaveAs()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverSaveAs());
	}


	@Test
	public void testOnMouseHoverPrintSetUp()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverPrintSetUp());
	}


	@Test
	public void testOnMouseHoverPrintPreview()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverPrintPreview());
	}


	@Test
	public void testOnMouseHoverPrint()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverPrint());
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


	@Test
	public void testOnMouseHoverOverview()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverOverview());
	}
	
	@Test
	public void testOnMouseHoverUndo()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverUndo());
	}
	
	@Test
	public void testOnMouseHoverRedo()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverRedo());
	}
	
	@Test
	public void testShowAbout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverShowAbout());
	}
	@Test
	public void testCircularLayout()
	{
	Assert.assertTrue(desktopTester.testCircularLayout());
	}
	
	@Test
	 public void testHierarchicalLayout()
	{
		Assert.assertTrue(desktopTester.testSymmetricLayout());
	}
	
	@Test
	 public void testSymmetricLayout()
	{
		Assert.assertTrue(desktopTester.testSymmetricLayout());
	}
	
	@Test
	public void testIsOverviewPresent()
	{
		Assert.assertTrue(desktopTester.testIsOverviewPresent());
	}
	
	@Test
	public void testSearch()
	{
		String searchCriteria="3720";
		String searchExpected=environment.projectImagesPath + File.separator +"searchExpected.png";
		String closeTreeNodeImagePath = environment.toolBarImagesPath + File.separator + "";
		Assert.assertTrue(desktopTester.testSearch(searchCriteria, searchExpected));
		TSFunctions.closeTreeNode(TSAutomationTester, closeTreeNodeImagePath);
		
	}
	
	@Test
	public void testDefaultTreeView()
	{
		Assert.assertTrue(desktopTester.testIsTreeViewPresent());
	}
	
	@Test
	public void testSettingsTreeView()
	{
		String filtersTreeViewTab = environment.projectImagesPath + File.separator + "Tabs" + File.separator + "settingsTreeViewTab.png";
		String filterTreeViewExpected=environment.projectImagesPath + File.separator + "settingsTreeViewExpected";
		String defaultTreeViewTab=environment.projectImagesPath + File.separator + "Tabs" + File.separator + "equipmentTreeViewTab.png";
		Assert.assertTrue(desktopTester.testIsTreeViewPresent(filtersTreeViewTab, filterTreeViewExpected, defaultTreeViewTab));
	}
	

	@Test
	public void testIsPresentInspectorView()
	{
		String nodeToSelect = environment.projectImagesPath + File.separator + "";
		String inspectorViewExpected =
			environment.projectImagesPath + File.separator + "inspectorViewExpected";
		desktopTester.testIsInspectorViewPresent(nodeToSelect, inspectorViewExpected);
	}
	
	@Test
	public void testConnectionsTableView()
	{
		String connectionTableViewTab="";
		String defaultTabView="";
		String expectedConnectionsTableView="";
		Assert.assertTrue(desktopTester.testIsTableViewPresent(connectionTableViewTab, expectedConnectionsTableView, defaultTabView));
	}
	
	@Test
	public void testAntennasTableView()
	{
		String antennasTableViewTab="";
		String defaultTabView="";
		String expectedAntennasTableView="";
		Assert.assertTrue(desktopTester.testIsTableViewPresent(antennasTableViewTab, expectedAntennasTableView, defaultTabView));
	}
	
	
	
	
	


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static TSDesktopPreviewTestCases desktopTester;
}
