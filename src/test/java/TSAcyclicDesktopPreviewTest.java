import java.io.File;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;


public class TSAcyclicDesktopPreviewTest
{
	@BeforeClass
	public static void setUp() throws Exception
	{
		org.sikuli.basics.Debug.setDebugLevel(3);
		className = TSAcyclicDesktopPreviewTest.class.getName();
		Settings.MoveMouseDelay = new Float(1.5);
		environment =
			new TSEnvironment("AcyclicTest", TSEnvironment.DESKTOP_PREVIEW);
		TSAutomationTester = new TSTester();
		TSAutomationTester.LaunchTS();
		TSAutomationTester.maximizeWindow();
		TSAutomationTester.openProject("AcyclicTestProjectPath");
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
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "NavigateLinksToolBarDesktop.png";
		String imageExpected = environment.toolTipsImagePath + File.separator + "NavigateLinks.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
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
				+ "testOnMouseHoverInteractiveZoom", environment.evidencePath);
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
				+ "HierarchicalLayoutToolBarDesktop.png";
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
	public void testOnMouseHoverOrthogonalLayout()
	{
		System.out.println("******testOnMouseHoverOrthogonalLayout******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "OrthogonalLayoutToolBarDesktopSelected.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "OrthogonalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
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
	public void testOnMouseHoverRunAcyclicTest()
	{
		System.out.println("******testOnMouseHoverRunAcyclicTest******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "RunAcyclicTestEnableToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "RunAcyclicTest.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverRunAcyclicTest", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}

	@Test
	public void testOnMouseHoverClearResults()
	{
		System.out.println("******testOnMouseHoverRunAcyclicTest******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "clearResultsAcyclicDisableToolBarDesktop.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "ClearResults.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(TSAutomationTester,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testOnMouseHoverAcyclicClearResults", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}
	
	@Test
	public void testHierarchicalLayout()
	{
		System.out.println("testHierarchicalLayout");
		TSAutomationTester.HierarchicalLayoutDesktop();
		boolean result =
			TSFunctions.isLayoutPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator
					+ "AcyclicTestDesktopHierarchicalExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
		TSAutomationTester.orthogonalLayoutDesktop();
	}


	@Test
	public void testIsOverviewPresent()
	{
		System.out.println("testIsOverViewPresent");
		TSAutomationTester.openOverviewDesktop();
		boolean result =
			TSFunctions.isOverviewPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator + "overviewExpected.png",
				new Float(0.65));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
		TSAutomationTester.closeOverviewDesktop();
	}


	@Test
	public void testIsRunAcyclicButtonEnable()
	{
		System.out.println("*******testRunAcyclicButtonEnable******");

		boolean result =
			TSFunctions.isButtonPresent(TSAutomationTester, environment.projectImagesPath
				+ File.separator + "RunAcyclicTestEnable.png", new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "RunAcyclicButtonEnable", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}


	@Test
	public void testIsClearResultsButtonDisable()
	{
		System.out.println("*******testIsClearResultsButtonDisable******");

		boolean result =
			TSFunctions.isButtonPresent(TSAutomationTester, environment.projectImagesPath
				+ File.separator + "clearResultsDisable.png", new Float(0.65));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "IsClearResultsButtonDisable", environment.evidencePath);
		}

		Assert.assertTrue(result);
	}


	@Test
	public void testRunAcyclicTest()
	{
		boolean result = false;
		TSAutomationTester.runAlgorithm(environment.toolBarImagesPath + File.separator
			+ "RunAcyclicTestEnableToolBarDesktop.png");
		if (TSFunctions.isButtonPresent(TSAutomationTester, environment.projectImagesPath
			+ File.separator + "ClearResultsEnable.png")
			&& TSFunctions.isButtonPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator
					+ "RunAcyclicTestDisable.png")
			&& TSFunctions.isViewPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator + "TreeViewDesktop"))
		{
			result = true;
		}
		else
		{
			result = false;
		}

		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testRunAcyclicTest", environment.evidencePath);
		}

		Assert.assertTrue(result);

		TSAutomationTester.clearResults(environment.toolBarImagesPath + File.separator
			+ "ClearResultsAcyclicEnableToolBarDesktop");
	}
	
	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;
	
	static int screenId;
}

