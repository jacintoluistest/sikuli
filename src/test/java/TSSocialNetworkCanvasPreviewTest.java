import java.io.File;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;


public class TSSocialNetworkCanvasPreviewTest
{

	@BeforeClass
	public static void setUp()
	{
		org.sikuli.basics.Debug.setDebugLevel(3);
		// org.sikuli.basics.Debug.setDebugLevel(3);
		className = TSSocialNetworkCanvasPreviewTest.class.getName();
		environment =
			new TSEnvironment("SocialNetworkAnalysis", TSEnvironment.HTML5_PREVIEW);
		TSAutomationTester = new TSTester();
		TSAutomationTester.LaunchTS();
		TSAutomationTester.openProject("SocialNetworkProyectPath");
		TSAutomationTester.launchHtml5Preview();
		TSAutomationTester.maximizeWindow();
		TSAutomationUtils.pauseScript(new Long(3000));
		TSAutomationTester.refreshChrome();
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
		TSAutomationTester.closeCurrentBrowser();
		TSAutomationTester.closeAll();
	}


	@Test
	public void testLaunchImageMapPreview()
	{
		System.out.println("testCanvasPreview");
		boolean result =
			TSTestCases.isCanvasPreviewLaunched(TSAutomationTester,
				environment.projectImagesPath + File.separator + "CanvasToolBar.png");

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testCanvasPreview", environment.evidencePath);
		}
		Assert.assertTrue(result);
	}


	@Test
	public void testOnMouseHoverSaveAsImage()
	{
		System.out.println("*******testHoverSaveAs*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "SaveAsCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "SaveAsImage.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testHoverSaveAs", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testOnMouseHoverSelect()
	{
		System.out.println("*******testOnMouseHoverSelect*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "SelectCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "Select.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
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
			environment.toolBarImagesPath + File.separator + "PanCanvas.png";
		String imageExpected = environment.toolTipsImagePath + File.separator + "Pan.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
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
		System.out.println("*******TestOnMouseHoverNavigateLinks*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "NavigateLinksCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "NavigateLinks.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
				imageToolBar,
				imageExpected);

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
		System.out.println("*******TestOnMouseHoverMarqueeZoom*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "MarqueeZoomCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "MarqueeZoom.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
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
			environment.toolBarImagesPath + File.separator + "ZoomInCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ZoomIn.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
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
			environment.toolBarImagesPath + File.separator + "ZoomOutCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ZoomOut.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
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
			environment.toolBarImagesPath + File.separator + "ZoomFitCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ZoomFit.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
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
			environment.toolBarImagesPath + File.separator + "OverviewCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "Overview.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
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
	public void testOnMouseHoverCircularLayout()
	{
		System.out.println("*******TestOnMouseHoverCircularLayout*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "CircularLayoutCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "CircularLayout.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverCircularLayout", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testOnMouseHoverHierarchicalLayout()
	{
		System.out.println("*******TestOnMouseHoverHierarchicalLayout*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "HierarchicalLayoutCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "HierarchicalLayout.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
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
	public void testOnMouseHoverOrthogonalLayout()
	{
		System.out.println("*******TestOnMouseHoverOrthogonalLayout*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "OrthogonalLayoutCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "OrthogonalLayout.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverOrthogonalLayout", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testOnMouseHoverSymmetricLayout()
	{
		System.out.println("*******TestOnMouseHoverSymmetricLayout*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "SymmetricLayoutCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "SymmetricLayout.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverSymmetricLayout", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testOnMouseHoverGlobalLayout()
	{
		System.out.println("*******TestOnMouseHoverGlobalLayout*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "GlobalLayoutCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "GlobalLayout.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
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
		System.out.println("*******TestOnMouseHoverIncrementalLayout*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "IncrementalLayoutCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "IncrementalLayout.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
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
	public void testOnMouseHoverBetweenCentralityLayout()
	{
		System.out.println("*******TestOnMouseHoverBetweenCentralityLayout*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "BetweennessCentralityCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "BetweennessCentrality.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverBetweenCentralityLayout", environment.evidencePath);
		}
		Assert.assertTrue(result);
	}


	@Test
	public void testOnMouseHoverClosenessCentralityLayout()
	{
		System.out.println("*******TestOnMouseHoverClosenessCentralityLayout*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "ClosenessCentralityCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ClosenessCentrality.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverClosenessCentralityLayout", environment.evidencePath);
		}
		Assert.assertTrue(result);
	}


	@Test
	public void testOnMouseHoverDegreeCentralityLayout()
	{
		System.out.println("*******TestOnMouseHoverDegreeCentralityLayout*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "DegreeCentralityCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "DegreeCentrality.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverClosenessCentralityLayout", environment.evidencePath);
		}
		Assert.assertTrue(result);
	}


	@Test
	public void testOnMouseHoverEigenVectorCentralityLayout()
	{
		System.out.println("*******TestOnMouseHoverEigenVectorCentralityLayout*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "EigenvectorCentralityCanvas.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "EigenvectorCentrality.png";
		boolean result =
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverEigenVectorCentralityLayout", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	
	public void testIsOverviewPresent()
	{
		System.out.println("*******TestIsOverviewPresent*******");
		TSAutomationTester.openOverviewHtml5();
		boolean result =
			TSTestCases.isOverviewPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator + "overviewExpected.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}
	
	@Test
	public void testCircularLayout()
	{
		System.out.println("testCircularLayout");
		TSAutomationTester.CircularLayoutHtml5();
		boolean result =
			TSTestCases.isOverviewPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator + "CircularExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
		TSAutomationTester.SymmetricLayoutHtml5();
	}
	
	@Test
	public void testHierarchicalLayout()
	{
		System.out.println("testHierarchicalLayout");
		TSAutomationTester.HierarchicalLayoutHtml5();
		boolean result =
			TSTestCases.isOverviewPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator + "HierarchicalExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
		TSAutomationTester.SymmetricLayoutHtml5();
	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

}
