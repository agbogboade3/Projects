/*
Adetomiwa Gbogboade
Assignment 4
Ade Thompson 
April 4, 2018
CSCI 1301 Spring Semester
*/
import java.util.*;
public class CarMaintenance
{
  public static void main (String[]args)
  {
   Scanner input = new Scanner(System.in);
   String[] services = {"Oil Change","Tire Rotation","Air filter","Fluid Check"};//array for services
   double[] price = {39.99,49.99,19.99,10.99};//array for service prices
   
   System.out.println("What is the make of your vehicle?");
   String make = input.nextLine();
   
   System.out.println("Is the vehicle an import (enter Yes or No)?");
   String answer = input.nextLine();
   
   boolean isImport = false;
   if(answer.equalsIgnoreCase("yes") ||answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("Y"))
     {
       isImport = true;
     }
   for(int i = 0;i<services.length;i++)
     {
       System.out.println(services[i] +"\t"+ price[i]);
     }
   double subTotal = 0;
   String response = "";
   do
     {
       System.out.println("What service would you like?"
       +"(1 for oil change, 2 for tire rotation, 3 for air filter, 4 for fluid check)");
       int choice = input.nextInt();
       
       subTotal += price[choice - 1];
       
       System.out.println("Would you like another service?(enter Yes or No)");
       response = input.next();
       
     }while(response.equalsIgnoreCase("Yes")||response.equalsIgnoreCase("Y"));
     
     System.out.println("Your subtotal is: \t$"+subTotal);
     
     double labor = subTotal * .3;
     
     System.out.println("Total Labor cost is: \t$" +String.format("%.2f",labor)); 
     double importPrice = subTotal * .05;//5% markup if their car is an import
     double tax = subTotal * .08;
     double total = 0;
     
     if(isImport == true)
     {
       System.out.println("Import charge:\t\t$"+String.format("%.2f",importPrice));
       total = subTotal + tax + importPrice + labor;
     }
     else
     {
      total = subTotal + tax + labor;
     }  
     System.out.println("Tax:\t\t\t$"+String.format("%.2f",tax));
     System.out.println("Total:\t\t\t$"+String.format("%.2f",total));
  } 
}
