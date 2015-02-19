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

public class TSTasksHtml5PreviewTest
{
	@BeforeClass
	public static void setUp()
	{
		// org.sikuli.basics.Debug.setDebugLevel(3);
		Settings.MoveMouseDelay = new Float(1.5);
		String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
		className = TSMaxFlowHtml5CanvasPreviewTest.class.getName();
		environment =
			new TSEnvironment("NetworkEditor",
				TSEnvironment.HTML5_PREVIEW,
				defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);
		html5Tester =
			new TSHtml5PreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester =
			TSFunctions.setHtml5Test(TSAutomationTester, "NetworkEditorPath");
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
	public void testOnMouseHoverDelete()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverDeleteDisabled());
	}
	
	@Test
	public void testOnMouseHoverShowAbout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverShowAbout());
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

		Assert.assertTrue(html5Tester.testDrawView(taskDurationDrawTab,
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

		Assert.assertTrue(html5Tester.testDrawView(taskRemainingDrawTab,
			taskRemainingDrawExpected,
			defaultTab));
	}


	@Test
	public void testDefautlDrawView()
	{
		String defaultDrawExpected =
			environment.projectImagesPath + File.separator
				+ "defautlDrawViewExpected.png";
		Assert.assertTrue(html5Tester.testDefautlDraw(defaultDrawExpected));
	}

	@Test
	public void testAssigmentTreeView()
	{
		String assigmentTreeViewTab = environment.projectImagesPath + File.separator + "Tabs" + File.separator
			+ "assigmentsTreeViewTab.png";
		
		String defaultTreeViewTab = environment.projectImagesPath + File.separator + "Tabs" + File.separator
			+ "displaySettingsTreeViewTab.png";
		String treeViewExpected =environment.projectImagesPath + File.separator + "Tabs" + File.separator
			+ "assigmentsTreeViewExpected.png";
		
		Assert.assertTrue(html5Tester.testIsTreeViewPresent(assigmentTreeViewTab, treeViewExpected, defaultTreeViewTab));
	}
	
	@Test
	public void testCategoriesTreeView()
	{
		String assigmentTreeViewTab = environment.projectImagesPath + File.separator + "Tabs" + File.separator
			+ "categoriesTreeViewTab.png";
		
		String defaultTreeViewTab = environment.projectImagesPath + File.separator + "Tabs" + File.separator
			+ "displaySettingsTreeViewTab.png";
		String treeViewExpected =environment.projectImagesPath + File.separator + "Tabs" + File.separator
			+ "categoriesTreeViewExpected.png";
		
		Assert.assertTrue(html5Tester.testIsTreeViewPresent(assigmentTreeViewTab, treeViewExpected, defaultTreeViewTab));
	}
	
	@Test
	public void testDefautlTreeView()
	{	String defautlTreeViewExpected =environment.projectImagesPath + File.separator + "Tabs" + File.separator
		+ "displaySettingsTreeViewExpected.png";
		Assert.assertTrue(html5Tester.testIsTreeViewPresent(defautlTreeViewExpected));
	}
	
	@Test
	public void testPeopleTableView()
	{
		String peopleTableTab = environment.projectImagesPath + File.separator + "Tabs" + File.separator
			+ "peopleTableViewTab.png";
		String defaultTableTab = environment.projectImagesPath + File.separator + "Tabs" + File.separator
			+ "tasksTableViewTab.png";
		String tableViewExpected = environment.projectImagesPath + File.separator + "peopleTableViewExpected";
		
		Assert.assertTrue(html5Tester.testIsTableViewPresent(peopleTableTab, tableViewExpected, defaultTableTab));
	}
	
	@Test
	public void testTasksTableView()
	{
		String tableViewExpected= environment.projectImagesPath + File.separator + "tasksTableViewExpected";
		Assert.assertTrue(html5Tester.testIsTableViewPresent(tableViewExpected));
	}
	
	@Test
	public void testSearch()
	{
		String searchCriteria = "";
		String searchExpected = environment.projectImagesPath + File.separator + "searchExpected.png";
		Assert.assertTrue(html5Tester.testSearch(searchCriteria, searchExpected));
	}
	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static TSHtml5PreviewTestCases html5Tester;
}
