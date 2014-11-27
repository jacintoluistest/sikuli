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
		//org.sikuli.basics.Debug.setDebugLevel(3);
		className = TSMSliceDesktopPreviewTest.class.getName();
		Settings.MoveMouseDelay = new Float(1.5);
		environment =
			new TSEnvironment("MSlice", TSEnvironment.DESKTOP_PREVIEW);
		TSAutomationTester = new TSTester();
		desktopTester = new TSDesktopPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester = TSFunctions.setDesktopTest(TSAutomationTester, "MSliceProjectPath");
		environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);

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
		Assert.assertTrue(desktopTester.testOnMouseHoverSaveAs());

	}
	
	@Test
	public void testOnMouseHoverPrintSetUp(){
	
		Assert.assertTrue(desktopTester.testOnMouseHoverPrintSetUp());
		
	}

	@Test
	public void testOnMouseHoverPrintPreview(){
	
		Assert.assertTrue(desktopTester.testOnMouseHoverPrintSetUp());
	
	}

	@Test
	public void testOnMouseHoverPrint(){
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
	public void testOnMouseHoverMSlice()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverMSlice());
	}
	
	@Test
	public void testOnMouseHoverClearResult()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverClearResults());
	}
	
	
	@Test
	public void testOnMouseHoverZoomOut()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverZoomOut());
	}
	
	@Test
	public void testIsOverviewPresent()
	{
		Assert.assertTrue(desktopTester.testIsOverviewPresent());
		
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
	
	static TSDesktopPreviewTestCases desktopTester;

}
