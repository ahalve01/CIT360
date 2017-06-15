package collections;
import java.util.*;

public class SetMyTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String weapons = "Sword Bow Longbow Mace Dagger Long-Sword Fists";
		String[] weaponsList = weapons.split(" ");
		
		TreeSet<String> weapon = new TreeSet<>();
		weapon.addAll (Arrays.asList(weaponsList));
		
		for (String w : weapon){
			System.out.println(w);
		}
	}

}
