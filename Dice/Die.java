/* Die Class done by Ecclesiastes Gan
 * 
 * UNI: efg2123
 */

public class Die {
	private int n;
	private int side;
	public Die(int shape){
		n=shape;
	}
	//method for rolling die
	public int getRolls(){
		//rolls a die and limits it to integers 1-6
		side = (int)(Math.random()*n + 1);
		return side;
	}
	
}
	

