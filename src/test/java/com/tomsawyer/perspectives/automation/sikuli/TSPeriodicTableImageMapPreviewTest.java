
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


public class TSPeriodicTableImageMapPreviewTest
{

	@BeforeClass
	public static void setUp()
	{
		Settings.MoveMouseDelay = new Float(1.5);
		String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
		className = TSAcyclicImageMapPreviewTest.class.getName();
		environment =
			new TSEnvironment("PeriodicTable",
				TSEnvironment.IMAGEMAP_PREVIEW,
				defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);
		imageMapTester =
			new TSImageMapPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester =
			TSFunctions.setImageMapTest(TSAutomationTester, "PeriodicTableProjectPath");
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
	public void testOnMOuseHoverMarqueeZoom()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverMarqueeZoom());
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
	public void testOnMOuseHoverOverview()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverOverview());
	}


	@Test
	public void testMetalicityDrawView()
	{
		String defaultDrawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "family.png";
		String drawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "metalicity.png";
		String drawExpected =
			environment.projectImagesPath + File.separator
				+ "metalicityDrawViewExpected.png";
		Assert.assertTrue(imageMapTester.testDrawView(drawTab,
			drawExpected,
			defaultDrawTab));
	}


	@Test
	public void testStateAt0DrawView()
	{
		String defaultDrawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "family.png";
		String drawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "stateAt0.png";
		String drawExpected =
			environment.projectImagesPath + File.separator
				+ "stateAt0DrawViewExpected.png";
		Assert.assertTrue(imageMapTester.testDrawView(drawTab,
			drawExpected,
			defaultDrawTab));

	}


	@Test
	public void testStateAt1000DrawView()
	{
		String defaultDrawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "family.png";
		String drawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "stateAt1000.png";
		String drawExpected =
			environment.projectImagesPath + File.separator
				+ "stateAt1000DrawViewExpected.png";
		Assert.assertTrue(imageMapTester.testDrawView(drawTab,
			drawExpected,
			defaultDrawTab));
	}


	@Test
	public void testElectronegativityDrawView()
	{
		String defaultDrawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "family.png";
		String drawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "electronegativity.png";
		String drawExpected =
			environment.projectImagesPath + File.separator
				+ "ElectronegativityDrawViewExpected.png";
		Assert.assertTrue(imageMapTester.testDrawView(drawTab,
			drawExpected,
			defaultDrawTab));

	}


	@Test
	public void testFamiliesTreeView()
	{
		String treeViewExpected =
			environment.projectImagesPath + File.separator + "familiesTreeView.png";
		Assert.assertTrue(imageMapTester.testIsTreeViewPresent(treeViewExpected));
	}


	@Test
	public void testGroupNumbersTreeView()
	{
		String defaultTreeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "family.png";
		String treeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "groupNumberTreeViewTab.png";
		String treeViewExpected =
			environment.projectImagesPath + File.separator + "groupNumberTreeView.png";

		Assert.assertTrue(imageMapTester.testIsTreeViewPresent(treeViewTab,
			treeViewExpected,
			defaultTreeViewTab));

	}


	public void testAlphabeticalTreeView()
	{
		String defaultTreeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "family.png";
		String treeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "alphabeticalTreeViewTab";
		String treeViewExpected =
			environment.projectImagesPath + File.separator + "alphabeticalTreeView";

		Assert.assertTrue(imageMapTester.testIsTreeViewPresent(treeViewTab,
			treeViewExpected,
			defaultTreeViewTab));

	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static TSImageMapPreviewTestCases imageMapTester;
}
