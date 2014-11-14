import org.sikuli.script.App;
import org.sikuli.script.Screen;







/**
 * @author ljacinto
 *
 */
public class TestSikuli {
	public static void main(String args[]){
		org.sikuli.basics.Debug.setDebugLevel(3);
		TSTester a = new TSTester(TSAutomationUtils.getProperty("DefaultBrowser"));
		a.automationTesterCurrentScreen.setRect(new Screen(0));
		a.SymmetricLayoutHtml5();
		
		
	
	}
}
		