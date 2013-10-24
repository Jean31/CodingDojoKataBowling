package com.infotel.codingdojo.bowling;
import java.util.Iterator;
import java.util.List;

public class ScoreCounter {

	public ScoreCounter() {

	}

	public Integer getScore(final List<String> game) 
	{
		Integer score = new Integer(0);

		Iterator<String> iter = game.iterator();  
		while (iter.hasNext())					     
		{
			String firstRoll = iter.next();
			Integer firstValueRoll = Integer.parseInt(firstRoll);
			
			if (isStrike(firstValueRoll)) {
				Integer firstNextValueRoll = Integer.parseInt(game.get(game.indexOf(firstRoll)+1));
				Integer secondNexValuetRoll = Integer.parseInt(game.get(game.indexOf(firstRoll)+2));
				score += firstValueRoll + firstNextValueRoll + secondNexValuetRoll;
			} else {
				String secondRoll = iter.next();
				Integer secondValueRoll = Integer.parseInt(secondRoll);
				
				if (isSpare(firstValueRoll, secondValueRoll)) 
				{
					Integer nextValueRoll = Integer.parseInt(game.get(game.indexOf(secondRoll)+1));
					score += firstValueRoll + secondValueRoll + nextValueRoll;
					
				} else {
					score += firstValueRoll + secondValueRoll;
				}
			} 
				
		}
		return score;
	}

	private boolean isSpare(Integer firstRoll, Integer secondRoll) {
		return (firstRoll + secondRoll) == 10;
	}
	
	private boolean isStrike(Integer roll) {
		return roll == 10;
	}
}
