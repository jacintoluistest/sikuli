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
		Settings.MoveMouseDelay = new Float(1.5);
		System.out.println(TSAutomationUtils.getOs());
		className = TSSocialNetworkImageMapPreviewTest.class.getName();
		environment =
			new TSEnvironment("SocialNetworkAnalysis", TSEnvironment.IMAGEMAP_PREVIEW);

		TSAutomationTester = new TSTester();
		TSAutomationTester.LaunchTS();
		TSAutomationTester.openProject("SocialNetworkProyectPath");
		TSAutomationTester.launchWebPreview();
		TSAutomationTester.maximizeWindow();
		TSAutomationUtils.pauseScript(new Long(3000));
		TSAutomationTester.refreshChrome();

		screenId = TSAutomationTester.automationTesterCurrentScreen.getID();
		if (screenId == 0)
		{
			if (TSAutomationUtils.getOs().contains("mac"))
			{
				environment.projectImagesPath =
					environment.projectImagesPath.concat(File.separator
						+ "SecondaryScreen");
				System.out.println(environment.projectImagesPath);

			}

			else
			{
				environment.projectImagesPath =
					environment.projectImagesPath.concat(File.separator + "PrimaryScreen");
				System.out.println(environment.projectImagesPath);
			}
		}
		else if (screenId == 1)
		{
			if (TSAutomationUtils.getOs().contains("mac"))
			{
				environment.projectImagesPath =
					environment.projectImagesPath.concat(File.separator + "PrimaryScreen");
				System.out.println(environment.projectImagesPath);

			}
			else
			{
				environment.projectImagesPath =
					environment.projectImagesPath.concat(File.separator
						+ "SecondaryScreen");
				System.out.println(environment.projectImagesPath);
			}
		}
		System.out.println(TSAutomationTester.automationTesterCurrentScreen.getBounds());

	}


	@Test
	public void testLaunchWebPreview()
	{
		System.out.println("testLaunchWebPreview");

		boolean result =
			TSTestCases.isToolBarPresent(TSAutomationTester,
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
			TSTestCases.isToolBarPresent(TSAutomationTester,
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
			TSTestCases.isToolBarPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator + "TableViewImageMap.png");
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
			TSTestCases.isToolTipPresentImageMap(TSAutomationTester,
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
	public void testOnMouseHoverMarqueeZoom()
	{

		System.out.println("*******TestOnMouseHoverMarqueeZoom*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "MarqueeZoomImageMap.png";
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
			environment.toolBarImagesPath + File.separator + "ZoomInImageMap.png";
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
			environment.toolBarImagesPath + File.separator + "ZoomOutImageMap.png";
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
			environment.toolBarImagesPath + File.separator + "ZoomFitImageMap.png";
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
			environment.toolBarImagesPath + File.separator + "OverviewImageMap.png";
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
			environment.toolBarImagesPath + File.separator + "CircularLayoutImageMap.png";
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
				+ "HierarchicaLayoutImageMap.png";
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
			environment.toolBarImagesPath + File.separator
				+ "OrthogonalLayoutImageMap.png";
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
			environment.toolBarImagesPath + File.separator
				+ "SymmetricLayoutImageMap.png";
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
			environment.toolBarImagesPath + File.separator + "GlobalLayoutImageMap.png";
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
				+ "IncrementalLayoutImageMap.png";
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
				+ "BetweenesCentralityImageMap.png";
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
				+ "ClosenessCentralityImageMap.png";
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
			environment.toolBarImagesPath + File.separator
				+ "DegreeCentralityImageMap.png";
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
	public void testOnMouseHoverEigenVectorCentralityLayout()
	{
		System.out.println("*******TestOnMouseHoverEigenVectorCentralityLayout*******");

		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "EigenVectorCentralityImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "EigenVectorCentrality.png";
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
		TSAutomationTester.openOverviewImageMap();
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
		TSAutomationTester.CircularLayoutImageMap();
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
		TSAutomationTester.SymmetricLayoutImageMap();
	}

	@Test
	public void testHierarchicalLayout()
	{
		System.out.println("testHierarchicalLayout");
		TSAutomationTester.HierarchicalLayoutImageMap();
		boolean result =
			TSTestCases.isOverviewPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator
					+ "HierarchicalExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
		TSAutomationTester.SymmetricLayoutImageMap();
	}


	@AfterClass
	public static void closeAll()
	{
		TSAutomationTester.closeCurrentBrowser();
		TSAutomationTester.closeAll();
	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

}
