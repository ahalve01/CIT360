package simpleCalculator;

public class Addition implements TheMath {
	
	public void execute(Integer n1, Integer n2){
		Integer sum = n1 + n2;
		System.out.println(sum);
	}

}
