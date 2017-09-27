I created a Blackjack class that creates a new game, from there i call the play method in game.

I then created a deck class, which creates a "deck" using an array.
I created a fill the deck method to fill a deck with 52 cards
I then created a shuffle method that shuffles the deck either upon call, or when the deck has a total of 40 cards drawn.
I also have a method called deal, which deals the top card of the deck to either player or dealer when invoked.

I then created a Card class
and in that card class i created a method that allows me to name the values of cards, e.g. array position 0, = ACE OF blahblah and so on.
I also created a method to return the value of the card, so that i can use it to compare who won.

I then created a player class
gave the player an arraylist so that he can accept the cards, upon deal.
then i gave the player a method to display his cards on the console so he knows what his cards are, and what is his total
I gave him a game balance, so as to calculate his winnings and losses, and these are adjusted accordingly upon every win or loss.
Depending on the amount he bets.
lastly, gave the player 3 reset methods that resets his hand, and ace values.

The dealer works on the same logic as the player class
except, during the game only the first card of the dealer is displayed on the console/table
dealer does not have a balance
but he has reset methods as well.

LASTLY GAME CLASS THE MOST IMPORTANT ONE
I ADDED A COUPLE OF METHODS OR MAYBE TOO MANY IDK
THE class has a play method invoked by BLACKJACK CLASS, and a playagain method which allows the game to be played
until the player decides to stand.

the game class has a lot of error checking methods, firstly, the player cannot bet more than he has, and if he has insufficient balance he is asked
to top it up and buy-in again

it also has a blackjacko method which is invoked after 4 cards are dealt, to check whether either player or dealer has BLACKJACK.

it has a hitmethod, rather useless, but helps me process my thoughts<-- allows player to add a next card

it has a bet method, to keep track of amount bet in each round

it then has two turn methods, after the 4 cards are dealth, the playerTurn is invoked first. and it gives the player
options on whether to hit or stand, it also checks for bust, if player busts. dealer wins.

upon player choosing stay, dealerTurn is invoked, and if the dealer has <17, he draws until he either <22 or he busts, if he busts player wins
if he does not, method gameCompare() is invoked it is the method that checks who has the higher hand, or is there a tie.

upon deciding the winner and assigning the bets,
it gives a "choice()" method that asks whether the user wishes to continue the game, in this choice method, it checks whether the user has sufficient funds to continue the game
if the user does not he is asked to top up and buy in again.

IF THE USER CHOOSES TO LEAVE AFTER ANY ROUND OR UPON RUNNING OUT OF MONEY, '2' the programme exits