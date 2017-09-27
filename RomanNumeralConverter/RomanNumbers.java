//*********************************
// The RomanNumbers Converter Class
// by Ecclesiastes Gan
// Uni: efg2123
//*********************************

//class
public class RomanNumbers
{
	//instances of a roman number
  private String RomanNums;
	private int num;

  //my constructor
  public RomanNumbers (int input){
    num = input;
    RomanNums = "";
    
  }
  //method to change integers to RomanNumbers
	public void iRomanNumbers()
	{
		
		//while loop if the number is in the 1000s
		while(num>=1000){//checking for number of 1000s
			RomanNums += "M";//if there is assign M to the string
      num -= 1000;//get rid of the 1000s in the input everytime we get 1 "M"
		}
		//while loops if the number is in the 900s
		while(num>=900){//checking
			RomanNums += "CM";//if there is assign CM to the string
      num -= 900;//get rid of the 900s in the input everytime we get 1 "CM"
		}
		//while loops if the number is in the 500s
		while (num>=500){//checking
			RomanNums += "D";//if there is assign D to the string
      num -= 500;//get rid of the 500s in the input everytime we get 1 "D"
		}
		
		//while loops if the number is 400
		while(num>=400){//checking
			RomanNums += "CD";//if there is assign CD to the string
      num -= 400;// get rid of the 400s in the input everytime we get 1 "CD"
		}
		
		while(num>=100){
			RomanNums += "C";
		  num -= 100;
    }
		
		while(num>=90){
			RomanNums += "XC";
      num -= 90;
		}
		
    while(num>=50){
			RomanNums += "L";
      num-= 50;
		}
		
    while(num>=40){
      RomanNums += "XL";
      num -= 40;
		}
		
    while(num>=10){
			RomanNums += "X";
		  num -= 10;
    }
		
    while(num>=9){
			RomanNums += "IX";
      num -= 9;
		}
	  
    while(num>=5){
			RomanNums += "V";
      num -= 5;
		}
		
    while(num>=4){
			RomanNums += "IV";
      num -= 4;
		}
		
    while(num>=1){
			RomanNums += "I";
      num -= 1;
		}
  }//end of method to get roman numeral
  
  public String getRomanNums()//method to get my roman numeral
  {
  return RomanNums;
  }//end of method
 
}//end of class






