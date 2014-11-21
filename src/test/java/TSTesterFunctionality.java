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
		//org.sikuli.basics.Debug.setDebugLevel(3);
		Settings.MoveMouseDelay = new Float(4);
		className = TSTesterFunctionality.class.getName();
		String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
		environment =
			new TSEnvironment("MSlice",
				TSEnvironment.IMAGEMAP_PREVIEW,defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);
		// TSAutomationTester.LaunchTS();
		// TSAutomationTester.openProject("SocialNetworkProyectPath");
		//TSAutomationTester.launchWebPreview();
		//TSAutomationTester.fullScreenBrowser();
		TSAutomationUtils.pauseScript(new Long(2000));
		//TSAutomationTester.refreshBrowser();
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
	public void testOnMouseHoverSaveAs()
	{
		System.out.println("*******testHoverSaveAs*******");

		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "SaveAsImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "SaveAsImage.png";
		boolean result =
			TSTestCases.isToolTipPresentWeb(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverSaveAs", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}
	
	@Test
	public void testOnMouseHoverPrintSetUp()
	{
		System.out.println("*******testHoverPrintSetUp*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "PrintSetUpImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "PrintSetUp.png";
		boolean result =
			TSTestCases.isToolTipPresentWeb(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testHoverPrintSetUp", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}
	
	@Test
	public void testOnMouseHoverPrintPreview()
	{
		System.out.println("*******testHoverPrintPreview*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "PrintPreviewImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "PrintSetUp.png";
		boolean result =
			TSTestCases.isToolTipPresentWeb(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testHoverPrintPreview", environment.evidencePath);
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
	public void testOnMouseHoverPan()
	{
		System.out.println("*******testOnMouseHoverPan*******");

		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "PanImageMap.png";
		String imageExpected = environment.toolTipsImagePath + File.separator + "Pan.png";
		boolean result =
			TSTestCases.isToolTipPresentWeb(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverPan", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testOnMouseHoverMarqueeZoom()
	{

		System.out.println("*******TestOnMouseHoverMarqueeZoom*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "MarqueeZoomImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "MarqueeZoom.png";
		boolean result =
			TSTestCases.isToolTipPresentWeb(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverMarqueeZoom", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testOnMouseHoverZoomIn()
	{
		System.out.println("*******TestOnMouseHoverZoomIn*******");

		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "ZoomInImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ZoomIn.png";
		boolean result =
			TSTestCases.isToolTipPresentWeb(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverZoomIn", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testOnMouseHoverZoomOut()
	{
		System.out.println("*******TestOnMouseHoverZoomOut*******");

		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "ZoomOutImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ZoomOut.png";
		boolean result =
			TSTestCases.isToolTipPresentWeb(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverZoomOut", environment.evidencePath);
		}
		Assert.assertTrue(result);
	}


	@Test
	public void testOnMouseHoverZoomFit()
	{
		System.out.println("*******TestOnMouseHoverZoomFit*******");

		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "ZoomFitImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ZoomFit.png";
		boolean result =
			TSTestCases.isToolTipPresentWeb(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverZoomFit", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testOnMouseHoverOverview()
	{
		System.out.println("*******TestOnMouseHoverOverview*******");

		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "OverviewImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "Overview.png";
		boolean result =
			TSTestCases.isToolTipPresentWeb(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverOverview", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}
	
	@Test
	public void testIsOverviewPresent()
	{
		Float similar = new Float(0.82);
		System.out.println("*******TestIsOverviewPresent*******");
		TSAutomationTester.openOverviewImageMap();
		boolean result =
			TSTestCases.isOverviewPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator + "overviewExpected.png",
				similar);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent", environment.evidencePath);
		}
		Assert.assertTrue(result);
		TSAutomationTester.closeOverviewImageMap();
	
	}
	

	@Test
	public void testMSlice100(){
		System.out.println("******testMSlice100******");
		String minCapacity = environment.toolBarImagesPath + File.separator+"100ImageMap.png";
		String expectedLayout = environment.projectImagesPath + File.separator + "MinCapacity100.png";
		String clearResultsButton=environment.toolBarImagesPath+File.separator + "ClearResultsEnableImageMap.png";
		boolean result = TSTestCases.runMSliceImageMap(TSAutomationTester, minCapacity, expectedLayout);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testMSlice100", environment.evidencePath);

		}
		Assert.assertTrue(result);
		
		TSAutomationTester.clearResults(clearResultsButton);
		TSAutomationTester.refreshBrowser();
	}
	
	@Test
	public void testMSlice1000(){
		
		System.out.println("******testMSlice1000******");
		String minCapacity = environment.toolBarImagesPath + File.separator+"1000ImageMap.png";
		String expectedLayout = environment.projectImagesPath + File.separator + "MinCapacity1000.png";
		String clearResultsButton=environment.toolBarImagesPath+File.separator + "ClearResultsEnableImageMap.png";
		boolean result = TSTestCases.runMSliceImageMap(TSAutomationTester, minCapacity, expectedLayout);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testMSlice1000", environment.evidencePath);

		}
		Assert.assertTrue(result);
		
		TSAutomationTester.clearResults(clearResultsButton);
		TSAutomationTester.refreshBrowser();
		
	}
	
	
	

	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

}
