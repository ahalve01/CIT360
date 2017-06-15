package simpleCalculator;
import java.util.HashMap;


public class controller {
	public static HashMap<String,TheMath> hashMapOfCommands = new HashMap<String, TheMath>();
	
	public void controller(){
		
	}
	
	public static void handleMath(String command, Integer n1, Integer n2){
		
		hashMapOfCommands.put("+", new Addition());
		hashMapOfCommands.put("-", new Subtract());
		hashMapOfCommands.put("/", new Divide());
		hashMapOfCommands.put("*", new Multiply());
		hashMapOfCommands.put("^", new Square());
		
		TheMath handler = hashMapOfCommands.get(command);
		
		handler.execute(n1, n2);
	}
}


