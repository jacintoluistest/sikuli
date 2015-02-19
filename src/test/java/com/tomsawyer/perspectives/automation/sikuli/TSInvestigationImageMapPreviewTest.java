
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


public class TSInvestigationImageMapPreviewTest
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
	public void testOnMouseHoverCircularLayout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverCircularLayout());
	}


	@Test
	public void testOnMouseHoverHierarchical()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverHierarchicalLayoutSelected());
	}


	@Test
	public void testOnMouseHoverOrthogonalLayout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverOrthogonalLayout());
	}


	@Test
	public void testOnMouseHoverSymmetricLayout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverOrthogonalLayout());
	}


	@Test
	public void testOnMouseHoverGlobalLayout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverGlobalLayout());
	}


	@Test
	public void testOnMouseHoverIncrementalLayout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverIncrementalLayout());
	}


	@Test
	public void testOnMouseHoverShowAbout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverShowAbout());
	}


	@Test
	public void testCircularLayout()
	{
		Assert.assertTrue(imageMapTester.testCircularLayout());
	}


	@Test
	public void testOrthogonalLayout()
	{
		Assert.assertTrue(imageMapTester.testOrthogonalLayout());
	}


	@Test
	public void testSymmetricLayout()
	{
		Assert.assertTrue(imageMapTester.testSymmetricLayout());
	}


	@Test
	public void testSearch()
	{
		String searchCriteria = "Barbara";
		String searchExpected =
			environment.projectImagesPath + File.separator + "searchExpected.png";
		String closeTreeNodeImagePath =
			environment.toolBarImagesPath + File.separator + "";
		Assert.assertTrue(imageMapTester.testSearch(searchCriteria, searchExpected));
		TSFunctions.closeTreeNode(TSAutomationTester, closeTreeNodeImagePath);

	}


	@Test
	public void testDefaultTreeView()
	{
		Assert.assertTrue(imageMapTester.testIsTreeViewPresent());
	}


	@Test
	public void testFiltersTreeView()
	{
		String filtersTreeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "filterTreeViewTab.png";
		String filterTreeViewExpected =
			environment.projectImagesPath + File.separator + "filtersTreeViewExpected";
		String defaultTreeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "directoryTreeViewTab.png";
		Assert.assertTrue(imageMapTester.testIsTreeViewPresent(filtersTreeViewTab,
			filterTreeViewExpected,
			defaultTreeViewTab));
	}


	@Test
	public void testIsPresentInspectorView()
	{
		String nodeToSelect = environment.projectImagesPath + File.separator + "";
		String inspectorViewExpected =
			environment.projectImagesPath + File.separator + "inspectorViewExpected";
		imageMapTester.testIsInspectorViewPresent(nodeToSelect, inspectorViewExpected);
	}
	
	


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static TSImageMapPreviewTestCases imageMapTester;
}
