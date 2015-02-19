
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


public class TSTopologicalSortHtml5PreviewTest
{
	@BeforeClass
	public static void setUp()
	{
		// org.sikuli.basics.Debug.setDebugLevel(3);
		Settings.MoveMouseDelay = new Float(1.5);
		String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
		className = TSMaxFlowHtml5CanvasPreviewTest.class.getName();
		environment =
			new TSEnvironment("RootCause", TSEnvironment.HTML5_PREVIEW, defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);
		html5Tester =
			new TSHtml5PreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester =
			TSFunctions.setHtml5Test(TSAutomationTester, "RootCausePath");
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
	public void testOnMouseHoverGlobalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverGlobalLayout());
	}


	@Test
	public void testOnMouseHoverIncrementalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverIncrementalLayout());
	}


	@Test
	public void testOnMouseHoverClearResults()
	{

		Assert.assertTrue(html5Tester.testOnMouseHoverClearResults());
	}


	@Test
	public void testOnMouseHoverCreateTask()
	{

		Assert.assertTrue(html5Tester.testOnMouseHoverCreateTask());
	}


	@Test
	public void testOnMouseHoverCreateDependency()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverCreateDependency());
	}


	@Test
	public void testOnMouseHoverRunTopologicalSort()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverRunTopologicalResult());
	}


	@Test
	public void testIsOverviewPresent()
	{
		Assert.assertTrue(html5Tester.testIsOverviewPresent());

	}


	@Test
	public void testButtonsState()
	{
		Assert.assertTrue(html5Tester.testTopologicalResortButtonsState());
	}


	@Test
	public void testRunTopologicalResort()
	{
		String drawExpected = "";
		String tableViewExpected = "";
		String treeViewExpected = "";

		Assert.assertTrue(html5Tester.testRunTopologicalResort(drawExpected,
			tableViewExpected,
			treeViewExpected));
	}


	@Test
	public void testDisplaySettingsTreeView()
	{
		String treeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "displaySettings.png";
		String treeViewExpected =
			environment.projectImagesPath + File.separator
				+ "displaySettingsTreeView.png";
		String defaultTreeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "analysisResults.png";
		Assert.assertTrue(html5Tester.testIsTreeViewPresent(treeViewTab,
			treeViewExpected,
			defaultTreeViewTab));

	}


	@Test
	public void testAssigmentsTreeView()
	{
		String treeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "assigments.png";
		String treeViewExpected =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "assigmentsTreeView.png";
		String defaultTreeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "analysisResults.png";
		Assert.assertTrue(html5Tester.testIsTreeViewPresent(treeViewTab,
			treeViewExpected,
			defaultTreeViewTab));

	}


	@Test
	public void testCategoriesTreeView()
	{

		String treeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "categories.png";
		String treeViewExpected =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "categoriesTreeView.png";
		String defaultTreeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "analysisResults.png";
		Assert.assertTrue(html5Tester.testIsTreeViewPresent(treeViewTab,
			treeViewExpected,
			defaultTreeViewTab));
	}


	@Test
	public void testPeopleTableView()
	{
		String tableViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "people.png";
		String defaultTableViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "tasks.png";
		String tableViewExpected =
			environment.projectImagesPath + File.separator
				+ "peopleTableViewExpected.png";
		Assert.assertTrue(html5Tester.testIsTableViewPresent(tableViewTab,
			tableViewExpected,
			defaultTableViewTab));

	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static TSHtml5PreviewTestCases html5Tester;
}
