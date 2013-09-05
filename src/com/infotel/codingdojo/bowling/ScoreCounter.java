package com.infotel.codingdojo.bowling;
import java.util.Iterator;
import java.util.List;

public class ScoreCounter {

	public ScoreCounter() {

	}

	public Integer getScore(final List<String> partie) 
	{
		Integer result = new Integer(0);

		Iterator<String> iter = partie.iterator();  //___\ Changer la boucle de controle pour eviter les index plus bas ...
		while (iter.hasNext())						//   /
		{
			Integer trie1 = Integer.parseInt(iter.next());

			Integer trie2 = Integer.parseInt(iter.next());

			if (trie1 + trie2 == 10) // -> extract method
			{
				// Beurk
				Integer trie3 = Integer.parseInt(partie.get(partie.indexOf(trie2)+1)); // Index intermediaire
				result = trie1 + trie2 + trie3;
			} else {
				result += trie1 + trie2;
			}
		}
		return result;
	}
}
