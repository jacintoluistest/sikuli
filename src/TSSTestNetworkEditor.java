import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

public class TSSTestNetworkEditor
{
	static String TSProjectPath;

	static TSTester TSAutomationTester;


	@BeforeClass
	public static void setUp()
	{
		TSProjectPath=TSAutomationUtils.getProperty("NetworkEditorProjectPath");
		System.out.println("Project's path: " + TSProjectPath);
		TSAutomationTester = new TSTester();
		TSAutomationTester.LaunchTS();
		TSAutomationTester.openProyectWindows(TSProjectPath);
	}


	@Test
	public void testLaunchDesktopPreview()
	{
		
		TSAutomationTester.launchDesktopPreview();
		assertNotNull(TSAutomationTester.isPresentElement(
			"images/NetworkEditorAssertions/NetworkEditorMainCanvas.png"));
		TSAutomationTester.closeDekstopPreview();
		try
		{
			TSAutomationTester.automationTesterCurrentScreen.wait(
				new Pattern("images/TSPHomeToolBar.png").similar(new Float(0.7)));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}
	}


	@Test
	public void testLaunchWebPreview()
	{
		TSAutomationTester.launchWebPreview();
		System.out.println(TSAutomationTester.isPresentElement(
			"images//NetworkEditorAssertions//NetworkEditorWebPreviewMain.png"));
		assertNotNull(TSAutomationTester.isPresentElement(
			"images//NetworkEditorAssertions//NetworkEditorWebPreviewMain.png"));
		TSAutomationTester.closeWebPreview();
		try
		{
			TSAutomationTester.automationTesterCurrentScreen.wait(new Pattern(
				"images/TSPHomeToolBar.png").similar(new Float(0.7)));
		}
		catch (FindFailed ff)
		{
			System.out.println(ff.getMessage());
		}

	}


	/*
	 * @Test public void testLaunchHtml5Preview(){
	 * 
	 * }
	 */

	@AfterClass
	public static void CloseAll()
	{
		System.out.println("Closing everything...");
		System.out.println("Thank you");
		TSAutomationTester.closeTSP();
	}

}
