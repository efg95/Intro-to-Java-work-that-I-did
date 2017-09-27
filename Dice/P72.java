/* P72 Tester Class done by Ecclesiastes Gan 
 * 
 * UNI: efg2123
 */

public class P72 {

	public static void main(String[] args) {
		System.out.println("Here is a list of your 20 random dice tosses ");
		System.out.println("that brackets the largest run of same numbers ");
		System.out.println("and if there are equivalent run lengths,");
		System.out.println("takes the first: ");
		//creates a new die of 6 sides
		Die d = new Die(6);
		int[]values = new int [20];
		//for loop to fill my array with 20 random die tosses
		for(int i = 0; i<values.length; i++){
			values[i]= d.getRolls();
		}
		/* initializing variables to store the length of the similar runs
		 * to compare them and then set the longest
		 * run to be the first bracket
		 * if there are equivalent runs of greatest length
		 */
		int longestStart = 0;
		int currentStart = 0;
		int currentRun = 0;
		int longestRun = 0;
		int current;
		String randomRolls = "";//create my result string
		//same idea for P71
		boolean inRun = false;
		for(int i = 0; i < values.length; i++){
			current = values[i];
			/* so after doing these first steps
			 * the loop will check whether inRun == True first
			 * it clearly isn't true so it goes to else
			 * where it checks the next value in the sequence 
			 * once that is equal inRun = true.
			 * once the for loop goes to the next i value and inRun = true
			 * it checks whether it equals the preceding value
			 * if it does not inRun is switched to false
			 */
			if(inRun == true){
				if(i>0){//making sure i doesn't compare to a null field
					if(current != values[i-1]){
						currentRun = 0;
						inRun = false;
					}
					else{
						//if the number is still the same
						currentRun++;
					}
				}
			}
			else
			{
				//if statement that checks for 
				//equal values in the next position
				if(i<19){
					if(current == values[i+1]){
						currentStart = i;
						currentRun++;
						inRun = true;
					}
				}
			}
			//if statement that sets the currentRun to longestRun
			if(currentRun > longestRun){
					longestStart = currentStart;
					longestRun=currentRun;
		}
			
				//concatenate result to the string randomRolls
				randomRolls += current;
			}
		//tricky part, because if there are no similar runs
		//my program prints () at the start I don't want that happening
		if(longestRun == 0 )
			System.out.println(randomRolls+
		    " you lucked out, there are 0 runs");
		else{
		System.out.print(randomRolls.substring(0, longestStart));
		System.out.print("(");
		System.out.print(randomRolls.substring(longestStart,+
				longestStart+longestRun));
		System.out.print(")");
		System.out.print(randomRolls.substring(longestStart+longestRun));
		}
	}
}
	
	



