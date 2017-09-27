/* CARD CLASS DONE BY ECCLESIASTES GAN
 * UNI: efg2123
 */

public class Card {
	//What makes a card
	private String suit;
	private int value;
	private int worth;
	//constructor
	public Card(int ranks, String suits, int k){
		 this.value = ranks;
		 this.suit = suits;
		 this.worth = k;
				 
	}
	//method to display a cards accordingly to the player
	public String toString(){
	String myCard;
		if(value==1)
			myCard = "Ace of ";
		else if(value == 11)
			myCard = "Jack of ";
		else if(value == 12)
			myCard = "Queen of ";
		else if(value == 13)
			myCard = "King of ";
		else
			myCard = value + " of ";
		//returns the value of the card
		myCard += suit;
		return myCard;
	}
	//allows me to retrieve the value of a card
	public int getValue(){
		return worth;
	}
}
