/*
Adetomiwa Gbogboade
Assignment 4
Ade Thompson 
April 4, 2018 Due April 11,2018
CSCI 1301 Spring Semester
*/
import java.util.*;//Useful if you want to use Scanner input
public class CarFix
{
public static double carMaintenance(String make)//The method carMaintenance
{
  Scanner input = new Scanner(System.in);//since we need this method to accept input
  String[] services = {"Oil Change","Tire Rotation","Air filter","Fluid Check"};
  double[] price = {39.99,49.99,19.99,10.99};
  for(int i = 0;i<services.length;i++)//For displaying all the services, starts at services[0] ends at services[3]
     {
       System.out.println(services[i] +"\t"+ price[i]);
     }
   double subTotal = 0;
   String response = "";
   do// a do while loop for determining which service the user wants
     {
       System.out.println("What service would you like?"
       +"(1 for oil change, 2 for tire rotation, 3 for air filter, 4 for fluid check)");
       int choice = input.nextInt();//accepting user input
       
       subTotal += price[choice - 1];//If 1 is entered it will be 1-1 which is 0, so array value price[0] will execute,2-1=1 so price[1] will execute and etc.
       //subTotal += price[n] will add whatevers on the right of the operater to itself 
       System.out.println("Would you like another service?(enter Yes or No)");
       response = input.next();
       
     }while(response.equalsIgnoreCase("Yes")||response.equalsIgnoreCase("Y"));//If the response is equal to any of these two things, do the while loop again, other wise, terminate.
     return subTotal;//keeps subTotals value
}
public static void main(String[]args)//the first thing that will be executed
{
   Scanner input = new Scanner(System.in);//since we need this method to accept input
   String[] services = {"Oil Change","Tire Rotation","Air filter","Fluid Check"};
   double[] price = {39.99,49.99,19.99,10.99};
   
   System.out.println("What is the make of your vehicle?");
   String make = input.nextLine();
   
   System.out.println("Is the vehicle an import (enter Yes or No)?");
   String answer = input.nextLine();
   boolean isImport = false;//we need it to be false by default otherwise the next if statement won't make sense
   if(answer.equalsIgnoreCase("yes") ||answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("Y"))
   {
     isImport = true;
   }
   double subTotal = carMaintenance(make);
   calcFinalPrice(subTotal,isImport);

}
public static void calcFinalPrice(double subTotal, boolean isImport)
{
     
     double labor = subTotal * .3;
     
     System.out.println("Your subtotal is: \t$"+subTotal);//displays subTotal
     
     System.out.println("Total Labor cost is: \t" +String.format("%.2f",labor)); //displays labor
     double importPrice = subTotal * .05;
     double tax = subTotal * .08;
     double total = 0;//creates the double total
     
     if(isImport == true)
     {
       System.out.println("Import charge:\t\t" +String.format("%.2f",importPrice));//displays Import charge if isimport is true
       total = subTotal + tax + importPrice + labor;
     }
     else
     {
      total = subTotal + tax + labor;
     }  
     System.out.println("Tax:\t\t\t"+String.format("%.2f",tax));//displays tax
     System.out.println("Total:\t\t\t"+String.format("%.2f",total));//displays total
}
}
