package collections;
import java.util.*;

public class SetOfHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] states = {"New York", "Vermont", "Maine", "Florida", "New York"};
		List<String> list = Arrays.asList(states);
		
		Set<String> hash = new HashSet<String>(list);
		System.out.printf("%s ", hash);
		}

}
