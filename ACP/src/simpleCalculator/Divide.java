package simpleCalculator;

public class Divide implements TheMath {
	
	public void execute(Integer n1, Integer n2){
		Integer divide = n1/n2;
		System.out.println(divide);
	}

}
