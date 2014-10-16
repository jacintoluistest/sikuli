
import java.io.File;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;


public class TSSocialNetworkDesktopPreviewTest
{

	static String projectPath;

	static String toolBar;

	static String toolTips;


	@BeforeClass
	public static void setUp()
	{
		Settings.MoveMouseDelay = new Float(1.5);
		System.out.println(TSAutomationUtils.getOs());
		if (TSAutomationUtils.getOs().contains("mac os x"))

		{
			projectPath =
				"images" + File.separator + "Mac" + File.separator
					+ "SocialNetworkAnalysis" + File.separator + "Desktop";
			toolBar =
				"images" + File.separator + "Mac" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonDesktopPreview"
					+ File.separator + "ToolBar";

			toolTips =
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
			projectPath =
				"images" + File.separator + "Windows" + File.separator
					+ "SocialNetworkAnalysis" + File.separator + "Desktop";

			toolBar =
				"images" + File.separator + "Windows" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonDesktopPreview"
					+ File.separator + "ToolBar";

			toolTips =
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
			System.out.println("Thank you");

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
		if (!TSTestCases.isDesktopPreviewLaunched(TSAutomationTester, projectPath
			+ File.separator + "SocialNetworkDesktopDefault.png"))
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester,
				TSSocialNetworkDesktopPreviewTest.class.getName()
					+ "testLaunchDesktopPreview");

		}
		Assert.assertTrue(TSTestCases.isDesktopPreviewLaunched(TSAutomationTester,
			projectPath + File.separator + "SocialNetworkDesktopDefault.png"));

	}


	@Test
	public void testIsToolBarPresent()
	{
		System.out.println("testToolBarPresent");
		if (!TSTestCases.isToolBarPresent(TSAutomationTester, projectPath
			+ File.separator + "SocialNetworkAnalysisToolBar.png"))
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester,
				TSSocialNetworkDesktopPreviewTest.class.getName()
					+ "testIsToolBarPresent");

		}
		Assert.assertTrue(TSTestCases.isToolBarPresent(TSAutomationTester, projectPath
			+ File.separator + "SocialNetworkAnalysisToolBar.png"));
	}


	@Test
	public void testIsTableViewPresent()
	{
		System.out.println("testIsTableViewPresent");
		if (!TSTestCases.isViewPresent(TSAutomationTester, projectPath + File.separator
			+ "SocialNetworkAnalysisDesktopTableView.png"))
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester,
				TSSocialNetworkDesktopPreviewTest.class.getName()
					+ "testIsTableViewPresent");
		}

		Assert.assertTrue(TSTestCases.isViewPresent(TSAutomationTester, projectPath
			+ File.separator + "SocialNetworkAnalysisDesktopTableView.png"));
	}


	@Test
	public void testIsTreeViewPresent()
	{
		System.out.println("testIsTreeViewPresent");
		if (!TSTestCases.isViewPresent(TSAutomationTester, projectPath + File.separator
			+ "SocialNetworkAnalysisDesktopTreeView.png"))
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester,
				TSSocialNetworkDesktopPreviewTest.class.getName()
					+ "testIsTreeViewPresent");
		}

		Assert.assertTrue(TSTestCases.isViewPresent(TSAutomationTester, projectPath
			+ File.separator + "SocialNetworkAnalysisDesktopTreeView.png"));
	}


	@Test
	public void testIsOverviewPresent()
	{
		System.out.println("testIsOverViewPresent");
		TSAutomationTester.openOverviewDesktop();
		if (!TSTestCases.isOverviewPresent(TSAutomationTester, projectPath
			+ File.separator + "overviewExpected.png"))
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester,
				TSSocialNetworkDesktopPreviewTest.class.getName()
					+ "testIsOverviewPresent");
		}

		Assert.assertTrue(TSTestCases.isOverviewPresent(TSAutomationTester, projectPath
			+ File.separator + "overviewExpected.png", new Float(0.95)));
	}


	@Test
	public void testOnMouseHoverSaveAs()
	{
		long timeOut = 1000;
		System.out.println("testOnMouseHoverSaveAs");
		TSAutomationTester.onMouseHoverDesktopMac(toolBar + File.separator
			+ "SaveAsToolBarDesktop.png");
		if (TSAutomationTester.isPresentElement(toolTips + File.separator
			+ "SaveAsImage.png", new Float(0.8), timeOut) == null)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester,
				TSSocialNetworkDesktopPreviewTest.class.getName()
					+ "testIsOverviewPresent");
		}
		Assert.assertNotNull(TSAutomationTester.isPresentElement(toolTips
			+ File.separator + "SaveAsImage.png", new Float(0.8), timeOut));

	}


	@Test
	public void testOnMouseHoverSelect()
	{
		long timeOut = 1000;
		System.out.println("testOnMouseHoverSelect");
		TSAutomationTester.onMouseHoverDesktopMac(toolBar + File.separator
			+ "SelectToolBarDesktop.png");
		if (TSAutomationTester.isPresentElement(toolTips + File.separator + "Select.png",
			new Float(0.8),
			timeOut) == null)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester,
				TSSocialNetworkDesktopPreviewTest.class.getName()
					+ "testOnMouseHoverSelect");
		}
		
		Assert.assertNotNull(TSAutomationTester.isPresentElement(toolTips
			+ File.separator + "Select.png", new Float(0.8), timeOut));

	}


	static TSTester TSAutomationTester;

}
