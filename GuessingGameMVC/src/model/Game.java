package model;

import java.util.Random;

public class Game {

	private int value;

	/**
	 * 
	 */
	public Game() {
		value =0;
	}

	/**
	 * @param value
	 */
	public Game(int value) {
		if (value < 0){
			this.value = 0;
		}else{
		this.value = value;
	}
		
}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		if (value < 0){
			this.value = 0;
		}
		this.value = value;
	}
public void setRandom(int minimum, int maximum){
	Random random = new Random();
	this.value = random.nextInt(maximum - minimum) + minimum;
}
public void increment(){
	this.value++;
}

}

