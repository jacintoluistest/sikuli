
package com.tomsawyer.perspectives.automation.sikuli.tests;


import java.io.File;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;


public class TSFunctions
{
	public static TSTester setDesktopTest(TSTester tester, String projectPathPropertyName)
	{
		// tester.LaunchTS();
		// tester.openProject(projectPathPropertyName);
		// tester.launchDesktopPreview();
		// tester.maximizeWindow();
		TSAutomationUtils.pauseScript(new Long(2000));

		return tester;
	}


	public static TSTester setHtml5Test(TSTester tester, String project)
	{
		tester.LaunchTS();
		tester.openProject(project);
		tester.launchHtml5Preview();
		tester.fullScreenBrowser();
		TSAutomationUtils.pauseScript(new Long(2000));
		tester.refreshBrowser();

		return tester;
	}


	public static TSTester setImageMapTest(TSTester tester, String project)
	{
		tester.LaunchTS();
		tester.openProject(project);
		tester.launchImageMap();
		tester.fullScreenBrowser();
		TSAutomationUtils.pauseScript(new Long(2000));
		tester.refreshBrowser();
		return tester;
	}


	public static TSEnvironment setScreenFolder(TSTester tester, TSEnvironment environment)
	{

		int screenId = tester.automationTesterCurrentScreen.getID();
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
		return environment;
	}


	public static boolean isDesktopPreviewLaunched(TSTester tester, String expected)
	{
		boolean result;
		if (tester.isPresentElement(expected) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}

		return result;
	}


	public static boolean isImageMapPreviewLaunched(TSTester tester,
		String expectedImagePath)
	{
		boolean result;
		if (tester.isPresentElement(expectedImagePath) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}

		return result;

	}


