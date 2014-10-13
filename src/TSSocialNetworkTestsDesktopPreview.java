import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TSSocialNetworkTestsDesktopPreview
{

	String projectImagesPath = "images//SocialNetworkAnalysis//Desktop";

	String toolBarImages = "images//TomSawyerPerspectives//CommonDesktopPreview//ToolBar";

	String toolTipsImages =
		"images//TomSawyerPerspectives//CommonDesktopPreview//HoverToolTips";


	@BeforeClass
	public static void setUp()
	{
		if(TSAutomationUtils.getOs()=="mac os x")
		{
			TSAutomationTester = new TSTester();
			TSAutomationTester.LaunchTS();
			TSAutomationTester.openProjectMac(TSAutomationUtils.getProperty("SocialNetworkProyectPath"));
			TSAutomationTester.launchDesktopPreview();
			
		}
		else
		{
			
		}
		
		
		
		
		
		TSAutomationTester = new TSTester();
		TSAutomationTester.LaunchTS();
		TSAutomationTester.openProyectWindows(TSAutomationUtils.getProperty("SocialNetworkProyectPath"));
		TSAutomationTester.launchDesktopPreview();
	}


	@AfterClass
	public static void closeAll()
	{
		TSAutomationTester.closeDekstopPreview();
		System.out.println("Closing everything...");
		System.out.println("Thank you");
		TSAutomationTester.closeTSP();
	}


	@Test
	public void testLaunchDesktopPreview()
	{
		System.out.println("testLaunchDesktopPreview");
		Assert.assertTrue(TSTestCases.isDesktopPreviewLaunched(TSAutomationTester,
			projectImagesPath + "//SocialNetworkDesktopDefault.png"));

	}


	@Test
	public void testIsToolBarPresent()
	{
		System.out.println("testToolBarPresent");
		if (!TSTestCases.isToolBarPresent(TSAutomationTester, projectImagesPath
			+ "//SocialNetworkAnalysisToolBar.png"))
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester,
				TSSocialNetworkTestsDesktopPreview.class.getName()
					+ "testIsToolBarPresent");

		}
		Assert.assertTrue(TSTestCases.isToolBarPresent(TSAutomationTester,
			projectImagesPath + "//SocialNetworkAnalysisToolBar.png"));
	}


	@Test
	public void testIsTableViewPresent()
	{
		System.out.println("testIsTableViewPresent");
		if (!TSTestCases.isViewPresent(TSAutomationTester, projectImagesPath
			+ "//SocialNetworkAnalysisDesktopTableView.png"))
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester,
				TSSocialNetworkTestsDesktopPreview.class.getName()
					+ "testIsTableViewPresent");
		}

		Assert.assertTrue(TSTestCases.isViewPresent(TSAutomationTester, projectImagesPath
			+ "//SocialNetworkAnalysisDesktopTableView.png"));
	}


	@Test
	public void testIsTreeViewPresent()
	{
		System.out.println("testIsTreeViewPresent");
		if (!TSTestCases.isViewPresent(TSAutomationTester, projectImagesPath
			+ "//SocialNetworkAnalysisDesktopTreeView.png"))
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester,
				TSSocialNetworkTestsDesktopPreview.class.getName()
					+ "testIsTreeViewPresent");
		}

		Assert.assertTrue(TSTestCases.isViewPresent(TSAutomationTester, projectImagesPath
			+ "//SocialNetworkAnalysisDesktopTreeView.png"));
	}


	@Test
	public void testIsOverviewPresent()
	{
		TSAutomationTester.openOverviewDesktop();
		System.out.println("testIsOverViewPresent");
		Assert.assertTrue(TSTestCases.isOverviewPresent(TSAutomationTester,
			projectImagesPath + "//overviewExpected.png",
			new Float(0.95)));
	}


	@Test
	public void testOnMouseHoverSaveAs()
	{
		long timeOut = 1000;
		System.out.println("testOnMouseHoverSaveAs");
		TSAutomationTester.onMouseHoverDesktop(toolBarImages
			+ "//SaveAsToolBarDesktop.png");
		Assert.assertNotNull(TSAutomationTester.isPresentElement(toolTipsImages
			+ "//SaveAsImage.png", new Float(0.8), timeOut));

	}


	@Test
	public void testOnMouseHoverSelect()
	{
		long timeOut = 1000;
		System.out.println("testOnMouseHoverSaveAs");
		TSAutomationTester.onMouseHoverDesktop(toolBarImages
			+ "//SelectToolBarDesktop.png");
		Assert.assertNotNull(TSAutomationTester.isPresentElement(toolTipsImages
			+ "//Select.png", new Float(0.5), timeOut));

	}


	static TSTester TSAutomationTester;

}
