import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.sikuli.basics.Settings;


public class TSAcyclicHtml5PreviewTest
{
	@BeforeClass
	public static void setUp()
	{
		       // org.sikuli.basics.Debug.setDebugLevel(3);
				Settings.MoveMouseDelay = new Float(1.5);
				String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
				className = TSMaxFlowHtml5CanvasPreviewTest.class.getName();
				environment =
					new TSEnvironment("AcyclicTest", TSEnvironment.HTML5_PREVIEW, defaultBrowser);
				TSAutomationTester = new TSTester(defaultBrowser);
				html5Tester =
					new TSHtml5PreviewTestCases(environment, TSAutomationTester, className);
				TSAutomationTester =
					TSFunctions.setHtml5Test(TSAutomationTester, "AcyclicTestProjectPath");
				environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);
	}
	
	@AfterClass
	public static void closeAll()
	{
		TSAutomationTester.fullScreenBrowser();
		TSAutomationTester.closeCurrentBrowser();
		TSAutomationTester.closeAll();
	}
	
	@Test
	public void testOnMouseHoverSelect()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverSelect());
	}
	
	@Test
	public void testOnMouseHoverPan()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverPan());
	}


	@Test
	public void testOnMouseHoverNavigateLinks()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverNavigateLinks());
	}


	@Test
	public void testOnMouseHoverMarqueeZoom()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverMarqueeZoom());
	}


	@Test
	public void testOnMouseHoverZoomIn()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverZoomIn());
	}


	@Test
	public void testOnMouseHoverZoomOut()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverZoomOut());
	}


	@Test
	public void testOnMouseHoverZoomFit()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverZoomFit());
	}


	@Test
	public void testOnMouseHoverOverview()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverOverview());
	}
	
	@Test
	public void testOnMouseHoverHierarchicalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverHierarchicalLayout());
	}
	
	@Test
	public void testOnMouseHoverOrthogonalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverOrthogonalLayout());
	}
	
	@Test
	public void testOnMouseHoverRunAcyclicTest()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverRunAcyclicTest());
	}

	@Test
	public void testOnMouseHoverClearResults()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverClearResults());
	}

	
	@Test
	public void testHierarchicalLayout()
	{
		Assert.assertTrue(html5Tester.testHierarchicalLayout());
		
	}


	@Test
	public void testIsOverviewPresent()
	{

		Assert.assertTrue(html5Tester.testIsOverviewPresent());
	}


	@Test
	public void testIsRunAcyclicButtonEnable()
	{
		Assert.assertTrue(html5Tester.testIsRunAcyclicButtonEnable());
	}


	@Test
	public void testIsClearResultsButtonDisable()
	{
		Assert.assertTrue(html5Tester.testIsClearResultsButtonDisable());
	}


	@Test
	public void testRunAcyclicTest()
	{
	
		Assert.assertTrue(html5Tester.testRunAcyclicTest());

	}
	


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;
	
	static TSHtml5PreviewTestCases html5Tester;
}
