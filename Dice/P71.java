/* P71 Tester Class done by Ecclesiastes Gan 
 * SHOUTOUT to TA JOE for helping me out 
 * UNI: efg2123
 */

public class P71 {

	public static void main(String[] args) {
		System.out.println("Here is a list of your 20 random dice tosses "+
		"that brackets repeated numbers:");
		Die d = new Die(6);//create a new 6 sided die
		int[]values = new int [20];//create an array list of 20 slots
			//filling my array with 20 random die rolls
			for(int i = 0; i<values.length; i++){
				values[i]= d.getRolls();
			}
				//translation of the pseudocode
				boolean inRun = false;
				for(int i = 0; i < values.length; i++){
					if(inRun){
						if(i>0){//making sure i doesnt compare to a null field
							if(values[i] != values[i-1]){
								System.out.print(")");
								inRun = false;
							}
						}	
					}
					if(!inRun){
						//making sure it doesn't compare 
						//to a non-existent field
						if(i<19){
							//loop that checks whether 
							//the number equals to the one preceding it
							if(values[i] == values[i + 1]){
								System.out.print("(");
								inRun = true;
							}
						}
					}
					System.out.print(values[i]);
		
				}	
			if(inRun){
				System.out.print(")"); 
		
			}			
	}//end of main method
}//end of class
	
	

