import org.sikuli.api.robot.Key;
import org.sikuli.script.Screen;




/**
 * @author ljacinto
 *
 */
public class TestSikuli {
	public static void main(String args[]){
		Screen a = new Screen(0);
		System.out.println(Screen.getBounds(0));
		System.out.println(Screen.getBounds(1));
		System.out.println(a.getBounds());
//		TSTester tester = new TSTester();
//		tester.launchWebPreview();
		
	
	}
}
		