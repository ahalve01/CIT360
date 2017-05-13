package testing;

public class JunitTesting {
	
	public int addition(int x){
		int y = 15;
		return x+y;
	}
	
	public int countA(String word){
		int count = 0;
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i)=='a' || word.charAt(i)=='A'){
				count++;
			}
		}
		return count;
	}
}
