package playground;

import java.util.Random;

public class Dice {
	private int value;
	private Random random;
	static private int MAX_VALUE;

	public Dice(int maxValue) {
		value =0;
		MAX_VALUE =maxValue;
		random =new Random();
	}
	
	public int getRandomValue() {
		this.value =random.nextInt(MAX_VALUE) +1;
		return value;
	}
	
	public void setValue(int value) {
		this.value =value;
	}
	
	public int getValue() {
		return value;
	}
	

}
