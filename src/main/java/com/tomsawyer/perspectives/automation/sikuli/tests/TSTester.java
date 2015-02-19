
package com.tomsawyer.perspectives.automation.sikuli.tests;


import java.io.File;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.App;


/**
 * @author ljacinto This class implements all the functions to interactive with Tom Sawyer
 * Perspectives
 * 
 */

public class TSTester
{
	String tsperspectivesToolBarImagesPath;

	String tspDesktopPreviewImagesPath;

	String tspImageMapImagesPath;

	String tspHtml5PreviewImagePath;

	String TS_HOME;

	Screen automationTesterCurrentScreen;

	long openTSPerspectivesTimeOut;

	String tomSawyerDesignerApplicationPath;

	App tomSawyerApplication;

	public String operativeSystem;

	String browser;


	public TSTester()
	{
		setAutomationOsEnvironment();
		System.out.println("Wait Time Out for sleep is " + openTSPerspectivesTimeOut);
		automationTesterCurrentScreen = new Screen();

	}


	/**
	 * 
	 * @param screenId
	 */
	public TSTester(int screenId)
	{
		setAutomationOsEnvironment();
		System.out.println("Wait Time Out for sleep is " + openTSPerspectivesTimeOut);
		automationTesterCurrentScreen = new Screen(screenId);

	}


	public TSTester(String browser)
	{
		this.browser = browser;
		setAutomationOsEnvironmentWeb();
		System.out.println("Wait Time Out for sleep is " + openTSPerspectivesTimeOut);
		automationTesterCurrentScreen = new Screen();

	}


	public void setAutomationOsEnvironmentWeb()
	{
		// This method sets the environment for test execution

		operativeSystem = TSAutomationUtils.getOs();
		System.out.println(operativeSystem);

		if (operativeSystem.contains("mac os x"))
		{
			setAutomationOsEnvironmentWebMac();
		}
		else
		{
			if (operativeSystem.contains("7"))
			{
				setAutomationOsEnvironmentWebWindows7();
			}

			else
			{
				setAutomationOsEnvironmentWebWindows();
			}
		}
		System.out.println("*****Paths set for init Test**********");
		System.out.println(tomSawyerDesignerApplicationPath);
		System.out.println(tsperspectivesToolBarImagesPath);
		System.out.println(tspImageMapImagesPath);
		System.out.println(tspHtml5PreviewImagePath);

	}


	public void setAutomationOsEnvironmentWebMac()
	{

		TS_HOME = TSAutomationUtils.getProperty("TS_HOME_Mac");
		System.out.println("Path de Tom Sawyer es " + TS_HOME);
		tomSawyerDesignerApplicationPath =
			TSAutomationUtils.getProperty("TSPApplicationPathMac");
		tsperspectivesToolBarImagesPath =
			"images/Mac/TomSawyerPerspectives" + File.separator + "TSPerspectivesToolBar";
		tspDesktopPreviewImagesPath =
			"images" + File.separator + "Mac" + File.separator + "TomSawyerPerspectives"
				+ File.separator + "CommonDesktopPreview" + File.separator + "ToolBar";
		tspImageMapImagesPath =
			"images" + File.separator + "Mac" + File.separator + "TomSawyerPerspectives"
				+ File.separator + "CommonImageMapPreview" + File.separator + browser
				+ File.separator + "ToolBar";

		tspHtml5PreviewImagePath =
			"images" + File.separator + "Mac" + File.separator + "TomSawyerPerspectives"
				+ File.separator + "CommonCanvasPreview" + File.separator + browser
				+ File.separator + "ToolBar";
	}


