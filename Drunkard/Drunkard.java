//****************************************************
// Drunkard Class
// UNI:efg2123
// Name: Ecclesiastes Gan
//****************************************************

public class Drunkard
{
  //instance variables for drunkard
  private int currentAvenueY;//the end avenue after the methods
  private int currentStreetX;//the end street after the methods
  private int startStreetX;//the starting street
  private int startAvenueY;//the end street
  
  //constructing my Drunkard
  public Drunkard (int avenue, int street)
    {
      this.currentStreetX=street;//current street at the start is same as start
      this.currentAvenueY=avenue;//current avenue is also same at start
      this.startStreetX=street;//starting street
      this.startAvenueY=avenue;//starting avenue
    }//end of constructor
    
    //the step method
    public void step()
    {
    //randoming the step method
      double i;
      i = Math.random();
      if(i<0.25) 
      {
      currentStreetX++;
      }
      else if(i<0.50){
      currentStreetX--;
      }
      else if(i<0.75){
      currentAvenueY++;
      }
      else if(i<1.00){
      currentAvenueY--;
      }
     }//end of step method
     
    //fastforwarding the number of steps, will use the step method to calculate
    //we take the parameter 100 inside the tester ozzy.fastForward(100)
    public void fastForward(int steps)
    {
    for(int i = 0; i <= steps; i++){
      step();
      }
    }//end of fastForward method
    
    //calculating the current random location
    public String getLocation(){
    String location = currentStreetX + " streets and " + currentAvenueY + 
    " avenues";
    return location;//returning the location for tester retrieval
    }//end of getLocation method
    
    //calculating how far we have traveled based on the random movement
    public int howFar()
    {
    int distance =Math.abs(currentStreetX - startStreetX) + Math.abs(currentAvenueY-startAvenueY);
    return distance; //returning the distance for tester retrieval
    }//end of howFar method
    
  }//end of class
