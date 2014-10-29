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

	String tspWebPreviewImagesPath;

	String TS_HOME;

	Screen automationTesterCurrentScreen;

	long openTSPerspectivesTimeOut;

	String tomSawyerDesignerApplicationPath;

	App tomSawyerApplication;

	public String operativeSystem;


	public TSTester()
	{
		setAutomationOsEnvironment();
		System.out.println("Wait Time Out for sleep is " + openTSPerspectivesTimeOut);
		automationTesterCurrentScreen = new Screen();

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
			tspWebPreviewImagesPath =
				"images" + File.separator + "Mac" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonImageMapPreview"
					+ File.separator + "ToolBar";
		}
		else
		{
			TS_HOME = TSAutomationUtils.getProperty("TS_HOME");
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
			tspWebPreviewImagesPath =
				"images" + File.separator + "Windows" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "CommonImageMapPreview"
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
		TSAutomationUtils.pauseScript();
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
					+ File.separator + "openFileIcon.png").similar(new Float(0.9))));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Pantalla actual= " + automationTesterCurrentScreen.getID());
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
		System.out.println("Getting again screen");

		try
		{
			System.out.println("Trying get screen again");
			automationTesterCurrentScreen =
				new Screen(TSAutomationUtils.getCurrentScreenId(new Pattern(tspWebPreviewImagesPath
					+ File.separator + "WebCommonToolBar.png").similar(new Float(0.8))));
			System.out.println("*********Screen Settings");
			System.out.println(automationTesterCurrentScreen.getBounds());
			System.out.println(automationTesterCurrentScreen.getID());
			
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
				new Screen(TSAutomationUtils.getCurrentScreenId(new Pattern(tspWebPreviewImagesPath
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


	public void orthogonalLayout()
	{

		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "orthogonalLayout.png").similar(new Float(0.7)));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

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
		if(imageFile.exists()){
		
		return automationTesterCurrentScreen.exists(new Pattern(patternStringPath).similar(similar));
		}
		else{
			System.out.println("Could not load file :" + patternStringPath);
			return null;
		}
		
	}


	public void isPresentElementImageMap(String patternStringPath)
	{

	}


	public void openOverviewImageMap()
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
		System.out.println("Closing Web Preview");
		if (operativeSystem.contains("windows"))
		{
			App.close(TSAutomationUtils.getProperty("DefaultBrowserNameWindows"));
		}
		else
		{
			App.close(TSAutomationUtils.getProperty("DefaultBrowserNameMac"));
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
				+ "//OverviewToolBarDesktop.png").similar(new Float(0.)));
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
			automationTesterCurrentScreen.hover(new Pattern(patternStringPath).similar(new Float(0.7)));
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
			automationTesterCurrentScreen.hover(new Pattern(patternStringPath).similar(new Float(0.8)));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
	}


	public void closeOnMacRedCross()
	{
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "closeRedCircle.png").similar(new Float(0.8)));
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
			String maximizeImage =
				"images" + File.separator + "Mac" + File.separator
					+ "TomSawyerPerspectives" + File.separator + "TSPerspectivesToolBar"
					+ File.separator + "maximize.png";

			Pattern maximizeElement = new Pattern(maximizeImage).similar(new Float(0.95));
			if (automationTesterCurrentScreen.exists(maximizeElement) != null)
				try
				{
					automationTesterCurrentScreen.click(maximizeElement);

				}
				catch (FindFailed ff)
				{
					System.out.println(ff.getMessage());
				}
		}

		else
			automationTesterCurrentScreen.type(Key.UP,Key.WIN );
		{
		}

	}


	public void refreshChrome()
	{	
		
		String refreshButtonPath = null;
		String refreshButtonFile=null;
		
		
		if(TSAutomationUtils.getOs().contains("mac"))
		{
		String browser = TSAutomationUtils.getProperty("DefaultBrowserNameMac");
		if(browser.contains("chrome")){
			refreshButtonFile = "refreshChrome.png";
		}
		else {
			refreshButtonFile = "refreshSafari.png";
		}
		
		
		
		
		
		refreshButtonPath =
			"images" + File.separator + "Mac" + File.separator + "TomSawyerPerspectives"
				+ File.separator + "TSPerspectivesToolBar" + File.separator
				+ refreshButtonFile;
		}
		else{
			refreshButtonPath =
				"images" + File.separator + "Windows" + File.separator + "TomSawyerPerspectives"
					+ File.separator + "TSPerspectivesToolBar" + File.separator
					+ refreshButtonFile;
		}
		
		try
		{
			automationTesterCurrentScreen.click(refreshButtonPath);
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		TSAutomationUtils.pauseScript(new Long(1500));
	}


	public void closeAll()
	{
		if (TSAutomationUtils.getOs() == "mac os x")
		{

			closeTSP();
			System.out.println("Closing everything...");
			System.out.println("Thank you");
			TSAutomationUtils.pauseScript(new Long(5000));

		}
		else
		{
			closeDekstopPreview();
			System.out.println("Closing everything...");
			System.out.println("Thank you");
			closeTSP();

		}
	}
	
	public void openProject(String proyectPath){
		if(TSAutomationUtils.getOs().contains("mac")){
			openProjectMac(TSAutomationUtils.getProperty(proyectPath+"_Mac"));
		}
		else{
			openProjectWindows(TSAutomationUtils.getProperty(proyectPath+"_Win"));
		}
	}
	
	public void zoomFit(){
		String zoomFit=tspDesktopPreviewImagesPath + File.separator +"SelectToolBarDesktop";
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

}
