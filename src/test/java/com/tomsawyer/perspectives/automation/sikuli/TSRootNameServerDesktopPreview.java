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

public class TSRootNameServerDesktopPreview
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
	public void testOnMouseHoverPrintSetUp()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverPrintSetUp());
	}


	@Test
	public void testOnMouseHoverPrintPreview()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverPrintPreview());
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
	public void testOnMouseHoverOrthogonalLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverOrthogonalLayoutSelected());
	}


	@Test
	public void testOnMouseHoverSymmetricLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverSymmetricLayout());
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


	public void testIsOverviewPresent()
	{
		Assert.assertTrue(desktopTester.testIsOverviewPresent());
	}


	public void testSymmetricLayout()
	{
		Assert.assertTrue(desktopTester.testSymmetricLayout());
	}


	public void testDefaultLayout()
	{
		String drawExpected =
			environment.projectImagesPath + File.separator + "defautlLayoutExpected.png";
		Assert.assertTrue(desktopTester.testDefautlDraw(drawExpected));
	}


	public void testIsTreeViewPresent()
	{
		Assert.assertTrue(desktopTester.testIsTreeViewPresent());
	}
		static TSTester TSAutomationTester;

		static String className;

		static TSEnvironment environment;

		static int screenId;

		static TSDesktopPreviewTestCases desktopTester;
}