	public void setAutomationOsEnvironmentWebWindows()
	{

		TS_HOME = TSAutomationUtils.getProperty("TS_HOME_Win");
		System.out.println("Path de Tom Sawyer es " + TS_HOME);
		tomSawyerDesignerApplicationPath =
			TSAutomationUtils.getProperty("TSPApplicationPathWindows");
		tsperspectivesToolBarImagesPath =
			"images" + File.separator + "Windows" + File.separator
				+ "TomSawyerPerspectives" + File.separator + "TSPerspectivesToolBar";
		tspDesktopPreviewImagesPath =
			"images" + File.separator + "Windows" + File.separator
				+ "TomSawyerPerspectives" + File.separator + "CommonDesktopPreview"
				+ File.separator + "ToolBar";
		tspImageMapImagesPath =
			"images" + File.separator + "Windows" + File.separator
				+ "TomSawyerPerspectives" + File.separator + "CommonImageMapPreview"
				+ File.separator + browser + File.separator + "ToolBar";
		tspHtml5PreviewImagePath =
			"images" + File.separator + "Windows" + File.separator
				+ "TomSawyerPerspectives" + File.separator + "CommonCanvasPreview"
				+ File.separator + browser + File.separator + "ToolBar";
	}


	public void setAutomationOsEnvironmentWebWindows7()
	{
		TS_HOME = TSAutomationUtils.getProperty("TS_HOME_Win");
		System.out.println("Path de Tom Sawyer es " + TS_HOME);
		tomSawyerDesignerApplicationPath =
			TSAutomationUtils.getProperty("TSPApplicationPathWindows");
		tsperspectivesToolBarImagesPath =
			"images" + File.separator + "Windows7" + File.separator
				+ "TomSawyerPerspectives" + File.separator + "TSPerspectivesToolBar";
		tspDesktopPreviewImagesPath =
			"images" + File.separator + "Windows7" + File.separator
				+ "TomSawyerPerspectives" + File.separator + "CommonDesktopPreview"
				+ File.separator + "ToolBar";
		tspImageMapImagesPath =
			"images" + File.separator + "Windows7" + File.separator
				+ "TomSawyerPerspectives" + File.separator + "CommonImageMapPreview"
				+ File.separator + browser + File.separator + "ToolBar";
		tspHtml5PreviewImagePath =
			"images" + File.separator + "Windows7" + File.separator
				+ "TomSawyerPerspectives" + File.separator + "CommonCanvasPreview"
				+ File.separator + browser + File.separator + "ToolBar";
	}


	public void setAutomationOsEnvironment()
	{
		// This method sets the environment for test execution

		operativeSystem = TSAutomationUtils.getOs();
		System.out.println(operativeSystem);

		if (operativeSystem.contains("mac os x"))
		{
			TS_HOME = TSAutomationUtils.getProperty("TS_HOME_Mac");
			System.out.println("Path de Tom Sawyer es " + TS_HOME);
			tomSawyerDesignerApplicationPath =
				TSAutomationUtils.getProperty("TSPApplicationPathMac");
			tsperspectivesToolBarImagesPath =
				"images/Mac/TomSawyerPerspectives/TSPerspectivesToolBar";
			tspDesktopPreviewImagesPath =
				"images" + File.separator + "Mac" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonDesktopPreview"
					+ File.separator + "ToolBar";
			tspImageMapImagesPath =
				"images" + File.separator + "Mac" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonImageMapPreview"
					+ File.separator + "ToolBar";

			tspHtml5PreviewImagePath =
				"images" + File.separator + "Mac" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonCanvasPreview"
					+ File.separator + "ToolBar";
		}
		else
		{
			TS_HOME = TSAutomationUtils.getProperty("TS_HOME_Win");
			System.out.println("Path de Tom Sawyer es " + TS_HOME);
			tomSawyerDesignerApplicationPath =
				TSAutomationUtils.getProperty("TSPApplicationPathWindows");
			tsperspectivesToolBarImagesPath =
				"images" + File.separator + "Windows" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "TSPerspectivesToolBar";
			tspDesktopPreviewImagesPath =
				"images" + File.separator + "Windows" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonDesktopPreview"
					+ File.separator + "ToolBar";
			tspImageMapImagesPath =
				"images" + File.separator + "Windows" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonImageMapPreview"
					+ File.separator + "ToolBar";
			tspHtml5PreviewImagePath =
				"images" + File.separator + "Windows" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonCanvasPreview"
					+ File.separator + "ToolBar";
		}

	}


