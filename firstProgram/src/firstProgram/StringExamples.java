package firstProgram;

public class StringExamples {
	
	public static void main(String[] args) {
		
		String person = "Merlin";
		
		System.out.println("Hello " + person);
		System.out.println(person.toUpperCase());
		// Print from different charactures 
		System.out.println(person.substring(2,4));
		
		/*Take a string that has a number and make it into
		an integer with wrapper classes*/
		String age = "37";
		String posistion = "8";
		String average = "319.23";
		
		int a = Integer.parseInt(age);
		System.out.println(a*3);
		int b = Integer.parseInt(posistion);
		System.out.println(b-1);
		double c = Double.parseDouble(average);
		System.out.println(c/2);
		
		
	}

}
