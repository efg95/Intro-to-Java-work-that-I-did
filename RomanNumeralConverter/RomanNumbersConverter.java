//******************************************
// Test Class for Roman Numerals Converter
// by Ecclesiastes Gan
// UNI: efg2123
//******************************************
import java.util.Scanner;

//my class tester
public class RomanNumbersConverter
{
  //main method
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number from 1 to 3999: ");
	  int RomanNumbers = input.nextInt();//storing the input integer
		
    //create new roman number
		RomanNumbers myRomanNumbers;
    myRomanNumbers = new RomanNumbers(RomanNumbers);
    //retrieving the input number
    myRomanNumbers.iRomanNumbers();
    String omega = myRomanNumbers.getRomanNums();
    //printing the inputted number in roman numerals
		System.out.println("Your Number in Roman Numerals is: " + omega );
	}//end main method
}//end of class


