import java.io.File;



public class TSHtml5PreviewTestCases
{
	public TSEnvironment environmentTestCase;
	public TSTester testerTestCase;
	public String className;
	public TSHtml5PreviewTestCases(TSEnvironment environmentTestCase, TSTester tester, String className)
	{
		this.environmentTestCase = environmentTestCase;
		this.testerTestCase = tester;
		this.className = className;
		
	}
		
	
	public boolean testOnMouseHoverSaveAsImage()
	{
		
		System.out.println("*******testHoverSaveAs*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "SaveAsCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "SaveAsImage.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);
		return result;
	}
   

	
	public boolean testOnMouseHoverSelect()
	{
		System.out.println("*******testOnMouseHoverSelect*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "SelectCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "Select.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);
		
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverPan", environmentTestCase.evidencePath);
		}
		
		return result;

	}


	
	public boolean testOnMouseHoverPan()
	{
		System.out.println("*******testOnMouseHoverPan*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "PanCanvas.png";
		String imageExpected = environmentTestCase.toolTipsImagePath + File.separator + "Pan.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverPan", environmentTestCase.evidencePath);
		}
		return result;

	}


	
	public boolean testOnMouseHoverNavigateLinks()
	{
		System.out.println("*******TestOnMouseHoverNavigateLinks*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "NavigateLinksCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "NavigateLinks.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverNavigateLinks", environmentTestCase.evidencePath);
		}
				return result;

	}


	
	public boolean testOnMouseHoverMarqueeZoom()
	{
		System.out.println("*******TestOnMouseHoverMarqueeZoom*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "MarqueeZoomCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "MarqueeZoom.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverMarqueeZoom", environmentTestCase.evidencePath);
		}
				return result;

	}


	public boolean testOnMouseHoverZoomIn()
	{
		System.out.println("*******TestOnMouseHoverZoomIn*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "ZoomInCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "ZoomIn.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverZoomIn", environmentTestCase.evidencePath);
		}
				return result;

	}


	
	public boolean testOnMouseHoverZoomOut()
	{
		System.out.println("*******TestOnMouseHoverZoomOut*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "ZoomOutCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "ZoomOut.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverZoomOut", environmentTestCase.evidencePath);
		}
				return result;
	}


	
	public boolean testOnMouseHoverZoomFit()
	{
		System.out.println("*******TestOnMouseHoverZoomFit*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "ZoomFitCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "ZoomFit.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverZoomFit", environmentTestCase.evidencePath);
		}
				return result;

	}


	
	public boolean testOnMouseHoverOverview()
	{
		System.out.println("*******TestOnMouseHoverOverview*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "OverviewCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "Overview.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverOverview", environmentTestCase.evidencePath);
		}
				return result;

	}


	
	public boolean testOnMouseHoverCircularLayout()
	{
		System.out.println("*******TestOnMouseHoverCircularLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "CircularLayoutCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "CircularLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverCircularLayout", environmentTestCase.evidencePath);
		}
				return result;

	}


	
	public boolean testOnMouseHoverHierarchicalLayout()
	{
		System.out.println("*******TestOnMouseHoverHierarchicalLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "HierarchicalLayoutCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "HierarchicalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverHierarchicalLayout", environmentTestCase.evidencePath);
		}
				return result;

	}
	
	public boolean testOnMouseHoverHierarchicalLayout(String hierarchicalButton)
	{
		System.out.println("*******TestOnMouseHoverHierarchicalLayout*******");
		String imageToolBar =hierarchicalButton;
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "HierarchicalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverHierarchicalLayout", environmentTestCase.evidencePath);
		}
				return result;

	}


	
	public boolean testOnMouseHoverOrthogonalLayout()
	{
		System.out.println("*******TestOnMouseHoverOrthogonalLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "OrthogonalLayoutCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "OrthogonalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverOrthogonalLayout", environmentTestCase.evidencePath);
		}
				return result;

	}


	
	public boolean testOnMouseHoverSymmetricLayout()
	{
		System.out.println("*******TestOnMouseHoverSymmetricLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "SelectedSymmetricLayout.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "SymmetricLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSymmetricLayout", environmentTestCase.evidencePath);
		}
				return result;

	}


	
	public boolean testOnMouseHoverGlobalLayout()
	{
		System.out.println("*******TestOnMouseHoverGlobalLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "GlobalLayoutCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "GlobalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverGlobalLayout", environmentTestCase.evidencePath);
		}
				return result;

	}


	
	public boolean testOnMouseHoverIncrementalLayout()
	{
		System.out.println("*******TestOnMouseHoverIncrementalLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "IncrementalLayoutCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "IncrementalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverIncrementalLayout", environmentTestCase.evidencePath);
		}
				return result;
	}


	
	public boolean testOnMouseHoverBetweenCentralityLayout()
	{
		System.out.println("*******TestOnMouseHoverBetweenCentralityLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "BetweennessCentralityCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "BetweennessCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverBetweenCentralityLayout", environmentTestCase.evidencePath);
		}
				return result;
	}


	
	public boolean testOnMouseHoverClosenessCentralityLayout()
	{
		System.out.println("*******TestOnMouseHoverClosenessCentralityLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "ClosenessCentralityCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "ClosenessCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverClosenessCentralityLayout", environmentTestCase.evidencePath);
		}
				return result;
	}


	
	public boolean testOnMouseHoverDegreeCentralityLayout()
	{
		System.out.println("*******TestOnMouseHoverDegreeCentralityLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "DegreeCentralityCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "DegreeCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverClosenessCentralityLayout", environmentTestCase.evidencePath);
		}
				return result;
	}


	
	public boolean testOnMouseHoverEigenVectorCentralityLayout()
	{
		System.out.println("*******TestOnMouseHoverEigenVectorCentralityLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "EigenvectorCentralityCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "EigenvectorCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverEigenVectorCentralityLayout", environmentTestCase.evidencePath);
		}
				return result;

	}


	
	public boolean testIsOverviewPresent()
	{
		Float similar = new Float(0.75);
		System.out.println("*******TestIsOverviewPresent*******");
		testerTestCase.openOverviewHtml5();
		boolean result =
			TSFunctions.isOverviewPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator + "overviewExpected.png",
				similar);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsOverviewPresent", environmentTestCase.evidencePath);
		}
				return result;

	}


	
	public boolean testCircularLayout()
	{
		System.out.println("testCircularLayout");
		testerTestCase.CircularLayoutHtml5();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase, environmentTestCase.projectImagesPath
				+ File.separator + "CircularExpected.png", new Float(0.60));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsOverviewPresent", environmentTestCase.evidencePath);
		}

				
		testerTestCase.SymmetricLayoutHtml5();
		return result;
	}


	
	public boolean testHierarchicalLayout()
	{
		System.out.println("testHierarchicalLayout");
		testerTestCase.HierarchicalLayoutHtml5();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase, environmentTestCase.projectImagesPath
				+ File.separator + "HierarchicalExpected.png", new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsOverviewPresent", environmentTestCase.evidencePath);
		}

				
		testerTestCase.SymmetricLayoutHtml5();
		return result;
	}
	
	public boolean testOnMouseHoverInteractiveZoom(){
		System.out.println("*******TestOnMouseHoverInteractiveZoom*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "InteractiveZoomCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "InteractiveZoom.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverClosenessCentralityLayout", environmentTestCase.evidencePath);
		}
				return result;
	}
	
	
	public boolean testOnMouseHoverSetSourceNode(){
		System.out.println("*******TestOnMouseHoverSetSourceNode*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "SetSourceNodeDisableCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "SetSourceNode.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSetSourceNode", environmentTestCase.evidencePath);
		}
				return result;
	}
	
	public boolean testOnMouseHoverSetSinkNode(){
		System.out.println("*******TestOnMouseHoverSetSinkNode*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "SetSinkNodeDisableCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "SetSinkNode.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSetSinkNode", environmentTestCase.evidencePath);
		}
				return result;
	}
	
	public boolean testOnMouseHoverRunMaximumFlow(){
		System.out.println("*******TestOnMouseHoverRunMaximumFlowCanvas*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "RunMaximumFlowCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "RunMaximumFlow.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRunMaximumFlow", environmentTestCase.evidencePath);
		}
				return result;
	}
	
	public boolean testOnMouseHoverClearResults(){
		System.out.println("*******TestOnMouseHoverSetSinkNode*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "ClearResultsDisableCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "ClearResults.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase,
				imageToolBar,
				imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverClearResults", environmentTestCase.evidencePath);
		}
				return result;
	}
	
	public boolean runMaximumFlowHtml5(String expectedLayout, String expectedView)
	{
		System.out.println("*******runMaximumFlowHtml5*******");
		boolean result=TSFunctions.runMaxFlowHtml5(testerTestCase, expectedLayout,expectedView, environmentTestCase);
		
		
		
		return result;
	}
	
	
	
}
