/* Game Class for BLACKJACK
 * Done by Ecclesiastes Gan
 * UNI: efg2123
 */
import java.util.Scanner;
//Game Class
public class Game {
	//my objects/instance variables
	private Deck deck;
	private static Player player;
	private static Dealer dealer;
	Scanner input = new Scanner(System.in);
	private double buyIn;
	private double bet;
	private boolean won = false;
	//constructor
	public Game(){
		//initializing objects
		deck = new Deck();
		player = new Player();
		dealer = new Dealer();
	}
	//main play method
	public void play(){
		System.out.print("\n");
		System.out.println("Welcome to Blackjack");
		System.out.println("The minimum buy-in is $100 ");
		System.out.println("How much would you like to buy-in for?");
		buyIn = input.nextInt();//get users money
		//check whether the buy-in is a valid amount
		while(buyIn<100){
			System.out.println("The Buy-in you entered is insufficient ");
			System.out.println("Please buy-in a minimum of 100: ");
			buyIn = input.nextInt();
		}
		//adds buy-in to players in-game balance
		player.playerBalance(buyIn);
		bet();//refer to bet method
		//fill the deck
		deck.fillDeck();
		//shuffle the deck
		deck.shuffleDeck();
		//give the cards
		player.acceptCards(deck.deal());
		dealer.dealerAcceptCards(deck.deal());
		player.acceptCards(deck.deal());
		dealer.dealerAcceptCards(deck.deal());
		player.displayHand();
		dealer.displayTopCard();
		
		//total player and dealer card count = 4
		//check for blackjack
		if(player.handTotal()==21){
			blackJacko();
		}
		else if(dealer.handTotal()==21){
			blackJacko();
		}
		//if there is no blackjack player gets the option to hit first
		else{
			playerTurn();//count = 3
			player.displayHand();
		}
		}
	/* This method of play allows me to skip the buy-in process
	 * if the user still has sufficient balance
	 */
	public void playAgain(){
		//shuffle the deck
		deck.shuffleDeck();
		bet();//refer to bet method
		//give the cards
		player.acceptCards(deck.deal());
		dealer.dealerAcceptCards(deck.deal());
		player.acceptCards(deck.deal());
		dealer.dealerAcceptCards(deck.deal());
		player.displayHand();
		dealer.displayTopCard();
		
		//total player and dealer card count = 4
		//check for blackjack
		if(player.handTotal()==21){
			blackJacko();
		}
		else if(dealer.handTotal()==21){
			blackJacko();
		}
		//if there is no blackjack player gets the option to hit first		
		else{
			playerTurn();//count = 3
			player.displayHand();
		}
		}
		//This method is the law for betting
		//bets are only done before the cards are dealed out
		public void bet(){
			System.out.print("\n");
			System.out.println("Please Bet without cents");
			System.out.println("The Minimum Bet is $10 ");
			System.out.println("The Maximum Bet is $1000 ");
			System.out.println("Your balance is currently: " 
			+ player.balance());
			bet = input.nextInt();//gathers the users bet
			//however, the bet must be more than $10 and less than $1000
			//and not more than the player's balance
			while(bet < 10 || bet > 1000 || bet>player.balance()){
				System.out.println("The bet entered is invalid," +
				"please enter it again ");
				bet = input.nextInt();
			}
			
		}
		//rather useless method called hitMe
		//helps me process what i need to do in creation
		private void hitMe(){
			player.acceptCards(deck.deal());
		}
		//after the cards are dealt, your turn begins
		//this is the method letting you choose what to do during your turn
		public void playerTurn(){
			boolean hit = true;
			while(hit == true){
			//if your hand Total is < 22 you have an option to draw
			//This method is valid for as long as your hand total <22
			if(player.handTotal()<22){
			System.out.print("\n");
			System.out.println("Your Total is now: " + player.handTotal());
			player.displayHand();
			System.out.println("Would you like to hit yourself " +
			"with another card? ");
			System.out.println("If yes, enter '1' , if no " +
			"and you choose to stay, enter '2' ");
			int choice = input.nextInt();
				if(choice == 1){
					hitMe();
				}
				//if you choose not to hitMe
				//it will become the dealers turn
				else if(choice == 2){
					dealerTurn();
					gameCompare();
				}
			}
			//however, if u bust after drawing your 3rd card
			//you get sent to BUSTEDSUCKER
			else if(player.handTotal()>21)
				bustedSucker();
			}
		}
		//dealers turn
		public void dealerTurn(){
			/* Straight forward laws
			 * as long as dealer has hand total <17, he draws
			 * if he has >17 he stays
			 * however, upon anytime after he is made to draw and
			 * his hand total >22 player wins
			 */
			while(dealer.handTotal() < 17){
				System.out.print("\n");
				System.out.println("Dealer has drawn a card ");
				dealer.dealerAcceptCards(deck.deal());
				if(dealer.handTotal()>21){
					System.out.print("\n");
					System.out.println("You Win!, Dealer has busted");
					won = true;
					if(won == true){
					bet = bet + (bet * 1);
					player.playerBalance(bet);
					System.out.print("\n");
					System.out.println("Dealer Total was: " + 
					dealer.handTotal());
					dealer.displayDealerHand();
					//method to give an option to leave or stay after a round
					choice();
					}
				}
				
			}
			if(dealer.handTotal()<22){
				System.out.print("\n");
				System.out.println("Dealer has chosen to stay ");
				System.out.print("\n");
				gameCompare();//method to decide who wins
			}
			
		}
		//method to check for blackjack after 4 cards are dealt
		public void blackJacko(){
			//player blackjack
			if(player.handTotal()==21 && 
				player.handTotal()>dealer.handTotal()){
				
				System.out.println("You got BLACKJACK; YOU WIN! ");
				won = true;
				if(won == true){
					bet = bet + (bet * 1.5);
					player.playerBalance(bet);
					choice();
					}
				}
			//push tie
			else if(player.handTotal() == 21 && 
					player.handTotal()==dealer.handTotal()){
				System.out.println("You got blackjack but so did the dealer");
				won = false;
				if(won == false)
					player.minusBalance(bet);
					choice();
			}
			//dealer blackjack
			else if(dealer.handTotal() == 21){
				System.out.println("Dealer got blackjack!");
				dealer.displayDealerHand();
				won = false;
				if(won == false){
					player.minusBalance(bet);
					choice();
				}
				
			}
			}
		//upon busting, this method is called
		public void bustedSucker(){
			System.out.println("I am so sorry, but you BUSTED");
			player.displayHand();//shows you your hand and total
			System.out.println("Your total was: " + player.handTotal());
			won = false;
			if(won == false){
				player.minusBalance(bet);
				choice();//upon losing or winning you are given a choice
			}
		}
		//method that decides who wins and how the bet is credited
		public void gameCompare(){
			won = false;
			//player victory
			if(player.handTotal()>dealer.handTotal() || dealer.handTotal()>21){
				won = true;
				if(won == true){
					bet = bet + (bet * 1);
					player.playerBalance(bet);
				}
				System.out.println(dealer.handTotal());
				dealer.displayDealerHand();
				System.out.print("\n");
				System.out.println("You have won this round");
				choice();
			}
			//dealer victory
			else if(player.handTotal()<dealer.handTotal()){
				won = false;
				if(won == false){
				player.minusBalance(bet);
				dealer.displayDealerHand();
				System.out.println("Dealer hand total: " + dealer.handTotal());
				System.out.print("\n");
				System.out.println("You have lost this round");
				choice();
				}
			}
			//incase of tie
			else if(dealer.handTotal() == player.handTotal()){
				won = false;
				dealer.displayDealerHand();
				System.out.println("Dealer hand total: " + dealer.handTotal());
				System.out.print("\n");
				System.out.println("Its a TIE!");
				System.out.println("You don't lose any money");
				choice();
			}
		}
		//method at the end of a round to decide whether you want
		//to stay or to leave the table
		public void choice(){
			System.out.print("\n");
			System.out.println("Your balance is now: " + player.balance());
			System.out.println("Would you like to play again? ");
			System.out.println("if yes, enter '1', if you wish to " +
					"stand-up, enter '2'");
			int playAgain = 1;
			int standUp = 2;
			int game = input.nextInt();
			while(game < 1 || game > 2){
				System.out.println("Invalid input,"+ 
				"please re-enter your choice");
				game = input.nextInt();
			}
			if(game == playAgain){
				//resets all hands to begin a new round afresh
				player.resetPlayerHand();
				player.resetPlayerTotal();
				dealer.resetDealerHand();
				dealer.resetDealerTotal();
				player.resetAce();
				dealer.resetAce();
				//but before beginning checks for adequate player funds
				//player must have enough funds to atleast bet $10
					if(player.balance() > 9){
						playAgain();
					}
					else{
						notEnoughCash();
					}
			}
			else if(game == standUp){
				System.out.println("You have chosen to stand-up goodbye" +
			" and good riddance ");
				System.exit(0);
			}	
		}
	//invoked if the player has used up all his cash and still wants to play	
	public void notEnoughCash(){
		System.out.print("\n");
		System.out.println("I am sorry but it seems like you " + 
				"do not have sufficient cash to play again");	
		System.out.println("Consider taking a loan" + 
		"and buying in again or leave");
		System.out.println("If you choose to buy-in again enter '1', " +
		"if you wish to leave enter '2'");
		int buyInAgain = 1;
		int leave = 2;
		int newGame = input.nextInt();
		while(newGame < 1 || newGame > 2){
			System.out.println("Invalid input, please re-enter your choice");
			newGame = input.nextInt();
		}
		if(newGame == buyInAgain){
			play();
		}
		else if(newGame == leave){
			System.out.println("Goodbye");
			System.exit(0);
		}
	}
}


