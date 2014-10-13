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


	public TSTester()
	{
		setAutomationOsEnvironment();
		System.out.println("Wait Time Out for sleep is " + openTSPerspectivesTimeOut);
		automationTesterCurrentScreen = new Screen();
		automationTesterCurrentScreen.setAutoWaitTimeout(40);
		LaunchTS();

	}


	public void setAutomationOsEnvironment()
	{
		// This method sets the environment for test execution

		String operativeSystem = TSAutomationUtils.getOs();
		if (operativeSystem.equals("mac os x"))
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
		tomSawyerApplication = new App(tomSawyerDesignerApplicationPath);
		tomSawyerApplication.open();
		System.out.println("Pause on LaunchTS");
		TSAutomationUtils.pauseScript();
	}


	public void openProyectWindows(String proyectPath)
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
		// System.out.println("Pause on openProyect");
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
				+ File.separator + "DesktopPreview.png").similar(new Float(0.9)),
				10000);

		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}


	public void openProjectMac(String proyectPath)
	{
		System.out.println("*******Opening Project ******");
		// Waiting for screen

		try
		{
			System.out.println("Getting current Screen");
			System.out.println("Trying to get :" + tsperspectivesToolBarImagesPath
				+ File.separator + "openFileIcon.png");
			automationTesterCurrentScreen =
				new Screen(TSAutomationUtils.getCurrentScreenId(new Pattern(this.tsperspectivesToolBarImagesPath
					+ "/openFileIcon.png").similar(new Float(0.9))));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Pantalla actual= " + automationTesterCurrentScreen.getID());
		try
		{
			automationTesterCurrentScreen.click(new Pattern(this.tsperspectivesToolBarImagesPath
				+ File.separator + "openFileIcon.png").similar(new Float(0.9)));
			App.focus("Tom Sawyer Perspectives Designer");
			automationTesterCurrentScreen.type("g", Key.CMD + Key.SHIFT);
			System.out.println("wait");
			// automationTesterCurrentScreen.wait(tspDesktopPreviewImagesPath
			// +File.separator+"openFileGoButton.png");
			automationTesterCurrentScreen.paste(proyectPath);
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "openFileGoButton.png").similar(new Float(0.8)));
			System.out.println("click");
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "openButton.png").similar(new Float(0.9)));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
	}


	public void launchDesktopPreview()
	{
		// Setting the screen
		System.out.println(tsperspectivesToolBarImagesPath + "/launchDesktopPreview.png");
		try
		{
			automationTesterCurrentScreen =
				new Screen(TSAutomationUtils.getCurrentScreenId(new Pattern(tsperspectivesToolBarImagesPath
					+ "/launchDesktopPreview.png").similar(new Float(0.7))));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ "/launchDesktopPreview.png").similar(new Float(0.5)));

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
				+ File.separator + "WebPreview.png").similar(new Float(0.5)));
		}

		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
		System.out.println("Pause on launchWebPreview");
		TSAutomationUtils.pauseScript(new Long(15000));
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

	}


	public void launchHtml5Preview()
	{
		TSAutomationUtils.pauseScript();
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "html5.png").similar(new Float(0.5)));
			automationTesterCurrentScreen.wait(new Pattern(tsperspectivesToolBarImagesPath
				+ File.separator + "TSWebLogoText.png").similar(new Float(0.5)),
				20000);
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
		TSAutomationUtils.pauseScript(timeout);
		System.out.println("Searching image for validation" + patternStringPath);
		// Waiting for screen

		return automationTesterCurrentScreen.exists(new Pattern(patternStringPath).similar(similar));

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
		// try
		// {
		// automationTesterCurrentScreen.click(new
		// Pattern("images//CloseDesktopPreview.png").similar(new Float(0.8)));
		// }
		// catch (FindFailed ff)
		// {
		// System.out.println(ff.getMessage());
		// }
		TSAutomationUtils.pauseScript(new Long(5000));
	}


	public void closeWebPreview()
	{
		System.out.println("Closing Web Preview");

		App.close("chrome");
	}


	public void openOverviewDesktop()
	{
		System.out.println("Opening Overview");
		System.out.println(tspDesktopPreviewImagesPath + File.separator
			+ "OverviewToolBarDesktop.png");
		try
		{
			automationTesterCurrentScreen.click(new Pattern(tspDesktopPreviewImagesPath
				+ "//OverviewToolBarDesktop.png").similar(new Float(0.8)));
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


	public void onMouseHoverImageMap(String patternStringPath)
	{
		String browserApp = TSAutomationUtils.getProperty("DefaultBrowserName");
		App.focus(browserApp);
		try
		{
			automationTesterCurrentScreen.hover(new Pattern(patternStringPath).similar(new Float(0.7)));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
	}

}
