import java.io.File;
import org.junit.Assert;



public class TSDesktopPreviewTestCases
{
	public TSEnvironment environmentTester;

	public TSTester testerTestCase;

	public String className;


	public TSDesktopPreviewTestCases(TSEnvironment environmentTestCase,
		TSTester tester,
		String className)
	{
		this.environmentTester = environmentTestCase;
		this.testerTestCase = tester;
		this.className = className;

	}


	public boolean testLaunchDesktopPreview()
	{
		System.out.println("testLaunchDesktopPreview");
		boolean result =
			TSFunctions.isDesktopPreviewLaunched(testerTestCase,
				environmentTester.projectImagesPath + File.separator
					+ "SocialNetworkDesktopDefault.png");

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testLaunchDesktopPreview", environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testIsToolBarPresent()
	{
		System.out.println("testToolBarPresent");
		boolean result =
			TSFunctions.isToolBarPresent(testerTestCase,
				environmentTester.projectImagesPath + File.separator
					+ "SocialNetworkAnalysisToolBar.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsToolBarPresent", environmentTester.evidencePath);

		}
		return result;
	}


	public boolean testIsTableViewPresent()
	{
		System.out.println("testIsTableViewPresent");
		boolean result =
			TSFunctions.isViewPresent(testerTestCase, environmentTester.projectImagesPath
				+ File.separator + "SocialNetworkAnalysisDesktopTableView.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsTableViewPresent", environmentTester.evidencePath);
		}
		return result;
	}


	public boolean testIsTreeViewPresent()
	{
		System.out.println("testIsTreeViewPresent");
		boolean result =
			TSFunctions.isViewPresent(testerTestCase, environmentTester.projectImagesPath
				+ File.separator + "SocialNetworkAnalysisDesktopTreeView.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsTreeViewPresent", environmentTester.evidencePath);
		}
		return result;

	}


	public boolean testIsOverviewPresent()
	{
		System.out.println("testIsOverViewPresent");
		testerTestCase.openOverviewDesktop();
		boolean result =
			TSFunctions.isOverviewPresent(testerTestCase,
				environmentTester.projectImagesPath + File.separator
					+ "overviewExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsOverviewPresent", environmentTester.evidencePath);
		}
		testerTestCase.closeOverviewDesktop();

		return result;
	}


	public boolean testCircularLayout()
	{
		System.out.println("testCircularLayout");
		testerTestCase.CircularLayoutDesktop();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				environmentTester.projectImagesPath + File.separator
					+ "SocialNetworkAnalysisDesktopCircularExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testCircularLayout", environmentTester.evidencePath);
		}

		testerTestCase.SymmetricLayoutDesktop();
		return result;
	}


	public boolean testHierarchicalLayout(String expected)
	{
		System.out.println("testHierarchicalLayout");
		testerTestCase.HierarchicalLayoutDesktop();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				expected,
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsOverviewPresent", environmentTester.evidencePath);
		}

		testerTestCase.SymmetricLayoutDesktop();
		return result;
	}


	public boolean testOnMouseHoverSaveAs()
	{
		System.out.println("******testOnMouseHoverSaveAs******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "SaveAsToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "SaveAsImage.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSaveAs", environmentTester.evidencePath);
		}
		return result;

	}


	public boolean testOnMouseHoverSelect()
	{
		System.out.println("******testOnMouseHoverSelect******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "SelectToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "Select.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSaveAs", environmentTester.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverPan()
	{
		System.out.println("******testOnMouseHoverPan******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "PanToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "Pan.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverPan", environmentTester.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverNavigateLinks()
	{
		System.out.println("******testOnMouseHoverNavigateLinks******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "NavigateLinksToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "NavigateLinks.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverNavigateLinks", environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverMarqueeZoom()
	{
		System.out.println("******testOnMouseHoverMarqueeZoom******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "MarqueeZoomToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "MarqueeZoom.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverMarqueeZoom", environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverZoomIn()
	{
		System.out.println("******testOnMouseHoverZoomIn******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "ZoomInToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "ZoomIn.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverZoomIn", environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverZoomOut()
	{
		System.out.println("******testOnMouseHoverZoomOut******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "ZoomOutToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "ZoomOut.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverZoomOut", environmentTester.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverZoomFit()
	{
		System.out.println("******testOnMouseHoverZoomFit******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "ZoomFitToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "ZoomFit.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverZoomFit", environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverOverview()
	{
		System.out.println("******testOnMouseHoverOverview******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "OverviewToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "Overview.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverOverview", environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverCircularLayout()
	{
		System.out.println("******testOnMouseHoverCircularLayout******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "CircularLayoutToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "CircularLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverCircularLayout", environmentTester.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverHierarchicalLayout()
	{
		System.out.println("******testOnMouseHoverCircularLayout******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "HierarchicalLayoutToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator
				+ "HierarchicalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverHierarchicalLayout", environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverOrthogonalLayout()
	{
		System.out.println("******testOnMouseHoverOrthogonalLayout******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "OrthogonalLayoutToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "OrthogonalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverOrthogonalLayout", environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverSymmetricLayout()
	{
		System.out.println("******testOnMouseHoverSymmetricLayout******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "SymmetricLayoutToolBarDesktopSelected.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "SymmetricLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSymmetricLayout", environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverGlobalLayout()
	{
		System.out.println("******testOnMouseHoverOrthogonalLayout******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "GlobalLayoutToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "GlobalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverGlobalLayout", environmentTester.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverIncrementalLayout()
	{
		System.out.println("******testOnMouseHoverIncrementalLayout******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "IncrementalLayoutToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator
				+ "IncrementalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverIncrementalLayout", environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverBetweenessCentrality()
	{
		System.out.println("******testOnMouseHoverBetweenesCentrality******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "BetweennessCentralityToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator
				+ "BetweennessCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testOnMouseHoverBetweenCentralityLayout",
				environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverClosenessCentralityLayout()
	{
		System.out.println("******testOnMouseHoverClosenessCentralityLayout******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "ClosenessCentralityToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator
				+ "ClosenessCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testOnMouseHoverClosenesCentralityLayout",
				environmentTester.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverDegreeCentralityLayout()
	{
		System.out.println("******testOnMouseHoverDegreeCentralityLayout******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "DegreeCentralityToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "DegreeCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testOnMouseHoverDegreeCentralityLayout",
				environmentTester.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverEigenVectorCentralityLayout()
	{
		System.out.println("******testOnMouseHoverEigenvectorCentralityLayout******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "EigenVectorCentralityToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator
				+ "EigenVectorCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverEigenVectorCentrality", environmentTester.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverSetSourceNode()
	{
		float similar = new Float(0.80);
		System.out.println("******testOnMouseHoverSetSourceNode******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "SetSourceNodeToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "SetSourceNode.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected,
				similar);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSetSourceNode", environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverSetSinkNode()
	{

		System.out.println("******testOnMouseHoverSetSinkNode******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "SetSinkNodeToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "SetSinkNode.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSetSinkNode", environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverRunMaximumFlow()
	{

		System.out.println("******testOnMouseHoverRunMaximumFlow******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "RunMaximumFlowToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "RunMaximumFlow.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRunMaximumFlow", environmentTester.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverMSlice()
	{
		System.out.println("******testOnMouseHoverMSlice******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "MSliceEnableToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "MSlice.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverMSlice", environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverInteractiveZoom()
	{
		System.out.println("******testOnMouseHoverInteractiveZoom******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "InteractiveZoomToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "InteractiveZoom.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverMarqueeZoom", environmentTester.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverClearResults()
	{

		System.out.println("******testOnMouseHoverClearResults******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "ClearResultsDisableToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "ClearResults.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverClearResults", environmentTester.evidencePath);
		}

		return result;
	}
	
	public boolean testOnMouseHoverPrintSetUp(){
		System.out.println("******testOnMouseHoverPrintSetUp******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator + "PrintSetUpToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "PrintSetUp.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverPrintSetUp", environmentTester.evidencePath);
		}
		return result;
	}
	
	public boolean testOnMouseHoverPrint(){
		System.out.println("******testOnMouseHoverPrint******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator + "PrintToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "Print.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverPrint", environmentTester.evidencePath);
		}
	 return result;	
	}
 

	public boolean testMaxFlowDefaultLayout()
	{
		System.out.println("******testMaxFlowDefaultLayout******");
		String imageExpected =
			environmentTester.projectImagesPath + File.separator + "MaxFlowDefault.png";
		float similar = new Float(0.80);
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase, imageExpected, similar);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testMaxFlowDefaultLayout", environmentTester.evidencePath);
		}
		return result;
	}
	
	public boolean testRunMaxFlow(){
		System.out.println("******testRunMaxFlow******");
		String expectedImage = environmentTester.projectImagesPath + File.separator + "MaxFlowExpected.png";
		boolean result = TSFunctions.runMaxFlowDesktop(testerTestCase, expectedImage, environmentTester);
		if(!result){
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testRunMaxFlow", environmentTester.evidencePath);
		}
		Assert.assertTrue(result);
		testerTestCase.clearResultsMaxFlowDesktop();
		
		return result;
	}
	
	public boolean testIsMSliceButtonEnable(){
		System.out.println("*******testIsMSliceButtonEnable******");

		boolean result =
			TSFunctions.isButtonPresent(testerTestCase, environmentTester.toolBarImagesPath
				+ File.separator + "MSliceEnableToolBarDesktop.png", new Float(0.65));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsMSliceButtonEnable", environmentTester.evidencePath);
		}
		return result;
	}
	
	public boolean testIsClearResultsButtonDisable()
	{
		System.out.println("*******testIsClearResultsButtonDisable******");

		boolean result =
			TSFunctions.isButtonPresent(testerTestCase, environmentTester.projectImagesPath
				+ File.separator + "clearResultsDisable.png", new Float(0.65));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "IsClearResultsButtonDisable", environmentTester.evidencePath);
		}
		
		return result;
	
	}
	
	public boolean testMSlice100()
	{
		System.out.println("******testMSlice100******");
		String msliceButton =
			environmentTester.projectImagesPath + File.separator + "MSlice.png";
		String comboButton = environmentTester.projectImagesPath + File.separator + "Combo.png";
		String minCapacityButton =
			environmentTester.projectImagesPath + File.separator + "MinCapacity.png";
		String capacity = environmentTester.projectImagesPath + File.separator + "100.png";
		String clearResultsButton =
			environmentTester.projectImagesPath + File.separator + "ClearResults.png";
		testerTestCase.runAlgorithm(msliceButton);
		testerTestCase.runAlgorithm(minCapacityButton);
		testerTestCase.runAlgorithm(comboButton);
		testerTestCase.runAlgorithm(capacity);
		boolean result =
			TSFunctions.isViewPresent(testerTestCase, environmentTester.projectImagesPath
				+ File.separator + "MinCapacity100.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testMSlice100", environmentTester.evidencePath);

		}
		
		testerTestCase.runAlgorithm(clearResultsButton);
		return result;
	}
	
	public boolean testMSlice1000()
	{
		System.out.println("******testMSlice1000******");
		String msliceButton =
			environmentTester.projectImagesPath + File.separator + "MSlice.png";
		String comboButton = environmentTester.projectImagesPath + File.separator + "Combo.png";
		String minCapacityButton =
			environmentTester.projectImagesPath + File.separator + "MinCapacity.png";
		String capacity = environmentTester.projectImagesPath + File.separator + "1000.png";
		String clearResultsButton =
			environmentTester.projectImagesPath + File.separator + "ClearResults.png";
		testerTestCase.runAlgorithm(msliceButton);
		testerTestCase.runAlgorithm(minCapacityButton);
		testerTestCase.runAlgorithm(comboButton);
		testerTestCase.runAlgorithm(capacity);
		boolean result =
			TSFunctions.isViewPresent(testerTestCase, environmentTester.projectImagesPath
				+ File.separator + "MinCapacity1000.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testMSlice1000", environmentTester.evidencePath);

		}
		testerTestCase.runAlgorithm(clearResultsButton);
		return result;
	}
	
	public boolean testOnMouseHoverRunAcyclicTest()
	{
		System.out.println("******testOnMouseHoverRunAcyclicTest******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "Run.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "RunAcyclicTest.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRunAcyclicTest", environmentTester.evidencePath);
		}
		
		return result;
	
	}	
	
	public boolean testIsRunAcyclicButtonEnable()
	{
		System.out.println("*******testRunAcyclicButtonEnable******");

		boolean result =
			TSFunctions.isButtonPresent(testerTestCase, environmentTester.projectImagesPath
				+ File.separator + "RunAcyclicTestEnable.png", new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "RunAcyclicButtonEnable", environmentTester.evidencePath);
		}
		return result;
	}
	
	public boolean testRunAcyclicTest(){
		boolean result = false;
		testerTestCase.runAlgorithm(environmentTester.toolBarImagesPath + File.separator
			+ "Run.png");
		if (TSFunctions.isButtonPresent(testerTestCase, environmentTester.projectImagesPath
			+ File.separator + "ClearResultsEnable.png")
			&& TSFunctions.isButtonPresent(testerTestCase,
				environmentTester.projectImagesPath + File.separator
					+ "RunAcyclicTestDisable.png")
			&& TSFunctions.isViewPresent(testerTestCase,
				environmentTester.projectImagesPath + File.separator + "TreeViewDesktop"))
		{
			result = true;
		}
		else
		{
			result = false;
		}

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testRunAcyclicTest", environmentTester.evidencePath);
		}
		testerTestCase.clearResults(environmentTester.toolBarImagesPath + File.separator
			+ "ClearResultsAcyclicEnableToolBarDesktop");
		return result;
	}


	
}
