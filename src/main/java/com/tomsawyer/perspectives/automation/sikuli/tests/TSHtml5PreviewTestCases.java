
package com.tomsawyer.perspectives.automation.sikuli.tests;


import java.io.File;
import org.sikuli.script.Region;


public class TSHtml5PreviewTestCases
{
	public TSEnvironment environmentTestCase;

	public TSTester testerTestCase;

	public String className;


	public TSHtml5PreviewTestCases(TSEnvironment environmentTestCase,
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
			environmentTestCase.toolBarImagesPath + File.separator + "SaveAsCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "SaveAsImage.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSaveAsImage", environmentTestCase.evidencePath);
		}

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
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverPan", environmentTestCase.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverPrintSetUp()
	{
		System.out.println("*******testHoverPrintSetUp*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "PrintSetUpCanvas.png";
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
				+ "PrintPreviewCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "PrintPreview.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testHoverPrintPreview", environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverPan()
	{
		System.out.println("*******testOnMouseHoverPan*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "PanCanvas.png";
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


	public boolean testOnMouseHoverNavigateLinks()
	{
		System.out.println("*******TestOnMouseHoverNavigateLinks*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "NavigateLinksCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "NavigateLinks.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

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
			environmentTestCase.toolBarImagesPath + File.separator
				+ "MarqueeZoomCanvas.png";
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
			environmentTestCase.toolBarImagesPath + File.separator + "ZoomInCanvas.png";
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
			environmentTestCase.toolBarImagesPath + File.separator + "ZoomOutCanvas.png";
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
			environmentTestCase.toolBarImagesPath + File.separator + "ZoomFitCanvas.png";
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
			environmentTestCase.toolBarImagesPath + File.separator + "OverviewCanvas.png";
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
				+ "CircularLayoutCanvas.png";
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
				+ "HierarchicalLayoutCanvas.png";
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
				+ "HierarchicalLayoutSelectedCanvas.png";
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
				+ "OrthogonalLayoutCanvas.png";
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
				+ "OrthogonalLayoutCanvasSelected.png";
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
				+ "SymmetricLayoutCanvas.png";
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
				+ "SelectedSymmetricLayout.png";
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
				+ "GlobalLayoutCanvas.png";
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
				+ "IncrementalLayoutCanvas.png";
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
				+ "BetweennessCentralityCanvas.png";
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
				+ "ClosenessCentralityCanvas.png";
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
				+ "DegreeCentralityCanvas.png";
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
				+ "EigenvectorCentralityCanvas.png";
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
			environmentTestCase.toolBarImagesPath + File.separator
				+ "undoDisabledCanvas.png";
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


	public boolean testOnMouseHoverSetEffectsNode()
	{
		System.out.println("*******TestOnMouseHoverSetEffectsNode*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "setEffectsNodeCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "setEffectsNode.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRedo", environmentTestCase.evidencePath);
		}
		return result;

	}


	public boolean testOnMouseHoverRunRootCause()
	{
		System.out.println("*******TestOnMouseHoverRunRootCause*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "runCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "RunRootCause.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRedo", environmentTestCase.evidencePath);
		}
		return result;

	}


	public boolean testOnMouseHoverSetStartNode()
	{

		System.out.println("******testOnMouseHoverSetSinkNode******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "setStartNodeCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "SetStartNode.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSetSinkNode", environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverSetFinishNode()
	{

		System.out.println("******testOnMouseHoverSetFinishNode******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "setFinishNodeCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "SetFinishNode.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverSetSinkNode", environmentTestCase.evidencePath);
		}

		return result;
	}


	public boolean testOnMouseHoverShowAbout()
	{
		System.out.println("*******TestOnMouseHoverShowAbout*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "showAboutCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "ShowAbout.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverShowAbout", environmentTestCase.evidencePath);
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


	public boolean testIsOverviewPresent()
	{
		Float similar = new Float(0.70);
		System.out.println("*******TestIsOverviewPresent*******");
		TSAutomationUtils.pauseScript(new Long(700));
		testerTestCase.openOverviewHtml5();
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
		testerTestCase.closeOverviewCanvas();
		return result;

	}


	public boolean testIsOverviewPresent(float similar)
	{
		System.out.println("similar = " + similar);
		System.out.println("*******TestIsOverviewPresent*******");
		TSAutomationUtils.pauseScript(new Long(700));
		testerTestCase.openOverviewHtml5();
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
		testerTestCase.closeOverviewCanvas();
		return result;

	}


	public boolean testCircularLayout()
	{
		System.out.println("******testCircularLayout*********");
		testerTestCase.CircularLayoutHtml5();
		TSAutomationUtils.pauseScript(new Long(700));
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "CircularExpected.png",
				new Float(0.60));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testCircularLayout", environmentTestCase.evidencePath);
		}

		testerTestCase.undoHtml5();
		return result;
	}


	public boolean testHierarchicalLayout()
	{
		System.out.println("*************testHierarchicalLayout*************");
		testerTestCase.HierarchicalLayoutHtml5();
		TSAutomationUtils.pauseScript(new Long(500));
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "HierarchicalExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testHierarchicalLayout", environmentTestCase.evidencePath);
		}

		testerTestCase.undoHtml5();
		return result;
	}


	public boolean testOrthogonalLayout()
	{
		System.out.println("*************testOrthogonalLayout*************");
		testerTestCase.orthogonalLayoutHtml5();
		TSAutomationUtils.pauseScript(new Long(500));
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "OrthogonalExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOrthogonalLayout", environmentTestCase.evidencePath);
		}

		testerTestCase.undoHtml5();
		return result;
	}


