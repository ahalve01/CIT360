package threads;

public class counting {
	 public static void main(String args[]){
		 programThread C1 = new programThread(5);
		 C1.start();
		 
		 programThread C2 = new programThread(15);
		 C2.start();
	 }
	}