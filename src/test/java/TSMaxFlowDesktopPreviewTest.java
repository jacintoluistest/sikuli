import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;

public class TSMaxFlowDesktopPreviewTest
{
	@BeforeClass
	public static void setUp() throws Exception
	{
		//org.sikuli.basics.Debug.setDebugLevel(3);
		className = TSMaxFlowDesktopPreviewTest.class.getName();
		Settings.MoveMouseDelay = new Float(1.5);
		environment =
			new TSEnvironment("MaxFlow", TSEnvironment.DESKTOP_PREVIEW);
		TSAutomationTester = new TSTester();
		desktopTester = new TSDesktopPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester = TSFunctions.setDesktopTest(TSAutomationTester, "MaxFlowProjectPath");
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
	public void testOnMouseHoverZoomOut()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverZoomOut());
	}
	
	@Test
	public void testOnMouseHoverOverview()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverOverview());
	}
	
	@Test
	public void testOnMouseHoverHierarchicalLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverHierarchicalLayoutSelected());
	}
	
	@Test
	public void testOnMouseHoverGlobalLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverGlobalLayout());
	}


	@Test
	public void testOnMouseHoverIncrementalLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverIncrementalLayout());
	}	
	
	@Test
	public void testOnMouseHoverSetSourceNode(){
		Assert.assertTrue(desktopTester.testOnMouseHoverSetSourceNode());
	}
	
	@Test
	public void testOnMouseHoverSetSinkNode(){
		
		Assert.assertTrue(desktopTester.testOnMouseHoverSetSinkNode());
	}
	
	@Test
	public void testOnMouseHoverRunMaximumFlow(){

		Assert.assertTrue(desktopTester.testOnMouseHoverRunMaximumFlow());		
	}
	
	@Test
	public void testOnMouseHoverClearResults(){

		Assert.assertTrue(desktopTester.testOnMouseHoverClearResults());
	}
	
	@Test
	public void testMaxFlowDefaultLayout(){
		
		Assert.assertTrue(desktopTester.testMaxFlowDefaultLayout());
	}
	
	@Test
	public void testRunMaxFlow(){
		Assert.assertTrue(desktopTester.testRunMaxFlow());

	}

	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;
	
	static int screenId;
	
	static TSDesktopPreviewTestCases desktopTester;
}
