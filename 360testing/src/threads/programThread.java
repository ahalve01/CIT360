package threads;

class programThread implements Runnable {
	private Thread mathPower;
	private int addingIt;
	
	programThread(int addingUp){
		addingIt = addingUp;
		System.out.println("Give me numbers! We need to " +addingIt+ ".");
	}
	public void execute(){
		System.out.println("Let the fun begin! ");
		try{
			for (int a = 5; a >0; a--){
				System.out.println("Calculate"+ addingIt + a + " = ");
				Thread.sleep(100);
			}
		}catch(InterruptedException e){
			System.out.println("Broken... must exerminate!");
		}
	}
	public void start(){
		System.out.println("Let's do this...");
		if (mathPower == null){
			mathPower = new Thread(this, "Begin");
			mathPower.start();
		}
	}
	
	}
public class testOut{
	public static void main(String args[]){
			getThisWorking x1 = new getThisWorking(5);
			x1.start();
			
			getThisWorking x2 = new getThisWorking(8);
			x2.start()
	}
}

