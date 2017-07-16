package testing;

public class JunitTesting {
	
	public int addition(int x){
		int y = 15;
		return x+y;
	}
	
	public int countA(String word){
		int count = 0;
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i)=='b' || word.charAt(i)=='B'){
				count++;
			}
		}
		return count;
	}
	public boolean equals(String word){
	boolean right;
	right = (55 > 65);
	System.out.println("Answer is " + right);
	return right;
	}

	public String youRock(String string) {
		// TODO Auto-generated method stub
	
		return null; 
		
	}
	public String[] arrayTest(){
		String[] arrayResults = {"Bobby", "Brawn","Bibby", "Billy"};
		
		//System.out.println(arrayResults[4]);
		return arrayResults;
	}
}
	
	
	

