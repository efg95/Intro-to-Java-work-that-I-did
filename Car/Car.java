//************************
//  Car
//************************


public class Car {
    //properties of the car class
    private double FuelEfficiency;
    private double FuelInTank;
    private double FuelInLiters;
    private double KmDriven;
    
    //creates the car with a fuel efficiency of a certain level
    public Car (double Efficiency)
    {
        FuelEfficiency = Efficiency;
        FuelInTank = 0;//new car has 0 fuel in tank
        KmDriven = 0;//new car has never been driven before
        
    }
    //my class methods
    public void drive(double distance)
    {
        FuelInLiters = distance/FuelEfficiency;
        //amt of fuel used to go a certain distance
        FuelInTank = FuelInTank - FuelInLiters;
        //amt of fuel left after going a certain distance
        KmDriven = KmDriven + distance;
        //the odometer tracking the amt of distance driven so far
    }
    //returns and shows the amount of fuel left in tank
    public double getGasInTank()
    {
      return FuelInTank;
    }
    //adds gas to the tank
    public void addGas(double amt)
    {
      FuelInTank = FuelInTank + amt; //fuel in tank plus amt added
    }
    // returns and shows total amt of Km driven so far
    public double getKmDriven()
    {
      return KmDriven;
    }
}//end of class car
    
    
