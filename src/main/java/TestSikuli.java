import org.sikuli.script.App;
import org.sikuli.script.Env;
import org.sikuli.script.Screen;
import org.sikuli.script.Sikulix;
import java.io.File;
import java.io.IOException;
import org.sikuli.script.Key;


/**
 * @author ljacinto
 *
 */
public class TestSikuli {
	public static void main(String args[]){
		
		App.close("Tom Sawyer Perspectives Designer");
		TSAutomationUtils.pauseScript(new Long (6000));
		App.open("/Users/ljacinto/Tom Sawyer Perspectives/6.3/Java/bin/Tom Sawyer Perspectives Designer.app");
		Sikulix.popup("Terminé");
//		TSTester tester = new TSTester();
//		tester.launchWebPreview();
//		System.out.println("My Screen id is :" +tester.automationTesterCurrentScreen.getID());
	
	}
		
		
		
		
		
		
	
}