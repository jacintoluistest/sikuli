
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


public class TSPeriodicTableDesktopPreviewTest
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
	public void testMetalicityDrawView()
	{
		String defaultDrawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "Family.png";
		String drawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "metalicity.png";
		String drawExpected =
			environment.projectImagesPath + File.separator
				+ "MetalicityDrawViewExpected.png";
		Assert.assertTrue(desktopTester.testDrawView(drawTab,
			drawExpected,
			defaultDrawTab));
	}


	@Test
	public void testStateAt0DrawView()
	{
		String defaultDrawTab =
			environment.projectImagesPath + File.separator + "Tabs" + "Family.png";
		String drawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "stateat0.png";
		String drawExpected =
			environment.projectImagesPath + File.separator
				+ "StateAt0DrawViewExpected.png";
		Assert.assertTrue(desktopTester.testDrawView(drawTab,
			drawExpected,
			defaultDrawTab));

	}


	@Test
	public void testStateAt1000DrawView()
	{
		String defaultDrawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "Family.png";
		String drawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "stateat1000.png";
		String drawExpected =
			environment.projectImagesPath + File.separator
				+ "StateAt1000DrawViewExpected.png";
		Assert.assertTrue(desktopTester.testDrawView(drawTab,
			drawExpected,
			defaultDrawTab));
	}


	@Test
	public void testElectronegativityDrawView()
	{
		String defaultDrawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "Family.png";
		String drawTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator
				+ "electronegativity.png";
		String drawExpected =
			environment.projectImagesPath + File.separator
				+ "ElectronegativityDrawViewExpected.png";
		Assert.assertTrue(desktopTester.testDrawView(drawTab,
			drawExpected,
			defaultDrawTab));

	}


	@Test
	public void testFamiliesTreeView()
	{
		String treeViewExpected =
			environment.projectImagesPath + File.separator + "familiesTreeView.png";
		Assert.assertTrue(desktopTester.testIsTreeViewPresent(treeViewExpected));
	}


	@Test
	public void testGroupNumbersTreeView()
	{
		String defaultTreeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator + "family.png";
		String treeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator + "groupNumberTreeViewTab.png";
		String treeViewExpected = environment.projectImagesPath + File.separator + "groupNumberTreeView.png";

		Assert.assertTrue(desktopTester.testIsTreeViewPresent(treeViewTab,
			treeViewExpected,
			defaultTreeViewTab));

	}


	public void testAlphabeticalTreeView()
	{
		String defaultTreeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator + "family.png";
		String treeViewTab =
			environment.projectImagesPath + File.separator + "Tabs" + File.separator + "alphabeticalTreeViewTab";
		String treeViewExpected = environment.projectImagesPath + File.separator + "alphabeticalTreeView";

		Assert.assertTrue(desktopTester.testIsTreeViewPresent(treeViewTab,
			treeViewExpected,
			defaultTreeViewTab));

	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static TSDesktopPreviewTestCases desktopTester;
}