	public static boolean isCanvasPreviewLaunched(TSTester tester,
		String expectedImagePath)
	{
		boolean result;
		if (tester.isPresentElement(expectedImagePath) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}


	public static boolean isToolBarPresent(TSTester tester, String toolBarImagePath)
	{
		boolean result;
		if (tester.isPresentElement(toolBarImagePath) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}


	public static boolean isElementPresent(TSTester tester, String elementImagePath)
	{
		boolean result;
		if (tester.isPresentElement(elementImagePath) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}


	public static boolean isViewPresent(TSTester tester, String viewImagePath)
	{

		boolean result = true;
		if (tester.isPresentElement(viewImagePath) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;

	}


	public static boolean isViewPresent(TSTester tester,
		String viewImagePath,
		float similar)
	{

		boolean result = true;
		if (tester.isPresentElement(viewImagePath, similar) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}

		System.out.println("isViewPresent: " + result);
		return result;

	}


	public static boolean isDrawPresent(TSTester tester,
		String drawImagePath,
		float similar)
	{

		boolean result = true;
		if (tester.isPresentElement(drawImagePath, similar) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}

		System.out.println("isViewPresent: " + result);
		return result;

	}


	public static boolean isDrawPresent(TSTester tester, String drawImagePath)
	{

		boolean result = true;
		if (tester.isPresentElement(drawImagePath) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;

	}


	public static boolean isOverviewPresent(TSTester tester, String overviewImagePath)
	{
		boolean result = true;
		if (tester.isPresentElement(overviewImagePath) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}


	public static boolean isOverviewPresent(TSTester tester,
		String overviewImagePath,
		float similar)
	{
		boolean result = true;
		if (tester.isPresentElement(overviewImagePath, similar) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}


	public static boolean isLayoutPresent(TSTester tester,
		String expectedLayout,
		float similar)
	{
		boolean result = true;
		if (tester.isPresentElement(expectedLayout, similar) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		System.out.println("isLayoutPresent: " + result);
		return result;
	}


	public static boolean isLayoutPresent(TSTester tester, String expectedLayout)
	{
		boolean result = true;
		if (tester.isPresentElement(expectedLayout) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		System.out.println("isLayoutPresent: " + result);
		return result;
	}


	public static boolean isToolTipPresentWeb(TSTester tester,
		String imageHover,
		String imageExpected)
	{
		boolean result = true;
		long timeOut = Long.valueOf(TSAutomationUtils.getProperty("OnMouseHoverTimeOut"));

		tester.onMouseHoverImageMap(imageHover);

		if (tester.isPresentElement(imageExpected, new Float(0.64), timeOut) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		System.out.println("isToolTipPresent result =" + result);
		return result;
	}


	public static boolean isToolTipPresentDesktop(TSTester tester,
		String imageHover,
		String imageExpected)

	{
		boolean result = true;
		long timeOut = 1000;

		if (tester.operativeSystem.contains("windows"))
		{
			tester.onMouseHoverDesktop(imageHover);
		}

		else
		{
			tester.onMouseHoverDesktopMac(imageHover);
		}
		if (tester.isPresentElement(imageExpected, new Float(0.7), timeOut) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		System.out.println("isToolTipPresent result =" + result);
		return result;
	}


	public static boolean isToolTipPresentDesktop(TSTester tester,
		String imageHover,
		String imageExpected,
		float similar)

	{
		boolean result = true;
		long timeOut = 1200;

		if (tester.operativeSystem.contains("windows"))
		{
			tester.onMouseHoverDesktop(imageHover, similar);
		}

		else
		{
			tester.onMouseHoverDesktopMac(imageHover);
		}
		if (tester.isPresentElement(imageExpected, similar, timeOut) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		System.out.println("isToolTipPresent result =" + result);
		return result;
	}


	public static boolean isButtonPresent(TSTester tester, String buttonExpected)
	{
		boolean result;
		if (tester.isPresentElement(buttonExpected) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}

		return result;
	}


	public static boolean isButtonPresent(TSTester tester,
		String buttonExpected,
		float similar)
	{
		boolean result;
		if (tester.isPresentElement(buttonExpected, similar) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}

		return result;
	}


	public static boolean runMSliceCanvasWindows(TSTester tester,
		String minCapacity,
		String expectedLayout)
	{
		boolean result;
		String mSliceButton =
			tester.tspHtml5PreviewImagePath + File.separator + "Run.png";
		String minCapacityButton =
			tester.tspHtml5PreviewImagePath + File.separator + "MinCapacityCanvas.png";
		String comboButton =
			tester.tspHtml5PreviewImagePath + File.separator + "ComboCanvas.png";
		try
		{
			tester.automationTesterCurrentScreen.click(mSliceButton);
			tester.automationTesterCurrentScreen.doubleClick(minCapacityButton);
			tester.automationTesterCurrentScreen.click(comboButton);
			tester.automationTesterCurrentScreen.click(minCapacity);
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		result = isLayoutPresent(tester, expectedLayout, new Float(0.80));

		return result;
	}


	public static boolean runMSliceCanvasMac(TSTester tester,
		String minCapacity,
		String expectedLayout)
	{
		boolean result;
		String mSliceButton =
			tester.tspHtml5PreviewImagePath + File.separator + "Run.png";
		String minCapacityButton =
			tester.tspHtml5PreviewImagePath + File.separator + "MinCapacityCanvas.png";

		String preComboButton =
			tester.tspHtml5PreviewImagePath + File.separator + "54.png";
		String comboButton =
			tester.tspHtml5PreviewImagePath + File.separator + "ComboCanvas.png";

		try
		{
			tester.automationTesterCurrentScreen.click(mSliceButton);
			tester.automationTesterCurrentScreen.click(minCapacityButton);
			tester.automationTesterCurrentScreen.click(preComboButton);
			tester.automationTesterCurrentScreen.click(comboButton);
			tester.automationTesterCurrentScreen.click(minCapacity);
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		result = isLayoutPresent(tester, expectedLayout, new Float(0.80));

		return result;
	}


	public static boolean runMSliceImageMap(TSTester tester,
		String minCapacity,
		String expectedLayout)
	{
		boolean result;
		String mSliceButton =
			tester.tspImageMapImagesPath + File.separator + "MSliceImageMap.png";
		String minCapacityButton =
			tester.tspImageMapImagesPath + File.separator + "MinCapacityImageMap.png";
		String comboButton =
			tester.tspImageMapImagesPath + File.separator + "ComboImageMap.png";

		if (tester.operativeSystem.contains("windows"))
		{
			try
			{
				tester.automationTesterCurrentScreen.click(mSliceButton);
				tester.automationTesterCurrentScreen.doubleClick(minCapacityButton);
				tester.automationTesterCurrentScreen.click(comboButton);
				tester.automationTesterCurrentScreen.click(minCapacity);
			}
			catch (FindFailed ff)
			{
				System.out.println(ff.getMessage());
			}
			result = isLayoutPresent(tester, expectedLayout, new Float(0.80));
		}

		else
		{

			try
			{
				tester.automationTesterCurrentScreen.click(mSliceButton);
				tester.automationTesterCurrentScreen.doubleClick(minCapacityButton);
				tester.automationTesterCurrentScreen.doubleClick(comboButton);
				tester.automationTesterCurrentScreen.click(minCapacity);
			}
			catch (FindFailed ff)
			{
				System.out.println(ff.getMessage());
			}
			result = isLayoutPresent(tester, expectedLayout, new Float(0.80));
		}

		return result;

	}


	public static boolean runMaxFlowDesktop(TSTester tester,
		String expectedImage,
		TSEnvironment environment)
	{
		boolean result = false;
		float similar = new Float(0.94);
		float similarButtons = new Float(0.94);
		String sourceNode =
			environment.projectImagesPath + File.separator + "sourceNode.png";
		String sinkNode = environment.projectImagesPath + File.separator + "sinkNode.png";
		String setSourceNodeButton =
			environment.toolBarImagesPath + File.separator
				+ "SetSourceNodeToolBarDesktop.png";
		String setSinkNodeButton =
			environment.toolBarImagesPath + File.separator
				+ "SetSinkNodeToolBarDesktop.png";
		String runMaximumFlowButton =
			environment.toolBarImagesPath + File.separator + "Run.png";

		try
		{
			tester.automationTesterCurrentScreen.click(new Pattern(sourceNode).similar(similar));
			tester.automationTesterCurrentScreen.click(new Pattern(setSourceNodeButton).similar(similarButtons));
			tester.automationTesterCurrentScreen.click(new Pattern(sinkNode).similar(similar));
			tester.automationTesterCurrentScreen.click(new Pattern(setSinkNodeButton).similar(similarButtons));
			tester.automationTesterCurrentScreen.click(new Pattern(runMaximumFlowButton).similar(similarButtons));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

		result = isLayoutPresent(tester, expectedImage, similar);

		return result;
	}


	public static boolean runMaxFlowHtml5(TSTester tester,
		String layoutExpected,
		String viewExpected,
		TSEnvironment environment)
	{
		boolean result = false;
		float similar = new Float(0.90);
		float similarButtons = new Float(0.94);
		String sourceNode =
			environment.projectImagesPath + File.separator + "sourceNode.png";
		String sinkNode = environment.projectImagesPath + File.separator + "sinkNode.png";
		String setSourceNodeButton =
			environment.toolBarImagesPath + File.separator + "SetSourceNodeCanvas.png";
		String setSinkNodeButton =
			environment.toolBarImagesPath + File.separator + "SetSinkNodeCanvas.png";
		String runMaximumFlowButton =
			environment.toolBarImagesPath + File.separator + "Run.png";

		try
		{

			tester.automationTesterCurrentScreen.click(new Pattern(sourceNode).similar(similar));
			if (TSAutomationUtils.getOs().contains("mac"))
			{
				tester.automationTesterCurrentScreen.click(new Pattern(sourceNode).similar(similar));

			}
			TSAutomationUtils.pauseScript(new Long(800));
			tester.automationTesterCurrentScreen.click(new Pattern(setSourceNodeButton).similar(similarButtons));
			TSAutomationUtils.pauseScript(new Long(800));
			tester.automationTesterCurrentScreen.click(new Pattern(sinkNode).similar(similar));
			TSAutomationUtils.pauseScript(new Long(800));
			tester.automationTesterCurrentScreen.click(new Pattern(setSinkNodeButton).similar(similarButtons));
			TSAutomationUtils.pauseScript(new Long(800));
			tester.automationTesterCurrentScreen.click(new Pattern(runMaximumFlowButton).similar(similarButtons));
			TSAutomationUtils.pauseScript(new Long(800));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		if (isLayoutPresent(tester, layoutExpected, similar)
			&& (isViewPresent(tester, viewExpected, similar)))
		{
			result = true;
		}
		else
		{
			result = false;
		}

		tester.clearResultsMaxFlowHtml5();
		return result;
	}


	public static boolean runMaxFlowImageMap(TSTester tester,
		String layoutExpected,
		String viewExpected,
		TSEnvironment environment)
	{
		boolean result = false;
		float similar = new Float(0.90);
		float similarButtons = new Float(0.94);
		String sourceNode =
			environment.projectImagesPath + File.separator + "sourceNode.png";
		String sinkNode = environment.projectImagesPath + File.separator + "sinkNode.png";
		String setSourceNodeButton =
			environment.toolBarImagesPath + File.separator + "SetSourceNodeImageMap.png";
		String setSinkNodeButton =
			environment.toolBarImagesPath + File.separator + "SetSinkNodeImageMap.png";
		String runMaximumFlowButton =
			environment.toolBarImagesPath + File.separator + "RunImageMap.png";

		try
		{
			tester.automationTesterCurrentScreen.click(new Pattern(sourceNode).similar(similar));
			if (TSAutomationUtils.getOs().contains("mac"))
			{
				tester.automationTesterCurrentScreen.click(new Pattern(sourceNode).similar(similar));

			}
			TSAutomationUtils.pauseScript(new Long(800));
			tester.automationTesterCurrentScreen.click(new Pattern(setSourceNodeButton).similar(similarButtons));
			TSAutomationUtils.pauseScript(new Long(800));
			tester.automationTesterCurrentScreen.click(new Pattern(sinkNode).similar(similar));
			TSAutomationUtils.pauseScript(new Long(800));
			tester.automationTesterCurrentScreen.click(new Pattern(setSinkNodeButton).similar(similarButtons));
			TSAutomationUtils.pauseScript(new Long(800));
			tester.automationTesterCurrentScreen.click(new Pattern(runMaximumFlowButton).similar(similarButtons));
			TSAutomationUtils.pauseScript(new Long(800));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		if (isLayoutPresent(tester, layoutExpected, similar)
			&& (isViewPresent(tester, viewExpected, similar)))
		{
			result = true;
		}
		else
		{
			result = false;
		}

		tester.clearResultsMaxFlowImageMap();
		return result;
	}


	public static void runShortestPathsAlgorithm(TSTester tester,
		TSEnvironment environment)
	{
		String setStartNodeButton =
			environment.toolBarImagesPath + File.separator
				+ "setStartNodeToolBarDesktop.png";
		String setFinishNodeButton =
			environment.toolBarImagesPath + File.separator
				+ "setFinishNodeToolBarDesktop.png";
		String runShortestPathsButton =
			environment.toolBarImagesPath + File.separator + "RunToolBarDesktop.png";

		String startNode =
			environment.toolBarImagesPath + File.separator + "startNode.png";
		String finishNode =
			environment.toolBarImagesPath + File.separator + "finishNode.png";

		tester.clickOnElement(startNode);
		tester.clickOnElement(setStartNodeButton);
		tester.clickOnElement(finishNode);
		tester.clickOnElement(setFinishNodeButton);
		tester.clickOnElement(runShortestPathsButton);
	}


	public static void defaultDraw(TSTester tester, String defaultTabDraw)
	{
		tester.clickOnElement(defaultTabDraw);
	}


	public static void clickBlankRegion(TSTester tester)
	{
		Region blankArea = null;
		switch (tester.automationTesterCurrentScreen.getID())
		{
			case 0:
				blankArea = new Region(1154, 114, 62, 38);

			case 1:
				blankArea = new Region(-119, -106, 40, 25);
				break;
		}
		blankArea.click();

	}


	public static void runTopologicalSort(TSTester tester, TSEnvironment environment)
	{
		String runTopologicalSort = environment.toolBarImagesPath + "Run.png";
		tester.runAlgorithm(runTopologicalSort);
	}


	public static void search(TSTester tester,
		TSEnvironment environtment,
		String searchBoxPath,
		String searchCriteria)
	{
		tester.clickOnElement(searchBoxPath);
		tester.automationTesterCurrentScreen.type(searchCriteria);
		tester.automationTesterCurrentScreen.type(Key.ENTER);
		tester.automationTesterCurrentScreen.type(Key.DOWN);
		tester.automationTesterCurrentScreen.type(Key.ENTER);

	}


	public static void cleanSearch(TSTester tester,
		TSEnvironment environment,
		String clearSearch)
	{
		try
		{
			tester.automationTesterCurrentScreen.click(clearSearch);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
	}


	public static void closeTreeNode(TSTester tester ,String closeNodeTool)
	{
		tester.clickOnElement(closeNodeTool);
		
	}

}
