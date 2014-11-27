import java.io.File;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.sikuli.basics.Settings;

public class TSSAcyclicImageMapPreviewTest
{
	
	@BeforeClass
	public static void setUp()
	{
		// org.sikuli.basics.Debug.setDebugLevel(3);
		Settings.MoveMouseDelay = new Float(1.5);
		String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
		className = TSSocialNetworkHtml5PreviewTest.class.getName();
		environment =
			new TSEnvironment("AcyclicTest",
				TSEnvironment.IMAGEMAP_PREVIEW,
				defaultBrowser);
		TSAutomationTester = new TSTester(defaultBrowser);
		TSAutomationTester.LaunchTS();
		TSAutomationTester.openProject("AcyclicTestProjectPath");
		TSAutomationTester.launchImageMap();
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
		TSAutomationTester.fullScreenBrowser();
		TSAutomationTester.closeCurrentBrowser();
		TSAutomationTester.closeAll();
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
	public void testOnMouseHoverHierarchicalLayout()
	{
		System.out.println("*******TestOnMouseHoverHierarchicalLayout*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "HierarchicalLayoutImageMap.png";
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
	public void testOnMouseHoverRunAcyclicTest()
	{
		System.out.println("******testOnMouseHoverRunAcyclicTest******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "RunAcyclicTestEnableImageMap.png";
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
		float similar = new Float(0.85);
		TSAutomationTester.runAlgorithm(environment.toolBarImagesPath + File.separator
			+ "RunAcyclicTestEnableImageMap");
		if (TSFunctions.isButtonPresent(TSAutomationTester, environment.projectImagesPath
			+ File.separator + "ClearResultsEnable.png",similar)
			&& TSFunctions.isButtonPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator
					+ "RunAcyclicTestDisable.png",similar)
			&& TSFunctions.isViewPresent(TSAutomationTester,
				environment.projectImagesPath + File.separator + "TreeViewImageMap"))
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
			+ "ClearResultsAcyclicEnableImageMap.png");
	}
	@Test
	public void testHierarchicalLayout()
	{
		System.out.println("testHierarchicalLayout");
		TSAutomationTester.HierarchicalLayoutDesktop();
		boolean result =
			TSFunctions.isLayoutPresent(TSAutomationTester, environment.projectImagesPath
				+ File.separator + "HierarchicalExpected.png", new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(TSAutomationTester, className
				+ "testIsOverviewPresent", environment.evidencePath);
		}

		Assert.assertTrue(result);
		TSAutomationTester.orthogonalLayoutImageMap();
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
	public void testOnMouseHoverSelect()
	{
		System.out.println("*******testOnMouseHoverSelect*******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator + "SelectImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "Select.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(TSAutomationTester,
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
		TSAutomationTester.closeOverview(environment.toolBarImagesPath + File.separator
			+ "OverviewSelectedImageMap.png");

	}


	@Test
	public void testOnMouseHoverClearResults()
	{
		System.out.println("******testOnMouseHoverClearResultsTest******");
		String imageToolBar =
			environment.toolBarImagesPath + File.separator
				+ "clearResultsAcyclicDisableImageMap.png";
		String imageExpected =
			environment.toolTipsImagePath + File.separator + "AcyclicClearResults.png";
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
	


	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;

	static int screenId;

}
