package firstProgram;

public class TwoDimArray {

	public static void main(String[] args) {

		// Matrix array, rows and columns First number is row
		// second number is column
		int [][] Two = new int [5][5];
		
		// Two[1][1] = 10;
		int temp = 0;
		
		for(int x = 0; x < 5; x++){
			for(int y = 0; y < 5; y++ ){
				Two[x][y] = temp;
				temp += 20;
			}
		}
			//Numbers in for represent array space
		for(int x = 0; x < 5; x++){
			for(int y = 0; y < 5; y++ ){
				System.out.print(Two[x][y] +" ");
			}
			System.out.println();
		}
	}

}
