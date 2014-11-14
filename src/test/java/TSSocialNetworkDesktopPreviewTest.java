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
		className = TSSocialNetworkDesktopPreviewTest.class.getName();
		Settings.MoveMouseDelay = new Float(1.5);
		environment =
			new TSEnvironment("SocialNetworkAnalysis", TSEnvironment.DESKTOP_PREVIEW);
		TSAutomationTester = new TSTester();
		TSAutomationTester.LaunchTS();
		TSAutomationTester.maximizeWindow();
		TSAutomationTester.openProject("SocialNetworkProjectPath");
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
	public void testLaunchDesktopPreview()
	{
		System.out.println("testLaunchDesktopPreview");
		boolean result =
			TSTestCases.isDesktopPreviewLaunched(TSAutomationTester,
				environment.projectImagesPath + File.separator
					+ "SocialNetworkDesktopDefault.png");

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testLaunchDesktopPreview", environment.evidencePath);
		}
		Assert.assertTrue(result);

	}


	@Test
	public void testIsToolBarPresent()
	{
		System.out.println("testToolBarPresent");
		boolean result =
			TSTestCases.isToolBarPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator
					+ "SocialNetworkAnalysisToolBar.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsToolBarPresent", environment.evidencePath);

		}
		Assert.assertTrue(result);
	}


	@Test
	public void testIsTableViewPresent()
	{
		System.out.println("testIsTableViewPresent");
		boolean result =
			TSTestCases.isViewPresent(TSAutomationTester, environment.projectImagesPath
				+ File.separator + "SocialNetworkAnalysisDesktopTableView.png");
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
		System.out.println("testIsTreeViewPresent");
		boolean result =
			TSTestCases.isViewPresent(TSAutomationTester, environment.projectImagesPath
				+ File.separator + "SocialNetworkAnalysisDesktopTreeView.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsTreeViewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}


	@Test
	public void testIsOverviewPresent()
	{
		System.out.println("testIsOverViewPresent");
		TSAutomationTester.openOverviewDesktop();
		boolean result =
			TSTestCases.isOverviewPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator + "overviewExpected.png",
				new Float(0.80));
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
		TSAutomationTester.CircularLayoutDesktop();
		boolean result =
			TSTestCases.isLayoutPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator
					+ "SocialNetworkAnalysisDesktopCircularExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testCircularLayout", environment.evidencePath);
		}

		Assert.assertTrue(result);
		TSAutomationTester.SymmetricLayoutDesktop();
	}


	@Test
	public void testHierarchicalLayout()
	{
		System.out.println("testHierarchicalLayout");
		TSAutomationTester.HierarchicalLayoutDesktop();
		boolean result =
			TSTestCases.isLayoutPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator
					+ "SocialNetworkAnalysisDesktopHierarchicalExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
		TSAutomationTester.SymmetricLayoutDesktop();
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
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "NavigateLinksToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "NavigateLinks.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
		System.out.println("******testOnMouseHoverMarqueeZoom******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "MarqueeZoomToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "MarqueeZoom.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
		System.out.println("******testOnMouseHoverZoomOut******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "ZoomOutToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ZoomOut.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
		System.out.println("******testOnMouseHoverZoomFit******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "ZoomFitToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ZoomFit.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
		System.out.println("******testOnMouseHoverOverview******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "OverviewToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "Overview.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
		System.out.println("******testOnMouseHoverCircularLayout******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "CircularLayoutToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "CircularLayout.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
		System.out.println("******testOnMouseHoverCircularLayout******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "HierarchicalLayoutToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "HierarchicalLayout.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
		System.out.println("******testOnMouseHoverOrthogonalLayout******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "OrthogonalLayoutToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "OrthogonalLayout.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
		System.out.println("******testOnMouseHoverSymmetricLayout******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "SymmetricLayoutToolBarDesktopSelected.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "SymmetricLayout.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
		System.out.println("******testOnMouseHoverOrthogonalLayout******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "GlobalLayoutToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "GlobalLayout.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
	public void testOnMouseHoverBetweenessCentrality()
	{
		System.out.println("******testOnMouseHoverBetweenesCentrality******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "BetweennessCentralityToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "BetweennessCentrality.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
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
		System.out.println("******testOnMouseHoverClosenessCentralityLayout******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "ClosenessCentralityToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ClosenessCentrality.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverClosenesCentralityLayout", environment.evidencePath);
		}

		Assert.assertTrue(result);

	}


	@Test
	public void testOnMouseHoverDegreeCentralityLayout()
	{
		System.out.println("******testOnMouseHoverDegreeCentralityLayout******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "DegreeCentralityToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "DegreeCentrality.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverDegreeCentralityLayout", environment.evidencePath);
		}

		Assert.assertTrue(result);

	}


	@Test
	public void testOnMouseHoverEigenVectorCentralityLayout()
	{
		System.out.println("******testOnMouseHoverEigenvectorCentralityLayout******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "EigenVectorCentralityToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "EigenVectorCentrality.png";
		boolean result =
			TSTestCases.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverEigenVectorCentrality", environment.evidencePath);
		}

		Assert.assertTrue(result);

	}


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;
	
	static int screenId;

}
