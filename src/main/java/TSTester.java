import java.io.File;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.App;


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
			TS_HOME = TSAutomationUtils.getProperty("TS_HOME_Mac");
			System.out.println("Path de Tom Sawyer es " + TS_HOME);
			tomSawyerDesignerApplicationPath =
				TSAutomationUtils.getProperty("TSPApplicationPathMac");
			tsperspectivesToolBarImagesPath =
				"images/Mac/TomSawyerPerspectives" + File.separator
					+ "TSPerspectivesToolBar";
			tspDesktopPreviewImagesPath =
				"images" + File.separator + "Mac" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonDesktopPreview"
					+ File.separator + "ToolBar";
			tspImageMapImagesPath =
				"images" + File.separator + "Mac" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonImageMapPreview"
					+ File.separator + browser + File.separator + "ToolBar";

			tspHtml5PreviewImagePath =
				"images" + File.separator + "Mac" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonCanvasPreview"
					+ File.separator + browser + File.separator + "ToolBar";
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
					+ File.separator + browser + File.separator + "ToolBar";
			tspHtml5PreviewImagePath =
				"images" + File.separator + "Windows" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonCanvasPreview"
					+ File.separator + browser + File.separator + "ToolBar";
		}

		System.out.println(tomSawyerDesignerApplicationPath);
		System.out.println(tsperspectivesToolBarImagesPath);
		System.out.println(tspImageMapImagesPath);
		System.out.println(tspHtml5PreviewImagePath);

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

			System.out.println("Open Dialog");
			automationTesterCurrentScreen.wait(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "pathTextBox.png").similar(new Float(0.9)),
				25000);
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


	public void launchWebPreview()
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
		// Launch CanvasPreview
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "Html5Preview.png").similar(new Float(0.5)));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		System.out.println("Pause on launchCanvasPreview");
		TSAutomationUtils.pauseScript(new Long(Long.valueOf(TSAutomationUtils.getProperty("TimeWaitwebPreview"))));
		System.out.println("Getting again screen");

		try
		{
			System.out.println("Trying get screen again");
			automationTesterCurrentScreen =
				new Screen(TSAutomationUtils.getCurrentScreenId(new Pattern(tspImageMapImagesPath
					+ File.separator + "WebCommonToolBar.png").similar(new Float(0.8))));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println("Finish launch Web Preview");
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
			tspImageMapImagesPath + File.separator
				+ "OrthogonalLayoutImageMap.png";
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
			tspImageMapImagesPath + File.separator
				+ "OrthogonalLayoutCanvas.png";
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


	public Match isPresentElement(String patternStringPath)
	{
		TSAutomationUtils.pauseScript();
		System.out.println("Searching image for validation " + patternStringPath);
		// Waiting for screen

		return automationTesterCurrentScreen.exists(new Pattern(patternStringPath).similar(new Float(0.5)));

	}


	public Match isPresentElement(String patternStringPath, float similar)
	{
		TSAutomationUtils.pauseScript();
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
		String browser = TSAutomationUtils.getProperty("DefaultBrowser");
		System.out.println("Closing Web Preview");
		if (browser.contains("Explorer"))
		{
			
				App.close(browser);
				App.close(browser);
			
		}
		else if(browser.contains("Safari"))
		{
			App.close("Tom Sawyer Perspectives Previewer");
		}
		else
		{
			App.close(browser);
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
			automationTesterCurrentScreen.hover(new Pattern(patternStringPath).similar(new Float(0.85)));
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


	public void onMouseHoverImageMap(String patternStringPath)
	{

		try
		{
			automationTesterCurrentScreen.hover(new Pattern(patternStringPath).similar(new Float(0.85)));
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

			automationTesterCurrentScreen.type("f", Key.CTRL + Key.META);
		}

		else
			automationTesterCurrentScreen.type(Key.UP, Key.WIN);
		{
		}

	}


	public void fullScreenBrowser()
	{
		automationTesterCurrentScreen.type(Key.F11);
	}


	public void refreshBrowser()
	{

		automationTesterCurrentScreen.type(Key.F5);
		TSAutomationUtils.pauseScript(new Long(3500));
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
			tspDesktopPreviewImagesPath + File.separator + "SelectToolBarDesktop";
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
			tspImageMapImagesPath + File.separator + "HierarchicaLayoutImageMap.png";
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
		String circularLayout =
			tspHtml5PreviewImagePath + File.separator + "HierarchicalLayoutCanvas.png";
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
	
	public void runAlgorithm(String button)
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

	public void closeOverview(String overviewButton){ 
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
}
