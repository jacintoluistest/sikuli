import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

//import junit.framework.TestCase;


public class TSSTestNetworkEditor {
	static TSTester a;
	
	@BeforeClass
	public static void openTS(){
		Properties prop = new Properties();
		InputStream input = null;
		String projectPath;
		

		try{
			input = new FileInputStream("config.properties");
			// load a properties file
			prop.load(input);
			projectPath =prop.getProperty("NetworkEditorProjectPath");
			System.out.println("Path a probar "+projectPath);
		}
			catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
		a = new TSTester();
		a.LaunchTS();
		a.openProyectWindows("");
	}
	
	@AfterClass
	public static void closeTS(){
		a.closeTSP();
	}
	
	
	@Test
	public void testProyectOpened(){
		System.out.println("Prueba");
	}
	
	
	
	

}