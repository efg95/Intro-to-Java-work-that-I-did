//******************************
// CAR CLASS TESTER
//******************************

public class CarTester
{
	public static void main(String[] args)
	{
    Car MyFerrari;
		MyFerrari = new Car(10);//10km per liter
		MyFerrari.addGas(100);//adds 100 liters of fuel
		MyFerrari.drive(1000);//drives 1000km
		MyFerrari.addGas(200);//adds 200 liters of fuel
		MyFerrari.drive(500);//drives 500km
		
    
		double FuelInTank = MyFerrari.getGasInTank();
		System.out.print("Fuel left: ");
		System.out.println(FuelInTank );
		System.out.println("expected: 150.0");
		System.out.print("Total Km Driven: ");
		System.out.println(MyFerrari.getKmDriven() );
		System.out.println("expected: 1500.0");
	}//end of test main method
}//end of test class