	public void LaunchTS()
	{

		System.out.println("Pause before launch TS");
		TSAutomationUtils.pauseScript(new Long(8000));
		tomSawyerApplication = new App(tomSawyerDesignerApplicationPath);
		tomSawyerApplication.open();
		System.out.println("Pause on LaunchTS");
		TSAutomationUtils.pauseScript(Long.valueOf(TSAutomationUtils.getProperty("openTomSawyerPerspectivesSecondsTimeOut")));
	}


	public void openProjectWindows(String proyectPath)
	{
		System.out.println("*******Opening Project ******");
		// Waiting for screen

		try
		{
			System.out.println("Getting current Screen");
			automationTesterCurrentScreen =
				new Screen(TSAutomationUtils.getCurrentScreenId(new Pattern(this.tsperspectivesToolBarImagesPath
					+ File.separator + "openFileIcon.png").similar(new Float(0.8))));

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Current Screen= " + automationTesterCurrentScreen.getID());
		System.out.println("Pause on openProyect");
		// TSSAutomationUtils.pauseScript();
		try
		{

			automationTesterCurrentScreen.click(new Pattern(this.tsperspectivesToolBarImagesPath
				+ File.separator + "openFileIcon.png").similar(new Float(0.9)));
			// automationTesterCurrentScreen.type(Key.DELETE);

			System.out.println("Open Dialog");
			automationTesterCurrentScreen.wait(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "pathTextBox.png").similar(new Float(0.9)),
				5000);
			System.out.println("Waiting for Text Area");
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "pathTextBox.png"));
			System.out.println("Pegando portapapeles" + TS_HOME + proyectPath);
			automationTesterCurrentScreen.paste(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "pathTextBox.png").similar(new Float(0.9)),
				TS_HOME + proyectPath);
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "openButton.png").similar(new Float(0.9)));
			automationTesterCurrentScreen.wait(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "DrawViewIcon.png").similar(new Float(0.7)),
				5);

		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}


	public void openProjectMac(String proyectPath)
	{
		System.out.println("*******Opening Project ******" + proyectPath);
		// Waiting for screen

		try
		{
			System.out.println("Getting current Screen");
			System.out.println("Trying to get:  " + tsperspectivesToolBarImagesPath
				+ File.separator + "openFileIcon.png");
			automationTesterCurrentScreen =
				new Screen(TSAutomationUtils.getCurrentScreenId(new Pattern(this.tsperspectivesToolBarImagesPath
					+ File.separator + "openFileIcon.png").similar(new Float(0.8))));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Current screenl= " + automationTesterCurrentScreen.getID());
		try
		{
			automationTesterCurrentScreen.click(new Pattern(this.tsperspectivesToolBarImagesPath
				+ File.separator + "openFileIcon.png").similar(new Float(0.9)));
			TSAutomationUtils.pauseScript(new Long(1000));
			automationTesterCurrentScreen.type("g", Key.CMD + Key.SHIFT);
			TSAutomationUtils.pauseScript(new Long(500));
			automationTesterCurrentScreen.type(Key.DELETE);
			TSAutomationUtils.pauseScript(new Long(500));
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "openFilePathInput.png").similar(new Float(0.7)));
			automationTesterCurrentScreen.type(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "openFilePathInput.png").similar(new Float(0.7)),
				TS_HOME + proyectPath);

			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "openFileGoButton.png").similar(new Float(0.8)));
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "openButton.png").similar(new Float(0.9)));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage() + ff);
		}
	}


	public void launchDesktopPreview()
	{
		// Setting the screen
		System.out.println(tsperspectivesToolBarImagesPath + File.separator
			+ "launchDesktopPreview.png");
		try
		{
			automationTesterCurrentScreen =
				new Screen(TSAutomationUtils.getCurrentScreenId(new Pattern(tsperspectivesToolBarImagesPath
					+ File.separator + "launchDesktopPreview.png").similar(new Float(0.7))));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "launchDesktopPreview.png").similar(new Float(0.5)));

		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript();
	}


	public void launchImageMap()
	{

		// Setting the screen
		try
		{
			automationTesterCurrentScreen =
				new Screen(TSAutomationUtils.getCurrentScreenId(new Pattern(tsperspectivesToolBarImagesPath
					+ File.separator + "WebPreview.png").similar(new Float(0.7))));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		// Launch ImageMapPreview
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "WebPreview.png").similar(new Float(0.7)));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		System.out.println("Pause on launchWebPreview");

		TSAutomationUtils.pauseScript(new Long(Long.valueOf(TSAutomationUtils.getProperty("TimeWaitwebPreview"))));

		try
		{
			System.out.println("Trying get screen again");
			automationTesterCurrentScreen =
				new Screen(TSAutomationUtils.getCurrentScreenId(new Pattern(tspImageMapImagesPath
					+ File.separator + "WebCommonToolBar.png").similar(new Float(0.8))));
			System.out.println("*********Screen Settings");

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println("Finish launch Web Preview");

	}


	public void launchHtml5Preview()
	{
		// Setting the screen
		try
		{
			automationTesterCurrentScreen =
				new Screen(TSAutomationUtils.getCurrentScreenId(new Pattern(tsperspectivesToolBarImagesPath
					+ File.separator + "WebPreview.png").similar(new Float(0.7))));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "Html5Preview.png").similar(new Float(0.5)));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		System.out.println("Pause on HTML5 Preview");
		TSAutomationUtils.pauseScript(new Long(Long.valueOf(TSAutomationUtils.getProperty("TimeWaitwebPreview"))));
		System.out.println("Getting again screen");

		try
		{
			System.out.println("Trying get screen for Preview");
			automationTesterCurrentScreen =
				new Screen(TSAutomationUtils.getCurrentScreenId(new Pattern(tspHtml5PreviewImagePath
					+ File.separator + "WebCommonToolBar.png").similar(new Float(0.8))));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println("Finish launch Web Preview");
	}

	public void zoomInDesktop()
	{
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "ZoomInToolBarDesktop.png").similar(new Float(0.7)));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}
	
	public void zoomInImageMap()
	{
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "ZoomInImageMap.png").similar(new Float(0.7)));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}
	
	public void zoomInHtml5()
	{
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "ZoomInCanvas.png").similar(new Float(0.7)));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}
	
	public void zoomFitDesktop()
	{
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "ZoomFitToolBarDesktop.png").similar(new Float(0.7)));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}
	
	public void zoomFitImageMap()
	{
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "ZoomFitImageMap.png").similar(new Float(0.7)));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}
	
	public void zoomFitHtml5()
	{
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "ZoomFitCanvas.png").similar(new Float(0.7)));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}
	
	public void circularLayout()
	{
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "CircularLayout.png").similar(new Float(0.7)));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}


	public void orthogonalLayoutDesktop()
	{
		String circularLayout =
			tspDesktopPreviewImagesPath + File.separator
				+ "OrthogonalLayoutToolBarDesktop.png";
		try
		{
			automationTesterCurrentScreen.click(circularLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}
	
	


	public void orthogonalLayoutImageMap()
	{
		String orthogonalLayout =
			tspImageMapImagesPath + File.separator + "OrthogonalLayoutImageMap.png";
		try
		{
			automationTesterCurrentScreen.click(orthogonalLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void orthogonalLayoutHtml5()
	{
		String orthogonalLayout =
			tspImageMapImagesPath + File.separator + "OrthogonalLayoutCanvas.png";
		try
		{
			automationTesterCurrentScreen.click(orthogonalLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}
	
	public void orthogonalLayoutHtml5(String orthogonalLayoutImage)
	{
		
		try
		{
			automationTesterCurrentScreen.click(orthogonalLayoutImage);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public Match isPresentElement(String patternStringPath)
	{
		TSAutomationUtils.pauseScript();
		System.out.println("Searching image for validation " + patternStringPath);
		// Waiting for screen

		return automationTesterCurrentScreen.exists(new Pattern(patternStringPath).similar(new Float(0.5)));

	}


	public Match isPresentElement(String patternStringPath, float similar)
	{
		TSAutomationUtils.pauseScript(new Long (2500));
		System.out.println("Searching image for validation" + patternStringPath);
		// Waiting for screen

		return automationTesterCurrentScreen.exists(new Pattern(patternStringPath).similar(similar));

	}


	public Match isPresentElement(String patternStringPath, float similar, Long timeout)
	{
		File imageFile;
		TSAutomationUtils.pauseScript(timeout);
		System.out.println("Searching image for validation" + patternStringPath);
		// Waiting for screen
		imageFile = new File(patternStringPath);
		if (imageFile.exists())
		{

			return automationTesterCurrentScreen.exists(new Pattern(patternStringPath).similar(similar));
		}
		else
		{
			System.out.println("Could not load file :" + patternStringPath);
			return null;
		}

	}


	public void isPresentElementImageMap(String patternStringPath)
	{

	}


	public void closeDekstopPreview()
	{
		App.close("Tom Sawyer Perspectives Previewer");
		System.out.println("Intentando cerrar");
		// TSAutomationUtils.pauseScript(new Long(5000));
	}


	public void closeCurrentBrowser()
	{
		// String browser = TSAutomationUtils.getProperty("DefaultBrowser");
		System.out.println("Closing Web Preview");
		if (operativeSystem.contains("windows"))
		{
			closeTabWindows();

		}

		else
		{
			closeTabMac();
		}

	}


	public void openOverviewDesktop()
	{
		System.out.println("Opening Overview");
		System.out.println(tspDesktopPreviewImagesPath + File.separator
			+ "OverviewToolBarDesktop.png");
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tspDesktopPreviewImagesPath
				+ "//OverviewToolBarDesktop.png").similar(new Float(0.7)));
			TSAutomationUtils.pauseScript(new Long(2000));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
	}


	public void openOverviewImageMap()
	{
		System.out.println("Opening Overview");
		System.out.println(tspImageMapImagesPath + File.separator
			+ "OverviewImageMap.png");
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tspImageMapImagesPath
				+ File.separator + "OverviewImageMap.png").similar(new Float(0.7)));
			TSAutomationUtils.pauseScript(new Long(1500));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
	}


	public void openOverviewHtml5()
	{
		System.out.println("Opening Overview");
		System.out.println(tspHtml5PreviewImagePath + File.separator
			+ "OverviewCanvas.png");
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tspHtml5PreviewImagePath
				+ File.separator + "OverviewCanvas.png").similar(new Float(0.7)));
			TSAutomationUtils.pauseScript(new Long(2000));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
	}


	public void closeTSP()
	{
		App.close("Tom Sawyer Perspectives Designer");
	}


	public void onMouseHoverDesktop(String patternStringPath)
	{
		App.focus("Tom Sawyer Perspectives Previewer");
		try
		{
			automationTesterCurrentScreen.hover(new Pattern(patternStringPath).similar(new Float(0.95)));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}


	public void onMouseHoverDesktop(String patternStringPath, float similar)
	{
		App.focus("Tom Sawyer Perspectives Previewer");
		try
		{
			automationTesterCurrentScreen.hover(new Pattern(patternStringPath).similar(similar));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}


	public void onMouseHoverDesktopMac(String patternStringPath)
	{
		try
		{
			automationTesterCurrentScreen.hover(new Pattern(patternStringPath).similar(new Float(0.80)));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}


	public void onMouseHoverDesktopMac(String patternStringPath, float similar)
	{
		try
		{
			automationTesterCurrentScreen.hover(new Pattern(patternStringPath).similar(similar));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}


	public void onMouseHoverImageMap(String patternStringPath)
	{
		float similar;
		if (operativeSystem.contains("windows"))
		{
			similar = new Float(0.85);
		}
		else
		{
			similar = new Float(0.78);
		}

		try
		{
			automationTesterCurrentScreen.hover(new Pattern(patternStringPath).similar(similar));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
	}


	public void maximizeWindow()
	{
		if (TSAutomationUtils.getOs().contains("mac"))
		{
			String maximizeWindowIcon =
				tsperspectivesToolBarImagesPath + File.separator + "maximize.png";

			// automationTesterCurrentScreen.type("f", Key.CTRL + Key.META);
			try
			{
				automationTesterCurrentScreen.click(new Pattern(maximizeWindowIcon).similar(new Float(0.88)));
				TSAutomationUtils.pauseScript(new Long(1500));
				zoomFit();
			}
			catch (FindFailed ff)
			{
				System.out.println(ff.getMessage());
			}
		}

		else
		{
			automationTesterCurrentScreen.type(Key.UP, Key.WIN);
			zoomFit();
		}

	}


	public void fullScreenBrowser()
	{
		if (operativeSystem.contains("windows"))
		{
			fullScreenBrowserWindows();

		}
		else
		{
			fullScreenBrowserMac();
		}
	}


	public void fullScreenBrowserMac()
	{
		// Region buttonsRegion =
		// new Region(0, 0, 70, 50, automationTesterCurrentScreen.getID());
		// if (buttonsRegion.exists(tsperspectivesToolBarImagesPath + File.separator
		// + "maximize.png") != null)
		System.out.println(TSAutomationUtils.getProperty("DefaultBrowser"));
		if (TSAutomationUtils.getProperty("DefaultBrowser").contains("Chrome"))
		{
			presentationView();
		}
		else
		{
			automationTesterCurrentScreen.type("f", Key.CTRL + Key.META);
		}

	}


	public void closeTabMac()
	{
		automationTesterCurrentScreen.type("W", Key.META);
	}


	public void closeTabWindows()
	{
		automationTesterCurrentScreen.type("W", Key.CTRL);
	}


	public void fullScreenBrowserWindows()
	{
		automationTesterCurrentScreen.type(Key.F11);

	}


	public void presentationView()
	{
		automationTesterCurrentScreen.type("f", Key.SHIFT + Key.CMD);
	}


	public void refreshBrowser()
	{

		if (operativeSystem.contains("mac"))
		{
			automationTesterCurrentScreen.type("r", Key.CMD);
			TSAutomationUtils.pauseScript(new Long(3500));
		}
		else
		{
			automationTesterCurrentScreen.type(Key.F5);
			TSAutomationUtils.pauseScript(new Long(3500));
		}
	}


	public void closeAll()
	{
		if (TSAutomationUtils.getOs().contains("mac os x"))
		{

			closeTSP();
			System.out.println("Closing everything...");
			System.out.println("Thank you");
			TSAutomationUtils.pauseScript(new Long(5000));

		}
		else
		{
			closeTSP();
			System.out.println("Closing everything...");
			System.out.println("Thank you");
			TSAutomationUtils.pauseScript(new Long(5000));

		}
	}


	public void openProject(String proyectPath)
	{
		if (TSAutomationUtils.getOs().contains("mac"))
		{
			openProjectMac(TSAutomationUtils.getProperty(proyectPath + "_Mac"));
		}
		else
		{
			openProjectWindows(TSAutomationUtils.getProperty(proyectPath + "_Win"));
		}
	}


	public void zoomFit()
	{
		String zoomFit =
			tspDesktopPreviewImagesPath + File.separator + "ZoomFitToolBarDesktop.png";
		try
		{
			automationTesterCurrentScreen.click(zoomFit);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));
	}


	public void CircularLayoutDesktop()
	{
		String circularLayout =
			tspDesktopPreviewImagesPath + File.separator
				+ "CircularLayoutToolBarDesktop.png";
		try
		{
			automationTesterCurrentScreen.click(circularLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void CircularLayoutImageMap()
	{
		String circularLayout =
			tspImageMapImagesPath + File.separator + "CircularLayoutImageMap.png";
		try
		{
			automationTesterCurrentScreen.click(circularLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void CircularLayoutHtml5()
	{
		String circularLayout =
			tspHtml5PreviewImagePath + File.separator + "CircularLayoutCanvas.png";
		try
		{
			automationTesterCurrentScreen.click(circularLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void HierarchicalLayoutDesktop()
	{
		String circularLayout =
			tspDesktopPreviewImagesPath + File.separator
				+ "HierarchicalLayoutToolBarDesktop.png";
		try
		{
			automationTesterCurrentScreen.click(circularLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void HierarchicalLayoutImageMap()
	{
		String circularLayout =
			tspImageMapImagesPath + File.separator + "HierarchicalLayoutImageMap.png";
		try
		{
			automationTesterCurrentScreen.click(circularLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void HierarchicalLayoutHtml5()
	{
		String hierarchicalLayout =
			tspHtml5PreviewImagePath + File.separator + "HierarchicalLayoutCanvas.png";
		try
		{
			automationTesterCurrentScreen.click(hierarchicalLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void SymmetricLayoutDesktop()
	{
		String circularLayout =
			tspDesktopPreviewImagesPath + File.separator
				+ "SymmetricLayoutToolBarDesktop.png";
		try
		{
			automationTesterCurrentScreen.click(circularLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}
	
	public void SymmetricLayoutDesktop(String circularLayout)
	{
		try
		{
			automationTesterCurrentScreen.click(circularLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void SymmetricLayoutImageMap()
	{
		String circularLayout =
			tspImageMapImagesPath + File.separator + "SymmetricLayoutImageMap.png";
		try
		{
			automationTesterCurrentScreen.click(circularLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}

	public void SymmetricLayoutImageMap(String symmetricLayout)
	{
		try
		{
			automationTesterCurrentScreen.click(symmetricLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void SymmetricLayoutHtml5()
	{
		String circularLayout =
			tspHtml5PreviewImagePath + File.separator
				+ "UnselectedSymmetricLayoutCanvas.png";
		try
		{
			System.out.println(circularLayout);
			automationTesterCurrentScreen.click(circularLayout);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}

	public void SymmetricLayoutHtml5(String symmetricLayoutImage)
	{
		try
		{
			System.out.println(symmetricLayoutImage);
			automationTesterCurrentScreen.click(symmetricLayoutImage);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void runAlgorithm(String button)
	{
		try
		{
			automationTesterCurrentScreen.click(button);
			if (operativeSystem.contains("mac"))
			{
				automationTesterCurrentScreen.click(button);

			}
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void clearResults(String button)
	{
		try
		{
			automationTesterCurrentScreen.click(button);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));
	}


	public void closeOverview(String overviewButton)
	{
		try
		{
			automationTesterCurrentScreen.click(overviewButton);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void closeOverviewDesktop()
	{
		String overviewButton =
			tspDesktopPreviewImagesPath + File.separator + "closeOverview.png";
		try
		{
			automationTesterCurrentScreen.click(overviewButton);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void closeOverviewCanvas()
	{
		String overviewButton =
			tspHtml5PreviewImagePath + File.separator + "closeOverviewCanvas.png";
		try
		{
			automationTesterCurrentScreen.click(overviewButton);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void closeOverviewImageMap()
	{
		String overviewButton =
			tspImageMapImagesPath + File.separator + "closeOverviewImageMap.png";
		try
		{
			automationTesterCurrentScreen.click(overviewButton);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));

	}


	public void clearResultsMaxFlowDesktop()
	{
		String clearResultsButton =
			tspDesktopPreviewImagesPath + File.separator
				+ "ClearResultsEnableToolBarDesktop.png";
		String hierarchicalSelected =
			tspDesktopPreviewImagesPath + File.separator
				+ "HierarchicalSelectedToolBarDEsktop.png";		
		Region r;

		switch (automationTesterCurrentScreen.getID())
		{
			case 0:
				r = new Region(350, 120, 10, 10);
				break;

			case 1:
				r = new Region(659, 98, 10, 10);
				break;

			default:
				r = null;
				break;
		}
		
		try
		{
			automationTesterCurrentScreen.click(clearResultsButton);
			automationTesterCurrentScreen.click(hierarchicalSelected);
			TSAutomationUtils.pauseScript(new Long(1500));
			automationTesterCurrentScreen.click(r);

		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		
	}
	
	public void clearResultsShortesPathsDesktop()
	{
		String clearResultsButton =
			tspDesktopPreviewImagesPath + File.separator
				+ "ClearResultsEnableToolBarDesktop.png";
		Region r;

		switch (automationTesterCurrentScreen.getID())
		{
			case 0:
				r = new Region(350, 120, 10, 10);
				break;

			case 1:
				r = new Region(659, 98, 10, 10);
				break;

			default:
				r = null;
				break;
		}
		
		try
		{
			automationTesterCurrentScreen.click(clearResultsButton);
			TSAutomationUtils.pauseScript(new Long(1500));
			automationTesterCurrentScreen.click(r);

		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		
	}


	public void clearResultsMaxFlowHtml5()
	{
		String clearResultsButton =
			tspHtml5PreviewImagePath + File.separator + "ClearResultsCanvas.png";
		Region r;

		switch (automationTesterCurrentScreen.getID())
		{
			case 0:
				r = new Region(332, 98, 10, 10);
				break;

			case 1:
				r = new Region(659, 98, 10, 10);
				break;

			default:
				r = null;
				break;
		}

		try
		{
			automationTesterCurrentScreen.click(clearResultsButton);
			automationTesterCurrentScreen.click(r);

		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
	}


	public void clearResultsMaxFlowImageMap()
	{

		String clearResultsButton =
			tspImageMapImagesPath + File.separator + "ClearResultsImageMap.png";
//		String hierarchicalSelected =
//			tspImageMapImagesPath + File.separator
//				+ "HierarchicalLayoutSelectedImageMap.png";
		Region r;

		switch (automationTesterCurrentScreen.getID())
		{
			case 0:
				r = new Region(332, 98, 10, 10);
				break;

			case 1:
				r = new Region(659, 98, 10, 10);
				break;

			default:
				r = null;
				break;
		}

		try
		{
			automationTesterCurrentScreen.click(clearResultsButton);
			//automationTesterCurrentScreen.click(hierarchicalSelected);
			automationTesterCurrentScreen.click(r);

		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
	}


	public void undoImageMap()
	{
		String undoButton = tspImageMapImagesPath + File.separator + "undo.png";

		try
		{
			automationTesterCurrentScreen.click(undoButton);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}


	public void undoHtml5()
	{
		String undoButton = tspHtml5PreviewImagePath + File.separator + "undoCanvas.png";

		try
		{
			automationTesterCurrentScreen.click(undoButton);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}


	public void undoDesktop()
	{
		String undoButton = tspDesktopPreviewImagesPath + File.separator + "undo.png";

		try
		{
			automationTesterCurrentScreen.click(undoButton);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
	}
	
	public void clickOnElement(String element)
	{
		try{
			automationTesterCurrentScreen.click(element);
		}
		
		catch(FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		
	}
	
	public void rightClickOnElement(String element)
	{
		try{
			automationTesterCurrentScreen.rightClick(element);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		}
	
}
