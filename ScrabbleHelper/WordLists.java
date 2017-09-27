/* WordLists done by Ecclesiastes Gan
 * UNI: efg2123
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordLists {
	//instance variables
	private ArrayList<String> dictionary;
	private ArrayList<String> wordLength;
	private ArrayList<String> startsWith;
	private ArrayList<String> containsLetter;
	private ArrayList<String> vowelHeavy;
	private ArrayList<String> multiLetter;
	private String word;
	
	public WordLists(String A) throws FileNotFoundException{
		//created an arrayList for dictionary.txt here
		dictionary = new ArrayList <String>();
		File inFile = new File(A);
		Scanner input = new Scanner(inFile);
		while(input.hasNextLine()){
			word = input.nextLine();
			dictionary.add(word);
		}
		input.close();
	}
	//method to get words with n length
	public String[] lengthN(int n){
		wordLength = new ArrayList <String>();
		for( String B : dictionary){
			if( n == B.length()){
				wordLength.add(B);
			}
			
		}
		String [] wordLengthA = new String [wordLength.size()];
		wordLengthA = wordLength.toArray(wordLengthA);
		return wordLengthA;
	}
	//method to get word with n length
	//with a firstletter of something
	public String[] startsWith(int n, char firstLetter){
		startsWith = new ArrayList <String>();
		for(String B : dictionary){
			if(n == B.length() && B.charAt(0)==(firstLetter))
				startsWith.add(B);
		}
		String [] startsWithA = new String [startsWith.size()];
		startsWithA = startsWith.toArray(startsWithA);
		return startsWithA;
	}
	//method to get word with n lenth
	//with char included but not when the word begins with char
	public String[] containsLetter(int n, char included){
		containsLetter = new ArrayList <String>();
		
		for(String B : dictionary){
			if( n == B.length() && B.contains(Character.toString(included))&&
					B.charAt(0) != included){//word must not begin with char	
				containsLetter.add(B);
			}
			}
		
		String [] containsLetterA = new String [containsLetter.size()];
		containsLetterA = containsLetter.toArray(containsLetterA);
		return containsLetterA;
	}
	/* I split this method into two
	 * originally this method contains of many for loops
	 * the main one and two more inside to count vowels
	 * but that was a pain on my brain to handle so i split it into two
	 * method to count vowels and method to get the words and
	 * return the results
	 */
	public String [] vowelHeavy(int n, int m){
		vowelHeavy = new ArrayList <String>();
		for(int i = 0; i < dictionary.size(); i++){
			String B = dictionary.get(i);
			//method vowel count is used below
			if(n == B.length() && vowelCount(B) >= m){
			vowelHeavy.add(B);
		}
		}
		String [] vowelHeavyA = new String [vowelHeavy.size()];
		vowelHeavyA = vowelHeavy.toArray(vowelHeavyA);
		return vowelHeavyA;
	}
	//method to return words with m amount of char included
	public String [] multiLetter(int m, char included){
		multiLetter = new ArrayList <String>();
		for(int i = 0; i < dictionary.size(); i++){
			int count = 0;
			String B = dictionary.get(i);
			for(int j = 0; j < B.length(); j++){
				if(included == B.charAt(j)){
					count++;
				}
			}
			if(count >= m){
				multiLetter.add(B);
			}
		}
		String [] multiLetterA = new String [multiLetter.size()];
		multiLetterA = multiLetter.toArray(multiLetterA);
		return multiLetterA;
	}
	//method that counts vowels
	private int vowelCount(String B){
		String vowels = "aeiou";
		int count = 0;
		for(int i = 0; i < B.length(); i++){
			for(int j = 0; j<vowels.length(); j++){
				char vowel = vowels.charAt(j);
				if(B.charAt(i) == vowel){
					count++;
				}
			}
		}
		return count;
	}
}//end class
