
package com.tomsawyer.perspectives.automation.sikuli.tests;


import java.io.File;
import org.junit.Test;


public class TSImageMapPreviewTestCases
{
	public TSEnvironment environmentTestCase;

	public TSTester testerTestCase;

	public String className;


	public TSImageMapPreviewTestCases(TSEnvironment environmentTestCase,
		TSTester tester,
		String className)
	{
		this.environmentTestCase = environmentTestCase;
		this.testerTestCase = tester;
		this.className = className;

	}


	public boolean testOnMouseHoverSaveAsImage()
	{

		System.out.println("*******testHoverSaveAs*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "SaveAsImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "SaveAsImage.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);
		return result;
	}


	public boolean testOnMouseHoverPrintSetUp()
	{
		System.out.println("*******testHoverPrintSetUp*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "PrintSetUpImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "PrintSetUp.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testHoverPrintSetUp", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverPrintPreview()
	{
		System.out.println("*******testHoverPrintPreview*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "PrintPreviewImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "PrintSetUp.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testHoverPrintPreview", environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverSelect()
	{
		System.out.println("*******testOnMouseHoverSelect*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "SelectImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "Select.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
			environmentTestCase.toolBarImagesPath + File.separator + "PanImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "Pan.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverPan", environmentTestCase.evidencePath);
		}
		return result;

	}


	public boolean testOnMouseHoverMarqueeZoom()
	{
		System.out.println("*******TestOnMouseHoverMarqueeZoom*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "MarqueeZoomImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "MarqueeZoom.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
			environmentTestCase.toolBarImagesPath + File.separator + "ZoomInImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "ZoomIn.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
			environmentTestCase.toolBarImagesPath + File.separator
				+ "ZoomOutImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "ZoomOut.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
			environmentTestCase.toolBarImagesPath + File.separator
				+ "ZoomFitImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "ZoomFit.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
			environmentTestCase.toolBarImagesPath + File.separator
				+ "OverviewImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "Overview.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
			environmentTestCase.toolBarImagesPath + File.separator
				+ "CircularLayoutImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "CircularLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
				+ "HierarchicalLayoutImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "HierarchicalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverHierarchicalLayout", environmentTestCase.evidencePath);
		}
		return result;

	}


	public boolean testOnMouseHoverHierarchicalLayoutSelected()
	{
		System.out.println("*******TestOnMouseHoverHierarchicalLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "HierarchicalLayoutSelectedImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "HierarchicalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
		String imageToolBar = hierarchicalButton;
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "HierarchicalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
			environmentTestCase.toolBarImagesPath + File.separator
				+ "OrthogonalLayoutImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "OrthogonalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverOrthogonalLayout", environmentTestCase.evidencePath);
		}
		return result;

	}


	public boolean testOnMouseHoverOrthogonalLayoutSelected()
	{
		System.out.println("*******TestOnMouseHoverOrthogonalLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "OrthogonalLayoutImageMapSelected.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "OrthogonalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
				+ "SymmetricLayoutImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "SymmetricLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSymmetricLayout", environmentTestCase.evidencePath);
		}
		return result;

	}


	public boolean testOnMouseHoverSymmetricLayoutSelected()
	{
		System.out.println("*******TestOnMouseHoverSymmetricLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "SymmetricLayoutImageMapSelected.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "SymmetricLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
			environmentTestCase.toolBarImagesPath + File.separator
				+ "GlobalLayoutImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "GlobalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
				+ "IncrementalLayoutImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "IncrementalLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
				+ "BetweennessCentralityImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "BetweennessCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testOnMouseHoverBetweenCentralityLayout",
				environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverClosenessCentralityLayout()
	{
		System.out.println("*******TestOnMouseHoverClosenessCentralityLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "ClosenessCentralityImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "ClosenessCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testOnMouseHoverClosenessCentralityLayout",
				environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverDegreeCentralityLayout()
	{
		System.out.println("*******TestOnMouseHoverDegreeCentralityLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "DegreeCentralityImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "DegreeCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testOnMouseHoverClosenessCentralityLayout",
				environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverEigenVectorCentralityLayout()
	{
		System.out.println("*******TestOnMouseHoverEigenVectorCentralityLayout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "EigenvectorCentralityImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "EigenvectorCentrality.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testOnMouseHoverEigenVectorCentralityLayout",
				environmentTestCase.evidencePath);
		}
		return result;

	}


	public boolean testOnMouseHoverUndo()
	{
		System.out.println("*******TestOnMouseHoverUndo*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "undoDisabled.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "undo.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverUndo", environmentTestCase.evidencePath);
		}
		return result;

	}


	public boolean testOnMouseHoverRedo()
	{
		System.out.println("*******TestOnMouseHoverRedo*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "redoDisabled.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "redo.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRedo", environmentTestCase.evidencePath);
		}
		return result;

	}


	public boolean testOnMouseHoverShowAbout()
	{
		System.out.println("*******TestOnMouseHoverShowAbout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "showAboutImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "showAbout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRedo", environmentTestCase.evidencePath);
		}
		return result;

	}


	public boolean testIsOverviewPresent()
	{
		Float similar = new Float(0.75);
		System.out.println("*******TestIsOverviewPresent*******");
		testerTestCase.openOverviewImageMap();
		boolean result =
			TSFunctions.isOverviewPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "overviewExpected.png",
				similar);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsOverviewPresent", environmentTestCase.evidencePath);
		}
		testerTestCase.closeOverviewImageMap();
		return result;

	}


	public boolean testCircularLayout()
	{
		System.out.println("testCircularLayout");
		testerTestCase.CircularLayoutHtml5();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "circularExpected.png",
				new Float(0.60));
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
		System.out.println("****testHierarchicalLayout******");
		testerTestCase.HierarchicalLayoutImageMap();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "hierarchicalExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOrthogonalLayout", environmentTestCase.evidencePath);
		}

		testerTestCase.undoImageMap();
		return result;
	}


	public boolean testOrthogonalLayout()
	{
		System.out.println("****testOrthogonalLayout******");
		testerTestCase.orthogonalLayoutImageMap();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "orthogonalExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOrthogonalLayout", environmentTestCase.evidencePath);
		}

		testerTestCase.undoImageMap();
		return result;
	}


