import java.io.File;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;


public class TSSocialNetworkDesktopPreviewTest
{
	@BeforeClass
	public static void setUp() throws Exception
	{
		//org.sikuli.basics.Debug.setDebugLevel(3);
		className = TSSocialNetworkDesktopPreviewTest.class.getName();
		Settings.MoveMouseDelay = new Float(1.5);
		environment =
			new TSEnvironment("SocialNetworkAnalysis", TSEnvironment.DESKTOP_PREVIEW);
		TSAutomationTester = new TSTester();
		desktopTester = new TSDesktopPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester = TSFunctions.setDesktopTest(TSAutomationTester, "SocialNetworkProjectPath");
		environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);
	}

@AfterClass
public static void closeAll()
{
	TSAutomationTester.closeDekstopPreview();
	TSAutomationTester.closeAll();
}

	@Test
	public void testLaunchDesktopPreview()
	{
		System.out.println("testLaunchDesktopPreview");
		String imageExpected = environment.projectImagesPath + File.separator
			+ "SocialNetworkDesktopDefault.png";
		
		Assert.assertTrue(desktopTester.testLaunchDesktopPreview(imageExpected));

	}


	@Test
	public void testIsToolBarPresent()
	{
		
		Assert.assertTrue(desktopTester.testIsToolBarPresent());
	}


	@Test
	public void testIsTableViewPresent()
	{
		String expectedViewPath=environment.projectImagesPath
			+ File.separator + "SocialNetworkAnalysisDesktopTableView.png";
		Assert.assertTrue(desktopTester.testIsTableViewPresent(expectedViewPath));
	}


	@Test
	public void testIsTreeViewPresent()
	{

		Assert.assertTrue(desktopTester.testIsTreeViewPresent());
	}


	@Test
	public void testIsOverviewPresent()
	{

		Assert.assertTrue(desktopTester.testIsOverviewPresent());
	}


	@Test
	public void testCircularLayout()
	{
		String expectedLayoutPath=environment.projectImagesPath + File.separator
			+ "SocialNetworkAnalysisDesktopCircularExpected.png";
		Assert.assertTrue(desktopTester.testCircularLayout(expectedLayoutPath));
		
	}


	@Test
	public void testHierarchicalLayout()
	{
		String expected= environment.projectImagesPath + File.separator
			+ "SocialNetworkAnalysisDesktopHierarchicalExpected.png";
		
		Assert.assertTrue(desktopTester.testHierarchicalLayout(expected));
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
	public void testOnMouseHoverZoomIn()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverZoomIn());
	}


	@Test
	public void testOnMouseHoverZoomOut()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverZoomOut());
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
	public void testOnMouseHoverCircularLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverCircularLayout());
	}


	@Test
	public void testOnMouseHoverHierarchicalLayout()
	{

		Assert.assertTrue(desktopTester.testOnMouseHoverHierarchicalLayout());
	}


	@Test
	public void testOnMouseHoverOrthogonalLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverOrthogonalLayout());
	}


	@Test
	public void testOnMouseHoverSymmetricLayout()
	{

		Assert.assertTrue(desktopTester.testOnMouseHoverSymmetricLayout());
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
	public void testOnMouseHoverBetweenessCentrality()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverBetweenessCentrality());
	}


	@Test
	public void testOnMouseHoverClosenessCentralityLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverClosenessCentralityLayout());
	}


	@Test
	public void testOnMouseHoverDegreeCentralityLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverDegreeCentralityLayout());
	}


	@Test
	public void testOnMouseHoverEigenVectorCentralityLayout()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverEigenVectorCentralityLayout());
	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;
	
	static int screenId;
	
	static TSDesktopPreviewTestCases desktopTester;

}
