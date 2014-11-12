import org.sikuli.script.App;
import org.sikuli.script.Screen;
import org.sikuli.script.Sikulix;






/**
 * @author ljacinto
 *
 */
public class TestSikuli {
	public static void main(String args[]){
		org.sikuli.basics.Debug.setDebugLevel(3);
		System.out.println(Screen.getBounds(0));
		System.out.println(Screen.getBounds(1));
		App.close("Tom Sawyer Perspectives Designer");
		
	
	}
}
		