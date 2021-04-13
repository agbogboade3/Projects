public class Car
{
 private double fuel=0; 
 private double efficiency=0;
 
 public Car()//Constructor
 {
  fuel = 0;
  efficiency = 0;
 }
 public void setFuel(double carFuel)//car fuel setter
	{
		fuel = carFuel;
	}
 public double getFuel()//getters for fuel
	{
		return fuel;
	}
 public void setEffic(double carEffic)//car efficiency setter
	{
		efficiency = carEffic;
	}
 public double getEffic()//getter for efficiency
	{
		return efficiency;
	}
 public double driving(double miles)
 {
  return this.fuel - (miles/this.efficiency);
 }
}