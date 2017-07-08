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
		
		//remove a player from the new list
		System.out.println("Lets remove two players: ");
		list1.remove("Alexander");
		list1.remove("Davis");
		System.out.println("New List: \n" + list1);
		
		//add new player
		list1.add("Sherman");
		System.out.println("Here's a new player! \n" + list1);
		
}
}