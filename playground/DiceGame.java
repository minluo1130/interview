package playground;


public class DiceGame {

	private Dice[] diceArray;
	
	public DiceGame(int diceNumber) {
		diceArray = new Dice[diceNumber];
	}
	
	public int playGames() {
		int totalScore=0;
		while(isAnyDiceLeft()) {
			totalScore +=throwDice();
		}
		
		return totalScore;
		
	}
	
	private boolean isAnyDiceLeft() {
		for(Dice dice: diceArray) {
			if(dice.getValue()!=-1) {
				return true;
			}
		}
		
		return false;
	}
	
	public int throwDice() {
		int lowest =Integer.MAX_VALUE;
		boolean foundThree =false;
		
		for(Dice dice:diceArray) {
		  if(dice.getValue()==-1) continue;
		  
		  int value=dice.getRandomValue();
		  if(value==3) {
			  dice.setValue(-1);
			  foundThree =true;
		  }
		  lowest =Math.min(lowest, value);
		}
		
		for(Dice dice:diceArray) {
			if(dice.getValue() ==lowest) {
				dice.setValue(-1);
			}
		}
		
		if(foundThree) return 0;
		
		return lowest;
		
	}

}
