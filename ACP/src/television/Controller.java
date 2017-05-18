package television;
import java.util.HashMap;

public class Controller {
	public static HashMap<String, YourShow> hashMapOfCommands = new HashMap<String, YourShow>();
	
	public void Controller(){
		
	}
	
	public static void handleShow(String command, String tv1, String tv2, String tv3, String tv4){
		
		hashMapOfCommands.put("Dr. Who", new DrWho());
		hashMapOfCommands.put("Sherlock", new Sherlock());
		hashMapOfCommands.put("Merlin", new Merlin());
		hashMapOfCommands.put("Star Trek", new StarTrek());
		
		YourShow handler = hashMapOfCommands.get(command);
		
		handler.execute(command);
		
	}

}
