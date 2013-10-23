package com.infotel.codingdojo.bowling;
import java.util.Iterator;
import java.util.List;

public class ScoreCounter {

	public ScoreCounter() {

	}

	public Integer getScore(final List<String> game) 
	{
		Integer result = new Integer(0);

		Iterator<String> iter = game.iterator();  //___ Changer la boucle de controle pour eviter les index plus bas ...
		while (iter.hasNext())					  //   
		{
			Integer roll1 = Integer.parseInt(iter.next());

			Integer roll2 = Integer.parseInt(iter.next());

			if (isSpare(roll1, roll2)) 
			{
				// Beurk
				Integer roll3 = Integer.parseInt(game.get(game.indexOf(roll2)+1)); // Index intermediaire
				result = roll1 + roll2 + roll3;
			} else {
				result += roll1 + roll2;
			}
		}
		return result;
	}

	private boolean isSpare(Integer roll1, Integer roll2) {
		return (roll1 + roll2) == 10;
	}
}
