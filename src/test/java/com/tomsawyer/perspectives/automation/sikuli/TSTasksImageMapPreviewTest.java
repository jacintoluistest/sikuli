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

public class TSTasksImageMapPreviewTest
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
	public void testOnMouseHoverPrint()
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
	public void testOnMouseHoverCreateTask()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverCreateTask());
	}
	
	@Test
	public void testOnMouseHoverCreateDependency()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverCreateDependency());
	}
	
	@Test
	public void testOnMouseHoverDelete()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverDeleteDisabled());
	}
	
	@Test
	public void testOnMouseHoverShowAbout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverShowAbout());
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

		Assert.assertTrue(imageMapTester.testDrawView(taskDurationDrawTab,
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

		Assert.assertTrue(imageMapTester.testDrawView(taskRemainingDrawTab,
			taskRemainingDrawExpected,
			defaultTab));
	}


	@Test
	public void testDefautlDrawView()
	{
		String defaultDrawExpected =
			environment.projectImagesPath + File.separator
				+ "defautlDrawViewExpected.png";
		Assert.assertTrue(imageMapTester.testDefautlDraw(defaultDrawExpected));
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
		
		Assert.assertTrue(imageMapTester.testIsTreeViewPresent(assigmentTreeViewTab, treeViewExpected, defaultTreeViewTab));
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
		
		Assert.assertTrue(imageMapTester.testIsTreeViewPresent(assigmentTreeViewTab, treeViewExpected, defaultTreeViewTab));
	}
	
	@Test
	public void testDefautlTreeView()
	{	String defautlTreeViewExpected =environment.projectImagesPath + File.separator + "Tabs" + File.separator
		+ "displaySettingsTreeViewExpected.png";
		Assert.assertTrue(imageMapTester.testIsTreeViewPresent(defautlTreeViewExpected));
	}
	
	@Test
	public void testPeopleTableView()
	{
		String peopleTableTab = environment.projectImagesPath + File.separator + "Tabs" + File.separator
			+ "peopleTableViewTab.png";
		String defaultTableTab = environment.projectImagesPath + File.separator + "Tabs" + File.separator
			+ "tasksTableViewTab.png";
		String tableViewExpected = environment.projectImagesPath + File.separator + "peopleTableViewExpected";
		
		Assert.assertTrue(imageMapTester.testIsTableViewPresent(peopleTableTab, tableViewExpected, defaultTableTab));
	}
	
	@Test
	public void testTasksTableView()
	{
		String tableViewExpected= environment.projectImagesPath + File.separator + "tasksTableViewExpected";
		Assert.assertTrue(imageMapTester.testIsTableViewPresent(tableViewExpected));
	}
	
	@Test
	public void testSearch()
	{
		String searchCriteria = "";
		String searchExpected = environment.projectImagesPath + File.separator + "searchExpected.png";
		Assert.assertTrue(imageMapTester.testSearch(searchCriteria, searchExpected));
	}
	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static TSImageMapPreviewTestCases imageMapTester;

}
