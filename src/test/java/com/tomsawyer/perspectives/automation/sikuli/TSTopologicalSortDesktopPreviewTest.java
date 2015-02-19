
package com.tomsawyer.perspectives.automation.sikuli;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;
import java.io.File;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSDesktopPreviewTestCases;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSEnvironment;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSFunctions;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSTester;


public class TSTopologicalSortDesktopPreviewTest
{
	@BeforeClass
	public static void setUp() throws Exception
	{
		// org.sikuli.basics.Debug.setDebugLevel(3);
		className = TSMSliceDesktopPreviewTest.class.getName();
		Settings.MoveMouseDelay = new Float(2.5);

		environment = new TSEnvironment("TopologicalSort", TSEnvironment.DESKTOP_PREVIEW);
		TSAutomationTester = new TSTester();
		desktopTester =
			new TSDesktopPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester =
			TSFunctions.setDesktopTest(TSAutomationTester, "TopologicalSortProjectPath");
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
	public void testOnMouseHoverClearResults()
	{

		Assert.assertTrue(desktopTester.testOnMouseHoverClearResults());
	}


	@Test
	public void testOnMouseHoverCreateTask()
	{

		Assert.assertTrue(desktopTester.testOnMouseHoverCreateTask());
	}


	@Test
	public void testOnMouseHoverCreateDependency()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverCreateDependency());
	}


	@Test
	public void testOnMouseHoverRunTopologicalSort()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverRunTopologicalResult());
	}


	@Test
	public void testIsOverviewPresent()
	{
		Assert.assertTrue(desktopTester.testIsOverviewPresent());

	}


	@Test
	public void testButtonsState()
	{
		Assert.assertTrue(desktopTester.testTopologicalResortButtonsState());
	}


	@Test
	public void testRunTopologicalResort()
	{
		String drawExpected = "";
		String tableViewExpected = "";
		String treeViewExpected = "";

		Assert.assertTrue(desktopTester.testRunTopologicalResort(drawExpected,
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
		Assert.assertTrue(desktopTester.testIsTreeViewPresent(treeViewTab,
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
		Assert.assertTrue(desktopTester.testIsTreeViewPresent(treeViewTab,
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
		Assert.assertTrue(desktopTester.testIsTreeViewPresent(treeViewTab,
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
		Assert.assertTrue(desktopTester.testIsTableViewPresent(tableViewTab,
			tableViewExpected,
			defaultTableViewTab));

	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static TSDesktopPreviewTestCases desktopTester;
}
