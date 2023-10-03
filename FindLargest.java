import java.util.*;
public class FindLargest
{
  public static void main(String[]args)
  {
    Random rnd = new Random();
    int max = 0; //Creating the variable max which starts at index 0
    int[] numbers = new int[15];//Defining the array 
//    int randomNumber = rnd.nextInt(100);
    
    for(int i = 0;i<numbers.length;i++)
    {
       numbers[i] = rnd.nextInt(1000);
    }
    
    for(int i = 0;i<numbers.length;i++)
    {
       System.out.print(numbers[i]+" ");
    }
       
    for(int i = 0;i<numbers.length;i++)// i starts at index 0, i++ increments by 1 as long as i is less than the length of numbers[5]
    {
       if(numbers[i] > max)//If the biggest number in in numbers[i] is greater than max..
       {
          max = numbers[i];//Max is that new number
       }
    }
    System.out.println("");
    System.out.println("The max number is: " +max);
  }
}