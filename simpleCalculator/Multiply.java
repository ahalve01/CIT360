package simpleCalculator;

public class Multiply implements TheMath {
	
	public void execute(Integer n1, Integer n2){
		Integer times = n1 * n2;
		System.out.println(times);
	}

}