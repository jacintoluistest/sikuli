
package com.tomsawyer.perspectives.automation.sikuli.tests;


import java.io.File;
import org.sikuli.script.Region;


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


	public boolean testLaunchDesktopPreview(String imageExpected)
	{
		System.out.println("testLaunchDesktopPreview");
		boolean result =
			TSFunctions.isDesktopPreviewLaunched(testerTestCase, imageExpected);

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
					+ "defaultToolBar.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsToolBarPresent", environmentTester.evidencePath);

		}
		return result;
	}
	
	public boolean testIsToolBarPresent(String toolBarExpected)
	{
		System.out.println("*****testToolBarPresent*****");
		boolean result =
			TSFunctions.isToolBarPresent(testerTestCase,toolBarExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsToolBarPresent", environmentTester.evidencePath);

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
				+ "testIsTableViewPresent", environmentTester.evidencePath);
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
				+ "testIsTableViewPresent", environmentTester.evidencePath);
		}
		testerTestCase.clickOnElement(defaultTab);
		return result;
	}


	public boolean testIsTreeViewPresent()
	{
		System.out.println("testIsTreeViewPresent");
		boolean result =
			TSFunctions.isViewPresent(testerTestCase, environmentTester.projectImagesPath
				+ File.separator + "treeViewExpected.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsTreeViewPresent", environmentTester.evidencePath);
		}
		return result;

	}


	public boolean testIsInspectorViewPresent()
	{
		System.out.println("testIsInspectorViewPresent");
		boolean result =
			TSFunctions.isViewPresent(testerTestCase, environmentTester.projectImagesPath
				+ File.separator + "InspectorViewExpected.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsInspectorViewPresent", environmentTester.evidencePath);
		}
		return result;

	}
	
	public boolean testIsInspectorViewPresent(String inspectorViewExpected)
	{
		System.out.println("testIsInspectorViewPresent");
		boolean result =
			TSFunctions.isViewPresent(testerTestCase,inspectorViewExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsInspectorViewPresent", environmentTester.evidencePath);
		}
		return result;

	}
	
	public boolean testIsInspectorViewPresent(String nodeToSelect,String inspectorViewExpected)
	{
		System.out.println("*****testIsInspectorViewPresent*****");
		String closeNodeImagePath=environmentTester.toolBarImagesPath + File.separator + "";
		boolean result = false;
		testerTestCase.clickOnElement(nodeToSelect);
		result =
			TSFunctions.isViewPresent(testerTestCase,inspectorViewExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsInspectorViewPresent", environmentTester.evidencePath);
		}
		
		TSFunctions.closeTreeNode(testerTestCase, closeNodeImagePath);
		TSFunctions.clickBlankRegion(testerTestCase);
		return result;

	}


	public boolean testIsInspectorViewPresentCurriculum()
	{
		System.out.println("testIsInspectorViewPresent");
		String node =
			environmentTester.projectImagesPath + File.separator + "cs201Node.png";
		testerTestCase.clickOnElement(node);
		boolean result =
			TSFunctions.isViewPresent(testerTestCase, environmentTester.projectImagesPath
				+ File.separator + "InspectorViewExpected.png");
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsInspectorViewPresent", environmentTester.evidencePath);
		}

		TSFunctions.clickBlankRegion(testerTestCase);

		return result;

	}


	public boolean testIsOpenWebPageEnabledCurriculum()
	{
		boolean result = false;
		String node =
			environmentTester.projectImagesPath + File.separator + "math101Node.png";
		String elementImagePath =
			environmentTester.projectImagesPath + File.separator + "openWebPage.png";
		testerTestCase.rightClickOnElement(node);
		result = TSFunctions.isElementPresent(testerTestCase, elementImagePath);

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsOpenWebPageEnableCurriculum", environmentTester.evidencePath);
		}

		TSFunctions.clickBlankRegion(testerTestCase);
		return result;
	}


	public boolean testIsTreeViewPresent(String treeViewExpected)
	{
		System.out.println("testIsTreeViewPresent");
		boolean result = TSFunctions.isViewPresent(testerTestCase, treeViewExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsTreeViewPresent", environmentTester.evidencePath);
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
				+ "testIsTreeViewPresent", environmentTester.evidencePath);
		}

		testerTestCase.clickOnElement(defaultTreeViewTab);
		return result;

	}


	public boolean testIsOverviewPresent()
	{
		System.out.println("*****testIsOverViewPresent*****");
		testerTestCase.openOverviewDesktop();
		boolean result =
			TSFunctions.isOverviewPresent(testerTestCase,
				environmentTester.projectImagesPath + File.separator
					+ "overviewExpected.png",
				new Float(0.65));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsOverviewPresent", environmentTester.evidencePath);
		}
		testerTestCase.closeOverviewDesktop();

		return result;
	}


	public boolean testIsOverviewPresent(String expectedImage)
	{
		System.out.println("testIsOverViewPresent");
		testerTestCase.openOverviewDesktop();
		boolean result =
			TSFunctions.isOverviewPresent(testerTestCase, expectedImage, new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsOverviewPresent", environmentTester.evidencePath);
		}
		testerTestCase.closeOverviewDesktop();

		return result;
	}


	public boolean testCircularLayout(String expectedLayoutPath)
	{
		System.out.println("testCircularLayout");
		testerTestCase.CircularLayoutDesktop();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				expectedLayoutPath,
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testCircularLayout", environmentTester.evidencePath);
		}

		testerTestCase.undoDesktop();
		return result;
	}


	public boolean testCircularLayout()
	{
		System.out.println("*****testCircularLayout*****");
		String expectedLayoutPath =
			environmentTester.projectImagesPath + File.separator +"circularExpected.png";
		testerTestCase.CircularLayoutDesktop();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase,
				expectedLayoutPath,
				new Float(0.70));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testCircularLayout", environmentTester.evidencePath);
		}

		testerTestCase.undoDesktop();
		return result;
	}


	public boolean testHierarchicalLayout(String expected)
	{
		System.out.println("****testHierarchicalLayout*****");
		testerTestCase.HierarchicalLayoutDesktop();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase, expected, new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsOverviewPresent", environmentTester.evidencePath);
		}

		testerTestCase.undoDesktop();
		return result;
	}


	public boolean testHierarchicalLayout()
	{
		System.out.println("****testHierarchicalLayout*****");
		String expectedLayout =
			environmentTester.projectImagesPath + File.separator
				+ "hierarchicalExpected.png";
		testerTestCase.HierarchicalLayoutDesktop();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase, expectedLayout, new Float(0.70));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testHierarchicalLayout", environmentTester.evidencePath);
		}

		testerTestCase.undoDesktop();
		return result;
	}


	public boolean testOrthogonalLayout()
	{
		System.out.println("****testHierarchicalLayout*****");
		String expectedLayout =
			environmentTester.projectImagesPath + File.separator
				+ "orthogonalExpected.png";
		testerTestCase.orthogonalLayoutDesktop();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase, expectedLayout, new Float(0.70));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOrthogonalLayout", environmentTester.evidencePath);
		}

		testerTestCase.undoDesktop();
		return result;
	}


	public boolean testOrthogonalLayoutSelected()
	{
		System.out.println("****testOrthogonalLayout*****");
		String expectedLayout =
			environmentTester.projectImagesPath + File.separator
				+ "OrthogonalExpected.png";
		testerTestCase.orthogonalLayoutDesktop();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase, expectedLayout, new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testIsOverviewPresent", environmentTester.evidencePath);
		}

		testerTestCase.undoDesktop();
		return result;
	}


	public boolean testSymmetricLayout()
	{
		System.out.println("****testSymmetricLayout*****");

		String expectedLayout =
			environmentTester.projectImagesPath + File.separator
				+ "symmetricExpected.png";
		testerTestCase.SymmetricLayoutDesktop();
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase, expectedLayout, new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testSymmetric",
				environmentTester.evidencePath);
		}

		testerTestCase.undoDesktop();
		return result;
	}


	public boolean testSymmetriclLayoutSelected()
	{
		System.out.println("****testSymmetricLayout*****");

		String symmetricLayout =
			environmentTester.toolBarImagesPath + File.separator
				+ "SymmetricLayoutToolBarDesktopSelected.png";
		String expectedLayout =
			environmentTester.projectImagesPath + File.separator
				+ "SymmetricExpected.png";
		testerTestCase.SymmetricLayoutDesktop(symmetricLayout);
		boolean result =
			TSFunctions.isLayoutPresent(testerTestCase, expectedLayout, new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testSymmetric",
				environmentTester.evidencePath);
		}

		testerTestCase.undoDesktop();
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
		float similar = new Float(0.85);
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "NavigateLinksToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "NavigateLinks.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected,
				similar);
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
		System.out.println("******testOnMouseHoverHierarchicalLayout******");
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


	public boolean testOnMouseHoverHierarchicalLayoutSelected()
	{
		System.out.println("******testOnMouseHoverHierarchicalLayout******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "HierarchicalSelectedLayoutToolBarDesktop.png";
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


	public boolean testOnMouseHoverOrthogonalLayoutSelected()
	{
		System.out.println("******testOnMouseHoverOrthogonalLayout******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "OrthogonalLayoutToolBarDesktopSelected.png";
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


	public boolean testOnMouseHoverOrthogonalLayout(String orthogonalButtonPath)
	{
		System.out.println("******testOnMouseHoverOrthogonalLayout******");
		String imageToolBar = orthogonalButtonPath;
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
				+ "SymmetricLayoutToolBarDesktop.png";
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
	


	public boolean testOnMouseHoverSymmetricLayout(String imageToolBar)
	{
		System.out.println("******testOnMouseHoverSymmetricLayout******");
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


	public boolean testOnMouseHoverSymmetricLayoutSelected()
	{
		System.out.println("******testOnMouseHoverSymmetricLayout******");
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "SymmetricLayout.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				environmentTester.toolBarImagesPath + File.separator
					+ "SymmetricLayoutToolBarDesktopSelected.png",
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
				+ "SetSinkNodeDisableToolBarDesktop.png";
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


	public boolean testOnMouseHoverSetStartNode()
	{

		System.out.println("******testOnMouseHoverSetSinkNode******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "setStartNodeToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "SetStartNode.png";
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


	public boolean testOnMouseHoverSetFinishNode()
	{

		System.out.println("******testOnMouseHoverSetFinishNode******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "setFinishNodeToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "SetFinishNode.png";
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


	public boolean testOnMouseHoverPrintSetUp()
	{
		System.out.println("******testOnMouseHoverPrintSetUp******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "PrintSetUpToolBarDesktop.png";
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

	
	public boolean testOnMouseHoverPrintPreview()
	{
		System.out.println("******testOnMouseHoverPrint******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "PrintPreviewToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "PrintPreview.png";
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

	public boolean testOnMouseHoverPrint()
	{
		System.out.println("******testOnMouseHoverPrint******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "PrintToolBarDesktop.png";
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


	public boolean testOnMouseHoverUndo()
	{
		System.out.println("******testOnMouseHoverUndo******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "undoToolBarDesktopDisabled.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "undo.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverUndo", environmentTester.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverRedo()
	{
		System.out.println("******testOnMouseHoverRedo******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "redoToolBarDesktopDisabled.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "redo.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRedo", environmentTester.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverShowAbout()
	{
		System.out.println("******testOnMouseHoverShowAbout******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator + "showAbout.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "showAbout.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRedo", environmentTester.evidencePath);
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


	public boolean testOnMouseHoverCreateTask()
	{
		System.out.println("******testOnMouseHoverCreateTask******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "AddNodeToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "CreateTask.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverCreateTask", environmentTester.evidencePath);
		}
		return result;
	}


	public boolean testOnMouseHoverCreateDependency()
	{
		System.out.println("******testOnMouseHoverCreateTask******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "AddConnectionToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "CreateDependency.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverCreateTask", environmentTester.evidencePath);
		}
		return result;
	}
	
	public boolean testOnMouseHoverDeleteDisabled()
	{
		System.out.println("******testOnMouseHoverDeleteDisabled******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "DeleteDisableToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "Delete.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverCreateTask", environmentTester.evidencePath);
		}
		return result;
	}


	public boolean testRunMaxFlow()
	{
		System.out.println("******testRunMaxFlow******");
		String expectedImage =
			environmentTester.projectImagesPath + File.separator + "MaxFlowExpected.png";
		boolean result =
			TSFunctions.runMaxFlowDesktop(testerTestCase,
				expectedImage,
				environmentTester);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testRunMaxFlow",
				environmentTester.evidencePath);
		}
		testerTestCase.clearResultsMaxFlowDesktop();

		return result;
	}


	public boolean testIsMSliceButtonEnable()
	{
		System.out.println("*******testIsMSliceButtonEnable******");

		boolean result =
			TSFunctions.isButtonPresent(testerTestCase,
				environmentTester.toolBarImagesPath + File.separator
					+ "MSliceEnableToolBarDesktop.png",
				new Float(0.65));
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
			TSFunctions.isButtonPresent(testerTestCase,
				environmentTester.projectImagesPath + File.separator
					+ "clearResultsDisable.png",
				new Float(0.65));
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
		String comboButton =
			environmentTester.projectImagesPath + File.separator + "Combo.png";
		String minCapacityButton =
			environmentTester.projectImagesPath + File.separator + "MinCapacity.png";
		String capacity =
			environmentTester.projectImagesPath + File.separator + "100.png";
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
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testMSlice100",
				environmentTester.evidencePath);

		}

		testerTestCase.runAlgorithm(clearResultsButton);
		return result;
	}


	public boolean testMSlice1000()
	{
		System.out.println("******testMSlice1000******");
		String msliceButton =
			environmentTester.projectImagesPath + File.separator + "MSlice.png";
		String comboButton =
			environmentTester.projectImagesPath + File.separator + "Combo.png";
		String minCapacityButton =
			environmentTester.projectImagesPath + File.separator + "MinCapacity.png";
		String capacity =
			environmentTester.projectImagesPath + File.separator + "1000.png";
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
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testMSlice1000",
				environmentTester.evidencePath);

		}
		testerTestCase.runAlgorithm(clearResultsButton);
		return result;
	}


	public boolean testOnMouseHoverRunAcyclicTest()
	{
		System.out.println("******testOnMouseHoverRunAcyclicTest******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator + "RunDesktop.png";
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


	public boolean testOnMouseHoverRun()
	{
		System.out.println("******testOnMouseHoverRun******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator + "RunDesktop.png";
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

	public boolean testOnMouseHoverRunBridgeDetection()
	{
		System.out.println("******testOnMouseHoverRun******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator + "RunDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "RunBridgeDetection.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRunBridgeDetection", environmentTester.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverRunBiconnectedComponentsAnalysis()
	{
		System.out.println("******testOnMouseHoverRun******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator + "RunToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator
				+ "RunBiconnectedComponentsAnalysis.png";
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


	public boolean testOnMouseHoverRunRootCause()
	{

		System.out.println("******testOnMouseHoverRunRootCause******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator + "RunDisableDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "RunRootCauseAnalysis.png";
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


	public boolean testOnMouseHoverRunShortestPaths()
	{

		System.out.println("******testOnMouseHoverRunRootCause******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "RunDisabledDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "RunShortestPaths.png";
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


	public boolean testOnMouseHoverRunTopologicalResult()
	{
		System.out.println("******testOnMouseHoverRunTopologicalResult******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator + "RunDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator
				+ "RunTopologicalSort.png";
		boolean result =
			TSFunctions.isToolTipPresentDesktop(testerTestCase,
				imageToolBar,
				imageExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testOnMouseHoverRunTopologicalResult", environmentTester.evidencePath);
		}

		return result;

	}


	public boolean testOnMouseHoverSetEfectsNodes()
	{

		System.out.println("******testOnMouseHoverSetEffectsNodes******");
		String imageToolBar =
			environmentTester.toolBarImagesPath + File.separator
				+ "setEffectNodesToolBarDesktop.png";
		String imageExpected =
			environmentTester.toolTipsImagePath + File.separator + "SetEffectNodes.png";
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
			TSFunctions.isButtonPresent(testerTestCase,
				environmentTester.projectImagesPath + File.separator
					+ "RunAcyclicTestEnable.png",
				new Float(0.80));
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "RunAcyclicButtonEnable", environmentTester.evidencePath);
		}
		return result;
	}


	public boolean testRunAcyclicTest()
	{
		boolean result = false;
		testerTestCase.runAlgorithm(environmentTester.toolBarImagesPath + File.separator
			+ "RunDesktop.png");
		if (TSFunctions.isButtonPresent(testerTestCase,
			environmentTester.projectImagesPath + File.separator
				+ "ClearResultsEnable.png")
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


	public boolean networkEditorViews()
	{
		boolean result = false;
		String nodeSelected =
			environmentTester.projectImagesPath + File.separator + "nodeSelected";
		String treeView =
			environmentTester.projectImagesPath + File.separator + "treeViewExpected";
		String inspectorView =
			environmentTester.projectImagesPath + File.separator
				+ "inspectorViewExpected";
		String tableView =
			environmentTester.projectImagesPath + File.separator + "tableViewExpected";
		testerTestCase.clickOnElement(nodeSelected);
		if (TSFunctions.isViewPresent(testerTestCase, tableView)
			&& TSFunctions.isViewPresent(testerTestCase, inspectorView)
			&& TSFunctions.isViewPresent(testerTestCase, treeView))
		{
			result = true;
		}

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "NetworkEditorView", environmentTester.evidencePath);
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
				environmentTester.evidencePath);
		}

		return result;
	}


	public boolean testDrawView(String drawTab, String drawExpected, String defaultTabDraw)
	{
		boolean result = false;
		testerTestCase.clickOnElement(drawTab);
		if (TSFunctions.isDrawPresent(testerTestCase, drawTab))
		{
			result = true;
		}

		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase,
				className + "testDrawView",
				environmentTester.evidencePath);
		}
		TSFunctions.defaultDraw(testerTestCase, defaultTabDraw);
		return result;
	}


	public boolean testShortestPathsButtonsState()
	{
		String setStartNodeButton =
			environmentTester.toolBarImagesPath + File.separator
				+ "setStartNodeToolBarDisabledDesktop.png";
		String setFinishNodeButton =
			environmentTester.toolBarImagesPath + File.separator
				+ "setFinishNodeToolBarDisabledDesktop.png";
		String runShortestPathsButton =
			environmentTester.toolBarImagesPath + File.separator
				+ "RunToolBarDesktop.png";
		String clearResultsButton =
			environmentTester.toolBarImagesPath + File.separator
				+ "ClearResultsEnableToolBarDesktop.png";
		boolean result = false;

		if (TSFunctions.isButtonPresent(testerTestCase, setStartNodeButton)
			&& TSFunctions.isButtonPresent(testerTestCase, setFinishNodeButton)
			&& TSFunctions.isButtonPresent(testerTestCase, runShortestPathsButton)
			&& TSFunctions.isButtonPresent(testerTestCase, clearResultsButton))
		{
			result = true;
		}
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testShortestPathsButtonsState", environmentTester.evidencePath);
		}

		return result;
	}
	
	public boolean testProcessDesignButtonsState()
	{	
		System.out.println("*****testProcessDesignButtonState*****");
		boolean result = false;
		String toolBarExpected =
			environmentTester.projectImagesPath + File.separator
				+ "defaultToolBarExpected.png";
		result = TSFunctions.isToolBarPresent(testerTestCase, toolBarExpected);
		
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testProcessDesignButtonState", environmentTester.evidencePath);
		}

		return result;
	}
	
	public boolean testProcessDesignButtonStateSubProcess()
	{
		System.out.println("*****testProcessDesignButtonState*****");
		boolean result = false;
		String subProcessElement=environmentTester.projectImagesPath + "subProcessNode.png";
		String toolBarExpected =
			environmentTester.projectImagesPath + File.separator
				+ "subProcessToolBarExpected.png";
		testerTestCase.clickOnElement(subProcessElement);
		result = TSFunctions.isToolBarPresent(testerTestCase, toolBarExpected);
		
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testProcessDesignButtonState", environmentTester.evidencePath);
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
				+ "testTopologicalResortButtonsState", environmentTester.evidencePath);
		}
		return result;
	}


	public boolean testRunShortestPathsAlgorithm()
	{
		boolean result = false;

		String layoutExpected =
			environmentTester.toolBarImagesPath + File.separator
				+ "ShortestPathsExpected.png";
		String treeViewExpected =
			environmentTester.toolBarImagesPath + File.separator + "TreeViewExpected.png";
		TSFunctions.runShortestPathsAlgorithm(testerTestCase, environmentTester);
		if (TSFunctions.isLayoutPresent(testerTestCase, layoutExpected)
			&& TSFunctions.isViewPresent(testerTestCase, treeViewExpected))
		{
			result = true;
		}
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "runShortestPathsAlgorithm", environmentTester.evidencePath);
		}

		testerTestCase.clearResultsMaxFlowDesktop();

		return result;
	}


	public boolean testRunTopologicalResort(String drawExpected,
		String treeViewExpected,
		String tableViewExpected)
	{
		boolean result = false;
		TSFunctions.runTopologicalSort(testerTestCase, environmentTester);
		if (TSFunctions.isDrawPresent(testerTestCase, drawExpected)
			&& TSFunctions.isViewPresent(testerTestCase, treeViewExpected)
			&& TSFunctions.isViewPresent(testerTestCase, tableViewExpected))
		{
			result = true;
		}
		
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "runTopologicalResort", environmentTester.evidencePath);
		}
		return result;
	}
	
	
	
	public boolean runRootCause(String drawExpected, String toolBarExpected)
	{
		boolean result = false;
		String nodeSelected =
			environmentTester.projectImagesPath + File.separator + "nodeSelected.png";
		String setEffectNodes =
			environmentTester.toolBarImagesPath + File.separator + "setEffectNodesToolBarDesktop.png";
		String runButton =
			environmentTester.toolBarImagesPath + File.separator + "RunDesktop.png";
		String clearButton =
			environmentTester.toolBarImagesPath + File.separator
				+ "ClearResultsEnableToolBarDesktop";
		
		String desktopCorner =
			environmentTester.toolBarImagesPath + File.separator + "desktopCorner.png";
		
		testerTestCase.clickOnElement(nodeSelected);
		testerTestCase.clickOnElement(setEffectNodes);
		testerTestCase.clickOnElement(runButton);
		
		TSAutomationUtils.pauseScript( new Long (2000));
		result = TSFunctions.isElementPresent(testerTestCase, drawExpected)
				&& testIsTreeViewPresent()
				&& TSFunctions.isToolBarPresent(testerTestCase, toolBarExpected);
		
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "runRootCause", environmentTester.evidencePath);
		}
		
		testerTestCase.clearResults(clearButton);
		testerTestCase.clickOnElement(desktopCorner);
		testerTestCase.clickOnElement(setEffectNodes);
		
		return result;
	}
	
	
	public boolean testSearch(String searchCriteria,String searchExpected)
	{
		boolean result = false;
		String searchBox=environmentTester.toolBarImagesPath + File.separator + "searchBoxToolBarDesktop.png";
		String clearSearchBox=environmentTester.toolBarImagesPath + File.separator + "";
		TSFunctions.search(testerTestCase, environmentTester,searchBox , searchCriteria);
		result = TSFunctions.isViewPresent(testerTestCase, searchExpected);
		if (!result)
		{
			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "testSearch", environmentTester.evidencePath);
		}
		TSFunctions.cleanSearch(testerTestCase, environmentTester, clearSearchBox);
		testerTestCase.zoomFit();
		TSFunctions.clickBlankRegion(testerTestCase);
		return result;
	}
	
	
	public boolean runBiconnectedComponents(String drawExpected , String treeViewExpected, String toolBarExpected)
	{
		boolean result = false;
		String runButton =
			environmentTester.toolBarImagesPath + File.separator
				+ "RunToolbarDesktop.png";
		String clearResultsButton =
			environmentTester.toolBarImagesPath + File.separator
				+ "ClearResultsEnableToolBarDesktop.png";
		testerTestCase.clickOnElement(runButton);
		result =
			TSFunctions.isDrawPresent(testerTestCase, drawExpected)
				&& TSFunctions.isElementPresent(testerTestCase, toolBarExpected)
				&& TSFunctions.isViewPresent(testerTestCase, treeViewExpected);
		if(!result)
		{

			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "runBiconnectedComponents", environmentTester.evidencePath);
		}
		
		testerTestCase.clickOnElement(clearResultsButton);
		

		return result;
	}
	
	public boolean runBridgeDetection(String drawExpected, String toolBarExpected)
	{
		boolean result = false;
		
		String runButton =
			environmentTester.toolBarImagesPath + File.separator
				+ "RunToolbarDesktop.png";
		String clearResultsButton =
			environmentTester.toolBarImagesPath + File.separator
				+ "ClearResultsEnableToolBarDesktop.png";
		testerTestCase.clickOnElement(runButton);
		result =
			TSFunctions.isDrawPresent(testerTestCase, drawExpected)
				&& TSFunctions.isElementPresent(testerTestCase, toolBarExpected);
		if(!result)
		{

			TSAutomationUtils.getScreenShot(testerTestCase, className
				+ "runBiconnectedComponents", environmentTester.evidencePath);
		}
		
		testerTestCase.clickOnElement(clearResultsButton);
		
		return result;
	}
	

}
