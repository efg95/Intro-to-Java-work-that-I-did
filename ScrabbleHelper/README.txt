Scrabble Helper in Java that helps a scrabble player when he is faced with

Scrabble Help: The dictionary.txtView in a new window file contains all of the words 
in the Official Scrabble Player's Dictionary, Second Edition. (Note this list contains some offensive language.) 


 

•WordLists(String fileName):  a constructor that takes the name of the dictionary file as the only parameter.

•lengthN(int n):  returns an array of words of length n.

•startsWith(int n, char firstLetter):  returns an array of words of length n beginning with the letter firstLetter

•containsLetter(int n, char included):  returns an array of words of length n containing the letter included 
but not beginning with it.

•vowelHeavy(int n, int m):  returns an array of words of length n containing at least m vowels.

•multiLetter(int m, char included):  returns an array of words with at least m occurrences of the letter included.


___________________________
code notes
#must compile with dictionary.txt at command line e.g. java ScrabbleTester dictionary.txt

ScrabbleTester.java

it works fine, with all the test variables i have inputted.

only thing to note, i managed to loop(to keep asking for a correct file) if user enters incorrect file, but
for no command line entered, i kept encountering more errors when i inputted a loop, so i decided to end this program gracefully
instead, just like Prof Cannon said we should do?

WordLists.java
i have 5 methods
lengthN - prints all the words to printwriter(txtfile) with desired length
startsWith - prints all the words to printwriter(txtfile) with desired length and desired firstletter char
containsLetter - prints all the words to printwriter(txtfile) with desired length and includes desired chars within the word, but not at the firstletter(CharAt(0))

vowelHeavy - prints all the words to printwriter(txtfile) with desired length of word.
However I split this method into two parts. A method to count vowels, and the actual method that gets the results from dictionary.txt, 
I combined this two at first, but the logic processing of the for loops within the for loops was confusing, and i wasn't confident in my for loop coding
IT WAS EASIER TO SPLIT IT UP FOR MY BRAIN. TBH

multiLetter - prints all the words to printwriter(txtfile) with desired number of the specific char.
