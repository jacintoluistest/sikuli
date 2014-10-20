import java.io.File;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;


public class TSSocialNetworkDesktopPreviewTest
{

	// On this path are stored the images used for the project Tests
	static String projectImagesPath;

	// On this path are stores the images used for tool bar on Desktop preview
	static String desktopPreviewToolBarImagesPath;

	// On this path are the tool tips expected for the tests
	static String desktopPreviewToolTipsImagePath;

	static String className;


	@BeforeClass
	public static void setUp()
	{
		className = TSSocialNetworkWebPreviewPreviewTest.class.getName();
		Settings.MoveMouseDelay = new Float(1.5);
		if (TSAutomationUtils.getOs().contains("mac os x"))

		{
			projectImagesPath =
				"images" + File.separator + "Mac" + File.separator
					+ "SocialNetworkAnalysis" + File.separator + "Desktop";
			desktopPreviewToolBarImagesPath =
				"images" + File.separator + "Mac" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonDesktopPreview"
					+ File.separator + "ToolBar";

			desktopPreviewToolTipsImagePath =
				"images" + File.separator + "Mac" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonDesktopPreview"
					+ File.separator + "HoverToolTips";
			TSAutomationTester = new TSTester();
			TSAutomationTester.LaunchTS();
			TSAutomationTester.openProjectMac(TSAutomationUtils.getProperty("SocialNetworkProyectPath_Mac"));
			TSAutomationTester.launchDesktopPreview();

		}
		else
		{
			projectImagesPath =
				"images" + File.separator + "Windows" + File.separator
					+ "SocialNetworkAnalysis" + File.separator + "Desktop";

			desktopPreviewToolBarImagesPath =
				"images" + File.separator + "Windows" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonDesktopPreview"
					+ File.separator + "ToolBar";

			desktopPreviewToolTipsImagePath =
				"images" + File.separator + "Windows" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonDesktopPreview"
					+ File.separator + "HoverToolTips";
			TSAutomationTester = new TSTester();
			TSAutomationTester.LaunchTS();
			TSAutomationTester.openProyectWindows(TSAutomationUtils.getProperty("SocialNetworkProyectPath_Win"));
			TSAutomationTester.launchDesktopPreview();

		}

	}


	@AfterClass
	public static void closeAll()
	{
		if (TSAutomationUtils.getOs() == "mac os x")
		{
			TSAutomationTester.closeOnMacRedCross();
			TSAutomationTester.closeTSP();
			System.out.println("Closing everything...");
			System.out.println("Thank you");
			TSAutomationUtils.pauseScript(new Long (5000));

		}
		else
		{
			TSAutomationTester.closeDekstopPreview();
			System.out.println("Closing everything...");
			System.out.println("Thank you");
			TSAutomationTester.closeTSP();

		}
	}


	@Test
	public void testLaunchDesktopPreview()
	{
		System.out.println("testLaunchDesktopPreview");
		boolean result =
			TSTestCases.isDesktopPreviewLaunched(TSAutomationTester, projectImagesPath
				+ File.separator + "SocialNetworkDesktopDefault.png");

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testLaunchDesktopPreview");
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testIsToolBarPresent()
	{
		System.out.println("testToolBarPresent");
		boolean result =
			TSTestCases.isToolBarPresent(TSAutomationTester, projectImagesPath
				+ File.separator + "SocialNetworkAnalysisToolBar.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsToolBarPresent");

		}
		Assert.assertTrue(result);
	}


	@Test
	public void testIsTableViewPresent()
	{
		System.out.println("testIsTableViewPresent");
		boolean result =
			TSTestCases.isViewPresent(TSAutomationTester, projectImagesPath
				+ File.separator + "SocialNetworkAnalysisDesktopTableView.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsTableViewPresent");
		}
		Assert.assertTrue(result);
	}


	@Test
	public void testIsTreeViewPresent()
	{
		System.out.println("testIsTreeViewPresent");
		boolean result =
			TSTestCases.isViewPresent(TSAutomationTester, projectImagesPath
				+ File.separator + "SocialNetworkAnalysisDesktopTreeView.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsTreeViewPresent");
		}

		Assert.assertTrue(result);
	}


	@Test
	public void testIsOverviewPresent()
	{
		System.out.println("testIsOverViewPresent");
		TSAutomationTester.openOverviewDesktop();
		boolean result =
			TSTestCases.isOverviewPresent(TSAutomationTester, projectImagesPath
				+ File.separator + "overviewExpected.png", new Float(0.95));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent");
		}

		Assert.assertTrue(result);
	}


	@Test
	public void testOnMouseHoverSaveAs()
	{
		System.out.println("******testOnMouseHoverSaveAs******");
		String imageToolBar =
			desktopPreviewToolBarImagesPath + File.separator + "SaveAsToolBarDesktop.png";
		String imageExpected =
			desktopPreviewToolTipsImagePath + File.separator + "SaveAsImage.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverSaveAs");
		}

		Assert.assertTrue(result);

	}


	@Test
	public void testOnMouseHoverSelect()
	{
		System.out.println("******testOnMouseHoverSelect******");
		String imageToolBar =
			desktopPreviewToolBarImagesPath + File.separator + "SelectToolBarDesktop.png";
		String imageExpected =
			desktopPreviewToolTipsImagePath + File.separator + "Select.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverSaveAs");
		}

		Assert.assertTrue(result);

	}


	static TSTester TSAutomationTester;

}
