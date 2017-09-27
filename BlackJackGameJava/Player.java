/* Player Class done by ECCLESIASTES GAN
 * UNI: efg2123 
 */
import java.util.ArrayList;

public class Player {
	//what my player has
	private ArrayList<Card> hand;
	private int handSum;
	private double balance;
	private boolean ace = false;
	//constructor
	public Player(){
		hand = new ArrayList<Card>();
	}
	//method that adds a card to his hand
	//and settles the ace issue
	public void acceptCards(Card aCard){
		hand.add(aCard);
		handSum += aCard.getValue();
		if(aCard.getValue()==11){
			ace = true;
		}
		if(ace && handSum >21){
			handSum -= 10;
			ace = false;
		}
	}
	//method that shows the hand on the console
	public void displayHand(){
		System.out.print("\n");
		System.out.println("Your hand is: ");
			if(hand != null)
			{
				for(Card a : hand)
					System.out.println(a+" ");
			}
	}
	//allows me to print the hand total out
	public int handTotal(){
		return handSum;
	}
	/* 3 balance classes to account for balance itself
	 * and what happens upon a win, and a loss
	 */
	public double playerBalance(double buyIn){
		balance += buyIn;
		return balance;
	}
	public double minusBalance(double bet){
		balance -= bet;
		return balance;
	}
	public double balance(){
		return balance;
	}
	/* 3 reset classes that allows me to reset everything about the player
	 * upon every new round of blackjack
	 */
	public void resetPlayerHand(){
		hand.clear();
	}
	public int resetPlayerTotal(){
		handSum = 0;
		return handSum;
	}
	public boolean resetAce(){
		ace = false;
		return ace;
	}
}
