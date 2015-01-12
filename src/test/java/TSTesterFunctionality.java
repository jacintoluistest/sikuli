
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

		className = TSTesterFunctionality.class.getName();
		Settings.MoveMouseDelay = new Float(1.5);
		String defaultBrowser =TSAutomationUtils.getProperty("DefaultBrowser");
		environment =
			new TSEnvironment("SocialNetworkAnalysis", TSEnvironment.HTML5_PREVIEW,defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);		
		html5Tester = new TSHtml5PreviewTestCases(environment, TSAutomationTester, className);
		environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);
		TSAutomationUtils.pauseScript();

	}
	
	@AfterClass
	public static void closeAll()
	{
		// TSAutomationTester.fullScreenBrowser();
		// TSAutomationTester.closeCurrentBrowser();
		// TSAutomationTester.closeAll();
	}



	@Test
	public void testIsTableViewPresent()
	{
		String expected=environment.projectImagesPath
			+ File.separator + "TableViewCanvas.png";
		Assert.assertTrue(html5Tester.testIsTableViewPresent(expected));
	}


	@Test
	public void testIsTreeViewPresent()
	{
		String expected =  environment.projectImagesPath
			+ File.separator + "TreeViewCanvas.png";
		Assert.assertTrue(html5Tester.testIsTreeViewPresent(expected));
	}


	@Test
	public void testOnMouseHoverSaveAsImage()
	{
	
		Assert.assertTrue(html5Tester.testOnMouseHoverSaveAsImage());

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
	public void testOnMouseHoverCircularLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverCircularLayout());
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
	public void testOnMouseHoverSymmetricLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverSymmetricLayout());
	}


	@Test
	public void testOnMouseHoverGlobalLayout()
	{
		
		Assert.assertTrue(html5Tester.testOnMouseHoverGlobalLayout());

	}		
	@Test
	public void testOnMouseHoverIncrementalLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverIncrementalLayout());
	}


	@Test
	public void testOnMouseHoverBetweenCentralityLayout()
	{
		
		Assert.assertTrue(html5Tester.testOnMouseHoverBetweenCentralityLayout());
	}


	@Test
	public void testOnMouseHoverClosenessCentralityLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverClosenessCentralityLayout());
	}


	@Test
	public void testOnMouseHoverDegreeCentralityLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverDegreeCentralityLayout());
	}


	@Test
	public void testOnMouseHoverEigenVectorCentralityLayout()
	{
		Assert.assertTrue(html5Tester.testOnMouseHoverEigenVectorCentralityLayout());
	}


	@Test
	public void testIsOverviewPresent()
	{
		Assert.assertTrue(html5Tester.testIsOverviewPresent());
	}


	@Test
	public void testCircularLayout()
	{
		Assert.assertTrue(html5Tester.testCircularLayout());		
	}


	@Test
	public void testHierarchicalLayout()
	{
	
		Assert.assertTrue(html5Tester.testHierarchicalLayout());
	}

		
	
	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;
	
	static TSHtml5PreviewTestCases html5Tester;

}
