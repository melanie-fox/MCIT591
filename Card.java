
/**
 * this class builds a Card object
 * these are basically blank cards that have no rant, suit, or points
 * all of those are added by the Deck class
 * @author melaniefox
 *
 */


/** this is a new comment, just to practice comitting changes on git. Change 1*/

//and here is the other change 2.

public class Card {
	
	//instance variables
	private String rank;
	private String suit;
	private int points;
	
	/**
	 * Constructor to build a card
	 * takes the rank, suit and points for each card
	 * @param rnk
	 * @param st
	 * @param pts
	 */
	Card(String rnk, String st, int pts){
		this.rank=rnk;
		this.suit=st;
		this.points = pts;
	}

	
	

	/**
	 * getters. no setters!
	 * @return
	 */
	public String getRank() {
		return rank;
	}


	public String getSuit() {
		return suit;
	}


	public int getPoints() {
		return points;
	}

	
	
}
