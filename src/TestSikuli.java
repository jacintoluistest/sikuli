import org.sikuli.script.App;
import org.sikuli.script.Env;
import org.sikuli.script.Screen;
import java.io.File;
import java.io.IOException;
import org.sikuli.basics.SikuliScript;
import org.sikuli.script.Key;


/**
 * @author ljacinto
 *
 */
public class TestSikuli {
	public static void main(String args[]){
		
//		String path ="images/Mac/TomSawyerPerspectives/TSPerspectivesToolBar/openFileIcon.png";
//		
//		for(int i =0; i< path.length();i++){
//			char a = path.charAt(i);
//			if(a=='/'){
//				a= Key.C_NUM9;
//				
//			}
//			System.out.print(a);
//		}
		
		TSTester tstester = new TSTester();
		
		
		//System.out.println(TSAutomationUtils.formatPath(TSAutomationUtils.getProperty("NetworkEditorProjectPath")));
		tstester.openProjectMac(TSAutomationUtils.getProperty("NetworkEditorProjectPath"));
		//tstester.closeTSP();
		
	
	}
		
		
		
		
		
		
	
}