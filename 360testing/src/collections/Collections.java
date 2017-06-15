package collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Collections {
	// When you don't know how big of an array you need, use arraylist
		
		static Scanner reader = new Scanner(System.in);
		static ArrayList<Integer> array = new ArrayList<Integer>();
		
		public static void main(String[] args){
			System.out.println("Please enter your score, enter 9 when finished. ");
			
			int scores = reader.nextInt();
			while (scores != 9){
				array.add(scores);
				scores = reader.nextInt();
			}
			//After exiting with 9
			System.out.println("-------------");
			for (int n : array){
				System.out.println(n);
			}
		}
	}

