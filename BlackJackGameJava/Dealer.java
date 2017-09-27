/* Dealer Class done by ECCLESIASTES GAN
 * UNI:efg2123
 */
import java.util.ArrayList;

public class Dealer {
	//what my dealer consists of
	private int handSum;
	private ArrayList<Card>dealerHand;
	private boolean ace = false;
	public Dealer(){
		dealerHand = new ArrayList<Card>();
	}
	//method to show the player the dealers top card
	public void displayTopCard(){
		System.out.print("\n");
		System.out.println("The dealers top card is: ");
		if(dealerHand != null){
			System.out.println(dealerHand.get(0));
		}
	}
	//method that adds a card to the dealers hand
	//only invoked if dealer hand < 17
	//deals with the ace as well
	public void dealerAcceptCards(Card aCard){
		dealerHand.add(aCard);
		handSum += aCard.getValue();
		if(aCard.getValue()==11){
			ace = true;
		}
		if(ace && handSum >21){
			handSum -= 10;
			ace = false;
		}
	}
	/*These 2 classes allow you as a player to see why
	 * either you lost? or you won
	 * as sitting on the blackjack table and only being
	 * told you WON or LOSS doesn't seem appropriate
	 * so, these two methods are invoked upon
	 * a win or loss
	 */
	public int handTotal(){
		
		return handSum;
	}
	public void displayDealerHand(){
		System.out.println("Dealer hand was: ");
		if(dealerHand != null)
		{
			for(Card a : dealerHand)
				System.out.println(a+" ");
		}
	}
	//resets dealer for a new round
	public void resetDealerHand(){
		dealerHand.clear();
	}
	public int resetDealerTotal(){
		handSum = 0;
		return handSum;
	}
	public boolean resetAce(){
		ace = false;
		return ace;
	}
}
