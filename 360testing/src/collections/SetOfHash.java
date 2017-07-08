package collections;
import java.util.*;

public class SetOfHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> states = new HashSet<String>();
				
		//add states
		states.add("Washington");
		states.add("Oregon");
		states.add("Pennsylvania");
		states.add("New York");
		states.add("Maryland");
		states.add("Ohio");
		states.add("New York");
				
		System.out.println("Now lets add some states: ");
		System.out.println(states);
		
		//copy the list
		System.out.println("Time to copy the list: ");
		HashSet<String> clone = new HashSet<String>();
		clone=(HashSet)states.clone();
		System.out.println(clone); 
		
		//remove state
		System.out.println("Lets remove the state we dislike the most... ");
		states.remove("Oregon");
		System.out.println("New list: \n" + states);
		}

}
