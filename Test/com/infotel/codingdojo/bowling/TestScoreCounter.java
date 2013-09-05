package com.infotel.codingdojo.bowling;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class TestScoreCounter {


	private ScoreCounter counter;

	@Before
	public void init()
	{
		counter = new ScoreCounter();
	}
	
	@Test
	public void testCountScoreNoob() {

		List <String> partie = new ArrayList<String>() {{
			add("0"); add("0");	add("0"); add("0");
			add("0"); add("0"); add("0"); add("0");
			add("0"); add("0");	add("0"); add("0");
			add("0"); add("0"); add("0"); add("0");
			add("0"); add("0");	add("0"); add("0");
		}};
		
		assertEquals(new Integer(0), counter.getScore(partie));
	}

	@Test		
	public void testCountScoreBeginer() {

//		Differentes fa�on d'initialiser une liste
//		List <String> partie2 = Arrays.asList( "1" , "1");
//		
//		List <String> partie3 = new ArrayList<String>();
//		Collections.addAll(partie3, "A", "B", "C", "D");
		
		List <String> partie = new ArrayList<String>() {{
			add("1"); add("1"); add("1"); add("1"); add("1");
			add("1"); add("1"); add("1"); add("1"); add("1");
			add("1"); add("1"); add("1"); add("1"); add("1");
			add("1"); add("1"); add("1"); add("1"); add("1");
		}};

		assertEquals(new Integer(20), counter.getScore(partie));
	}
	
	@Test 
	public void testCountScoreMedium()
	{
		List <String> partie = new ArrayList<String>(){{
			add("1"); add("9"); add("1"); add("1"); add("1");
			add("1"); add("1"); add("1"); add("1"); add("1");
			add("1"); add("1"); add("1"); add("1"); add("1");
			add("1"); add("1"); add("1"); add("1"); add("1");
		}};

		assertEquals(new Integer(29), counter.getScore(partie));
	}
}