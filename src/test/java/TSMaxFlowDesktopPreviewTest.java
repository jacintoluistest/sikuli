import java.io.File;
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
		TSAutomationTester.LaunchTS();
		TSAutomationTester.maximizeWindow();
		TSAutomationTester.openProject("MaxFlowProjectPath");
		TSAutomationTester.launchDesktopPreview();
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
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "ZoomInToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ZoomIn.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
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
	public void testOnMouseHoverZoomOut()
	{
		System.out.println("******testOnMouseHoverZoomOut******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "ZoomOutToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ZoomOut.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
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
	public void testOnMouseHoverHierarchicalLayout()
	{
		System.out.println("******testOnMouseHoverCircularLayout******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "HierarchicalSelectedToolBarDEsktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "HierarchicalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverHierarchicalLayout", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}
	
	@Test
	public void testOnMouseHoverGlobalLayout()
	{
		System.out.println("******testOnMouseHoverOrthogonalLayout******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "GlobalLayoutToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "GlobalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverGlobalLayout", environment.evidencePath);
		}

		Assert.assertTrue(result);

	}


	@Test
	public void testOnMouseHoverIncrementalLayout()
	{
		System.out.println("******testOnMouseHoverIncrementalLayout******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "IncrementalLayoutToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "IncrementalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverIncrementalLayout", environment.evidencePath);
		}

		Assert.assertTrue(result);

	}	
	
	@Test
	public void testOnMouseHoverSetSourceNode(){
		float similar = new Float(0.80);
		System.out.println("******testOnMouseHoverSetSourceNode******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "SetSourceNodeToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "SetSourceNode.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected,similar);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverSetSourceNode", environment.evidencePath);
		}

		Assert.assertTrue(result);
		
	}
	
	@Test
	public void testOnMouseHoverSetSinkNode(){
		
		System.out.println("******testOnMouseHoverSetSinkNode******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "SetSinkNodeToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "SetSinkNode.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverSetSinkNode", environment.evidencePath);
		}

		Assert.assertTrue(result);
		
	}
	
	@Test
	public void testOnMouseHoverRunMaximumFlow(){
		
		System.out.println("******testOnMouseHoverRunMaximumFlow******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "RunMaximumFlowToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "RunMaximumFlow.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverRunMaximumFlow", environment.evidencePath);
		}

		Assert.assertTrue(result);
		
	}
	
	@Test
	public void testOnMouseHoverClearResults(){
		
		System.out.println("******testOnMouseHoverClearResults******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "ClearResultsDisableToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ClearResults.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverClearResults", environment.evidencePath);
		}

		Assert.assertTrue(result);
		
	}
	
	@Test
	public void testMaxFlowDefaultLayout(){
		System.out.println("******testMaxFlowDefaultLayout******");
		String imageExpected = environment.projectImagesPath + File.separator + "MaxFlowDefault.png";
		float similar = new Float(0.80);
		boolean result =
		TSFunctions.isLayoutPresent(TSAutomationTester, imageExpected, similar);
		if(!result){
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testMaxFlowDefaultLayout", environment.evidencePath);
		}
		Assert.assertTrue(result);
	}
	
	@Test
	public void testRunMaxFlow(){
		System.out.println("******testRunMaxFlow******");
		String expectedImage = environment.projectImagesPath + File.separator + "MaxFlowExpected.png";
		boolean result = TSFunctions.runMaxFlowDesktop(TSAutomationTester, expectedImage, environment);
		if(!result){
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testRunMaxFlow", environment.evidencePath);
		}
		Assert.assertTrue(result);
		TSAutomationTester.clearResultsMaxFlowDesktop();
		

	}

	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;
	
	static int screenId;
}
