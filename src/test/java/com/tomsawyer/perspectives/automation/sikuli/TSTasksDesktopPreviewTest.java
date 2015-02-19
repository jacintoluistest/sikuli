
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


public class TSTasksDesktopPreviewTest
{
	@BeforeClass
	public static void setUp() throws Exception
	{
		// org.sikuli.basics.Debug.setDebugLevel(3);
		className = TSMSliceDesktopPreviewTest.class.getName();
		Settings.MoveMouseDelay = new Float(2.5);

		environment = new TSEnvironment("PeriodicTable", TSEnvironment.DESKTOP_PREVIEW);
		TSAutomationTester = new TSTester();
		desktopTester =
			new TSDesktopPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester =
			TSFunctions.setDesktopTest(TSAutomationTester, "PeriodicTableProjectPath");
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
		Assert.assertTrue(desktopTester.testOnMouseHoverPrint());
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
	public void testOnMouseHoverDelete()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverDeleteDisabled());
	}


	@Test
	public void testOnMouseHoverShowAbout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverShowAbout());
	}


	@Test
	public void testTaskDurationDrawView()
	{
		String taskDurationDrawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "taskDurationTab.png";
		String taskDurationDrawExpected =
			environment.projectImagesPath + File.separator
				+ "taskDurationDrawExpected.png";
		String defaultTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "taskDependenciesTab.png";

		Assert.assertTrue(desktopTester.testDrawView(taskDurationDrawTab,
			taskDurationDrawExpected,
			defaultTab));
	}


	@Test
	public void testTaskRemainingDrawView()
	{
		String taskRemainingDrawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "taskRemainingTab.png";
		String taskRemainingDrawExpected =
			environment.projectImagesPath + File.separator
				+ "taskRemainingDrawExpected.png";
		String defaultTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "taskDependenciesTab.png";

		Assert.assertTrue(desktopTester.testDrawView(taskRemainingDrawTab,
			taskRemainingDrawExpected,
			defaultTab));
	}


	@Test
	public void testDefautlDrawView()
	{
		String defaultDrawExpected =
			environment.projectImagesPath + File.separator
				+ "defautlDrawViewExpected.png";
		Assert.assertTrue(desktopTester.testDefautlDraw(defaultDrawExpected));
	}


	@Test
	public void testAssigmentTreeView()
	{
		String assigmentTreeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "assigmentsTreeViewTab.png";

		String defaultTreeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "displaySettingsTreeViewTab.png";
		String treeViewExpected =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "assigmentsTreeViewExpected.png";

		Assert.assertTrue(desktopTester.testIsTreeViewPresent(assigmentTreeViewTab,
			treeViewExpected,
			defaultTreeViewTab));
	}


	@Test
	public void testCategoriesTreeView()
	{
		String assigmentTreeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "categoriesTreeViewTab.png";

		String defaultTreeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "displaySettingsTreeViewTab.png";
		String treeViewExpected =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "categoriesTreeViewExpected.png";

		Assert.assertTrue(desktopTester.testIsTreeViewPresent(assigmentTreeViewTab,
			treeViewExpected,
			defaultTreeViewTab));
	}


	@Test
	public void testDefautlTreeView()
	{
		String defautlTreeViewExpected =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "displaySettingsTreeViewExpected.png";
		Assert.assertTrue(desktopTester.testIsTreeViewPresent(defautlTreeViewExpected));
	}


	@Test
	public void testPeopleTableView()
	{
		String peopleTableTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "peopleTableViewTab.png";
		String defaultTableTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "tasksTableViewTab.png";
		String tableViewExpected =
			environment.projectImagesPath + File.separator + "peopleTableViewExpected";

		Assert.assertTrue(desktopTester.testIsTableViewPresent(peopleTableTab,
			tableViewExpected,
			defaultTableTab));
	}


	@Test
	public void testTasksTableView()
	{
		String tableViewExpected =
			environment.projectImagesPath + File.separator + "tasksTableViewExpected";
		Assert.assertTrue(desktopTester.testIsTableViewPresent(tableViewExpected));
	}


	@Test
	public void testSearch()
	{
		String searchCriteria = "";
		String searchExpected =
			environment.projectImagesPath + File.separator + "searchExpected.png";
		Assert.assertTrue(desktopTester.testSearch(searchCriteria, searchExpected));
	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static TSDesktopPreviewTestCases desktopTester;

}
