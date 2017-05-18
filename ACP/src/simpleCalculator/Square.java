package simpleCalculator;

public class Square implements TheMath {
	public void execute(Integer n1, Integer n2){
		Integer sqr = n1 * n1;
		System.out.println(sqr);
	}

}
