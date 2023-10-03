//Demonstration of Array Processing 
import java.util.Scanner;

public class ArrayProcess2 
{
	public static void main(String[] args)
	{
		//Initialize the array with user input
      //double[] earnings = new double[10];
      double[] earnings = {50.0,110.0,75.0,500.0,250.0};
      int[] numbers = {5,-4,34,22,-30,55,-11,-99,88,7,48,-18,77,14,-151};
      System.out.println();
      
      //How To Print the Array values
      for(int index = 0; index < earnings.length; index++) 
      {
         System.out.println("Array Element Value is: " + earnings[index]);
      }
      
      //How To Sum all elements in an array
      double total = 0.0; //accumulator variable

      for(int index = 0; index < earnings.length; index++)
      {
         total += earnings[index]; //accumulation/running total
         //total = total + earnings[index];
      }
      System.out.println();
      System.out.println("Total earnings: " + total);
      
      //How To Find the largest element in the array
      double max = earnings[0];

      for(int index = 1; index < earnings.length; index++) 
      {
         //examine the current element in the array
         //determine if it is larger than the current max
         if(earnings[index] > max)
         { 
            //if so, replace the current max
            max = earnings[index];
         }
      }
      System.out.println();
      System.out.println("The largest value in the array is " + max);
      //System.out.println("The highest price entree is " + entree[maxindex] + " which costs " + max + ");
      
      // How to Determine the number of positive numbers in an array
      int count = 0;
       for(int index = 0; index < numbers.length; index++) 
      {
         //examine the current element in the array
         //determine if it is larger than the current max
         if(numbers[index] > 0)
         { 
            //
            count++;
         }
      }
      System.out.println();
      System.out.println("The number of positive numbers in the array is " + count);
      
	}
}