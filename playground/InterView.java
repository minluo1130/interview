package playground;

import java.util.HashMap;
import java.util.Map;

public class InterView {
	
	public static void main(String[] args) {
		DiceGame diceGame = new DiceGame(5);
		int playTimes =10000;
		Map<Integer,Integer> playScores = new HashMap<>();
		
		int index=0;
		while(index<playTimes) {
			int score =diceGame.playGames();
			playScores.put(score,playScores.getOrDefault(score,0)+1);
			index++;
		}
		
		for(Map.Entry<Integer, Integer> score:playScores.entrySet()) {
			System.out.println(String.format("Total %d occurs %d times", score.getKey(),score.getValue()));
		}
		
	}

}
