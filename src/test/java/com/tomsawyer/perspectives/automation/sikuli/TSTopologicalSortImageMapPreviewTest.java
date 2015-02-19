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

public class TSTopologicalSortImageMapPreviewTest
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
	public void testOnMouseHoverClearResults(){

		Assert.assertTrue(imageMapTester.testOnMouseHoverClearResults());
	}
	
	@Test
	public void testOnMouseHoverCreateTask(){

		Assert.assertTrue(imageMapTester.testOnMouseHoverCreateTask());
	}
	
	@Test
	public void testOnMouseHoverCreateDependency()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverCreateDependency());
	}
	
	@Test
	public void testOnMouseHoverRunTopologicalSort()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverRunTopologicalResult());
	}
	
	@Test
	public void testIsOverviewPresent()
	{
		Assert.assertTrue(imageMapTester.testIsOverviewPresent());
		
	}
	
	@Test
	public void testButtonsState()
	{
		Assert.assertTrue(imageMapTester.testTopologicalResortButtonsState());
	}
	

	@Test
	public void testRunTopologicalResort()
	{
		String drawExpected = "";
		String tableViewExpected = "";
		String treeViewExpected = "";

		Assert.assertTrue(imageMapTester.testRunTopologicalResort(drawExpected,
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
		Assert.assertTrue(imageMapTester.testIsTreeViewPresent(treeViewTab,
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
		Assert.assertTrue(imageMapTester.testIsTreeViewPresent(treeViewTab,
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
		Assert.assertTrue(imageMapTester.testIsTreeViewPresent(treeViewTab,
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
		Assert.assertTrue(imageMapTester.testIsTableViewPresent(tableViewTab,
			tableViewExpected,
			defaultTableViewTab));

	}
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static TSImageMapPreviewTestCases imageMapTester;
}
