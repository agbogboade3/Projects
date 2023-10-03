/**
  A class for simulating a car that can be driven.
  @author Adetomiwa Gbogboade
 */
 public class Car2{
   //attributes
   private double fuelEfficiency=0;
   private double fuelLevel=0;

   /**
     Sets the fuel efficiency to the given amount.
     @param efficiency amount to set the fuel efficiency of the tank.
   */
   public void setFuelEfficiency(fuelEfficiency){
   this.fuelEfficiency = fuelEfficiency;
   }
   /**
     Retrieves the fuel efficiency of the car.
     @returns the fuel efficiency of the car
   */
   public double getFuelEfficiency(){
   return fuelEfficiency;
   }
   
   /**
     Put gas in the tank.
     @param fuelLevel amount of gas to add
   */
   public void setFuelLevel(double fuelLevel){
   this.fuelLevel += fuelLevel;
   }
   
   /**
     Retrieves the amount of gas currently in the tank.
   */
   public double getFuelLevel(){return fuelLevel;}
   
   //main method just to test our class
   
   public Car2(double fuelEfficiency){
     this.fuelEfficiency = fuelEfficiency;
     fuelLevel = 0;
    }
   public double driving(double miles)
 {
  return this.fuel - (miles/this.efficiency);
 }
}