import java.util.*;
public class DriveThru
{
 public static void main(String[]args)
  {

   Scanner input = new Scanner(System.in);
   System.out.println("How many toppings do you want?");
   
   int toppingAMT = input.nextInt();
   String[]toppings = new String[toppingAMT];
   
   System.out.println("You wanted " +toppingAMT+ " toppings.");
   
   for(int i = 0; i<toppings.length;i++)
   {
    System.out.println("Enter your toppings:");
    toppings[i] = input.next();
   }
   System.out.print("Toppings: " +toppings[toppingAMT]);

  }
}