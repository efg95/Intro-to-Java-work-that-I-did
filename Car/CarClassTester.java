//******************************
// CAR CLASS TESTER
//******************************

public class CarClassTester
{
	//main method
  public static void main(String[] args)
	{
    Car MyFerrari;
		MyFerrari = new Car(50);//fuel efficiency 50km per liter
		MyFerrari.addGas(20);//adds 20 liters of fuel
		MyFerrari.drive(100);//the car is driven for 100km
		MyFerrari.addGas(40);//adds 40 liters of fuel
		MyFerrari.drive(500);//the car is driven for 500km
		
    //print out my results
		double FuelInTank = MyFerrari.getGasInTank();
		System.out.print("Fuel left: ");
		System.out.print(FuelInTank );
		System.out.println();
		System.out.print("expected: 48.0");
		System.out.println();
		System.out.print("Total Km Driven: ");
		System.out.print(MyFerrari.getKmDriven() );
		System.out.println();
		System.out.print("expected: 600.0");
		System.out.println();
	}//end of test main method
}//end of test class
