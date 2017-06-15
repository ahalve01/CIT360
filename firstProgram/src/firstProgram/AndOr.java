package firstProgram;

public class AndOr {

	public static void main(String[] args) {
		int x, y;
		x = -10;
		y = -10;
		
		if(x > 0 && y > 0){
			System.out.println("Both are Positive, like you!");
		}else if(x > 0 || y > 0){
			System.out.println("One of them are positive, keep trying");
		}else{
			System.out.println("Both are negative");
		}
	}

}
