/* ScrabbleTester Done By Ecclesiastes Gan
 * UNI:efg2123
 */
import java.util.Scanner;
import java.io.*;

public class ScrabbleTester {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);//loop FileNotFound except
	boolean again = true;
	//hardcore to test my methods
	while(again){
		try{
			//reads the command line 
			WordLists A = new WordLists(args[0]);
			//hardcore to test wordlist length
			String[] lengthN = A.lengthN(20);
			PrintWriter one = new PrintWriter("lengthN.txt");
			for(int i = 0; i < lengthN.length; i++){
				one.println(lengthN[i]);
			}
			one.close();
			//hardcore to test words that start with and length of the word
			String [] startsWith = A.startsWith(3, 'z');
			PrintWriter two = new PrintWriter("startsWith.txt");
					for(int i = 0; i < startsWith.length; i++){
						two.println(startsWith[i]);
						}
					two.close();
			/* hardcore to test for words that contain a certain vowel
			 * but does not begin with the vowel
			 * and length of all these words.		
			 */
			String [] containsLetter = A.containsLetter(4, 'z');
			PrintWriter three = new PrintWriter("containsLetter.txt");
				for(int i = 0; i < containsLetter.length; i++){
					three.println(containsLetter[i]);
					}
				three.close();
			//hardcore to test for words that have a certain letter
			//and how many times they occur
			String [] multiLetter = A.multiLetter(2, 'z');
			PrintWriter four = new PrintWriter("multiLetter.txt");
				for(int i = 0; i < multiLetter.length; i++){
					four.println(multiLetter[i]);
					}
				four.close();
			//hardcore to test for words that contains at least 
			// m number of vowels in a word length of n
			String [] vowelHeavy = A.vowelHeavy(5, 3);
			PrintWriter five = new PrintWriter("vowelHeavy.txt");
				for(int i = 0; i < vowelHeavy.length; i++){
					five.println(vowelHeavy[i]);
					}
				five.close();
				again = false;
				
				
		}//end of try
		//catch and loop for correct file
		catch(FileNotFoundException e){
		System.out.println("The File You entered cannot be found " +
		"Please enter a correct file name ");
        args[0] = scan.next();
		}
		//i didn't know how to loop this exception
		//so i just ended the program.
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("You did not have a command line " + 
        "Please have a command line and restart the program");
        again = false;
		}		
	}//end of while
	scan.close();
	

	

	}//end of main
}//end of class
