package television;
import java.util.Scanner;

public class Application {
	public static void main(String[] args){
		Controller deligates = new Controller();
		String tv1 = " Dr Who";
		String tv2 = " Sherlock";
		String tv3 = " Merlin";
		String tv4 = " StarTrek";
		String command;
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a show(Dr. Who, Sherlock, Merlin, StarTrek): ");
		command = in.nextLine();
		
		System.out.println("You selected " + command);
		deligates.handleShow(command, tv1, tv2, tv3, tv4);
		
		
		
		
	}

}
