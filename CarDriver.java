import java.util.*;
public class CarDriver
{
 public static void main(String[]args)
 {
  Car car = new Car();

  car.setEffic(39);
   
  double carEffic = car.getEffic();
  
  car.setFuel(16);
  
  System.out.println("Driving your car for 34.6 miles...");
    
  System.out.println("Distance = "+car.driving(34.6));

  
 }
 
}