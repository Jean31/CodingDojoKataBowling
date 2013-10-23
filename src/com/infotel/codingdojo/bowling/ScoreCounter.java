package com.infotel.codingdojo.bowling;
import java.util.Iterator;
import java.util.List;

public class ScoreCounter {

	public ScoreCounter() {

	}

	public Integer getScore(final List<String> game) 
	{
		Integer result = new Integer(0);

		Iterator<String> iter = game.iterator();  
		while (iter.hasNext())					     
		{
			String currentRoll = iter.next();
			Integer roll1 = Integer.parseInt(currentRoll);
			
			if (isStrike(roll1)) {
				Integer roll3 = Integer.parseInt(game.get(game.indexOf(currentRoll)+1));
				Integer roll4 = Integer.parseInt(game.get(game.indexOf(currentRoll)+2));
				result += roll1+roll3+roll4;
			} else {
				String currentRoll2 = iter.next();
				Integer roll2 = Integer.parseInt(currentRoll2);
				
				if (isSpare(roll1, roll2)) 
				{
					Integer roll3 = Integer.parseInt(game.get(game.indexOf(currentRoll2)+1));
					result += roll1 + roll2 + roll3;
					
				} else {
					result += roll1 + roll2;
				}
			} 
				
		}
		return result;
	}

	private boolean isSpare(Integer roll1, Integer roll2) {
		return (roll1 + roll2) == 10;
	}
	
	private boolean isStrike(Integer roll) {
		return roll == 10;
	}
}
