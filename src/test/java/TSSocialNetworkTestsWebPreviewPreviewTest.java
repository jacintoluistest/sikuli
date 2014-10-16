

import java.io.File;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;



public class TSSocialNetworkTestsWebPreviewPreviewTest
{
	//On this path are stored the images used for the project Tests
		static String projectImagesPath;

		//On this path are stores the images used for tool bar on Desktop preview
		static String webPreviewToolBarImagesPath;

		//On this path are the tool tips expected for the tests
		static String webPreviewToolTipsImagePath;
		
		//
		static int currentScreenId=0;
	


	@BeforeClass
	public static void setUp()
	{
		Settings.MoveMouseDelay = new Float(1.5);
		System.out.println(TSAutomationUtils.getOs());
		//Set up Mac Environment
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
		}
		else
			//Set up Windows Environment
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
					+ "TomSawyerPerspectives" + File.separator + "CommonDesktopPreview"
					+ File.separator + "HoverToolTips";
			TSAutomationTester = new TSTester();
			TSAutomationTester.LaunchTS();
			TSAutomationTester.openProyectWindows(TSAutomationUtils.getProperty("SocialNetworkProyectPath_Win"));
			TSAutomationTester.launchWebPreview();

		}
	}


	@Test
	public void testLaunchWebPreview()
	{
		System.out.println("testLaunchWebPreview");
		Assert.assertTrue(TSTestCases.isToolBarPresent(TSAutomationTester,
			projectImagesPath + "ToolBar//WebCommonToolBar.png"));

	}


	@Test
	public void testIsPresentToolBar()
	{
		System.out.println("testIsPresentToolBar");
		Assert.assertTrue(TSTestCases.isToolBarPresent(TSAutomationTester,
			projectImagesPath + "SecondaryScreen//ToolBarImageMap.png"));
	}


	@Test
	public void testIsTableViewPresent()
	{
		System.out.println("testIsTableViewPresent");
		Assert.assertTrue(TSTestCases.isToolBarPresent(TSAutomationTester,
			projectImagesPath + "SecondaryScreen//TableViewImageMap.png"));
	}


	@Test
	public void testHoverSaveAs()
	{

		System.out.println("testHoverSaveAs");

		Assert.assertTrue(TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
			webPreviewToolBarImagesPath + File.separator +"SaveAsImageMap.png",
			webPreviewToolTipsImagePath + File.separator +"SaveAsImage.png"));
	}


	@AfterClass
	public static void closeAll()
	{
		TSAutomationTester.closeWebPreview();
		System.out.println("Closing everything...");
		System.out.println("Thank you");
		TSAutomationTester.closeTSP();
//		SikuliScript.popup("TestFinished");
	}


	static TSTester TSAutomationTester;

}