	public boolean testSymmetricLayout()
	{
		System.out.println("*************testSymmetricLayout*************");
		testerTestCase.SymmetricLayoutHtml5();
		TSAutomationUtils.pauseScript(new Long(500));
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "SymmetricExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOrthogonalLayout", environmentTestCase.evidencePath);
		}

		testerTestCase.undoHtml5();
		return result;
	}


	public boolean testSymmetricLayoutSelected()
	{
		System.out.println("*************testSymmetricLayout*************");
		String symmetricLayoutImage =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "SymmetricSelectedLayoutCanvas";
		testerTestCase.SymmetricLayoutHtml5(symmetricLayoutImage);
		TSAutomationUtils.pauseScript(new Long(500));
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "SymmetricExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOrthogonalLayout", environmentTestCase.evidencePath);
		}

		testerTestCase.undoHtml5();
		return result;
	}


	public boolean testSymmetricLayout(String symmetricToolBarImage)
	{
		System.out.println("*************testSymmetricLayout*************");
		testerTestCase.SymmetricLayoutHtml5(symmetricToolBarImage);
		TSAutomationUtils.pauseScript(new Long(500));
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "SymmetricExpected.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOrthogonalLayout", environmentTestCase.evidencePath);
		}

		testerTestCase.undoHtml5();
		return result;
	}


	public boolean testOnMouseHoverInteractiveZoom()
	{
		System.out.println("*******TestOnMouseHoverInteractiveZoom*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "InteractiveZoomCanvas.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator
				+ "InteractiveZoom.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverInteractiveZoom", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverSetSourceNode()
	{
		System.out.println("*******TestOnMouseHoverSetSourceNode*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "SetSourceNodeDisableCanvas.png";
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
				+ "SetSinkNodeDisableCanvas.png";
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
			environmentTestCase.toolBarImagesPath + File.separator + "Run.png";
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


	public boolean testOnMouseHoverRunBiconnected()
	{
		System.out.println("*******TestOnMouseHoverRunMaximumFlowCanvas*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "Run.png";
		String imageExpected =
			environmentTestCase.toolTipsImagePath + File.separator + "RunBiconnected.png";
		boolean result =
			TSFunctions.isToolTipPresentWeb(testerTestCase, imageToolBar, imageExpected);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRunBiconnected", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverClearResults()
	{
		System.out.println("*******TestOnMouseHoverClearResults*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "ClearResultsDisableCanvas.png";
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
			environmentTestCase.toolBarImagesPath + File.separator + "AddNodeCanvas.png";
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
				+ "AddConnectionCanvas.png";
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


	public boolean runMaximumFlowHtml5(String expectedLayout, String expectedView)
	{
		System.out.println("*******runMaximumFlowHtml5*******");
		boolean result =
			TSFunctions.runMaxFlowHtml5(testerTestCase,
				expectedLayout,
				expectedView,
				environmentTestCase);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "runMaximumFlowHtml5", environmentTestCase.evidencePath);
		}

		testerTestCase.clearResultsMaxFlowHtml5();
		return result;
	}


	public boolean testOnMouseHoverRunAcyclicTest()
	{
		System.out.println("******testOnMouseHoverRunAcyclicTest******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "Run.png";
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
		testerTestCase.clearResultsMaxFlowHtml5();

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


	public boolean testOnMouseHoverRunShortestPaths()
	{

		System.out.println("******testOnMouseHoverRunShortestPaths******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "RunDisabledCanvas.png";
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
		System.out.println("****testRunAcyclciTest******");
		boolean result = false;
		float similar = new Float(0.90);
		testerTestCase.runAlgorithm(environmentTestCase.toolBarImagesPath
			+ File.separator + "Run.png");
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
					+ "TreeViewCanvas.png"))
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
			+ File.separator + "ClearResultsEnableCanvas.png");

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


	public boolean testOnMouseHoverMSlice()
	{
		System.out.println("*******TestOnMouseHoverMSlice*******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "Run.png";
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


	public boolean testMSlice100()
	{
		System.out.println("******testMSlice100******");
		boolean result;
		String minCapacity =
			environmentTestCase.projectImagesPath + File.separator + "100Canvas.png";
		String expectedLayout =
			environmentTestCase.projectImagesPath + File.separator + "MinCapacity100.png";
		String clearResultsButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "ClearResultsCanvas.png";
		if (testerTestCase.operativeSystem.contains("windows"))
		{
			result =
				TSFunctions.runMSliceCanvasWindows(testerTestCase,
					minCapacity,
					expectedLayout);
		}
		else
		{
			result =
				TSFunctions.runMSliceCanvasMac(testerTestCase,
					minCapacity,
					expectedLayout);
		}
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
		boolean result;
		System.out.println("******testMSlice100******");
		String minCapacity =
			environmentTestCase.projectImagesPath + File.separator + "1000Canvas.png";
		String expectedLayout =
			environmentTestCase.projectImagesPath + File.separator
				+ "MinCapacity1000.png";
		String clearResultsButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "ClearResultsCanvas.png";

		if (testerTestCase.operativeSystem.contains("windows"))
		{
			result =
				TSFunctions.runMSliceCanvasWindows(testerTestCase,
					minCapacity,
					expectedLayout);
		}
		else
		{
			result =
				TSFunctions.runMSliceCanvasMac(testerTestCase,
					minCapacity,
					expectedLayout);
		}
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


	public boolean testIsTableViewPresent(String expected)
	{

		System.out.println("*******testIsTableViewPresent*******");

		boolean result = TSFunctions.isViewPresent(testerTestCase, expected);
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
		String expected =
			environmentTestCase.projectImagesPath + File.separator
				+ "treeViewExpected.png";

		boolean result = TSFunctions.isViewPresent(testerTestCase, expected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsTableViewPresent", environmentTestCase.evidencePath);
		}
		return result;
	}
	
	public boolean testIsTreeViewPresent(String expected)
	{
		System.out.println("*******testIsTreeViewPresent*******");

		boolean result = TSFunctions.isViewPresent(testerTestCase, expected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsTableViewPresent", environmentTestCase.evidencePath);
		}
		return result;
	}


	public boolean networkEditorViews()
	{
		boolean result = false;
		String nodeSelected =
			environmentTestCase.projectImagesPath + File.separator + "nodeSelected";
		String treeView =
			environmentTestCase.projectImagesPath + File.separator + "treeViewExpected";
		String inspectorView =
			environmentTestCase.projectImagesPath + File.separator
				+ "inspectorViewExpected";
		String tableView =
			environmentTestCase.projectImagesPath + File.separator + "tableViewExpected";
		testerTestCase.clickOnElement(nodeSelected);
		if (TSFunctions.isViewPresent(testerTestCase, tableView)
			&& TSFunctions.isViewPresent(testerTestCase, inspectorView)
			&& TSFunctions.isViewPresent(testerTestCase, treeView))
		{
			result = true;
		}
		testerTestCase.zoomFit();
		Region collapse = new Region(40, 197, 24, 20);
		collapse.click();

		return result;
	}


	public boolean networkEditorViews(String treeView,
		String inspectorView,
		String tableView,
		String nodeSelected)
	{
		boolean result = false;
		testerTestCase.clickOnElement(nodeSelected);
		if (TSFunctions.isViewPresent(testerTestCase, tableView)
			&& TSFunctions.isViewPresent(testerTestCase, inspectorView)
			&& TSFunctions.isViewPresent(testerTestCase, treeView))
		{
			result = true;
		}
		testerTestCase.zoomFit();
		Region collapse = new Region(40, 197, 24, 20);
		collapse.click();

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
	
	public boolean testIsInspectorViewPresent(String nodeToSelect,String inspectorViewExpected)
	{
		System.out.println("*****testIsInspectorViewPresent*****");
		String closeNodeImagePath=environmentTestCase.toolBarImagesPath + File.separator + "";
		boolean result = false;
		testerTestCase.clickOnElement(nodeToSelect);
		result =
			TSFunctions.isViewPresent(testerTestCase,inspectorViewExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsInspectorViewPresent", environmentTestCase.evidencePath);
		}
		
		TSFunctions.closeTreeNode(testerTestCase, closeNodeImagePath);
		TSFunctions.clickBlankRegion(testerTestCase);
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


	public boolean testShortestPathsButtonsState()
	{
		String setStartNodeButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "setStartNodeDisabledCanvas.png";
		String setFinishNodeButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "setFinishNodeDisabledCanvas.png";
		String runShortestPathsButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "RunToolDisabledCanvas.png";
		String clearResultsButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "ClearResultsDisabledCanvas.png";
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
				+ "setStartNodeDisabledCanvas.png";
		String setFinishNodeButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "setFinishNodeDisabledCanvas.png";
		String runShortestPathsButton =
			environmentTestCase.toolBarImagesPath + File.separator
				+ "RunToolDisabledCanvas.png";

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


	public boolean testOnMouseHoverRunTopologicalResult()
	{
		System.out.println("******testOnMouseHoverRunTopologicalResult******");
		String imageToolBar =
			environmentTestCase.toolBarImagesPath + File.separator + "RunCanvas.png";
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


	public boolean testIsInspectorViewPresentCurriculum()
	{
		System.out.println("testIsInspectorViewPresent");
		String node =
			environmentTestCase.projectImagesPath + File.separator + "cs201Node.png";
		testerTestCase.clickOnElement(node);
		boolean result =
			TSFunctions.isViewPresent(testerTestCase,
				environmentTestCase.projectImagesPath + File.separator
					+ "inspectorViewExpected.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsInspectorViewPresent", environmentTestCase.evidencePath);
		}

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


	public boolean testDefautlDraw(String defaultDrawExpected)
	{
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
	
	public boolean testSearch(String searchCriteria,String searchExpected)
	{
		boolean result = false;
		String searchBox=environmentTestCase.toolBarImagesPath + File.separator + "";
		String clearSearchBox=environmentTestCase.toolBarImagesPath + File.separator + "";
		TSFunctions.search(testerTestCase, environmentTestCase,searchBox , searchCriteria);
		result = TSFunctions.isViewPresent(testerTestCase, searchExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testSearch", environmentTestCase.evidencePath);
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
		String subProcessElement=environmentTestCase.projectImagesPath + "subProcessNode.png";
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
}
