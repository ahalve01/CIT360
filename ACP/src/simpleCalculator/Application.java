package simpleCalculator;
import java.util.Scanner;

public class Application {
	public static void main(String[] args){
		controller deligates = new controller();
		String add = "add";
		String times = "times";
		String sub = "sub";
		String divide = "divide";
		String square = "square";
		Integer n1 = -5;
		Integer n2 = 5;
		String command;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		n1 = Integer.parseInt(in.nextLine());
		System.out.println("Enter a command(+,-,*,/,^): ");
		command = in.nextLine();
		System.out.println("Enter another number: ");
		n2 = Integer.parseInt(in.nextLine());
		
		System.out.println(n1+ " " + command +n2 +" = ");
		deligates.handleMath(command,n1,n2);
	}

}
