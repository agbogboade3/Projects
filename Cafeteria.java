/*Adetomiwa Gbogboade
CSCI 1301 - Computer Science I
Assignment 3
Due
*/
//Array 1 week
//Array 2 entree(accepts user input)
//Array 3 prices(accepts user input)
//max Determines the max price
//vari 
import java.util.Scanner;
public class Cafeteria
{
  public static void main(String[]args)
  {
     Scanner input = new Scanner(System.in);//Creating scanner object
     String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}; //creating the array week, with five elemments, and an index of 0-4
     String[] entree = new String[5];//Creating the array entree
         
     for(int i = 0; i < week.length; i++)
     {
        System.out.println("What entree is being served on "+ week[i]+"?");
        entree[i] = input.nextLine();//
     }

     double[] prices = new double[5]; //Creates the array that stores the prices
     for(int i = 0; i < prices.length; i++)
     {
         System.out.println("Enter the price of the " +entree[i]);//Prompts user to input the number of a specific produce they want
         prices[i] = input.nextDouble();//Allows the program to accept the number of produce(this will only accept numbers(doubless)) 
     }
     
     System.out.println("Enter an entree to search for:");
     String search = input.next();
     
     for(int i =0;i<week.length;i++)
     {
       if(entree[i].equals(search)) 
       {
         System.out.print(search + " is served on "+week[i]);   
         System.out.println("");  
       }
     }


     double max = prices[0];
     int vari=0;
      for(int i = 1; i < prices.length; i++) 
      {
         //examine the current element in the array
         //determine if it is larger than the current max
         if(prices[i] > max)
         { 
            //if so, replace the current max
            max = prices[i];
            vari=i;
         }
      }
      System.out.println("The highest priced entree is the " +entree[vari]+ " at the price of $"+ max);

  }
}