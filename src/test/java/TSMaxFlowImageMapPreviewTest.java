import java.io.File;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;


public class TSMaxFlowImageMapPreviewTest
{
	@BeforeClass
	public static void setUp()
	{
		// org.sikuli.basics.Debug.setDebugLevel(3);

		Settings.MoveMouseDelay = new Float(1.5);
		String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
		className = TSMaxFlowImageMapPreviewTest.class.getName();
		environment =
			new TSEnvironment("MaxFlow", TSEnvironment.IMAGEMAP_PREVIEW, defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);
		imageMapTester =
			new TSImageMapPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester =
			TSFunctions.setHtml5Test(TSAutomationTester, "MaxFlowProjectPath");
		environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);

	}
	
	
	@Test
	public void testOnMouseHoverSelect()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverSelect());
	}


	@Test
	public void testOnMouseHoverSaveAs()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverSaveAsImage());
	}


	@Test
	public void testOnMouseHoverPan()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverPan());
	}

	@Test
	public void testOnMouseHoverMarqueeZoom()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverMarqueeZoom());
	}


	@Test
	public void testOnMouseHoverInteractiveZoom()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverInteractiveZoom());
	}


	@Test
	public void testOnMouseHoverZoomIn()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverZoomIn());
	}


	@Test
	public void testOnMouseHoverZoomOut()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverZoomOut());
	}


	@Test
	public void testOnMouseHoverZoomFit()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverZoomFit());
	}


	@Test
	public void testOnMouseHoverOverview()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverOverview());
	}


	@Test
	public void testOnMouseHoverHierarchicalLayout()
	{
		String hierarchicalButtonPath =
			environment.toolBarImagesPath + File.separator
				+ "HierarchicalLayoutSelectedCanvas.png";
		Assert.assertTrue(imageMapTester.testOnMouseHoverHierarchicalLayout(hierarchicalButtonPath));
	}


	@Test
	public void testOnMouseHoverGlobalLayout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverGlobalLayout());
	}

	@Test
	public void testOnMouseHoverIncrementallLayout()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverIncrementalLayout());
	}


	@Test
	public void testOnMouseHoverSetSourceNode()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverSetSinkNode());
	}


	public void testOnMouseHoverSetSinNode()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverSetSinkNode());
	}


	public void testOnMouseHoverRunMaximumFlow()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverRunMaximumFlow());
	}


	public void testOnMouseHoverClearResults()
	{
		Assert.assertTrue(imageMapTester.testOnMouseHoverClearResults());

	}
	
	@Test
	public  void testRunMaxFlow()
	{
		String layoutExpected = environment.projectImagesPath + File.separator + "MaxFlowExpected.png";
		String viewExpected = environment.projectImagesPath + File.separator + "TreeViewMaxFlow.png";
		Assert.assertTrue(imageMapTester.runMaximumImageMap(layoutExpected,viewExpected));
	}
	
	


	@AfterClass
	public static void closeAll()
	{
		TSAutomationTester.fullScreenBrowser();
		TSAutomationTester.closeCurrentBrowser();
		TSAutomationTester.closeAll();
	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

	static String projectName;

	static TSImageMapPreviewTestCases imageMapTester;
}
