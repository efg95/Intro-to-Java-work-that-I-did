/* DECK CLASS DONE BY ECCLESIASTES GAN
 * UNI: efg2123
 */

public class Deck {
	//What my deck is made out of
	private Card[] deck;
	private Card top;
	private int cardsDrawn;
	public Deck(){
		deck = new Card[52];//create an array with 52 spaces
	
		}
		//fill the deck with cards
		public void fillDeck(){
			String [] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
			 int [] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9,
		    10, 11, 12, 13};
			cardsDrawn = 0;
			int count = 0;
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 13; j++){
					int k = j+1;
					
					if(k==11||k==12||k==13)
						k=10;
					if(k==1)
						k=11;		
					deck[count] = new Card(ranks[j],suits[i], k);
				count++;
				}
			}
		}
		//shuffles the deck
		public void shuffleDeck(){
			int j;
			for(int i = 0; i < 10000; i++){
				int random = (int)(Math.random()*(52));
				j = (int)(Math.random()*(52));
				Card temp = deck[random];
				deck[random] = deck[j];
				deck[j] = temp;
			}
			cardsDrawn = 0;
		}
		//deal the top of the deck, if deck has 12 cards left 
		//shuffle and deal from top again
		public Card deal(){
			top = deck[0];
			for(int i = 0; i < 51; i++){
			deck[i] = deck[i+1];
			}
			cardsDrawn++;
			if(cardsDrawn == 40)
				shuffleDeck();
			deck[51] = top;
			return top;
		} 	
}
