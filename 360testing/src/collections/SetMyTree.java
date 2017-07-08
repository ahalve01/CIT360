package collections;
import java.util.*;

public class SetMyTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> weapon = new TreeSet<String>();
		String weapons = "Sword Bow Longbow Mace Dagger Long-Sword Fists";
		// add another weapon
		weapon.add("Halberd");
		weapon.add("Flail");
		weapon.add("Battle Axe");
		weapon.add("Caltops");
		
		String[] weaponsList = weapons.split(" ");
		
		System.out.println(weapons);
		
		// insert names into list in order
		weapon.addAll (Arrays.asList(weaponsList));
		
		//remove an entry
		System.out.println("Your Mace was destroyed!  But you did find new weapons! ");
		weapon.remove("Mace");
		
		//reprint list
		Iterator<String> newList = weapon.iterator();
		System.out.println("New List of items: ");
		while(newList.hasNext()){
			String named = newList.next();
			System.out.println(named + " ");
		}
		
		}
	}

