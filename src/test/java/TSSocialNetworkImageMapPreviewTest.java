import java.io.File;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;


public class TSSocialNetworkImageMapPreviewTest
{

	@BeforeClass
	public static void setUp()
	{
		//org.sikuli.basics.Debug.setDebugLevel(3);
		Settings.MoveMouseDelay = new Float(1.5);
		String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
		System.out.println(TSAutomationUtils.getOs());
		className = TSSocialNetworkImageMapPreviewTest.class.getName();
		environment =
			new TSEnvironment("SocialNetworkAnalysis",
				TSEnvironment.IMAGEMAP_PREVIEW,
				defaultBrowser);

		TSAutomationTester = new TSTester(defaultBrowser);
		TSAutomationTester.LaunchTS();
		TSAutomationTester.openProject("SocialNetworkProjectPath");
		TSAutomationTester.launchWebPreview();
		TSAutomationTester.fullScreenBrowser();
		TSAutomationUtils.pauseScript(new Long(2000));
		TSAutomationTester.refreshBrowser();

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
	public void testLaunchImageMap()
	{
		System.out.println("testLaunchWebPreview");

		boolean result =
			TSFunctions.isToolBarPresent(TSAutomationTester,
				environment.toolBarImagesPath + File.separator + "WebCommonToolBar.png");

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testLaunchWebPreview", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testIsPresentToolBar()
	{
		System.out.println("*******testIsPresentToolBar*******");

		boolean result =
			TSFunctions.isToolBarPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator + "ToolBarImageMap.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "IsPresentToolBar", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}


	@Test
	public void testIsTableViewPresent()
	{
		System.out.println("*******testIsTableViewPresent*******");

		boolean result =
			TSFunctions.isViewPresent(TSAutomationTester, environment.projectImagesPath
				+ File.separator + "TableViewImageMap.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsTableViewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}


	@Test
	public void testIsTreeViewPresent()
	{
		System.out.println("*******testIsTreeViewPresent*******");

		boolean result =
			TSFunctions.isViewPresent(TSAutomationTester, environment.projectImagesPath
				+ File.separator + "TreeViewImageMap.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsTableViewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
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
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
		System.out.println("*******testOnMouseHoverPan*******");

		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "PanImageMap.png";
		String imageExpected = environment.toolTipsImagePath + File.separator + "Pan.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
			environment.toolBarImagesPath + File.separator + "CircularLayoutImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "CircularLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
				+ "HierarchicaLayoutImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "HierarchicalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
			environment.toolBarImagesPath + File.separator
				+ "OrthogonalLayoutImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "OrthogonalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
			environment.toolBarImagesPath + File.separator
				+ "SymmetricLayoutImageMapSelected.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "SymmetricLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
			environment.toolBarImagesPath + File.separator + "GlobalLayoutImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "GlobalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
				+ "IncrementalLayoutImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "IncrementalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
				+ "BetweenesCentralityImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "BetweennessCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
				+ "ClosenessCentralityImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ClosenessCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
			environment.toolBarImagesPath + File.separator
				+ "DegreeCentralityImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "DegreeCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverDegreeCentrality", environment.evidencePath);
		}
		Assert.assertTrue(result);
	}


	@Test
	public void testOnMouseHoverEigenVectorCentralityLayout()
	{
		System.out.println("*******TestOnMouseHoverEigenVectorCentralityLayout*******");

		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "EigenVectorCentralityImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "EigenVectorCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverEigenVectorCentralityLayout", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testIsOverviewPresent()
	{
		Float similar = new Float(0.50);
		System.out.println("*******TestIsOverviewPresent*******");
		TSAutomationTester.openOverviewImageMap();
		boolean result =
			TSFunctions.isOverviewPresent(TSAutomationTester,
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
	public void testCircularLayout()
	{
		System.out.println("testCircularLayout");
		TSAutomationTester.CircularLayoutImageMap();
		boolean result =
			TSFunctions.isLayoutPresent(TSAutomationTester, environment.projectImagesPath
				+ File.separator + "CircularExpected.png", new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testCircularLayout", environment.evidencePath);
		}

		Assert.assertTrue(result);
		TSAutomationTester.SymmetricLayoutImageMap();
	}


	@Test
	public void testHierarchicalLayout()
	{
		System.out.println("testHierarchicalLayout");
		TSAutomationTester.HierarchicalLayoutImageMap();
		boolean result =
			TSFunctions.isLayoutPresent(TSAutomationTester, environment.projectImagesPath
				+ File.separator + "HierarchicalExpected.png", new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
		TSAutomationTester.SymmetricLayoutImageMap();
	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

}
