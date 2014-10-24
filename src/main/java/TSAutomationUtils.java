
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class TSAutomationUtils
{

	public static int getCurrentScreenId(Pattern pattern) throws Exception
	{
		int result = 0;

		for (int i = 0; i <= 1; i++)
		{
			System.out.println("Try number " + i);
			if (new Screen(i).exists(pattern) != null)
			{
				System.out.println("Searching on Screen: " + i);
				result = i;
				System.out.println("Screen founded =" + result);

			}
			else
			{
				continue;
			}

		}
		return result;
	}


	public static int getCurrentScreenIdImageMap(Pattern patternScreenZero,
		Pattern patternScreenOne) throws Exception
	{
		int id;
		if (new Screen(0).exists(patternScreenZero) != null)
		{
			id = 0;
			System.out.println("Screen founded: " + id);
			return id;
		}
		else if (new Screen(1).exists(patternScreenOne) != null)
		{
			id = 1;
			System.out.println("Screen founded: " + id);

			return id;
		}
		else
		{
			System.out.println("Error finding screen");
			return 3;
		}

	}


	public static String getProperty(String property)
	{
		Properties propertiesFile = new Properties();
		InputStream propertiesFileInputStream = null;

		try
		{
			propertiesFileInputStream = new FileInputStream("config.properties");
			propertiesFile.load(propertiesFileInputStream);
			return propertiesFile.getProperty(property);
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
		return null;

	}


	public static void pauseScript(Long miliseconds)
	{
		try
		{
			Thread.sleep(miliseconds);
			System.out.println("Script paused for: " + miliseconds);
		}
		catch (InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}
	}


	public static void pauseScript()
	{
		try
		{
			Thread.sleep(Long.valueOf(getProperty("pauseScriptTimeSeconds")));
			System.out.println("Script paused for: "
				+ getProperty("pauseScriptTimeSeconds"));
		}
		catch (InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}

	}


	public static void getScreenShot(TSTester tester, String currentMethod, String evidencePath)
	{
		File defautlFile = null;
		File destinationFile = null;
			defautlFile =
				new File(tester.automationTesterCurrentScreen.capture(tester.automationTesterCurrentScreen.getBounds())
					.getFile());
			destinationFile =
				new File(evidencePath
					+ TestSikuli.class.getName() + currentMethod + ".png");
			defautlFile.renameTo(destinationFile);
			System.out.println("Saving Evidence in: " + destinationFile);

		
		
	}
	
	public static String getOs(){
		return System.getProperty("os.name").toLowerCase();
	}
	
	public static String formatPath(String path){
		String pathParsed;
		pathParsed=path.replace('/', File.separatorChar);
		return pathParsed;
	}
	
	
	

}