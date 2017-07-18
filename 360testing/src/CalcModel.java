package mvc;

public class CalcModel {
	private int total;
	
	public void addNumbers(int numberOne, int numberTwo){
		total = numberOne + numberTwo;
	}
	public int getValue(){
		return total;
	}
}
