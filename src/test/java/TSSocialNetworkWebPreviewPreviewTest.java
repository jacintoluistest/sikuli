import java.io.File;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;


public class TSSocialNetworkWebPreviewPreviewTest
{
	// On this path are stored the images used for the project Tests
	static String projectImagesPath;

	// On this path are stores the images used for tool bar on Desktop preview
	static String webPreviewToolBarImagesPath;

	// On this path are the tool tips expected for the tests
	static String webPreviewToolTipsImagePath;

	static int screenId;

	static String className;


	@BeforeClass
	public static void setUp()
	{
		Settings.MoveMouseDelay = new Float(1.5);
		System.out.println(TSAutomationUtils.getOs());
		className = TSSocialNetworkWebPreviewPreviewTest.class.getName();
		// Set up Mac Environment
		if (TSAutomationUtils.getOs().contains("mac os x"))

		{
			projectImagesPath =
				"images" + File.separator + "Mac" + File.separator
					+ "SocialNetworkAnalysis" + File.separator + "ImageMap";
			webPreviewToolBarImagesPath =
				"images" + File.separator + "Mac" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonImageMapPreview"
					+ File.separator + "ToolBar";

			webPreviewToolTipsImagePath =
				"images" + File.separator + "Mac" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonImageMapPreview"
					+ File.separator + "HoverToolTips";
			TSAutomationTester = new TSTester();
			TSAutomationTester.LaunchTS();
			TSAutomationTester.openProjectMac(TSAutomationUtils.getProperty("SocialNetworkProyectPath_Mac"));
			TSAutomationTester.launchWebPreview();
			
			screenId = TSAutomationTester.automationTesterCurrentScreen.getID();
			if (screenId == 0)
			{
				projectImagesPath =
					"images" + File.separator + "Mac" + File.separator
						+ "SocialNetworkAnalysis" + File.separator + "ImageMap"
						+ File.separator + "PrimaryScreen";

			}
			else if (screenId == 1)
			{
				projectImagesPath =
					"images" + File.separator + "Mac" + File.separator
						+ "SocialNetworkAnalysis" + File.separator + "ImageMap"
						+ File.separator + "SecondaryScreen";
			}

		}
		else
		// Set up Windows Environment
		{
			projectImagesPath =
				"images" + File.separator + "Windows" + File.separator
					+ "SocialNetworkAnalysis" + File.separator + "ImageMap";

			webPreviewToolBarImagesPath =
				"images" + File.separator + "Windows" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonImageMapPreview"
					+ File.separator + "ToolBar";

			webPreviewToolTipsImagePath =
				"images" + File.separator + "Windows" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonImageMapPreview"
					+ File.separator + "HoverToolTips";
			TSAutomationTester = new TSTester();
			TSAutomationTester.LaunchTS();
			TSAutomationTester.openProyectWindows(TSAutomationUtils.getProperty("SocialNetworkProyectPath_Win"));
			TSAutomationTester.launchWebPreview();
			screenId = TSAutomationTester.automationTesterCurrentScreen.getID();
			if (screenId == 0)
			{
				projectImagesPath =
					"images" + File.separator + "Windows" + File.separator
						+ "SocialNetworkAnalysis" + File.separator + "ImageMap"
						+ File.separator + "PrimaryScreen";

			}
			else if (screenId == 1)
			{
				projectImagesPath =
					"images" + File.separator + "Windows" + File.separator
						+ "SocialNetworkAnalysis" + File.separator + "ImageMap"
						+ File.separator + "SecondaryScreen";
			}

		}

	}


	@Test
	public void testLaunchWebPreview()
	{
		System.out.println("testLaunchWebPreview");
		boolean result =
			TSTestCases.isToolBarPresent(TSAutomationTester, webPreviewToolBarImagesPath
				+ File.separator +"WebCommonToolBar.png");

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testLaunchWebPreview");
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testIsPresentToolBar()
	{
		System.out.println("*******testIsPresentToolBar*******");

		boolean result =
			TSTestCases.isToolBarPresent(TSAutomationTester, projectImagesPath
				+ File.separator + "ToolBarImageMap.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "IsPresentToolBar");
		}

		Assert.assertTrue(result);
	}


	@Test
	public void testIsTableViewPresent()
	{
		System.out.println("*******testIsTableViewPresent*******");
		boolean result =
			TSTestCases.isToolBarPresent(TSAutomationTester, projectImagesPath
				+ File.separator + "TableViewImageMap.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsTableViewPresent");
		}

		Assert.assertTrue(result);
	}


	@Test
	public void testHoverSaveAs()
	{
		System.out.println("*******testHoverSaveAs*******");
		String imageToolBar =
			webPreviewToolBarImagesPath + File.separator + "SaveAsImageMap.png";
		String imageExpected =
			webPreviewToolTipsImagePath + File.separator + "SaveAsImage.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testHoverSaveAs");
		}
		Assert.assertTrue(result);

	}


	@AfterClass
	public static void closeAll()
	{
		TSAutomationTester.closeCurrentBrowser();
		System.out.println("Closing everything...");
		System.out.println("Thank you");
		TSAutomationTester.closeTSP();
	}


	static TSTester TSAutomationTester;

}
