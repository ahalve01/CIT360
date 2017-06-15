package firstProgram;

public class SwitchCase {

	public static void main(String[] args) {

		String a = "Jerry";
		
		switch(a){
		case "June":
			System.out.println("I work with them");
			break;
		case "Jarod":
			System.out.println("He's a friend of mine");
			break;
		case "Jerry":
			System.out.println("Stole my lunch money");
			break;
		case "Jimmy":
			System.out.println("Is an alright cat");
			break;
		default:
			System.out.println("I don't know you");
			break;
		}

	}

}
