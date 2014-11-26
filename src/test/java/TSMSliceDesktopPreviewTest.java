import java.io.File;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;

public class TSMSliceDesktopPreviewTest
{
	
	@BeforeClass
	public static void setUp() throws Exception
	{
		org.sikuli.basics.Debug.setDebugLevel(3);
		className = TSSocialNetworkDesktopPreviewTest.class.getName();
		Settings.MoveMouseDelay = new Float(1.5);
		environment =
			new TSEnvironment("MSlice", TSEnvironment.DESKTOP_PREVIEW);
		TSAutomationTester = new TSTester();
		TSAutomationTester.LaunchTS();
		TSAutomationTester.maximizeWindow();
		TSAutomationTester.openProject("MSliceProjectPath");
		TSAutomationTester.launchDesktopPreview();
		TSAutomationTester.maximizeWindow();
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
		TSAutomationTester.closeDekstopPreview();
		TSAutomationTester.closeAll();
	}
	
	@Test
	public void testOnMouseHoverSaveAs()
	{
		System.out.println("******testOnMouseHoverSaveAs******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "SaveAsToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "SaveAsImage.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
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
	public void testOnMouseHoverPrintSetUp(){
		System.out.println("******testOnMouseHoverPrintSetUp******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "PrintSetUpToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "PrintSetUp.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverPrintSetUp", environment.evidencePath);
		}

		Assert.assertTrue(result);
		
	}

	@Test
	public void testOnMouseHoverPrintPreview(){
		System.out.println("******testOnMouseHoverPrintSetUp******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "PrintPreviewToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "PrintPreview.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverPrintPreview", environment.evidencePath);
		}

		Assert.assertTrue(result);
		
	}

	@Test
	public void testOnMouseHoverPrint(){
		System.out.println("******testOnMouseHoverPrint******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "PrintToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "Print.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverPrint", environment.evidencePath);
		}

		Assert.assertTrue(result);
		
	}
	
	@Test
	public void testOnMouseHoverSelect()
	{
		System.out.println("******testOnMouseHoverSelect******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "SelectToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "Select.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
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
	public void testOnMouseHoverPan()
	{
		System.out.println("******testOnMouseHoverPan******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "PanToolBarDesktop.png";
		String imageExpected = environment.toolTipsImagePath + File.separator + "Pan.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
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
	public void testOnMouseHoverNavigateLinks()
	{
		System.out.println("******testOnMouseHoverNavigateLinks******");
		float similar = new Float(0.6);
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "NavigateLinksToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "NavigateLinks.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected,similar);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverNavigateLinks", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}
	
	@Test
	public void testOnMouseHoverMarqueeZoom()
	{
		System.out.println("******testOnMouseHoverMarqueeZoom******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "MarqueeZoomToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "MarqueeZoom.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
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
	public void testOnMouseHoverInteractiveZoom()
	{
		System.out.println("******testOnMouseHoverInteractiveZoom******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "InteractiveZoomToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "InteractiveZoom.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
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
		System.out.println("******testOnMouseHoverZoomIn******");
		float similar = new Float(0.94);
		String imageToolBar =
			environment.projectImagesPath + File.separator + "ZoomInDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ZoomIn.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected,similar);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverZoomIn", environment.evidencePath);
		}

		Assert.assertTrue(result);

	}

	@Test
	public void testOnMouseHoverZoomFit()
	{
		System.out.println("******testOnMouseHoverZoomFit******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "ZoomFitToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ZoomFit.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
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
		System.out.println("******testOnMouseHoverOverview******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "OverviewToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "Overview.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
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
	public void testOnMouseHoverMSlice()
	{
		System.out.println("******testOnMouseHoverMSlice******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "MSliceEnableToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "MSlice.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverMSlice", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}
	
	@Test
	public void testOnMouseHoverClearResult()
	{
		System.out.println("******testOnMouseHoverMSlice******");
		String imageToolBar =
			environment.projectImagesPath + File.separator + "clearResultsDisable.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ClearResults.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverMSlice", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}
	
	

	
	
	@Test
	public void testOnMouseHoverZoomOut()
	{
		
		float similar = new Float((0.80));
		System.out.println("******testOnMouseHoverZoomOut******");
		String imageToolBar =
			environment.projectImagesPath + File.separator + "ZoomOutDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ZoomOut.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected,similar);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverZoomOut", environment.evidencePath);
		}

		Assert.assertTrue(result);

	}
	
	@Test
	public void testIsOverviewPresent()
	{
		System.out.println("testIsOverViewPresent");
		TSAutomationTester.openOverviewDesktop();
		boolean result =
			TSFunctions.isOverviewPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator + "overviewExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
		TSAutomationTester.closeOverviewDesktop();
	}
	

	@Test
	public void testIsMSliceButtonEnable()
	{
		System.out.println("*******testIsMSliceButtonEnable******");

		boolean result =
			TSFunctions.isButtonPresent(TSAutomationTester, environment.toolBarImagesPath
				+ File.separator + "MSliceEnableToolBarDesktop.png", new Float(0.65));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsMSliceButtonEnable", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}
	
	
	@Test
	public void testIsClearResultsButtonDisable()
	{
		System.out.println("*******testIsClearResultsButtonDisable******");

		boolean result =
			TSFunctions.isButtonPresent(TSAutomationTester, environment.projectImagesPath
				+ File.separator + "clearResultsDisable.png", new Float(0.65));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "IsClearResultsButtonDisable", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}


	@Test
	public void testMSlice100()
	{
		System.out.println("******testMSlice100******");
		String msliceButton =
			environment.projectImagesPath + File.separator + "MSlice.png";
		String comboButton = environment.projectImagesPath + File.separator + "Combo.png";
		String minCapacityButton =
			environment.projectImagesPath + File.separator + "MinCapacity.png";
		String capacity = environment.projectImagesPath + File.separator + "100.png";
		String clearResultsButton =
			environment.projectImagesPath + File.separator + "ClearResults.png";
		TSAutomationTester.runAlgorithm(msliceButton);
		TSAutomationTester.runAlgorithm(minCapacityButton);
		TSAutomationTester.runAlgorithm(comboButton);
		TSAutomationTester.runAlgorithm(capacity);
		boolean result =
			TSFunctions.isViewPresent(TSAutomationTester, environment.projectImagesPath
				+ File.separator + "MinCapacity100.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testMSlice100", environment.evidencePath);

		}
		Assert.assertTrue(result);
		TSAutomationTester.runAlgorithm(clearResultsButton);

	}
	
	@Test
	public void testMSlice1000()
	{
		System.out.println("******testMSlice1000******");
		String msliceButton =
			environment.projectImagesPath + File.separator + "MSlice.png";
		String comboButton = environment.projectImagesPath + File.separator + "Combo.png";
		String minCapacityButton =
			environment.projectImagesPath + File.separator + "MinCapacity.png";
		String capacity = environment.projectImagesPath + File.separator + "1000.png";
		String clearResultsButton =
			environment.projectImagesPath + File.separator + "ClearResults.png";
		TSAutomationTester.runAlgorithm(msliceButton);
		TSAutomationTester.runAlgorithm(minCapacityButton);
		TSAutomationTester.runAlgorithm(comboButton);
		TSAutomationTester.runAlgorithm(capacity);
		boolean result =
			TSFunctions.isViewPresent(TSAutomationTester, environment.projectImagesPath
				+ File.separator + "MinCapacity1000.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testMSlice1000", environment.evidencePath);

		}
		Assert.assertTrue(result);
		TSAutomationTester.runAlgorithm(clearResultsButton);

	}

	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;
	
	static int screenId;

}
