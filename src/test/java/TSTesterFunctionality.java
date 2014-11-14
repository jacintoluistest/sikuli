import java.io.File;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;


public class TSTesterFunctionality
{

	@BeforeClass
	public static void setUp()
	{
		// org.sikuli.basics.Debug.setDebugLevel(3);
		Settings.MoveMouseDelay = new Float(1.5);
		className = TSSAcyclicImageMapPreviewTest.class.getName();
		String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
		environment =
			new TSEnvironment("AcyclicTest",
				TSEnvironment.IMAGEMAP_PREVIEW,
				defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);
		// TSAutomationTester.LaunchTS();
		// TSAutomationTester.openProject("SocialNetworkProyectPath");
		TSAutomationTester.launchWebPreview();
		TSAutomationTester.fullScreenBrowser();
		TSAutomationUtils.pauseScript(new Long(2000));
		TSAutomationTester.refreshBrowser();
		screenId = TSAutomationTester.automationTesterCurrentScreen.getID();
		if (screenId == 0)
		{
			environment.projectImagesPath =
				environment.projectImagesPath.concat(File.separator + "PrimaryScreen");

		}
		else if (screenId == 1)
		{
			environment.projectImagesPath =
				environment.projectImagesPath.concat(File.separator + "SecondaryScreen");
		}

	}


	@AfterClass
	public static void closeAll()
	{
		// TSAutomationTester.fullScreenBrowser();
		// TSAutomationTester.closeCurrentBrowser();
		// TSAutomationTester.closeAll();
	}


	@Test
	public void testHierarchicalLayout()
	{
		System.out.println("testHierarchicalLayout");
		TSAutomationTester.HierarchicalLayoutDesktop();
		boolean result =
			TSTestCases.isLayoutPresent(TSAutomationTester, environment.projectImagesPath
				+ File.separator + "HierarchicalExpected.png", new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
		TSAutomationTester.orthogonalLayoutImageMap();
	}


	@Test
	public void testOnMouseHoverOrthogonalLayout()
	{
		System.out.println("*******TestOnMouseHoverOrthogonalLayout*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "OrthogonalLayoutImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "OrthogonalLayout.png";
		boolean result =
			TSTestCases.isToolTipPresentWeb(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverOrthogonalLayout", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testOnMouseHoverSelect()
	{
		System.out.println("*******testOnMouseHoverSelect*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "SelectImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "Select.png";
		boolean result =
			TSTestCases.isToolTipPresentWeb(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverSelect", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testIsOverviewPresent()
	{
		System.out.println("testIsOverViewPresent");
		TSAutomationTester.openOverviewDesktop();
		boolean result =
			TSTestCases.isOverviewPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator + "overviewExpected.png",
				new Float(0.65));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
		TSAutomationTester.closeOverview(environment.toolBarImagesPath + File.separator
			+ "OverviewSelectedImageMap.png");

	}


	@Test
	public void testOnMouseHoverClearResults()
	{
		System.out.println("******testOnMouseHoverClearResultsTest******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "clearResultsAcyclicDisableImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "AcyclicClearResults.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverAcyclicClearResults", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

}
