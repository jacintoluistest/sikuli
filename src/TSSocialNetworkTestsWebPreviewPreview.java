import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.SikuliScript;


public class TSSocialNetworkTestsWebPreviewPreview
{
	String projectImagesPath = "images//SocialNetworkAnalysis";;

	String commonImageMapImagesPath =
		"images//TomSawyerPerspectives//CommonImageMapPreview//";;

	String imageMapProjectImages = "images//SocialNetworkAnalysis//ImageMap//";;

	static String toolTipsImages =
		"images//TomSawyerPerspectives//CommonImageMapPreview//HoverToolTips";;


	@BeforeClass
	public static void setUp()
	{
		TSAutomationTester = new TSTester();
		TSAutomationTester.LaunchTS();
		TSAutomationTester.openProyectWindows(TSAutomationUtils.getProperty("SocialNetworkProyectPath"));
		TSAutomationTester.launchWebPreview();
	}


	@Test
	public void testLaunchWebPreview()
	{
		System.out.println("testLaunchWebPreview");
		Assert.assertTrue(TSTestCases.isToolBarPresent(TSAutomationTester,
			commonImageMapImagesPath + "ToolBar//WebCommonToolBar.png"));

	}


	@Test
	public void testIsPresentToolBar()
	{
		System.out.println("testIsPresentToolBar");
		Assert.assertTrue(TSTestCases.isToolBarPresent(TSAutomationTester,
			imageMapProjectImages + "SecondaryScreen//ToolBarImageMap.png"));
	}


	@Test
	public void testIsTableViewPresent()
	{
		System.out.println("testIsTableViewPresent");
		Assert.assertTrue(TSTestCases.isToolBarPresent(TSAutomationTester,
			imageMapProjectImages + "SecondaryScreen//TableViewImageMap.png"));
	}


	@Test
	public void testHoverSaveAs()
	{

		System.out.println("testHoverSaveAs");

		Assert.assertTrue(TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
			commonImageMapImagesPath + "Toolbar//SaveAsImageMap.png",
			commonImageMapImagesPath + "HoverToolTips//SaveAsImage.png"));
	}


	@AfterClass
	public static void closeAll()
	{
		TSAutomationTester.closeWebPreview();
		System.out.println("Closing everything...");
		System.out.println("Thank you");
		TSAutomationTester.closeTSP();
		SikuliScript.popup("TestFinished");
	}


	static TSTester TSAutomationTester;

}
