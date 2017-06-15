package firstProgram;

public class Arrays {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50};
		String[] jobs ={"Fred Meyers", "Sprint", "Dollar Tree", "USPS"};
		System.out.println(a[3] + " With " + jobs[2]);
		System.out.println("-----------");

		for(int number : a){
			System.out.println(number);
		}
		
		// enhanced for statements are these
		System.out.println("-----------");
		for(String work : jobs){
			System.out.println(work);
		}
	}
}