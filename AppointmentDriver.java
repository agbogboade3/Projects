import java.util.*;
public class AppointmentDriver
{
 public static void main(String[]args)
 {
 
 Scanner input = new Scanner(System.in);
//Superclass Objname = new Subclass(Parameters);
/**
*These are new objects of the Appointment class using polymorphism.
*
*/
 Appointment date1 = new Daily(10,22,2018,"Take a Shower");
 Appointment date2 = new Daily(10,31,2018,"Brush your teeth");
 Appointment date3 = new Monthly(11,4,2018,"Call your Gran");
 Appointment date4 = new OneTime(12,4,2018,"Doctor's Appointment");
 Appointment date5 = new OneTime(12,25,2018,"Christmas");
 
 /**I imported the Scanner for accepting user input*/
 System.out.println("Enter a month:");
 int month = input.nextInt();
  System.out.println("Enter a day:");
 int day = input.nextInt();
  System.out.println("Enter a year:");
 int year = input.nextInt();
 /**
 For this one I chose to create a array because I was more familar with arrays
 *
 *this next line creates an appointment array containing 5 appointment objects
 */
 Appointment[]array= new Appointment[5]; 
 
 array[0] = date1;
 array[1] = date2;
 array[2] = date3;
 array[3] = date4;
 array[4] = date5;
 
/**
*So in order to check in the array which dates correspond to the user input we will need a for loop
*I called the occursOn method to check which values are
*/ 
 for(int i = 0;i<array.length;i++){
   if(array[i].occursOn(month,day,year)){//This line is basically comparing user input in the occursOn method
   System.out.println(array[i]);/**If the condition is true print out all statements which which correspond to the right date */
   }
 }
 
 }
 }
