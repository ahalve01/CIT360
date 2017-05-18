package collections;
import java.util.*;

public class Linked{
	public static void main (String[] args){
		
		String[] players = {"Griffey", "Ichiro", "Buhner", "Davis", "Wilson"};
	    List<String> list1 = new LinkedList<String>();
		for(String x : players)
			list1.add(x);
		
		String[] players2 = {"Wilson", "Alexander", "Hasselbeck", "Warner", "Largent"};
		List<String> list2 = (List<String>) new LinkedList();
		for (String y : players2)
			list2.add(y);
		
		list1.addAll(list2);
		list2 = null;
		
		System.out.println(list1);
}
}