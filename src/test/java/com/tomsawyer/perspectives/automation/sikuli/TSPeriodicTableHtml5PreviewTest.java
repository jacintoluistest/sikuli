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

public class TSPeriodicTableHtml5PreviewTest
{
	
	@BeforeClass
	public static void setUp()
	{
		       // org.sikuli.basics.Debug.setDebugLevel(3);
				Settings.MoveMouseDelay = new Float(1.5);
				String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
				className = TSPeriodicTableHtml5PreviewTest.class.getName();
				environment =
					new TSEnvironment("PeriodicTable", TSEnvironment.HTML5_PREVIEW, defaultBrowser);
				TSAutomationTester = new TSTester(defaultBrowser);
				html5Tester =
					new TSHtml5PreviewTestCases(environment, TSAutomationTester, className);
				TSAutomationTester =
					TSFunctions.setHtml5Test(TSAutomationTester, "PeriodicTableProjectPath");
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
	public void testOnMouseHoverNavigateLinks()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverNavigateLinks());
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
	public void testOnMOuseHoverMarqueeZoom()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverMarqueeZoom());
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
	public void testOnMOuseHoverOverview()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverOverview());
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
		Assert.assertTrue(html5Tester.testDrawView(drawTab,
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
		Assert.assertTrue(html5Tester.testDrawView(drawTab,
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
		Assert.assertTrue(html5Tester.testDrawView(drawTab,
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
		Assert.assertTrue(html5Tester.testDrawView(drawTab,
			drawExpected,
			defaultDrawTab));

	}


	@Test
	public void testFamiliesTreeView()
	{
		String treeViewExpected =
			environment.projectImagesPath + File.separator + "familiesTreeView.png";
		Assert.assertTrue(html5Tester.testIsTreeViewPresent(treeViewExpected));
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

		Assert.assertTrue(html5Tester.testIsTreeViewPresent(treeViewTab,
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

		Assert.assertTrue(html5Tester.testIsTreeViewPresent(treeViewTab,
			treeViewExpected,
			defaultTreeViewTab));

	}
	
	
	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;
	
	static TSHtml5PreviewTestCases html5Tester;

}