	public boolean testSymmetricLayout()
	{
		System.out.println("****testSymmetricLayout******");
		testerTestCase.SymmetricLayoutImageMap();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "symmetricExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testSymmetricLayout", environmentTestCase.evidencePath);
		}

		testerTestCase.undoImageMap();
		return result;
	}


	public boolean testSymmetricLayoutSelected()
	{
		System.out.println("****testSymmetricLayout******");
		String symmetricLayoutSelected = "";
		testerTestCase.SymmetricLayoutImageMap(symmetricLayoutSelected);
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "SymmetricExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testSymmetricLayout", environmentTestCase.evidencePath);
		}

		testerTestCase.undoImageMap();
		return result;
	}


	public boolean testSymmetricLayout(String symmetricToolBar)
	{
		System.out.println("****testSymmetricLayout******");
		testerTestCase.SymmetricLayoutImageMap(symmetricToolBar);
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "SymmetricExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testSymmetricLayout", environmentTestCase.evidencePath);
		}

		testerTestCase.undoImageMap();
		return result;
	}


	public boolean testOnMouseHoverInteractiveZoom()
	{
		System.out.println("*******TestOnMouseHoverInteractiveZoom*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "InteractiveZoomImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "InteractiveZoom.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testOnMouseHoverClosenessCentralityLayout",
				environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverSetSourceNode()
	{
		System.out.println("*******TestOnMouseHoverSetSourceNode*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "SetSourceNodeDisableImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "SetSourceNode.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSetSourceNode", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverSetSinkNode()
	{
		System.out.println("*******TestOnMouseHoverSetSinkNode*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "SetSinkNodeDisableImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "SetSinkNode.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSetSinkNode", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverRunMaximumFlow()
	{
		System.out.println("*******TestOnMouseHoverRunMaximumFlowCanvas*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "RunMaximumFlowImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "RunMaximumFlow.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRunMaximumFlow", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverRunRootCause()
	{
		System.out.println("*******TestOnMouseHoverRunRootCauseImageMap*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "RunImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "RunRootCause.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRunMaximumFlow", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverSetEffectNodes()
	{
		System.out.println("*******TestOnMouseHoverSetEffectNodesImageMap*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "SetEffectNodesImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "SetEffectNodes.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRunMaximumFlow", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverSetStartNode()
	{

		System.out.println("******testOnMouseHoverSetSinkNode******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "setStartNodeToolBarDesktop.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "SetStartNode.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSetStartNode", environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverSetFinishNode()
	{

		System.out.println("******testOnMouseHoverSetFinishNode******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "setFinishNodeToolBarDesktop.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "SetFinishNode.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSetFinishNode", environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverClearResults()
	{
		System.out.println("*******TestOnMouseHoverClearResults*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "ClearResultsDisableImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "ClearResults.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverClearResults", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverCreateTask()
	{
		System.out.println("******testOnMouseHoverCreateTask******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "AddNodeImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "CreateTask.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverCreateTask", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverCreateDependency()
	{
		System.out.println("******testOnMouseHoverCreateTask******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "AddConnectionImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "CreateDependency.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverCreateTask", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverRunTopologicalResult()
	{
		System.out.println("******testOnMouseHoverRunTopologicalResult******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "RunImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "RunTopologicalSort.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testOnMouseHoverRunTopologicalResult",
				environmentTestCase.evidencePath);
		}

		return result;

	}
	
	public boolean testOnMouseHoverRunBiconnectedComponentsAnalysis()
	{
		System.out.println("******testOnMouseHoverRun******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "RunImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "RunBiconnectedComponentsAnalysis.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRunAcyclicTest", environmentTestCase.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverRunShortestPaths()
	{

		System.out.println("******testOnMouseHoverRunRootCause******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "RunDisabledImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "RunShortestPaths.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRunShortestPaths", environmentTestCase.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverDeleteDisabled()
	{
		System.out.println("******testOnMouseHoverDeleteDisabled******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "DeleteDisableToolBarDesktop.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "Delete.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverCreateTask", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean runMaximumImageMap(String expectedLayout, String expectedView)
	{
		System.out.println("*******runMaximumFlowImageMap*******");
		boolean result =
			TSFunctions.runMaxFlowImageMap(testerTestCase,
				expectedLayout,
				expectedView,
				environmentTestCase);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "runMaximumImageMap", environmentTestCase.evidencePath);
		}

		return result;
	}


	@Test
	public boolean testMSlice100()
	{
		System.out.println("******testMSlice100******");
		String minCapacity =
			environmentTestCase.projectImagesPath + File.separator + "100ImageMap.png";
		String expectedLayout =
			environmentTestCase.projectImagesPath + File.separator + "MinCapacity100.png";
		String clearResultsButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "ClearResultsEnableImageMap.png";
		boolean result =
			TSFunctions.runMSliceImageMap(testerTestCase, minCapacity, expectedLayout);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testMSlice100",
				environmentTestCase.evidencePath);

		}

		testerTestCase.clearResults(clearResultsButton);
		testerTestCase.refreshBrowser();
		return result;
	}


	public boolean testMSlice1000()
	{

		System.out.println("******testMSlice1000******");
		String minCapacity =
			environmentTestCase.projectImagesPath + File.separator + "1000ImageMap.png";
		String expectedLayout =
			environmentTestCase.projectImagesPath + File.separator
				+ "MinCapacity1000.png";
		String clearResultsButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "ClearResultsEnableImageMap.png";
		boolean result =
			TSFunctions.runMSliceImageMap(testerTestCase, minCapacity, expectedLayout);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testMSlice1000",
				environmentTestCase.evidencePath);

		}

		testerTestCase.clearResults(clearResultsButton);
		testerTestCase.refreshBrowser();
		return result;
	}


	public boolean testOnMouseHoverRunAcyclicTest()
	{
		System.out.println("******testOnMouseHoverRunAcyclicTest******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "RunImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "RunAcyclicTest.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRunAcyclicTest", environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverRunBridgeDetection()
	{
		System.out.println("******testOnMouseHoverRunAcyclicTest******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "RunImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "RunBridgeDetection.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRunAcyclicTest", environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testIsRunAcyclicButtonEnable()
	{
		System.out.println("*******testRunAcyclicButtonEnable******");

		boolean result =
			TSFunctions.isButtonPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "RunAcyclicTestEnable.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "RunAcyclicButtonEnable", environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testIsClearResultsButtonDisable()
	{
		System.out.println("*******testIsClearResultsButtonDisable******");

		boolean result =
			TSFunctions.isButtonPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "clearResultsDisable.png",
				new Float(0.65));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "IsClearResultsButtonDisable", environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testRunAcyclicTest()
	{
		System.out.println("*******testRunAcyclicTest******");
		boolean result = false;
		float similar = new Float(0.85);
		testerTestCase.runAlgorithm(environmentTestCase.toolBarImagesPath
			+ File.separator + "RunImageMap");
		if (TSFunctions.isButtonPresent(testerTestCase,
			environmentTestCase.projectImagesPath + File.separator
				+ "ClearResultsEnable.png",
			similar)
			&& TSFunctions.isButtonPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "RunAcyclicTestDisable.png",
				similar)
			&& TSFunctions.isViewPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "TreeViewImageMap"))
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
				+ "testRunAcyclicTest", environmentTestCase.evidencePath);
		}

		testerTestCase.clearResults(environmentTestCase.toolBarImagesPath
			+ File.separator + "ClearResultsAcyclicEnableImageMap.png");
		return result;
	}


	public boolean testOnMouseHoverMSlice()
	{
		System.out.println("*******TestOnMouseHoverMSlice*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "MSliceImageMap.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "MSlice.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverOverview", environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testIsPresentToolBar()
	{
		System.out.println("*******testIsPresentToolBar*******");

		boolean result =
			TSFunctions.isToolBarPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "ToolBarImageMap.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "IsPresentToolBar", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testIsTableViewPresent(String expectedViewPath)
	{
		System.out.println("*****testIsTableViewPresent*****");
		boolean result = TSFunctions.isViewPresent(testerTestCase, expectedViewPath);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsTableViewPresent", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testIsTableViewPresent()
	{
		System.out.println("*******testIsTableViewPresent*******");

		boolean result =
			TSFunctions.isViewPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "TableViewImageMap.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsTableViewPresent", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testIsTableViewPresent(String tableViewTab,
		String expectedViewPath,
		String defaultTab)
	{
		System.out.println("testIsTableViewPresent");
		boolean result = false;
		testerTestCase.clickOnElement(tableViewTab);
		TSFunctions.isViewPresent(testerTestCase, expectedViewPath);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsTableViewPresent", environmentTestCase.evidencePath);
		}
		testerTestCase.clickOnElement(defaultTab);
		return result;
	}


	public boolean testIsTreeViewPresent()
	{
		System.out.println("*******testIsTreeViewPresent*******");

		boolean result =
			TSFunctions.isViewPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "TreeViewImageMap.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsTableViewPresent", environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testIsTreeViewPresent(String treeViewExpected)
	{
		System.out.println("testIsTreeViewPresent");
		boolean result = TSFunctions.isViewPresent(testerTestCase, treeViewExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsTreeViewPresent", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testIsTreeViewPresent(String treeViewTab,
		String treeViewExpected,
		String defaultTreeViewTab)
	{
		System.out.println("testIsTreeViewPresent");
		testerTestCase.clickOnElement(treeViewTab);
		boolean result = TSFunctions.isViewPresent(testerTestCase, treeViewExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsTreeViewPresent", environmentTestCase.evidencePath);
		}

		testerTestCase.clickOnElement(defaultTreeViewTab);
		return result;

	}


	public boolean testDrawView(String drawTab, String drawExpected, String defaultTabDraw)
	{
		boolean result = false;
		testerTestCase.clickOnElement(drawTab);
		if (TSFunctions.isButtonPresent(testerTestCase, drawTab))
		{
			result = true;
		}
		TSFunctions.defaultDraw(testerTestCase, defaultTabDraw);
		return result;
	}


	public boolean testDefautlDraw(String defaultDrawExpected)
	{	
		System.out.println("*******testDefautlDraw*******");
		boolean result = false;
		if (TSFunctions.isDrawPresent(testerTestCase, defaultDrawExpected))
		{
			result = true;
		}
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testDefaultDraw",
				environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testShortestPathsButtonsState()
	{
		String setStartNodeButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "setStartNodeDisabledImageMap.png";
		String setFinishNodeButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "setFinishNodeDisabledImageMap.png";
		String runShortestPathsButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "RunToolDisabledImageMap.png";
		String clearResultsButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "ClearResultsDisabledImageMap.png";
		boolean result = false;

		if (TSFunctions.isButtonPresent(testerTestCase, setStartNodeButton)
			&& TSFunctions.isButtonPresent(testerTestCase, setFinishNodeButton)
			&& TSFunctions.isButtonPresent(testerTestCase, runShortestPathsButton)
			&& TSFunctions.isButtonPresent(testerTestCase, clearResultsButton))
		{
			result = true;
		}

		return result;
	}


	public boolean runShortestPathsAlgorithm()
	{
		boolean result = false;

		String setStartNodeButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "setStartNodeToolBarDesktop.png";
		String setFinishNodeButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "setFinishNodeToolBarDesktop.png";
		String runShortestPathsButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "RunToolBarDesktop.png";

		String startNode =
			environmentTestCase.projectImagesPath + File.separator + "startNode.png";
		String finishNode =
			environmentTestCase.projectImagesPath + File.separator + "finishNode.png";

		String layoutExpected =
			environmentTestCase.projectImagesPath + File.separator
				+ "ShortestPathsExpected.png";
		String treeViewExpected =
			environmentTestCase.projectImagesPath + File.separator
				+ "TreeViewExpected.png";

		testerTestCase.clickOnElement(startNode);
		testerTestCase.clickOnElement(setStartNodeButton);
		testerTestCase.clickOnElement(finishNode);
		testerTestCase.clickOnElement(setFinishNodeButton);
		testerTestCase.clickOnElement(runShortestPathsButton);

		if (TSFunctions.isLayoutPresent(testerTestCase, layoutExpected)
			&& TSFunctions.isViewPresent(testerTestCase, treeViewExpected))
		{
			result = true;
		}

		testerTestCase.clearResultsMaxFlowDesktop();

		return result;
	}


	public boolean testIsInspectorViewPresentCurriculum()
	{
		System.out.println("testIsInspectorViewPresent");
		String node =
			environmentTestCase.projectImagesPath + File.separator + "cs201Node.png";
		testerTestCase.clickOnElement(node);
		boolean result =
			TSFunctions.isViewPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "InspectorViewExpected.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsInspectorViewPresent", environmentTestCase.evidencePath);
		}

		TSFunctions.clickBlankRegion(testerTestCase);

		return result;

	}


	public boolean testIsInspectorViewPresent(String nodeToSelect,
		String inspectorViewExpected)
	{
		System.out.println("*****testIsInspectorViewPresent*****");
		String closeNodeImagePath =
			environmentTestCase.toolBarImagesPath + File.separator + "";
		boolean result = false;
		testerTestCase.clickOnElement(nodeToSelect);
		result = TSFunctions.isViewPresent(testerTestCase, inspectorViewExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsInspectorViewPresent", environmentTestCase.evidencePath);
		}

		TSFunctions.closeTreeNode(testerTestCase, closeNodeImagePath);
		TSFunctions.clickBlankRegion(testerTestCase);
		return result;

	}


	public boolean testIsOpenWebPageEnabledCurriculum()
	{
		boolean result = false;
		String node =
			environmentTestCase.projectImagesPath + File.separator + "cs201Node.png";
		String elementImagePath =
			environmentTestCase.projectImagesPath + File.separator + "openWebPage.png";
		testerTestCase.rightClickOnElement(node);
		result = TSFunctions.isElementPresent(testerTestCase, elementImagePath);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsOpenWebPageEnableCurriculum", environmentTestCase.evidencePath);
		}

		TSFunctions.clickBlankRegion(testerTestCase);
		return result;
	}


	public boolean testTopologicalResortButtonsState()
	{
		boolean result = false;
		String createTaskButtonEnabled = "";
		String createDependencyEnabled = "";
		String deleteDisabled = "";
		String runTopologicalEnabled = "";
		String clearResultsDisabled = "";
		if (TSFunctions.isButtonPresent(testerTestCase, createTaskButtonEnabled)
			&& TSFunctions.isButtonPresent(testerTestCase, createDependencyEnabled)
			&& TSFunctions.isButtonPresent(testerTestCase, deleteDisabled)
			&& TSFunctions.isButtonPresent(testerTestCase, runTopologicalEnabled)
			&& TSFunctions.isButtonPresent(testerTestCase, clearResultsDisabled))
		{
			result = true;
		}

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testTopologicalResortButtonsState", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testRunTopologicalResort(String drawExpected,
		String treeViewExpected,
		String tableViewExpected)
	{
		boolean result = false;
		TSFunctions.runTopologicalSort(testerTestCase, environmentTestCase);
		if (TSFunctions.isDrawPresent(testerTestCase, drawExpected)
			&& TSFunctions.isViewPresent(testerTestCase, treeViewExpected)
			&& TSFunctions.isViewPresent(testerTestCase, tableViewExpected))
		{
			result = true;
		}
		return result;
	}


	public boolean testSearch(String searchCriteria, String searchExpected)
	{
		boolean result = false;
		String searchBox = environmentTestCase.toolBarImagesPath + File.separator + "";
		String clearSearchBox =
			environmentTestCase.toolBarImagesPath + File.separator + "";
		TSFunctions.search(testerTestCase, environmentTestCase, searchBox, searchCriteria);
		result = TSFunctions.isViewPresent(testerTestCase, searchExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testSearch",
				environmentTestCase.evidencePath);
		}
		TSFunctions.cleanSearch(testerTestCase, environmentTestCase, clearSearchBox);
		testerTestCase.zoomFit();
		TSFunctions.clickBlankRegion(testerTestCase);
		return result;
	}


	public boolean testProcessDesignButtonsState()
	{
		System.out.println("*****testProcessDesignButtonState*****");
		boolean result = false;
		String toolBarExpected =
			environmentTestCase.projectImagesPath + File.separator
				+ "defaultToolBarExpected.png";
		result = TSFunctions.isToolBarPresent(testerTestCase, toolBarExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testProcessDesignButtonState", environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testProcessDesignButtonStateSubProcess()
	{
		System.out.println("*****testProcessDesignButtonState*****");
		boolean result = false;
		String subProcessElement =
			environmentTestCase.projectImagesPath + "subProcessNode.png";
		String toolBarExpected =
			environmentTestCase.projectImagesPath + File.separator
				+ "subProcessToolBarExpected.png";
		testerTestCase.clickOnElement(subProcessElement);
		result = TSFunctions.isToolBarPresent(testerTestCase, toolBarExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testProcessDesignButtonState", environmentTestCase.evidencePath);
		}
		TSFunctions.clickBlankRegion(testerTestCase);

		return result;
	}
	
	public boolean runBiconnectedComponents(String drawExpected , String treeViewExpected, String toolBarExpected)
	{
		boolean result = false;
		String runButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "RunImageMap.png";
		String clearResultsButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "ClearEnableImageMap.png";
		testerTestCase.clickOnElement(runButton);
		result =
			TSFunctions.isDrawPresent(testerTestCase, drawExpected)
				&& TSFunctions.isElementPresent(testerTestCase, toolBarExpected)
				&& TSFunctions.isViewPresent(testerTestCase, treeViewExpected);
		if(!result)
		{

			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "runBiconnectedComponents", environmentTestCase.evidencePath);
		}
		
		testerTestCase.clickOnElement(clearResultsButton);
		

		return result;
	}

}
